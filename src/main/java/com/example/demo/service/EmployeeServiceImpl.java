package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> employees = new ArrayList<>();
	static {
		
		Employee e = new Employee();
		e.setName("Adrian");
		e.setDepartment("IT");
		employees.add(e);
		
		e = new Employee();
		e.setName("Maria");
		e.setDepartment("Civil");
		employees.add(e);
	
	}
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub

	}

}
