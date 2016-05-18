package com.example.config;

import com.example.controller.Demo;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ptmind on 2016/5/18.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //加载Resource
        register(Demo.class);

        //注册数据转换器
        register(JacksonJsonProvider.class);

        // Logging.
        register(LoggingFilter.class);
    }

}
