package com.restapi.first.Controller;
import com.restapi.first.Contracts.EmployeeContract;
import com.restapi.first.Entity.Employee;

import com.restapi.first.Exception.NotFoundException;

import com.restapi.first.Service.EmployeeService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author Ansh Pandey
 * @version 1.1
 */
@Slf4j
@RestController
@RequestMapping("/employees")
//@ApiResponses(value = {
//        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
//        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
//        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
//}
//)
public class EmployeeController {
   // @RequestMapping(value = "/employee",method = RequestMethod.GET)
    @Autowired
    private EmployeeService employeeService;


    /**
     *
     * @return ResponseEntity
     * Create a ResponseEntity with a body and status code.
     */
    @GetMapping()
    public ResponseEntity<List<Employee>>getAllEmployee(){
        List<Employee> list =this.employeeService.getAllEmployee();
        if(list.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else{
            return ResponseEntity.of(Optional.of(list));
        }

    }

    /**
     *Create a ResponseEntity with a body and status code.
     * @param id
     * @return ResponseEntity<Employee>
     */
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable ("id") long id){
        Employee employee = employeeService.getEmployeeById(id);
        if(employee==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        else{
            return ResponseEntity.of(Optional.of(employee));
        }
    }

    /**
     *Create a ResponseEntity with a body and status code.
     * @param employeeContract
     * @return ResponseEntity
     */
    @PostMapping()
    public ResponseEntity< Employee> addEmployee(@RequestBody EmployeeContract employeeContract) {
        log.info(employeeContract.toString());
        Employee emp1 = null;
        try {

            emp1 = employeeService.addEmployee((employeeContract));

                return ResponseEntity.of(Optional.of(emp1));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     *Create a ResponseEntity with a body and status code.
     * @param list
     * @return ResponseEntity list of employee
     */
    @PostMapping("/SaveAll")
    public ResponseEntity<List<Employee>> saveAll(@RequestBody List<Employee> list){
        try {
            this.employeeService.saveAll(list);
            return ResponseEntity.of(Optional.of(list));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    /**
     *Create a ResponseEntity with a body and status code.
     * @param id
     * @return ResponseEntity
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable ("id") long id){
      try{
          this.employeeService.deleteEmployee(id);
          return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
      }catch (Exception e){
          e.printStackTrace();
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
    }
    /**
     *Create a ResponseEntity with a body and status code.
     * @return ResponseEntity void
     */
    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteALl(){
       try {
           this.employeeService.deleteAll();
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       }catch (Exception e){
           e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }

    }
    /**
     *Create a ResponseEntity with a body and status code.
     * @param employee
     * @param id
     * @return ResponseEntity
     */
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee ,@PathVariable("id") int id){
          try{
              if(employee==null){
                  throw new NotFoundException("Employee and its id cannot be null");
              }
              Employee employee1 = employeeService.getEmployeeById(id);
              if(employee1==null){
                  throw new NotFoundException(("Employee with given id "+ id+ "is not present"));
              }

              employeeService.updateEmployee(employee,id);
              return ResponseEntity.ok().body(employee);
          }catch (Exception e){
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
          }
    }
}
