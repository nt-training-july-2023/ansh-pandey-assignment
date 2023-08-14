package com.restapi.first.Contracts;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeContract {

    String employeeName;
    String employeephone;
    double salary;
    String email;
//    String department;
}
