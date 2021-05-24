package com.PWS.DEMO.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.PWS.DEMO.Entity.Employees;
@EnableMongoRepositories
public interface employeesRepository extends MongoRepository<Employees, Long>{

    @Query("{'Salary':?0}")
    public List<Employees> findBySalary(long Salary);

    
    

}
