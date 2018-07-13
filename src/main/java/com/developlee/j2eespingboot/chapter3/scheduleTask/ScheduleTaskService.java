package com.developlee.readingnotes.chapter3.scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lee
 * @// TODO 2018/7/6-16:08
 * @description
 */
@Service
public class ScheduleTaskService {

    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒钟执行一次" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 25 12 ? * *")
    public void fixTimeExecutor(){
        System.out.println("指定时间执行" + dateFormat.format(new Date()) + "执行");
    }
}
