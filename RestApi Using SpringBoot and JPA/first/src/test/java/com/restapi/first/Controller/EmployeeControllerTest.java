package com.restapi.first.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;
import com.restapi.first.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.http.ResponseEntity.status;
@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {


    @MockBean
    EmployeeService employeeService;
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getAllEmployee() {
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void addEmployee() throws Exception {
        EmployeeContract employeeContract = EmployeeContract.builder()

                .employeeName("Alok")
                .employeephone("94849393")
                .email("alok@gmail.com")
                .salary(345D)
                .build();

        Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Alok")
                .employeePhone("94849393")
                .email("alok@gmail.com")
                .build();
        when(employeeService.addEmployee(employeeContract)).thenReturn(employee1);
//        mockMvc.perform( post("/employees")
//                .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(employee1)))
//                .andExpect(status(200).isOk());










    }

    @Test
    void saveAll() {
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void deleteALl() {
    }

    @Test
    void updateEmployee() {
    }
}