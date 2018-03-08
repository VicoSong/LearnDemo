package com.swk.service.impl;

import java.util.List;


import com.swk.bean.Product;
import com.swk.dao.ProductDao;
import com.swk.dao.impl.ProductDaoImpl;
import com.swk.service.ProductService;

public class ProductServiceImpl implements ProductService {
    
    private ProductDao productDao=new ProductDaoImpl();
    @Override
    public List<Product> findProduct() {

	List<Product> productList=productDao.findProduct();
	return productList;
    }
    @Override
    public Product findProductById(int id) {
	Product product=productDao.findProductById(id);
	return null;
    }

}
