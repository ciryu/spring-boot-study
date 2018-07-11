package com.developlee.j2eespingboot.service;

import com.developlee.j2eespingboot.entity.PersonEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Lee
 * @// TODO 2018/7/11-14:10
 * @description
 */
public interface PersonService {
    List<PersonEntity> findBySex();
    List<PersonEntity> findByNameSort();
    Page<PersonEntity> findByNamePage();
}
