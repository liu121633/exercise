package com.example.liy.util;

import org.springframework.stereotype.Component;

/**
 * StrUtil
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-18 11:37
 */
@Component("StrUtil")
public class StrUtil {
    /**
     * @param str
     * @return 空ture 否則false
     */
    public boolean emptyValidation(String str) {
        if (str == null || str.equals(""))
            return true;
        return false;
    }

}
