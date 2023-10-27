package com.emsproject.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Leave_Requests")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee; 

    @NotBlank
    @Column(name = "LeaveReason" , length=200)
    private String reason;

    @NotNull
    @Column(name = "start_date")
    private Date startDate;

    @NotNull
    @Column(name = "end_date")
    private Date endDate;

    
}
