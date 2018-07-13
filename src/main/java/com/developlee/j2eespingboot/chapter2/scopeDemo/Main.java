package com.developlee.readingnotes.chapter2.scopeDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:31
 * @description
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        System.out.println("singleton验证: " + singletonService1.equals(singletonService2));

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("prototype验证: " + prototypeService1.equals(prototypeService2));
    }
}
