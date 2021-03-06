package com.jkoder.employee.service;

import com.jkoder.employee.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IEmployeeService
{
    void createEmp(Employee e);
     
    Mono<Employee> findByEmpId(Integer id);
 
    Flux<Employee> findAllEmp();
 
    Mono<Employee> updateEmp(Employee e);
 
    Mono<Void> deleteEmp(Integer id);
}