package com.projectems.dto;

import javax.management.relation.Role;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UserDTO {
	
	private Long id;
    @NotBlank
    private String username;

    @NotBlank
    private String password;

//    @Email
//    private String email;

    private Role role;
    
    
}
