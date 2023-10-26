package com.projectems.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "FirstName" , length=20)
    private String firstName;

    @NotBlank
    @Column(name = "LastName" , length=20)
    private String lastName;

    @Email
    @Column(name = "Mail" , length=20 )
    private String email;
   
//    @ManyToOne
//    @Column(name = "Department")
//    private Department department; // Relationship with Department
//    @OneToOne
//    @Column(name = "Salary")
//    private Salary salary; // Relationship with Salary
//
//    @Column(name = "hire_date")
//    private Date hireDate;

    
}
