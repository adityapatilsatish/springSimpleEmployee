package com.spring.demo.service;

import com.spring.demo.entity.CommisionEmp;
import com.spring.demo.entity.Employee;
import com.spring.demo.repository.employeeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService {

    @Autowired
    private employeeRepoInterface EmployeeRepo;

    public Employee saveEmployee(Employee Employee){
        Employee save = EmployeeRepo.save(Employee);
        return save;
    }

    public void saveAllEmployees(List<Employee> EmployeeList){

        EmployeeRepo.saveAll(EmployeeList);
//        for (Employee Employee : EmployeeList) {
//            EmployeeRepo.save(Employee);
//        }

    }

    public List<Employee> getEmployees(){
        return EmployeeRepo.findAll();

    }

    public Employee getEmployeeById(int Id){
        return EmployeeRepo.findById(Id).orElse(null);
    }

    public List<Employee> getEmployeeByName(String name){
        return EmployeeRepo.findEmployeeByName(name);
    }

    public String deleteEmployeeById(int id){
        EmployeeRepo.deleteById(id);
        return "Employee deleted" + id;
    }

    public Employee updateEmployee(Employee employee){
        Employee excestingEmployee = EmployeeRepo.findById(employee.getEpmployeId()).orElse(null);

        if (excestingEmployee == null){
            System.out.println("Invalid Input");
            return null;
        }

        excestingEmployee.setName(employee.getName());
        excestingEmployee.setDoj(employee.getDoj());
        excestingEmployee.setCommissions(employee.getCommissions());

        return EmployeeRepo.save(excestingEmployee);

    }

    public List<Employee> saveEmployees(List<Employee> Employees){

        return EmployeeRepo.saveAll(Employees);
    }

    public Employee updateCommisionEmployee(Employee employee) {

        Employee excestingEmployee = EmployeeRepo.findById(employee.getEpmployeId()).orElse(null);

        if (excestingEmployee == null){
            System.out.println("Invalid Input");
            return null;
        }
        List<CommisionEmp> commissions = new ArrayList<>() ;

        if(excestingEmployee.getCommissions() != null){
            List<CommisionEmp> commissions1 = excestingEmployee.getCommissions();
            commissions.addAll(commissions1);
        }

        if(employee.getCommissions()!= null){
            commissions.addAll(employee.getCommissions());
        }

        excestingEmployee.setName(employee.getName());
        excestingEmployee.setDoj(employee.getDoj());
        excestingEmployee.setCommissions(commissions);

        return EmployeeRepo.save(excestingEmployee);

    }
}
