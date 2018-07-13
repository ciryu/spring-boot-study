package com.developlee.readingnotes.chapter3.asyncTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/6-15:52
 * @description   并发执行的噢
 */
@Service
public class AsyncTaskService {

    @Async
    public void executorAsyncTask(Integer i){
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1: " + (i+1));
    }


}
