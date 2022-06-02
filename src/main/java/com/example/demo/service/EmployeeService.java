package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployee();
	Employee save(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee (Long id);
	

}
