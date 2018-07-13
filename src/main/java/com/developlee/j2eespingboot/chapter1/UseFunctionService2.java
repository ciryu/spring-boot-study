package com.developlee.readingnotes.chapter1;

import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:14
 * @description
 */
public class UseFunctionService2 {
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return "Hello," + word + "!";
    }
}
