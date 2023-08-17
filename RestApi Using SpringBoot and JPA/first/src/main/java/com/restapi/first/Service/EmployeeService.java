package com.restapi.first.Service;

import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;

import com.restapi.first.Exception.DuplicateEmployeeException;
import com.restapi.first.Exception.EmployeeNotFoundException;
import com.restapi.first.Exception.ValidationException;
import com.restapi.first.Repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		log.info("request for list of employee");
		List<Employee> list = employeeRepository.findAll();
		if (list.isEmpty()) {
			log.info("List is Empty");
			throw new RuntimeException("List is Empty");
		}
		return list;
	}

	public Employee getEmployeeById(Long Id) throws EmployeeNotFoundException {

		Optional<Employee> employee1 = employeeRepository.findById(Id);
		if (employee1.isEmpty()) {
			log.error("employee with id "+Id+" not found...");
			throw new EmployeeNotFoundException(Id);
		}
		return employee1.get();
	}

	public Employee addEmployee(EmployeeContract employeeContract) {
		log.info("Request received for creating the employee in Employee in Employee Servicc");

		Employee employee = Employee.builder().employeeName(employeeContract.getEmployeeName())
				.employeePhone(employeeContract.getEmployeePhone()).email(employeeContract.getEmail())
				.salary(employeeContract.getSalary()).build();

		Employee employee2;
		try {
		 employee2= employeeRepository.save(employee);
		}catch (DataIntegrityViolationException e) {
			throw new ValidationException("duplicate either email or ContactNo");
		}

		return employee2;
	}

	public void deleteEmployee(long id) throws EmployeeNotFoundException {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isEmpty()) {
			throw new EmployeeNotFoundException(id);
		} else {
			employeeRepository.deleteById(id);
		}

	}

	public Employee updateEmployee(EmployeeContract employeeContract, long id) throws EmployeeNotFoundException {
		Optional<Employee> employee1 = employeeRepository.findById(id);
		if (employee1.isEmpty()) {
			throw new EmployeeNotFoundException(id);
		}

		if (employeeRepository.existsByEmail(employeeContract.getEmail())
				&& employee1.get().getEmail() != employeeContract.getEmail()) {
			throw new DuplicateEmployeeException(
					"Employee with mail " + employeeContract.getEmail() + " already exist");
		}

		else {
			Employee employee = Employee.builder().employeeName(employeeContract.getEmployeeName())
					.employeePhone(employeeContract.getEmployeePhone()).email(employeeContract.getEmail())
					.salary(employeeContract.getSalary()).build();
			return employeeRepository.save(employee);
		}

	}

	public List<Employee> saveAll(List<Employee> list) {
		return employeeRepository.saveAll(list);
	}

	public void deleteAll() {
		this.employeeRepository.deleteAll();
	}
}
