package com.developlee.readingnotes.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:15
 * @description java 配置方式
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService2 useFunctionService2() {
        UseFunctionService2 useFunctionService2 = new UseFunctionService2();
        useFunctionService2.setFunctionService(functionService());
        return useFunctionService2;
    }
}
