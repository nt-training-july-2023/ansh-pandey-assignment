package com.restapi.first.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Project")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int employeeId;
    @Column
    private  String employeeName;
    @Column
    private String employeePhone;



}
