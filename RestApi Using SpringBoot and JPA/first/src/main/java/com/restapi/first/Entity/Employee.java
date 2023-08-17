package com.restapi.first.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
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
	@Column(name = "Emp_Name", nullable = false)
	private String employeeName;
	@Column(unique = true, name = "Emp_Phone", nullable = false)
	private String employeePhone;
	@Column(name = "Salary",nullable = false)
	private double salary;
	@Column(unique = true, name = "Email", nullable = false)
	private String email;
	@Enumerated(EnumType.STRING)
	private Department department;
}
