package com.restapi.first.Controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;
import com.restapi.first.Service.EmployeeService;

//@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
	@InjectMocks
	EmployeeController employeeController;

	@MockBean
	EmployeeService employeeService;
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper objectMapper;
	
	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	

	@Test
	void getAllEmployee()throws Exception {
		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Alok").employeePhone("94849393")
				.email("alok@gmail.com").build();
		Employee employee2 = Employee.builder().employeeId(3L).employeeName("Ansh").employeePhone("948493453")
				.email("ansh@gmail.com").build();
		when(employeeService.getAllEmployee()).thenReturn(List.of(employee1,employee2));
		 mockMvc.perform(get("/employees"))
		  		
		      .andExpect(status().isOk())
		  .andExpect(jsonPath("$.size()", is(2)));
		 
		
	}

	@Test
	void getEmployeeById()throws Exception {
		Employee employee1 = Employee.builder().employeeId(2L).employeeName("Alok").employeePhone("94849393")
				.email("alok@gmail.com").build();
		when(employeeService.getEmployeeById(2l)).thenReturn(employee1);
		mockMvc.perform(get("/employees/2"))
		       .andExpect(status().isOk())
		       .andExpect(jsonPath("$.name", is(employee1.getEmployeeName())));	
	}

	@Test
    void addEmployee() throws Exception {
        EmployeeContract employeeContract = EmployeeContract.builder()

                .employeeName("Alok")
                .employeePhone("94849393")
                .email("alok@gmail.com")
                .salary(345D)
                .build();

        Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Alok")
                .employeePhone("9484939233")
                .email("alok@gmail.com")
                .build();
//        when(employeeService.addEmployee(employeeContract)).thenReturn(employee1);
        when(employeeService.addEmployee(any(EmployeeContract.class))).thenReturn(employee1);
        this.mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON)
        		
        		.content(asJsonString(employee1))).andExpect(status().isOk());
    }


	@Test
	void updateEmployee()throws Exception {
	      EmployeeContract employeeContract = EmployeeContract.builder()

	                .employeeName("Alok")
	                .employeePhone("94849393")
	                .email("alok@gmail.com")
	                .salary(345D)
	                .build();

	        Employee employee1 = Employee.builder()
	                .employeeId(2L)
	                .employeeName("Alok")
	                .employeePhone("9484939233")
	                .email("alok@gmail.com")
	                .build();
	        when(employeeService.updateEmployee(employeeContract, 2L)).thenReturn(employee1);
	        mockMvc.perform(put("/employees/2")
	        		.accept(MediaType.APPLICATION_JSON)
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(asJsonString(employee1)))
	        .andExpect(status().isOk());
		
	}

	@Test
	void deleteEmployee() throws Exception {
		Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Alok")
                .employeePhone("9484939233")
                .email("alok@gmail.com")
                .build();
//		employeeService.deleteEmployee(2l);
		doNothing().when(employeeService).deleteEmployee(2l);
		mockMvc.perform(delete("/employee/2l")
				.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	
	}

	
}