package com.zbl.repository;

import com.zbl.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhaobaolong
 * @Title: SearchRepository
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/410:04
 */
public interface SearchRepository extends ElasticsearchRepository<Product,Long> {
}
