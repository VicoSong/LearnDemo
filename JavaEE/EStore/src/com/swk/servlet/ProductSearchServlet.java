package com.swk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swk.bean.Product;
import com.swk.service.ProductService;
import com.swk.service.impl.ProductServiceImpl;

/**
 * Description:当前Servlet主要用于完成查看产品详情功能
 * 
 * @author Vico
 *
 */
public class ProductSearchServlet extends HttpServlet {

   
    public ProductSearchServlet() {
	super();
    }

    public void destroy() {
	super.destroy(); 
    }

 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	//1.接收页面传递过来的id参数
	int id=Integer.parseInt(request.getParameter("id"));
	//2.根据id查找出该物品的详细信息
	ProductService service=new ProductServiceImpl();
	Product product=service.findProductById(id);
	
	request.setAttribute("product", product);
	request.getRequestDispatcher("/product_detail.jsp").forward(request, response);
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	doGet(request, response);
    }

    
    public void init() throws ServletException {
	// Put your code here
    }

}
