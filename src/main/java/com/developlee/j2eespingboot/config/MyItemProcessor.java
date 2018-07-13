package com.developlee.demo.config;

import com.developlee.demo.Entity.Person;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * @author Lee
 * @// TODO 2018/7/11-16:43
 * @description  数据校验及处理都是由 itemProcessor来处理
 */
public class MyItemProcessor extends ValidatingItemProcessor<Person> implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person person) throws ValidationException {
        super.process(person);
        return person;
    }
}
