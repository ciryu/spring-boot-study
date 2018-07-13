package com.developlee.readingnotes.chapter2.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Lee
 * @// TODO 2018/7/6-10:02
 * @description
 */
public class JSR250WayService {
    @PostConstruct
    public void initPost(){
        System.out.println("@ init");
    }

    @PreDestroy
    public void destroyPre(){
        System.out.println("@ destroy");
    }
}
