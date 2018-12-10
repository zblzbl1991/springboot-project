package com.zbl.mapper;

import com.zbl.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeMapper {

	@Select("select * from employee where id =#{id}")
	public Employee getEmployeeById(Integer id);

	@Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
	public int updateEmp(Employee employee);

	@Delete("delete from employee where id=#{id}")
	public int deleteEmp(Integer id);

	@Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
	public int insertEmp(Employee employee);

	@Select("select * from employee where lastName=#{lastName}")
	Employee getEmployeeByLastName(String lastName);
}
