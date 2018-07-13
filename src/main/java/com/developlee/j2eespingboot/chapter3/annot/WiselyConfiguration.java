package com.developlee.readingnotes.chapter3.annot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author Lee
 * @// TODO 2018/7/9-9:41
 * @description  组合注解与元注解
 */
@Target(ElementType.TYPE) //注解使用范围
@Retention(RetentionPolicy.RUNTIME) //注解检查时间
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {

    String[] value() default {}; //覆盖value 参数
}
