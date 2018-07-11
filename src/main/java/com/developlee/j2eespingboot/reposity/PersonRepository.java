package com.developlee.j2eespingboot.reposity;

import com.developlee.j2eespingboot.entity.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @author Lee
 * @// TODO 2018/7/11-13:33
 * @description
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Long>, JpaSpecificationExecutor<PersonEntity> {

    //使用@NamedQuery定义查询语句
    List<PersonEntity> findByName(String name);

    List<PersonEntity> findByNameLike(String name);

    List<PersonEntity> findByNameAndSex(String name, String sex);

    List<PersonEntity> findByAgeLessThan(Integer age);

    List<PersonEntity> findByAgeLessThanEqual(Integer age);

    //查询符合添加的前十条
    List<PersonEntity> findFirst10ByName(String name);

    //查询符合条件的前十条
    List<PersonEntity> findTop10ByName(String name);

    //使用@Query注解来查询 （根据参数索引号）
    @Query("select p from PersonEntity p where p.age = ?1")
    List<PersonEntity> findByAge(Integer age);

    //使用命名参数
    @Query("select p from PersonEntity p where p.sex = :sex ")
    List<PersonEntity> findBySex(@Param("sex") String sex);

    //使用@Modifying和@Query 更新查询
    @Modifying
    @Transactional
    @Query("update PersonEntity p set p.name = ?1")
    int setName(String name);

    List<PersonEntity> findByName(String name, Sort sort);

    Page<PersonEntity> findByName(String name, Pageable pageable);

}
