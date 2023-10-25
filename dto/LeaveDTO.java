package com.projectems.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class LeaveDTO {
	
	 private Long id;
    @NotNull
    private Long employeeId; // Use the employee's ID to link to an employee

    @NotBlank
    private String reason;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;
}
