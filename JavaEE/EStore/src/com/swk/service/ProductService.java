package com.swk.service;

import java.util.List;

import com.swk.bean.Product;

public interface ProductService {

    public List<Product> findProduct();

    public Product findProductById(int id);

}
