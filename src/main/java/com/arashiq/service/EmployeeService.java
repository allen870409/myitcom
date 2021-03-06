package com.arashiq.service;

import com.arashiq.Repository.EmployeeRepository;
import com.arashiq.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployee(String employeeId){
        return employeeRepository.findOne(employeeId);
    }

    public List<Employee> getEmployees(Long userId){
        return employeeRepository.findByUserId(userId);
    }
}
