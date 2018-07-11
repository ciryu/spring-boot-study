package com.developlee.j2eespingboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Lee
 * @// TODO 2018/7/11-15:17
 * @description
 */
@Configuration
@EnableTransactionManagement //开启声明式事物注解
public class PlatformTransactionManagerConfig {

    @Autowired
    @Qualifier("dataSource")
    public DataSource dataSource;

    @Bean
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
