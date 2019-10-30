package com.panda.SpringDataJPARESTfulH2.dao;

import com.panda.SpringDataJPARESTfulH2.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @program: SpringDataJPA-RESTful-H2
 * @description:
 * @author: jiangzq
 * @create: 2019-10-30 18:35
 **/
@RepositoryRestResource(collectionResourceRel = "people",path = "people")
//访问路径
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
    List<Person> findByLastName(@Param("name") String name);
}
