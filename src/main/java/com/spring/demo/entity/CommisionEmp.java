package com.spring.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CommisionEmp")
public class CommisionEmp {

    @Id
    @GeneratedValue
    private int employeeCommId;


//    private int epmployeId;

    private int month;

    private int year;

    private double commissionAmt;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name="epmployeId")
//    private Employee employee;
}
