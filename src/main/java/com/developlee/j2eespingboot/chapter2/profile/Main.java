package com.developlee.readingnotes.chapter2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/6-10:12
 * @description
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh(); //刷新配置
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
