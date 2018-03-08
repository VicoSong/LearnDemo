package com.swk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.swk.bean.Product;
import com.swk.service.ProductService;
import com.swk.service.impl.ProductServiceImpl;

/**
 * Description:当前Servlet主要用于完成添加购物车功能
 * @author Vico
 *
 */
public class AddCartServlet extends HttpServlet {

    
    public AddCartServlet() {
	super();
    }

   
    public void destroy() {
	super.destroy(); 
    }

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	   //1.获取添加购物车上商品的id
		int id=Integer.parseInt(request.getParameter("id"));
	  //2.根据id查找添加到购物车的物品信息
		ProductService service=new ProductServiceImpl();
		Product product=service.findProductById(id);
	  //3.购买数量，默认1
	
	  //4.创建或获取Session
		HttpSession session=request.getSession();
		//4.1先从Session中获取Map集合，如果为空说明第一次购买，直接将商品信息放到购物车
		Map<Product, Integer> cart=(Map<Product, Integer>) session.getAttribute("cart");
		if(cart==null)
		{
		    	 cart=new HashMap<Product, Integer>();
			cart.put(product, 1);
		}else {
		    //说明购物出已经有商品
		    //判断添加的商品在购物车中是否已经存在，如果存在则数量加1，不存在则增加该条记录
		    for (Map.Entry<Product, Integer> entry:cart.entrySet()) {
			if(entry.getKey().getId()==id)
			{
			    //说明购物车中存在该商品
			    
			    cart.put(product, entry.getValue()+1); 
			    break;
			}else{
			    //说明购物车中不存在该商品
			    cart.put(product, 1);
			}
		    }
		}
		
		
		
		//4.2 说明已经购买
		
	  //5.创建一个Map集合用于存放购物车信息
		
	  //6.将购物出信息保存到Session中
		/*session.setAttribute("cart",cart);*/
	  //7.页面跳转
	request.getRequestDispatcher("/cart.jsp").forward(request, response);
		
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doGet(request, response);
	
    }

    
    public void init() throws ServletException {
	
    }

}
