package com.zbl.controller;

import com.zbl.dao.EmployeeRepository;
import com.zbl.entity.Employee;
import com.zbl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaobaolong
 * @Title: EmployeeController
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/12/411:24
 */

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/emp/save")
	public String save(){
		return "null";
	}

	@GetMapping("/emp/{id}")
	@ResponseBody
	public Employee get(@PathVariable Integer id){
		Employee employee = employeeRepository.findOne(id);
		if(employee==null){
			employee = employeeService.getEmp(id);
			if(employee!=null){
				employeeRepository.save(employee);
				return employee;
			}
		}
		return employee;

	}
}
