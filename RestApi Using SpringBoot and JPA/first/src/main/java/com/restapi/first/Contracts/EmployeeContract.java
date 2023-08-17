package com.restapi.first.Contracts;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmployeeContract {
    @NotNull(message = "username cannot be null")
	String employeeName;
	@Pattern(regexp = "[0-9]{10}$",message = "Phone number must be 10 digit number")
	String employeePhone;
	@NotNull
	double salary;
	@NotNull
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}" ,message = "Email address invalid")
	String email;
//    String department;
}
