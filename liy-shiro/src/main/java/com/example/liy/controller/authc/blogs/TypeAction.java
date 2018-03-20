package com.example.liy.controller.authc.blogs;

import com.example.liy.dao.TypeMapper;
import com.example.liy.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * TypeAction
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-19 9:15
 */
@Controller
@RequestMapping("type")
public class TypeAction {
    @Autowired
    private TypeMapper typeMapper;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> add(@RequestBody Type type) {
        Map<String, Object> map = new HashMap<>();
        try {
            typeMapper.insertSelective(type);
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
