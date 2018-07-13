package com.developlee.readingnotes.chapter4.msgConvert;

/**
 * @author Lee
 * @// TODO 2018/7/9-11:37
 * @description
 */
public class DemoObj {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoObj(Long aLong, String s) {
        this.id = aLong;
        this.name = s;
    }
}
