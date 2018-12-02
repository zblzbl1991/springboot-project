package com.zbl.springbootcache;

import com.zbl.springbootcache.entity.Employee;
import com.zbl.springbootcache.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;

	@Test
	public void contextLoads() {
		Employee employee = new Employee();
		employee.setEmail("357760876@qq.com");
		employee.setGender(0);
		employee.setLastName("赵宝龙");
		employee.setdId(222);
		employeeMapper.insertEmp(employee);
	}

}
