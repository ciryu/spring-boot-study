package com.developlee.readingnotes.chapter2.springEl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/5-22:10
 * @description
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Elconfig.class);
        Elconfig elconfig = context.getBean(Elconfig.class);
        elconfig.outputResource();
        context.close();
    }
}
