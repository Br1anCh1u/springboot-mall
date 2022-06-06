package com.br1anch1u.springbootmall.service;

import com.br1anch1u.springbootmall.dto.ProductRequest;
import com.br1anch1u.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
