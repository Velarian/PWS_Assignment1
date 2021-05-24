package com.PWS.DEMO.Service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.PWS.DEMO.Entity.Employees;
import com.PWS.DEMO.Repository.employeesRepository;

@Service
public class employeesService {
    @Autowired
    private employeesRepository repository;
    public List<Employees> getAllEmployees() {
    return repository.findAll();
       
        
    }
    public Employees getEmployeeById(long eid) {
        // TODO Auto-generated method stub
        
        return repository.findById(eid).orElse(new Employees());
    }
    public Employees addEmp(Employees employees) {
        // TODO Auto-generated method stub
        
        return repository.save(employees);
    }
    public List<Employees> getEmployeeBySalary(long Salary) {
        // TODO Auto-generated method stub
        return repository.findBySalary(Salary);
    }
    public Employees updateEmployee(Employees employees) {
        // TODO Auto-generated method stub
        Employees existingEmployees=repository.findById(employees.getEid()).orElse(null);
        existingEmployees.setEid(employees.getEid());
        existingEmployees.setName(employees.getName());
        existingEmployees.setSalary(employees.getSalary());
        System.out.println(employees.getClass());
        return repository.save(existingEmployees);
    }
    public String deleteEmployee(long eid) {
        repository.deleteById(eid); 
        return "deleted"+eid;
        // TODO Auto-generated method stub
        
        
    }

}
