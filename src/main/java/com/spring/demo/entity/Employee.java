package com.spring.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue
    private int epmployeId;

    private String name;

    private String doj;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="epmployeId",referencedColumnName = "epmployeId")
    private List<CommisionEmp> commissions;
}
