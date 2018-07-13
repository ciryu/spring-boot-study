package com.developlee.readingnotes.chapter3.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/6-17:06
 * @description  条件注解章节
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令：" +listService.showListCmd());
        context.close();
    }
}
