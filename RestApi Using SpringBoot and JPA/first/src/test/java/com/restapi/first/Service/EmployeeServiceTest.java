package com.restapi.first.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Department;
import com.restapi.first.Entity.Employee;
import com.restapi.first.Exception.EmployeeNotFoundException;
import com.restapi.first.Repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;
	@InjectMocks
	private EmployeeService employeeService;

	@DisplayName("JUnit test for getAllEmployees method")
	@Test
	void testgetAllEmployeeId() {

		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Alok").employeePhone("94849393")
				.email("alok@gmail.com").build();
		Employee employee2 = Employee.builder().employeeId(3L).employeeName("Ansh").employeePhone("948493453")
				.email("ansh@gmail.com").build();
		when(employeeRepository.findAll()).thenReturn(List.of(employee1,employee2));
		List<Employee> list = employeeService.getAllEmployee();

		assertEquals(list.size(), 2);
	}

	@Test
	public void testgetbyId() throws EmployeeNotFoundException {
		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Ansh").employeePhone("94849393")
				.email("Ansh@gmail.com").build();
		when(employeeRepository.findById(2L)).thenReturn(Optional.of(employee1));
		Employee employeeSaved = employeeService.getEmployeeById(employee1.getEmployeeId());

		assertThat(employeeSaved).isNotNull();

	}

	@Test
	public void testaddEmployee() throws Exception {
		// Arrange
		EmployeeContract employeeContract = new EmployeeContract("Ansh Pandey", "875478378",48393d,"hfhd");

		
		Employee employee = Employee.builder().employeeId(2L).employeeName("Alok").employeePhone("94849393")
				.email("alok@gmail.com").build();
		when(employeeRepository.save(Mockito.any(Employee.class))).thenReturn(employee);

		Employee result = employeeService.addEmployee(employeeContract);
		assertEquals(employee.getEmployeeName(), result.getEmployeeName());
	}


	
	@Test
	void testDeleteById() {
		
		Department de = Department.Enginnering;
		Employee employee = new Employee(1l, "Ansh Pandey", "7843734", 37474d, "43784",de);
		when(employeeRepository.findById(1l)).thenReturn(Optional.of( employee));
		doNothing().when(employeeRepository).deleteById(1l);
	    employeeService.deleteEmployee(1l);
		verify(employeeRepository).findById(1l);
		verify(employeeRepository).deleteById(1l);
		
	}

	@Test
	void updateEmployee() throws EmployeeNotFoundException {
		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Ansh").employeePhone("94849393")
				.email("Ansh@gmail.com").build();
		EmployeeContract employeeContract = new EmployeeContract("Ansh Pandey", "875478378", 4367437D, "sdhfb");
		when(employeeRepository.findById(2l)).thenReturn(Optional.of(employee1));
		when(employeeRepository.save(Mockito.any(Employee.class))).thenReturn(employee1);
		
		
		Employee result = employeeService.updateEmployee(employeeContract, 2l);
		
		assertEquals(result, employee1);
	}

	@Test
	void saveAll() {
		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Alok").employeePhone("94849393")
				.email("alok@gmail.com").build();
		Employee employee2 = Employee.builder().employeeId(3L).employeeName("Ansh").employeePhone("948493453")
				.email("ansh@gmail.com").build();
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		when(employeeRepository.saveAll(list)).thenReturn(list);
		List<Employee> employees = employeeService.saveAll(list);
		assertEquals(employees.size(), list.size());
		assertEquals(employees, list);

	}

}