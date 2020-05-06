package com.techdev.barquas.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScans(value = {
		@ComponentScan("com.techdev.barquas.dao"),
		@ComponentScan("com.techdev.barquas.service")
		
})
public class AppConfig {

}
