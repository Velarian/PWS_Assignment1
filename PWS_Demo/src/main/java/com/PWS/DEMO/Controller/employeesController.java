package com.PWS.DEMO.Controller;

import java.security.PublicKey;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.PWS.DEMO.Entity.Employees;
import com.PWS.DEMO.Service.employeesService;

@RestController
public class employeesController {
    @Autowired
    private employeesService service;
   
    @GetMapping("/getAll")
    public List<Employees> getEmployees() {
        return service.getAllEmployees();   
        } 
    
    @GetMapping("/get/{eid}")
    public Employees getEmployee(@PathVariable long eid) {
        return service.getEmployeeById(eid) ;
        }   
    @GetMapping("/getSal/{Salary}")
    public List<Employees> getEmployeeBySalary(@PathVariable long Salary) {
        return service.getEmployeeBySalary(Salary) ;
        }   
    @PostMapping("/add")
    public String addEmployees(@RequestBody Employees employees) {
        service.addEmp(employees);
        return "Employee Added with id :" +employees.getEid();
}
    @PutMapping("/update/{eid}")
    public Employees updatEmployees(@RequestBody Employees employees)
    {
        return service.updateEmployee(employees);
    }
    @DeleteMapping("delete/{eid}")
    public String deletEmployees(@PathVariable long eid) {
        return service.deleteEmployee(eid);
     
        
    }
    
}
