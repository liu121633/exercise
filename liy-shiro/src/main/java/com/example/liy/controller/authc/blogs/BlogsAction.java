package com.example.liy.controller.authc.blogs;

import com.example.liy.dao.ArticleMapper;
import com.example.liy.dao.TypeMapper;
import com.example.liy.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Blogs
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-18 19:28
 */
@Controller
@RequestMapping("blogs")
public class BlogsAction {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET)
    public String to() {
        request.setAttribute("types",
                typeMapper.selectByExample(null));

        return "blogs/add";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int id) {
        request.setAttribute("article", articleMapper.selectByPrimaryKey(id));
        return "blogs/single";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> save(@RequestBody Article article) {
        Map<String, Object> map = new HashMap<>();
        try {
            article.setArticlePostedtime(new Date());
            article.setArticleAuthor("贺兰沁焱");
            articleMapper.insertSelective(article);
            map.put("code", "200");
            map.put("code", "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "500");
            map.put("code", e.getMessage());
        }
        return map;
    }
}
