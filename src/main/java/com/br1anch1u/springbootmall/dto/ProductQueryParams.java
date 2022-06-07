package com.br1anch1u.springbootmall.dto;

import com.br1anch1u.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    ProductCategory category;
    String search;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
