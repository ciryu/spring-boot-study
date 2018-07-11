package com.developlee.j2eespingboot.service.impl;

import com.developlee.j2eespingboot.entity.PersonEntity;
import com.developlee.j2eespingboot.reposity.PersonRepository;
import com.developlee.j2eespingboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import static com.developlee.j2eespingboot.specs.CustomSpecification.*;

import java.util.List;

/**
 * @author Lee
 * @// TODO 2018/7/11-14:10
 * @description
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonEntity> findBySex(){
        return personRepository.findAll(personFromMale());
    }

    @Override
    public List<PersonEntity> findByNameSort() {
        List<PersonEntity> personEntityList = personRepository.findByName("xx", new Sort(Sort.Direction.ASC,"age"));
        return personEntityList;
    }

    @Override
    public Page<PersonEntity> findByNamePage() {
        return personRepository.findByName("xx", new QPageRequest(0,10));
    }
}
