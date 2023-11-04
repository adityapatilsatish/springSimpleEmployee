package com.spring.demo.service;

import com.spring.demo.entity.CommisionEmp;
import com.spring.demo.entity.Employee;
import com.spring.demo.repository.CommisionEmpRepo;
import com.spring.demo.repository.employeeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commisionEmpService {

    @Autowired
    private CommisionEmpRepo commisionEmpRepo;

    public CommisionEmp addCommisionEmp(CommisionEmp commisionEmp){
        CommisionEmp save = commisionEmpRepo.save(commisionEmp);
        return save;
    }

}
