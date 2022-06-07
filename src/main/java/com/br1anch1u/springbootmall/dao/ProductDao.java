package com.br1anch1u.springbootmall.dao;

import com.br1anch1u.springbootmall.constant.ProductCategory;
import com.br1anch1u.springbootmall.dto.ProductRequest;
import com.br1anch1u.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}
