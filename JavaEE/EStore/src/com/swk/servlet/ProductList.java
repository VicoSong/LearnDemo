package com.swk.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swk.bean.Product;
import com.swk.service.ProductService;
import com.swk.service.impl.ProductServiceImpl;



/**
 * Description:当前Servlet主要用于完成产品展示功能
 * 
 * @author Vico
 *
 */
public class ProductList extends HttpServlet {
    
    public ProductList() {
	super();
    }

   
    public void destroy() {
	super.destroy(); 
    }

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	ProductService service=new ProductServiceImpl();
	List<Product> productList=service.findProduct();
	
	request.setAttribute("products", productList);
	request.getRequestDispatcher("/product.jsp").forward(request, response);
	
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	doGet(request, response);
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
    public void init() throws ServletException {
	// Put your code here
    }

}
