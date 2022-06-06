package com.br1anch1u.springbootmall.dao;

import com.br1anch1u.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
