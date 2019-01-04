package com.zbl.dao;

import com.zbl.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaobaolong
 * @Title: SearchDao
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/49:58
 */
@Repository
public interface SearchDao {
	@Select("select * from pms_product")
	List<Product> selectAll();
}
