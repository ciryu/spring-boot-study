package com.developlee.readingnotes.chapter4.msgConvert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author Lee
 * @// TODO 2018/7/9-10:49
 * @description
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/**");
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters){
            converters.add(converter());
    }

    @Bean
    public MessageConvert converter(){
        return new MessageConvert();
    }
}
