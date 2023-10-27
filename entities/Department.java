package com.emsproject.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_id" , length=20)
    private Long id;

    @NotBlank
    @Column(name = "Dept_Name" , length=20)
    private String name;

    @NotBlank
    @Column(name = "Dept_Desc" , length=100)
    private String description;

	
    
}
