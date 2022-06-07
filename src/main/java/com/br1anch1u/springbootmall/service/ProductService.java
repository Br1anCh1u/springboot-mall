package com.br1anch1u.springbootmall.service;

import com.br1anch1u.springbootmall.constant.ProductCategory;
import com.br1anch1u.springbootmall.dto.ProductQueryParams;
import com.br1anch1u.springbootmall.dto.ProductRequest;
import com.br1anch1u.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
