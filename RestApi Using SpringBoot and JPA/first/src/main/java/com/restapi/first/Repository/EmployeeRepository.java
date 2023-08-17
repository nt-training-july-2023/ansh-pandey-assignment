package com.restapi.first.Repository;


import com.restapi.first.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

       boolean existsByEmail(String email);
}
