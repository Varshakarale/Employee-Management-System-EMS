package com.projectems.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok's @Data annotation will automatically generate getters,and other necessary methods for you 
@NoArgsConstructor
@AllArgsConstructor(staticName="build")
public class AdminDTO 
{
	private Long id;
    @NotBlank
    @NotNull(message="Username cannot be null")
    private String username;

    @NotBlank
    private String password;

    @Email(message="Enter proper email")
    private String email;

    private Date joinDate;
}

