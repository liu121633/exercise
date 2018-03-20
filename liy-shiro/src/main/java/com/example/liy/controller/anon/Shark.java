package com.example.liy.controller.anon;

import com.example.liy.dao.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Shark
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-18 19:19
 */
@Controller
@RequestMapping("index")
public class Shark {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String to() {
        request.setAttribute("articles", articleMapper.selectByExample(null));
        return "blogs/index";
    }
}
