package com.zbl.springbootcache.mapper;

import com.zbl.springbootcache.entity.Department;
import org.apache.ibatis.annotations.Select;

public interface DepartmentMapper {

	@Select("select * from department where id=#{id}")
	Department getDeptById(Integer id);
}
