package com.order_food.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/shopcart").setViewName("shopcart");
        registry.addViewController("/commodity").setViewName("commodity");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/*.css").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/img/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/*.js").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**/layui/**").addResourceLocations("classpath:/static/");
    }
}
