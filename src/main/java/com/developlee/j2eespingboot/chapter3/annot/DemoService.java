package com.developlee.readingnotes.chapter3.annot;

import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/9-9:45
 * @description
 */
@Service
public class DemoService {
    public void outputResult (){
        System.out.println("从组合注解配置照样获取bean");
    }
}
