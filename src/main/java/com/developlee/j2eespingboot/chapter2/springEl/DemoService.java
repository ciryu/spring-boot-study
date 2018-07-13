package com.developlee.readingnotes.chapter2.springEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/5-22:17
 * @description
 */
@Service
public class DemoService {

    @Value("其他的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
