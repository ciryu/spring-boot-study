package com.developlee.readingnotes.chapter2.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lee
 * @// TODO 2018/7/6-9:59
 * @description
 */
@Configuration
@ComponentScan("com.developlee.readingnotes.chapter2.initdestroy")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
