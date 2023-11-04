package com.spring.demo.controller;

import com.spring.demo.entity.Employee;
import com.spring.demo.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {

    @Autowired
    employeeService EmployeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee Employee){

        return EmployeeService.saveEmployee(Employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> Employees){

        return EmployeeService.saveEmployees(Employees);
    }

    @GetMapping("/getEmployees")
    public List<Employee> findAllEmployees(){

        return EmployeeService.getEmployees();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee findAllEmployee(@PathVariable int id){

        return EmployeeService.getEmployeeById(id);
    }

    @GetMapping("/getEmployeeByName/{name}")
    public List<Employee> findAllEmployee(@PathVariable String name){

        return EmployeeService.getEmployeeByName(name);
    }


    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee Employee){

        return EmployeeService.updateEmployee(Employee);
    }

    @PutMapping("/updateCommisionEmployee")
    public Employee updateCommisionEmployee(@RequestBody Employee Employee){

        return EmployeeService.updateCommisionEmployee(Employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String updateEmployee(@PathVariable int id){

        return EmployeeService.deleteEmployeeById(id);
    }

}
