package com.roomie.db_connect_spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://hdreactbucket.s3-website.ap-northeast-2.amazonaws.com")
                .allowedMethods("GET", "POST")  // 허용할 HTTP method
                .allowCredentials(true);
    }
}