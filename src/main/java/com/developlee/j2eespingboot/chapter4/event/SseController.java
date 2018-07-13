package com.developlee.readingnotes.chapter4.event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author Lee
 * @// TODO 2018/7/9-12:59
 * @description
 */
@RestController
public class SseController {

    @RequestMapping(value = "/push",produces = "text/event-stream")
    public String push(){
        Random random = new Random();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Data:" + random.nextInt();
    }
}
