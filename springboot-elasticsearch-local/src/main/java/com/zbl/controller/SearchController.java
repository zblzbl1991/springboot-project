package com.zbl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zbl.domain.Product;
import com.zbl.repository.SearchRepository;
import com.zbl.service.SearchService;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhaobaolong
 * @Title: SearchController
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/49:57
 */
@Controller
public class SearchController {
	@Autowired
	SearchService searchService;
	@Autowired
	SearchRepository searchRepository;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	@RequestMapping("/importAll")
	public String importAll(){
		List<Product> products =searchService.selectAll();
		Iterable<Product> productIterable = searchRepository.save(products);
		Iterator<Product> iterator = productIterable.iterator();
		int result = 0;
		while (iterator.hasNext()) {
			result++;
			iterator.next();
		}
		return result+"";
	}

	@RequestMapping("/search")
	@ResponseBody
	public List<Product> search(@RequestBody String content) throws JsonProcessingException {
		QueryStringQueryBuilder qsqb = new QueryStringQueryBuilder(content);
		System.out.println("查询语句:" +qsqb);
		Iterable<Product> products = searchRepository.search(qsqb);

		List<Product> lists =new ArrayList<>();
		products.forEach(product ->lists.add(product) );
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValueAsString(lists);
		return  lists;
	}
	@RequestMapping("/weightSearch")
	@ResponseBody
	public String weightSearch(String content){
			return null;
	}
}
