package com.example.liy.realm;

import com.example.liy.dao.UserMapper;
import com.example.liy.pojo.UserExample;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * MyShiroRealm
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-17 15:14
 */
public class MyShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    /**
     * 授权用户权限
     *
     * @author liy贺兰沁焱-刘洪君
     * @date 2018-03-17 15:19
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("验证权限");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        /*authorizationInfo.addStringPermission("home:str");
        authorizationInfo.addStringPermission("home:to");*/
       authorizationInfo.addStringPermission("home:*");
        return authorizationInfo;
    }

    /**
     * 　　* 验证用户身份
     * 　　* @author liy贺兰沁焱-刘洪君
     * 　　* @date 2018-03-17 15:20
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("进入Realm");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String loginName = loginName = (String) token.getPrincipal();
        String loginPwd = new String((char[]) token.getCredentials());
        try {
            logger.info("开始验证用户身份");
            UserExample userExample = new UserExample();
            userExample.or().andLoginNameEqualTo(loginName);
            String password = userMapper.selectByExample(userExample).get(0).getLoginPwd();
            if (password == null || "".equals(password)) {
                logger.info("用户名错误");
                throw new UnknownAccountException();//如果用户名错误
            }
            if (!loginPwd.equals(password)) {
                logger.info("密码错误");
                throw new IncorrectCredentialsException();//如果密码错误
            }
        } catch (IndexOutOfBoundsException e) {
            logger.info("用户名错误");
            throw new UnknownAccountException();//如果用户名错误
        }
        //如果身份认证验证成功，返回一个AuthenticationInfo实现；
        return new SimpleAuthenticationInfo(loginName, loginPwd, getName());
    }


}
