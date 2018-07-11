package com.developlee.j2eespingboot.reposity;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author Lee
 * @// TODO 2018/7/11-14:28
 * @description
 */
public class CustomRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements CustomRepository<T, ID> { //继承simpleJpaRepository可使用它的方法

    private final EntityManager entityManager;

    public CustomRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public void doSomething(ID id) {

    }
}
