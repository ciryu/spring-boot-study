package com.developlee.j2eespingboot.reposity;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @author Lee
 * @// TODO 2018/7/11-14:19
 * @description 自定义repository
 */
@NoRepositoryBean  //指明当前类不是我们领域类的接口
public interface CustomRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> { //自定义实现PagingAndSortingRepository接口，具备分页和排序能力

    public void doSomething(ID id); //定义具体的操作方法

}
