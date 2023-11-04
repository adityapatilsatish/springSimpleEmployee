package com.spring.demo.repository;

import com.spring.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface employeeRepoInterface extends JpaRepository<Employee, Integer> {

    List<Employee> findEmployeeByName(String name);
}
