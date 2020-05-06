package com.techdev.barquas.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@EnableWebMvc
@ComponentScan(basePackages = {"com.techdev.barquas.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

}
