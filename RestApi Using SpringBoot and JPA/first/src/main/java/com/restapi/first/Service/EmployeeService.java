package com.restapi.first.Service;


import com.restapi.first.Entity.Employee;

import com.restapi.first.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int Id){
        Employee employee= null;
        employee =this.employeeRepository.findById(Id);
       return employee;
    }
    public  Employee addEmployee(Employee e){
        Employee b1= null;
         b1 = employeeRepository.save(e);
        return b1;
    }
    public void deleteEmployee(int id){
         employeeRepository.deleteById(id);

    }

    public Employee updateEmployee(Employee employee, int id) {
      employee.setEmployeeId(id);
        Employee saved = employeeRepository.save(employee);

        return saved;

    }

    public List<Employee> saveAll(List<Employee> list) {
        return employeeRepository.saveAll(list);


    }

    public void deleteAll() {
        this.employeeRepository.deleteAll();
    }
}
