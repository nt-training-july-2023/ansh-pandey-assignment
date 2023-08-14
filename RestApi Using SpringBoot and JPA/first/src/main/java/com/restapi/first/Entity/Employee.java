package com.restapi.first.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@EqualsAndHashCode
@Builder
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    @NonNull
    @Column(name ="Emp_Name")
    private String employeeName;
    @NonNull
    @Column(unique = true,name ="Emp_Phone")
    private String employeePhone;
    @NonNull
    private double salary;
    @Column(unique = true,name ="Email")
    @NonNull
    private String email;

    @Enumerated(EnumType.STRING)
    private Department department;
}

