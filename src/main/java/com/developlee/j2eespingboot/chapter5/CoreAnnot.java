package com.developlee.readingnotes.chapter5;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Lee
 * @// TODO 2018/7/10-13:59
 * @description spring boot 核心注解
 */
public class CoreAnnot {

    //Springboot中大多数AutoConfiguration 注解一般都使用了条件注解

    // @ConditionalOnBean: 当容器里有指定bean的条件下
    //@ConditionalOnClass: 当类路径下有指定的类的条件下
    //@ConditionalOnExpression:  基于SpEL表达式作为判断条件
    //@ConditionalOnJava: 基于Jvm版本作为判断条件
    //@ConditionalOnJndi: 在JNDI存在的条件下查找指定的位置
    //@ConditionalOnMissingBean: 当容器里没有指定Bean的情况下
    //@ConditionalOnMissingClass:当类路径没有指定Bean的情况下
    //@ConditionalOnNotWebApplication 当前项目不是Web项目的条件下
    //ConditionalOnProperty 指定的属性是否有指定的值
    //ConditionalOnResource 类路径是否有指定的值
    //@ConditionalOnSingleCandidate 当指定Bean在容器中只有一个，或者虽然有多个但是指定首选的Bean。
    //@ConditionalOnWebApplication 当前项目是Web项目的条件下


    //这些注解都使用了@Conditional元注解

}
