package com.tw.apistackbase.controller;

import com.tw.apistackbase.controller.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeesResource {

    private final Logger log = Logger.getLogger(this.getClass().getName());
    private EmployeeService employeeService;

    @Autowired
    public EmployeesResource(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAll() {

        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAll();

        return ResponseEntity.ok(employees);
    }

}
