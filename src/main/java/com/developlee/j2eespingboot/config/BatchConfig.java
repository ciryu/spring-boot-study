package com.developlee.demo.config;

import com.developlee.demo.Entity.Person;
import com.developlee.demo.listener.JobListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.item.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author Lee
 * @// TODO 2018/7/11-16:01
 * @description
 * <textarea>
 *     spring batch 组成部分
 *     JobRepository 用来注册Job的容器
 *     JobLauncher 用来启动Job的接口
 *     Job 我们实际要执行的任务。包含一个或多个step
 *     Step 包含ItemReader ItemProcessor ItemWriter
 *     ItemReader 读取数据的接口
 *     ItemProcessor 处理数据的接口
 *     ItemWriter 输出数据的接口
 * </textarea>
 */
@Configuration
@EnableBatchProcessing //开启批处理
public class BatchConfig {

    @Bean
    public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager platformTransactionManager) throws Exception {
        JobRepositoryFactoryBean jobRepositoryFactoryBean = new JobRepositoryFactoryBean();
        jobRepositoryFactoryBean.setDataSource(dataSource);
        jobRepositoryFactoryBean.setTransactionManager(platformTransactionManager);
        jobRepositoryFactoryBean.setDatabaseType("mysql");
        return jobRepositoryFactoryBean.getObject();
    }

    @Bean
    public SimpleJobLauncher simpleJobLauncher(DataSource dataSource, PlatformTransactionManager platformTransactionManager) throws Exception {
        SimpleJobLauncher simpleJobLauncher = new SimpleJobLauncher();
        simpleJobLauncher.setJobRepository(jobRepository(dataSource,platformTransactionManager));
        return simpleJobLauncher;
    }

    @Bean
    public JobListener jobListener (){
        return new JobListener();
    }

    @Bean
    public Job importJob(JobBuilderFactory jobBuilderFactory, Step step1){
        return jobBuilderFactory.get("importJob")
                .incrementer(new RunIdIncrementer())
                .flow(step1)
                .end()
                .listener(jobListener())
                .build();
    }



    @Bean
    public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<Person> reader, ItemWriter<Person> writer, ItemProcessor<Person, Person> processor){
        return stepBuilderFactory.get("step1")
                .<Person, Person> chunk(65000)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public ItemReader<Person> reader() throws Exception {
        ItemReader reader = new ItemReader() {
            @Override
            public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
                return null;
            }
        };
        return reader;
    }
    @Bean
    public ItemProcessor<Person,Person> processor() throws Exception {
        ItemProcessor processor = new ItemProcessor() {
            @Override
            public Object process(Object object) throws Exception {
                return null;
            }
        };

        return processor;
    }
    @Bean
    public ItemWriter<Person> writer() throws Exception {
        ItemWriter writer = new ItemWriter() {
            @Override
            public void write(List list) throws Exception {

            }
        };
        return writer;
    }
}
