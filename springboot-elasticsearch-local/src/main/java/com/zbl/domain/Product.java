package com.zbl.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhaobaolong
 * @Title: Product
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/410:06
 */
@Document(indexName = "pms", type = "product",shards = 1,replicas = 0)
public class Product {
	private static final long serialVersionUID = -1L;
	@Id
	private Long id;
	@Field(index = FieldIndex.not_analyzed,type = FieldType.String)
	private String productSn;
	private Long brandId;
	@Field(index = FieldIndex.not_analyzed,type = FieldType.String)
	private String brandName;
	private Long productCategoryId;
	@Field(index = FieldIndex.not_analyzed,type = FieldType.String)
	private String productCategoryName;
	private String pic;
	@Field(analyzer = "ik_max_word",type = FieldType.String)
	private String name;
	@Field(analyzer = "ik_max_word",type = FieldType.String)
	private String subTitle;
	@Field(analyzer = "ik_max_word",type = FieldType.String)
	private String keywords;
	private BigDecimal price;
	private Integer sale;
	private Integer newStatus;
	private Integer recommandStatus;
	private Integer stock;
	private Integer promotionType;
	private Integer sort;
	@Field(type =FieldType.Nested)
	private List<ProductAttrbuite> attrValueList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductSn() {
		return productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}

	public Integer getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(Integer newStatus) {
		this.newStatus = newStatus;
	}

	public Integer getRecommandStatus() {
		return recommandStatus;
	}

	public void setRecommandStatus(Integer recommandStatus) {
		this.recommandStatus = recommandStatus;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(Integer promotionType) {
		this.promotionType = promotionType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public List<ProductAttrbuite> getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(List<ProductAttrbuite> attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
