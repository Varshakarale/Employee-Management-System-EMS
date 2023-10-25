package com.projectems.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(staticName="build")
@Data
public class DepartmentDTO {
	
	  private Long id;
    @NotBlank
    private String name;

    @NotBlank
    private String description;
}
