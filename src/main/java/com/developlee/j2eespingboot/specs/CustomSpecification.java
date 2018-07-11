package com.developlee.j2eespingboot.specs;

import com.developlee.j2eespingboot.entity.PersonEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @author Lee
 * @// TODO 2018/7/11-14:05
 * @description
 */
public class CustomSpecification {
    public static Specification<PersonEntity> personFromMale(){
        return new Specification<PersonEntity>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<PersonEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("sex"),"male");
            }
        }
    }
}
