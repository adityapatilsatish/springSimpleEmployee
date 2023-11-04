package com.spring.demo.repository;

import com.spring.demo.entity.CommisionEmp;
import com.spring.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommisionEmpRepo extends JpaRepository<CommisionEmp, Integer> {

//    List<Employee> findEmployeeByName(String name);
}
