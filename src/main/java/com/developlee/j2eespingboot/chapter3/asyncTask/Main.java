package com.developlee.readingnotes.chapter3.asyncTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lee
 * @// TODO 2018/7/6-15:57
 * @description
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            taskService.executorAsyncTask(i);
            taskService.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
