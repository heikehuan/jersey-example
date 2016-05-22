package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-12-22
 * <p>Version: 1.0
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/user")
    public Map selectUser() {
        Map map = new HashMap();
        map.put("username", "huanhuan");
        map.put("password", 123456);
        return map;
    }

}
