package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees= new ArrayList();
    private int id = 0;

    public EmployeeService (){
        Employee employeeA = new Employee("Xiaoming",20,"Male");
        employeeA.setId(id);
        employees.add(employeeA);
        id++;

        Employee employeeB = new Employee("Xiaohong",19,"Female");
        employeeB.setId(id);
        employees.add(employeeB);
        id++;

        Employee employeeC = new Employee("Xiaozhi",15,"Male");
        employeeC.setId(id);
        employees.add(employeeC);
        id++;

        Employee employeeD = new Employee("Xiaogang",16,"Male");
        employeeD.setId(id);
        employees.add(employeeD);
        id++;

        Employee employeeE = new Employee("Xiaoxia",15,"Female");
        employeeE.setId(id);
        employees.add(employeeE);
        id++;

    }

    public List<Employee> getAll(){
        return this.employees;
    }

    public Employee addEmployee(Employee employee){
        employee.setId(this.id);
        this.id++;
        return employee;
    }


}
