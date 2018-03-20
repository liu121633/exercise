package com.example.liy.controller.authc;

import com.example.liy.pojo.User;
import com.example.liy.util.StrUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Security;
import java.util.Map;

/**
 * Index
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-17 3:31
 */
@Controller
public class Login {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private StrUtil strUtil;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() throws Exception {
        //此方法不处理登陆 登陆交给shiro 自动处理
        //shiroLoginFailure 为shiro 登陆的异常
        String exception = (String) request.getAttribute("shiroLoginFailure");
        String msg = "";
        if (exception != null) {
            logger.info("登陆失败,shiro异常:");
            if (UnknownAccountException.class.getName().equals(exception)) {
                msg = "账号不存在：";
                logger.info(exception);
            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
                msg = "密码不正确：";
                logger.info(exception);
            } else {
                logger.info(exception);
            }
        }
        request.setAttribute("msg", msg);
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        if (!subject.isAuthenticated()) {
            //如果登陆就不登陆
            try {
                subject.login(token);
            } catch (Exception e) {
                request.setAttribute("msg", "登陆失败!");
                return "login";
            }
        }
        return "redirect:/shark";
    }

    @RequestMapping("logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser.isAuthenticated()) {
            currentUser.logout();
            logger.info("用户注销了登陆");
        }
        return "login";
    }


}
