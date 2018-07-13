package com.developlee.readingnotes.chapter2.appEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Lee
 * @// TODO 2018/7/6-10:21
 * @description
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("DemoListener had received DemoPublisher's Msg: " + msg);
    }
}
