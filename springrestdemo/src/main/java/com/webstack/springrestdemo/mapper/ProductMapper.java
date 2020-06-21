package com.webstack.springrestdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.webstack.springrestdemo.dto.ProductDTO;
import com.webstack.springrestdemo.entity.Product;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

	default Product fromId(Integer id) {
		if (id == null)
			return null;
		Product product = new Product();
		product.setId(id);
		return product;
	}

}
