package com.projectems.entities;

import javax.management.relation.Role;
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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")
    @Column(name = "UserName")
    private String username;

    @NotBlank(message = "Password is required")
    @Column(name = "Password")
    private String password;

    
    @Column(name = "role")
    private Role role; //ADMIN, MANAGER, EMPLOYEE

//    @OneToMany(mappedBy = "user")
//    private List<Employee> employees;

    
}
