package com.restapi.first.Service;

import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Department;
import com.restapi.first.Entity.Employee;
import com.restapi.first.Repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {




    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeService employeeService;

    @DisplayName("JUnit test for getAllEmployees method")
    @Test
    void getEmployeeById() {


            Employee employee1 = Employee.builder()
                    .employeeId(2L)
                    .employeeName("Alok")
                    .employeePhone("94849393")
                    .email("alok@gmail.com")
                    .build();
        Employee employee2 = Employee.builder()
                .employeeId(3L)
                .employeeName("Ansh")
                .employeePhone("948493453")
                .email("ansh@gmail.com")
                .build();
            when(employeeRepository.findAll()).thenReturn(List.of(employee1));
            List<Employee> list = employeeService.getAllEmployee();

            assertEquals(list.size(),2);
    }
    @Test
    public void testgetbyId(){
        Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Ansh")
                .employeePhone("94849393")
                .email("Ansh@gmail.com")
                .build();
        when(employeeRepository.findById(2L)).thenReturn(Optional.of(employee1));
        Employee employeeSaved = employeeService.getEmployeeById(employee1.getEmployeeId());

        assertThat(employeeSaved).isNotNull();

    }
        @Test
        public void testaddEmployee() throws Exception {
            // Arrange
               EmployeeContract employeeContract =new EmployeeContract("Ansh Pandey","875478378",4367437D,"sdhfb");

            Department department ;
            department=Department.Enginnering;
            Employee employee= new Employee(1l,"Ansh Pandey","7843734",37474d,"43784",department);
            when(employeeRepository.save(Mockito.any(Employee.class))).thenReturn(employee);

           Employee result = employeeService.addEmployee(employeeContract);
            assertEquals(employee.getEmployeeName(), result.getEmployeeName());
    }

    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenNothing(){
        // given - precondition or setup
        long employeeId = 1L;

        willDoNothing().given(employeeRepository).deleteById(employeeId);

        // when -  action or the behaviour that we are going test
        employeeService.deleteEmployee(employeeId);

        // then - verify the output
        verify(employeeRepository, times(1)).deleteById(employeeId);
    }

    @Test
    void updateEmployee() {
        Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Ansh")
                .employeePhone("94849393")
                .email("Ansh@gmail.com")
                .build();
        when(employeeRepository.save(employee1)).thenReturn(employee1);
        employee1.setEmployeeName("Roushan");
        employee1.setEmployeePhone("743783");
        Employee result  = employeeService.updateEmployee(employee1,2l);
       // assertThat(employee2.getEmployeeName()).isEqualTo("Roushan");
        assertEquals(result,employee1);
    }

    @Test
    void saveAll() {
        Employee employee1 = Employee.builder()
                .employeeId(2L)
                .employeeName("Alok")
                .employeePhone("94849393")
                .email("alok@gmail.com")
                .build();
        Employee employee2 = Employee.builder()
                .employeeId(3L)
                .employeeName("Ansh")
                .employeePhone("948493453")
                .email("ansh@gmail.com")
                .build();
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        when(employeeRepository.saveAll(list)).thenReturn(list);
        List<Employee> employees= employeeService.saveAll(list);
        assertEquals(employees.size(),list.size());


    }

}