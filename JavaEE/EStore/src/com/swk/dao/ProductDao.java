package com.swk.dao;

import java.util.List;

import com.swk.bean.Product;

public interface ProductDao {

    List<Product> findProduct();

    Product findProductById(int id);

}
