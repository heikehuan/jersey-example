package com.example.controller;

import com.example.bean.UserBean;
import com.example.util.JsonView;
import com.example.util.JsonViewFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import javax.ws.rs.*;
import java.util.UUID;

/**
 * Created by ptmind on 2016/5/16.
 */
@Path("/user")
public class Demo {

    private final Logger logger = LoggerFactory.getLogger(Demo.class);

    @GET
    @Path("/select")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public JsonView selectUser(@QueryParam("username") String username) {
        JsonView jsonView = JsonViewFactory.createJsonView();
        try {
            UserBean userBean = new UserBean();
            userBean.setUserId(UUID.randomUUID().toString().replace("-", ""));
            userBean.setUsername(username);
            userBean.setPassword("123456");
            jsonView.success(userBean);
        } catch (Exception e) {
            jsonView.error("select user error. ", e);
        }
        return jsonView;
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public JsonView addUser(UserBean userBean) {
        JsonView jsonView = JsonViewFactory.createJsonView();
        try {
            jsonView.success("add user success");
        } catch (Exception e) {
            jsonView.error("add user error. ", e);
        }
        return jsonView;
    }

}