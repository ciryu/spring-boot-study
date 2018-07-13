package com.developlee.readingnotes.chapter2.initdestroy;

import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/6-9:57
 * @description
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy (){
        System.out.println("@Bean-destroy-method");
    }
}
