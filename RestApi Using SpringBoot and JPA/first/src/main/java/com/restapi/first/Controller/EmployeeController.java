package com.restapi.first.Controller;
import com.restapi.first.Entity.Employee;

import com.restapi.first.Service.EmployeeService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController {
   // @RequestMapping(value = "/employee",method = RequestMethod.GET)
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")


    public ResponseEntity<List<Employee>>getAllEmployee(){
        List<Employee> list =this.employeeService.getAllEmployee();
        if(list.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else{
            return ResponseEntity.of(Optional.of(list));
        }

    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable ("id") int id){
        Employee employee = employeeService.getEmployeeById(id);
        if(employee==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        else{
            return ResponseEntity.of(Optional.of(employee));
        }
    }
    @PostMapping("/employee")
    public ResponseEntity< Employee> addEmployee(@RequestBody Employee employee) {
        Employee emp1 = null;
        try {
            emp1 = employeeService.addEmployee((employee));

                return ResponseEntity.of(Optional.of(emp1));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
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


    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable ("id") int id){
      try{
          this.employeeService.deleteEmployee(id);
          return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
      }catch (Exception e){
          e.printStackTrace();
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
    }
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
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee ,@PathVariable("id") int id){
          try{
              this.employeeService.updateEmployee(employee,id);
              return ResponseEntity.ok().body(employee);
          }catch (Exception e){
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
          }


    }


    
}
