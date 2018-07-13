package com.developlee.readingnotes.chapter1;

import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/5-16:58
 * @description  创建一个功能类Bean , 使用@Service 注解声明当前类是Spring管理的一个Bean
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello," + word + "!";
    }
}
