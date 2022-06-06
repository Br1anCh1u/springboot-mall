package com.br1anch1u.springbootmall.dao;

import com.br1anch1u.springbootmall.dto.ProductRequest;
import com.br1anch1u.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
