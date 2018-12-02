package com.zbl.springbootcache.controller;


import com.zbl.springbootcache.EmployeeService;
import com.zbl.springbootcache.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable Integer id){
		System.out.println("3");
		return employeeService.getEmp(id);
	}

	@GetMapping("/emp")
	public Employee updateEmp(Employee employee){
		Employee employee1 = employeeService.updateEmp(employee);
		return employee1;
	}

	@GetMapping("/emp/lastName/{lastName}")
	public Employee getEmpByLastName(@PathVariable String lastName){
		return employeeService.getEmployeeByLastName(lastName);
	}

}
