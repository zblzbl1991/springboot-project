package com.zbl.dao;

import com.zbl.entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @author zhaobaolong
 * @Title: EmployeeRepository
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/12/411:23
 */
public interface EmployeeRepository extends ElasticsearchCrudRepository<Employee,Integer> {
}
