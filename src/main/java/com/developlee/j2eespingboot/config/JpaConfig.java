package com.developlee.j2eespingboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManagerFactory;

/**
 * @author Lee
 * @// TODO 2018/7/11-13:29
 * @description
 */
@Configuration
@EnableJpaRepositories("com.developlee.j2eespingboot")
public class JpaConfig {

    @Bean
    public EntityManagerFactory entityManagerFactory(){
        return null;
    }
}
