package com.zbl.service;

import com.zbl.dao.SearchDao;
import com.zbl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaobaolong
 * @Title: SearchService
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/49:57
 */
@Service
public class SearchService {
	@Autowired
	SearchDao searchDao;

	public List<Product> selectAll() {
		return searchDao.selectAll();
	}
}
