package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees= new ArrayList();

    public EmployeeService (){
        employees.add(new Employee(0,"Xiaoming",20,"Male"));
        employees.add(new Employee(1,"Xiaohong",19,"Female"));
        employees.add(new Employee(2,"Xiaozhi",15,"Male"));
        employees.add(new Employee(3,"Xiaogang",16,"Male"));
        employees.add(new Employee(4,"Xiaoxia",15,"Female"));

    }

    public List<Employee> getAll(){
        return this.employees;
    }
}
