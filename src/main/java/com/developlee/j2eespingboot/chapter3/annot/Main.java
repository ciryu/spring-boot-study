package com.developlee.readingnotes.chapter3.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/9-9:49
 * @description
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
