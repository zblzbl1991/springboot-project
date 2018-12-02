package com.zbl.springbootcache.controller;

import com.zbl.springbootcache.entity.Department;
import com.zbl.springbootcache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	@Autowired
	DeptService deptService;
	@GetMapping("/dept/{id}")
	public Department getDeptById(@PathVariable Integer id){
		return deptService.getDeptById(id);
	}
}
