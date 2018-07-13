package com.developlee.readingnotes.chapter3.condition;

/**
 * @author Lee
 * @// TODO 2018/7/6-17:03
 * @description
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
