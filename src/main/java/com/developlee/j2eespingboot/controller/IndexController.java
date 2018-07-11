package com.developlee.j2eespingboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lee
 * @// TODO 2018/7/11-9:53
 * @description
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "Test is Running!";
    }
}
