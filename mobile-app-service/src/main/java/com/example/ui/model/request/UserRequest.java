package com.example.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRequest {
	@NotNull(message="First Name cannot be null.")
	private String fName;
	
	@NotNull(message="Last Name Cannot be null.")
	private String lName;
	
	@NotNull(message="Email should not be null")
	@Email
	private String emaiId;
	
	private String userId;
	
	@NotNull(message="Password cannot be null.")
	@Size(min=8, max=16, message = "Password must be minimum 8 and maximum 16.")
	private String password;
}
