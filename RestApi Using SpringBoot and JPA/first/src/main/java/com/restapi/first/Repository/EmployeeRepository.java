package com.restapi.first.Repository;

;

import com.restapi.first.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findById(int id);

}
