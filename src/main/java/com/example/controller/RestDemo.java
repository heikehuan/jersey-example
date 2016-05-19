package com.example.controller;

import com.example.bean.UserBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by ptmind on 2016/5/20.
 */
@RestController
public class RestDemo {

    @RequestMapping(value = "/rest", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserBean home() {
        UserBean userBean = new UserBean();
        userBean.setUserId(UUID.randomUUID().toString().replace("-", ""));
        userBean.setUsername("resthuan");
        userBean.setPassword("7890123");
        return userBean;
    }
}
