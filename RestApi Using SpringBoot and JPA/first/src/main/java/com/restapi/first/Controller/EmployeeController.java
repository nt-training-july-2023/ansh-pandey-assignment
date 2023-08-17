package com.restapi.first.Controller;

import com.restapi.first.FirstApplication;
import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;

import com.restapi.first.Exception.EmployeeNotFoundException;

import com.restapi.first.Exception.ResourceNotFoundException;
import com.restapi.first.Exception.ValidationException;
import com.restapi.first.Service.EmployeeService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author Ansh Pandey
 * @version 1.1
 */
//@Slf4j
@RestController
@RequestMapping("/employees")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 *
	 * @return ResponseEntity Create a ResponseEntity with a body and status code.
	 */
	@GetMapping()
	public ResponseEntity<?> getAllEmployee() {
		FirstApplication.log.info("Request received to find all Employees");
		List<Employee> list = this.employeeService.getAllEmployee();
		if (list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.of(Optional.of(list));
		}
	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @param id
	 * @return ResponseEntity
	 */
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long id) throws EmployeeNotFoundException {
		FirstApplication.log.info("Request received to find Employees by id {}", id);
		if (id <= 0) {
			String errorMessage = "Invalid Employee Id";
			FirstApplication.log.error(errorMessage);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		Employee employee;
		try {
			employee = employeeService.getEmployeeById(id);
		} catch (EmployeeNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		return ResponseEntity.of(Optional.of(employee));
	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @param employeeContract
	 * @return ResponseEntity
	 */
	@PostMapping
	public ResponseEntity<?> addEmployee(@RequestBody @Valid EmployeeContract employeeContract) {
		FirstApplication.log.info("Request receieved for Creating New EMPLOYEE");

		Employee emp1 = null;
		try {
			emp1 = employeeService.addEmployee((employeeContract));
		} catch (ValidationException e) {
			FirstApplication.log.error(e.getMessage());
			System.out.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.of(Optional.of(emp1));
	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @param list
	 * @return ResponseEntity list of employee
	 */
	@PostMapping("/SaveAll")
	public ResponseEntity<List<Employee>> saveAll(@RequestBody @Valid List<Employee> list) {
		FirstApplication.log.info("Request receieved for saving all the employee");
		this.employeeService.saveAll(list);
		return ResponseEntity.of(Optional.of(list));
//        }catch (Exception e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @param id
	 * @return ResponseEntity
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") long id) throws EmployeeNotFoundException {
		FirstApplication.log.info("Request receieved for Deleting an Employee");
		try {
			this.employeeService.deleteEmployee(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		} catch (EmployeeNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @return ResponseEntity void
	 */
	@DeleteMapping("/deleteAll")
	public ResponseEntity<?> deleteALl() {
		try {
			this.employeeService.deleteAll();
			return ResponseEntity.status(HttpStatus.OK).build();
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	/**
	 * Create a ResponseEntity with a body and status code.
	 * 
	 * @param employeeContract
	 * @param id
	 * @return ResponseEntity
	 */
	@PutMapping("/{id}")
	public ResponseEntity<?> updateEmployee(@RequestBody @Valid EmployeeContract employeeContract,
			@PathVariable("id") Long id) {
		FirstApplication.log.info("Request Receieved for Updating an Employee");
		Employee employee2 = null;
		try {
			employee2 = employeeService.updateEmployee(employeeContract, id);
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.ok().body(employee2);
	}
}
