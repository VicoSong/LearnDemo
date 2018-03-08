package com.swk.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.swk.bean.Product;
import com.swk.dao.ProductDao;
import com.swk.utils.JDBCUtils;

public class ProductDaoImpl implements ProductDao {
    private QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public List<Product> findProduct() {
	
	try {
	    String sql="select * from product";
	    List<Product> productList=runner.query(sql, new BeanListHandler<Product>(Product.class));
	    return productList;
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	return null;
    }
    @Override
    public Product findProductById(int id) {
	
	try {
	    String sql="select * from product where id =?";
	    Product product=runner.query(sql,new BeanHandler<Product>(Product.class),id);
	    return product;
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }

}
