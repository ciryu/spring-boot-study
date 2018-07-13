package com.developlee.readingnotes.chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:08
 * @description
 */
public class Main {

    public static void main(String[] args) {
        /**
         * <p> AnnotationConfigApplicationContext 作为Spring 容器，接受一个配置类作为参数</p>
         */
       // DI方式注入bean
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        //Java配置方式
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       UseFunctionService2 useFunctionService = context.getBean(UseFunctionService2.class);
        System.out.println(useFunctionService.sayHello("Developlee"));
        context.close();
    }
}
