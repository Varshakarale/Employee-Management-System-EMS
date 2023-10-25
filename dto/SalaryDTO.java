package com.projectems.dto;

import lombok.Data;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SalaryDTO {
	
	private Long id;
    @NotNull
    private BigDecimal amount;

    @NotNull
    private Date paymentDate;
}
