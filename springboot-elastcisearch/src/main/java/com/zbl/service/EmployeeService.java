package com.zbl.springbootcache;

import com.zbl.springbootcache.entity.Employee;
import com.zbl.springbootcache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;


	@Cacheable(value = "emp",key = "#id")
	public Employee getEmp(Integer id) {
		System.out.println("查询:" + id + "号员工");
		Employee employeeById = employeeMapper.getEmployeeById(id);
		return employeeById;
	}

	@CachePut( key = "#result.id")
	public Employee updateEmp(Employee employee) {
		System.out.println("update emp:" + employee);
		employeeMapper.updateEmp(employee);
		return employee;
	}

	@Caching(
			cacheable = {
					@Cacheable(/*value = "emp",*/ key = "#lastName")
			}, put = {
				@CachePut(/*value = "emp",*/key = "#result.id"),
				@CachePut(/*value = "emp",*/key="#result.email")

	}
	)
	public Employee getEmployeeByLastName(String lastName) {
		return employeeMapper.getEmployeeByLastName(lastName);
	}
}
