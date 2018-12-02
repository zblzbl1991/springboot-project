package com.zbl.springbootcache.service;


import com.zbl.springbootcache.entity.Department;
import com.zbl.springbootcache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
	@Autowired
	DepartmentMapper departmentMapper;
	@Cacheable(value = "dept")
	public Department getDeptById(Integer id){
		return departmentMapper.getDeptById(id);
	}
}
