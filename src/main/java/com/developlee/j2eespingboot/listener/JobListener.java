package com.developlee.demo.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author Lee
 * @// TODO 2018/7/11-16:34
 * @description
 */
public class JobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        //job开始前
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        //job完成后
    }
}
