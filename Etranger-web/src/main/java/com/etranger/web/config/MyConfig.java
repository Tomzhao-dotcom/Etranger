package com.etranger.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/dashboard-finance").setViewName("dashboard-finance");
        registry.addViewController("/dashboard-sales").setViewName("dashboard-sales");
        registry.addViewController("/dashboard-influencer").setViewName("dashboard-influencer");
        registry.addViewController("/influencer-finder").setViewName("influencer-finder");
        registry.addViewController("/influencer-profile").setViewName("influencer-profile");
    }
}
