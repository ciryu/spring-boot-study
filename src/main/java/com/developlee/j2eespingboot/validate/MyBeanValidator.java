package com.developlee.demo.validate;

import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 * @author Lee
 * @// TODO 2018/7/11-16:50
 * @description
 */
public class MyBeanValidator<T> implements Validator<T>, InitializingBean {

    private javax.validation.Validator validator;

    @Override
    public void validate(T value) throws ValidationException {
        validator.validate(value);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator  = validatorFactory.usingContext().getValidator();
    }
}
