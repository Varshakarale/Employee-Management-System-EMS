
package com.emsproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
   
    	@Id
    	@Column(name="employee_id")
    	@GeneratedValue(strategy = GenerationType.AUTO)
    	private int employeeID;
    	
    	@Column(name="first_name")
    	private String firstName;
    	
    	@Column(name="last_name")
    	private String lastName;
    	
    	@NotNull
    	@ManyToOne
    	@JoinColumn(name="department_id")
    	private Department department;
    	
}