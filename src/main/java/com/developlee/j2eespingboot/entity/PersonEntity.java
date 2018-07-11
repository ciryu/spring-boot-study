package com.developlee.j2eespingboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

/**
 * @author Lee
 * @// TODO 2018/7/11-13:32
 * @description
 */
@Data
@Entity
@NamedQuery(name = "PersonEntity.findByName", query = "select p from PersonEntity p where p.name = ?1")
public class PersonEntity {
    private String name;
    private String sex;
    private Integer age;

}
