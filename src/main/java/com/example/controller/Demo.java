package com.example.controller;

import com.example.bean.UserBean;
import org.springframework.http.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.UUID;

/**
 * Created by ptmind on 2016/5/16.
 */
@Path("/demo")
public class Demo {

    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public UserBean home() {
        UserBean userBean = new UserBean();
        userBean.setUserId(UUID.randomUUID().toString().replace("-", ""));
        userBean.setUsername("huan");
        userBean.setPassword("123456");
        return userBean;
    }

}
