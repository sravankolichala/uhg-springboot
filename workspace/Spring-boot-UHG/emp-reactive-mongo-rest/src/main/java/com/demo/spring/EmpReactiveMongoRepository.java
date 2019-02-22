package com.demo.spring;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public interface EmpReactiveMongoRepository extends ReactiveMongoRepository<Emp, Integer> {

}
