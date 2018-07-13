package com.developlee.readingnotes.chapter2.springEl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author Lee
 * @// TODO 2018/7/5-21:58
 * @description
 *
 * 如果 test.properties 放在com.developlee.readingnotes.chapter2.springEl目录下， 会抛出异常java.io.FileNotFoundException
 * class path resource [com/developlee/readingnotes/chapter2/springEl/test.properties] cannot be opened because it does not exist
 * 看到class path resource 推断 idea 是在resource文件夹查找的，放到resource 目录下，改为 classpath:test.properties
 */
@Configuration
@ComponentScan("com.developlee.readingnotes.chapter2.springEl")
@PropertySource("classpath:test.properties")
public class Elconfig {
    @Value("I Love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String anotherOne;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(anotherOne);
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.reader"));
    }
}
