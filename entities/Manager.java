package com.emsproject.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "managers")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveid;

    @NotBlank
    @Column(name = "UseName")
    private String username;

    @NotBlank
    @Column(name = "Password")
    private String password;

    @Email
    @Column(name = "Mail")
    private String email;

	private Date getJoinDate;

	public void setId(Object object) {
		// TODO Auto-generated method stub
		
	}  
    
}