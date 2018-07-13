package com.developlee.readingnotes.chapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:03
 * @description 使用功能类的Bean  DI方式
 */
@Service
public class UseFunctionService {

    /**
     * @// TODO: 2018/7/5 注入FunctionService 到UseFunctionService中
     * 此处使用JSR-330的@Inject 和JSR250的@Resource注解是等效的
     */
    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
