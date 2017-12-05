package edu.msudenver.cs.team_four.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/courses").setViewName("courses");
        registry.addViewController("/professors").setViewName("professors");
        registry.addViewController("/students").setViewName("students");
        registry.addViewController("/login").setViewName("login");
    }

}