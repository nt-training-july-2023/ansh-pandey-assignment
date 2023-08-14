package com.restapi.first.Service;


import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;

import com.restapi.first.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        List<Employee> list = employeeRepository.findAll();
             if(list.isEmpty()){
                 throw new RuntimeException("List is Empty");
             }
            return list;
    }
    public Employee getEmployeeById(long Id){

        Optional<Employee> employee1= employeeRepository.findById(Id);
       return employee1.get();
    }
    public  Employee addEmployee(EmployeeContract employeeContract){
        Employee employee=Employee.builder()
                .employeeName(employeeContract.getEmployeeName())
                .employeePhone(employeeContract.getEmployeephone())
                .email(employeeContract.getEmail())
                .salary(employeeContract.getSalary())
                .build();
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(long id){
         employeeRepository.deleteById(id);

    }

    public Employee updateEmployee(Employee employee, long id) {
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
