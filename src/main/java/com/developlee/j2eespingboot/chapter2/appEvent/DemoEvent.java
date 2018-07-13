package com.developlee.readingnotes.chapter2.appEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @author Lee
 * @// TODO 2018/7/6-10:14
 * @description
 */
public class DemoEvent extends ApplicationEvent {

    private final static long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
