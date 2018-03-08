package com.swk.librarymanagerdemo.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.swk.librarymanagerdemo.model.BookBorrowInfo;
import com.swk.librarymanagerdemo.model.BookInfo;
import com.swk.librarymanagerdemo.model.BookOrderInfo;
import com.swk.librarymanagerdemo.model.BookReturn;
import com.swk.librarymanagerdemo.model.BookType;
import com.swk.librarymanagerdemo.model.Operator;
import com.swk.librarymanagerdemo.model.user;




/**
 *功能：数据库操作方法类，该类中封装了和数据库有关的操作的方法
 *@author Administrator
 *@version
 * */
public class SQLMethod {
//	
	//登录方法
	public static Operator loginCheck(String user,String password)
	{
		Operator operator=new Operator();
		String sql="SELECT username,userpassword FROM OperatorInfo WHERE username="+"'"+user+"'"+"and userpassword="+"'"+password+"'";
		ResultSet rs=Dao.executeQuery(sql);
		try {
			while(rs.next())
			{
				String userName=rs.getString("username");
				
				operator.setUserName(userName);
				
				String userPassword=rs.getString("userpassword");
				
				operator.setUserPassword(userPassword);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		   
		}
		Dao.close();
		return operator;
	}
	
	/*
	 * 查询类别方法
	 */
	public static List selectBookCategory() {
		List list=new ArrayList();
		String sql = "select *  from tb_bookType";
		ResultSet rs = Dao.executeQuery(sql);
		try {
			while (rs.next()) {
				BookType bookType=new BookType();
				bookType.setBookTypeID(rs.getString("id"));
				bookType.setTypeName(rs.getString("typeName"));
				bookType.setDays(rs.getString("days"));
				bookType.setFinePerDay(rs.getString("fk"));
				list.add(bookType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Dao.close();
		return list;
		
	}
	public static List selectBookCategory(String bookType) {
		List list=new ArrayList();
		String sql = "select days  from tb_bookType where typeName='"+bookType+"'";
		ResultSet rs = Dao.executeQuery(sql);
		try {
			while (rs.next()) {
				BookType type=new BookType();
				type.setDays(rs.getString("days"));
				list.add(type);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Dao.close();
		return list;
		
	}
	
	
	/*
	 * 查询图书相关信息
	 * 
	 */
	public static List selectBookInfo() {
		List list=new ArrayList();
		String sql = "select *  from tb_bookInfo";
		ResultSet rs = Dao.executeQuery(sql);
		try {
			while (rs.next()) {
				BookInfo bookinfo=new BookInfo();
				bookinfo.setBookISBN(rs.getString("ISBN"));
				bookinfo.setTypeId(rs.getString("typeid"));
				bookinfo.setBookName(rs.getString("bookname"));
				bookinfo.setWriter(rs.getString("writer"));
				bookinfo.setTranslator(rs.getString("translator"));
				bookinfo.setPublisher(rs.getString("publisher"));
				bookinfo.setDate(rs.getDate("date"));
				bookinfo.setPrice(rs.getDouble("price"));
				list.add(bookinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Dao.close();
		return list;
	}
	public static List selectBookInfo(String ISBN) {
		List list=new ArrayList();
		String sql = "select *  from tb_bookInfo where ISBN='"+ISBN+"'";
		ResultSet rs = Dao.executeQuery(sql);
		try {
			while (rs.next()) {
				BookInfo bookinfo=new BookInfo();
				bookinfo.setBookISBN(rs.getString("ISBN"));
				bookinfo.setTypeId(rs.getString("typeid"));
				bookinfo.setBookName(rs.getString("bookname"));
				bookinfo.setWriter(rs.getString("writer"));
				bookinfo.setTranslator(rs.getString("translator"));
				bookinfo.setPublisher(rs.getString("publisher"));
				bookinfo.setDate(rs.getDate("date"));
				bookinfo.setPrice(rs.getDouble("price"));
				list.add(bookinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Dao.close();
		return list;
	}
	
	/*
	 * 插入图书信息方法
	 */
	public static int Insertbook(String ISBN,String typeId,String bookname,String writer,String translator,String publisher,Date date,Double price){
		int i=0;
		try{
			String sql="insert into tb_bookInfo(ISBN,typeId,bookname,writer,translator,publisher,date,price) values('"+ISBN+"','"+typeId+"','"+bookname+"','"+writer+"','"+translator+"','"+publisher+"','"+date+"',"+price+")";
			//System.out.println(sql);
			i=Dao.executeUpdate(sql);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		Dao.close();
		return i;
	}
	/*
	 * 修改图书信息方法
	 */
	public static int Updatebook(String ISBN,String typeId,String bookname,String writer,String translator,String publisher,Date date,Double price){
		int i=0;
		try{
			String sql="update tb_bookInfo set ISBN='"+ISBN+"',typeId='"+typeId+"',bookname='"+bookname+"',writer='"+writer+"',translator='"+translator+"',publisher='"+publisher+"',date='"+date+"',price="+price+" where ISBN='"+ISBN+"'";
			//System.out.println(sql);
			i=Dao.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		Dao.close();
		return i;
	}
	
	/*
	 * 对订购信息表操作
	 */
		public static int InsertBookOrder(String ISBN,Date date,String number,String operator,String checkAndAccept,Double zk){
			int i=0;
			try{
				String sql="insert into tb_order(ISBN,date,number,operator,checkAndAccept,zk) values('"+ISBN+"','"+date+"','"+number+"','"+operator+"',"+checkAndAccept+",'"+zk+"')";
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
			
		}
		public static List selectBookOrder() {
			List list=new ArrayList();
			String sql = "SELECT * FROM tb_order a INNER JOIN tb_bookInfo b ON a.ISBN = b.ISBN";
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					BookOrderInfo order=new BookOrderInfo();
					BookInfo bookInfo=new BookInfo();
					order.setBookISBN(rs.getString("ISBN"));;
					order.setOrderDate(rs.getDate("date"));
					order.setNumber(rs.getString("number"));
					order.setOperator(rs.getString("operator"));
					order.setCheckAndAccept(rs.getString("checkAndAccept"));
					order.setDiscount(String.valueOf(rs.getDouble("discount")));;
					bookInfo.setTypeId(rs.getString("typeId"));
					bookInfo.setBookName(rs.getString("bookName"));
					bookInfo.setWriter(rs.getString("writer"));
					bookInfo.setTranslator(rs.getString("translator"));;
					bookInfo.setPublisher(rs.getString("publisher"));
					bookInfo.setDate(rs.getDate(12));
					bookInfo.setPrice(rs.getDouble("price"));
					list.add(order);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		public static List selectBookOrder(String ISBN) {
			List list=new ArrayList();
			String sql = "SELECT * FROM tb_order where ISBN='"+ISBN+"'";
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					BookOrderInfo order=new BookOrderInfo();
					order.setBookISBN(rs.getString("ISBN"));
					order.setOrderDate(rs.getDate("date"));
					order.setNumber(rs.getString("number"));
					order.setOperator(rs.getString("operator"));
					order.setDiscount("discount");
					order.setCheckAndAccept("checkAndAccept");
					list.add(order);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		public static int UpdateCheckBookOrder(String ISBN){
			int i=0;
			try{
				String sql="update tb_order set checkAndAccept=0 where ISBN='"+ISBN+"'";
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
			
		}
		/*
		 * 对借阅表进行操作
		 */
		public static int InsertBookBorrow(String bookISBN,String readerISBN,String operatorId,Timestamp borrowDate,Timestamp backDate){
			int i=0;
			try{
				String sql="insert into tb_borrow(bookISBN,readerISBN,operatorId,borrowDate,backDate)values('"+bookISBN+"','"+readerISBN+"','"+operatorId+"','"+borrowDate+"','"+backDate+"')";
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
			
		}
		public static List selectBorrow(String readerISBN) {
			List list=new ArrayList();
			String sql = "select *  from tb_borrow where readerISBN='"+readerISBN+"'";
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					BookBorrowInfo borrow=new BookBorrowInfo();
					borrow.setId(rs.getInt("id"));
					borrow.setBookISBN(rs.getString("bookISBN"));
					borrow.setReaderISBN(rs.getString("readerISBN"));
					borrow.setBorrowDate(rs.getString("borrowDate"));
					borrow.setBackDate(rs.getString("backDate"));
					borrow.setBookName(rs.getString("borrowBookName"));
					list.add(borrow);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		/*
		 * 查询还书内容，tb_bookinfo tb_reader tb_borrow之间的查询
		 */
		public static List selectBookBack(String readerISBN) {
			List list=new ArrayList();
			String sql = "SELECT a.ISBN AS bookISBN, a.bookname, a.typeId ,b.id,b.operatorId, b.borrowDate, b.backDate, c.name AS readerName, c.ISBN AS readerISBN FROM tb_bookInfo a INNER JOIN tb_borrow b ON a.ISBN = b.bookISBN INNER JOIN tb_reader c ON b.readerISBN = c.ISBN WHERE (c.ISBN = '"+readerISBN+"' and isback=1)";
			System.out.println(sql);
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					BookReturn back=new BookReturn();
					back.setBookISBN(rs.getString("bookISBN"));
					back.setBookname(rs.getString("bookname"));
//					back.setTypeId(rs.getInt("typeId"));
					back.setOperatorId(rs.getString("operatorId"));
					back.setBorrowDate(rs.getString("borrowDate"));
					back.setBackDate(rs.getString("backDate"));
					back.setReaderName(rs.getString("readerName"));
					back.setReaderISBN(rs.getString("readerISBN"));
//					back.setId(rs.getInt("id"));
					list.add(back);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		public static int UpdateBookBack(String bookISBN,String readerISBN,int id){//归还图书操作
			int i=0;
			try{
				String sql="update tb_borrow set isback=0 where bookISBN='"+bookISBN+"'and readerISBN='"+readerISBN+"' and id="+id+"";
				System.out.println(sql);
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
			
		}
		
		
		//new
		public static List selectbookserch() {
			List list=new ArrayList();
			String sql = "select *  from tb_bookInfo";
			ResultSet s = Dao.executeQuery(sql);
			try {
				while (s.next()) {
					BookInfo bookinfo=new BookInfo();
					bookinfo.setBookISBN(s.getString("ISBN"));;
					bookinfo.setTypeId(s.getString("typeId"));
					bookinfo.setBookName(s.getString("bookName"));
					bookinfo.setWriter(s.getString("writer"));
					bookinfo.setTranslator(s.getString("translator"));
					bookinfo.setPublisher(s.getString("publisher"));
					bookinfo.setDate(s.getDate("date"));
					bookinfo.setPrice(s.getDouble("price"));
					list.add(bookinfo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		public static List selectbookmohu(String bookname){
			List list=new ArrayList();
			String sql="select * from tb_bookInfo where bookname like '%"+bookname+"%'";
			System.out.print(sql);
			ResultSet s=Dao.executeQuery(sql);
			try {
				while(s.next()){
					BookInfo bookinfo=new BookInfo();
					bookinfo.setBookISBN(s.getString(1));
					bookinfo.setTypeId(s.getString(2));
					bookinfo.setBookName(s.getString(3));
					bookinfo.setWriter(s.getString(4));
					bookinfo.setTranslator(s.getString(5));
					bookinfo.setPublisher(s.getString(6));
					bookinfo.setDate(s.getDate(7));
					bookinfo.setPrice(s.getDouble(8));
					list.add(bookinfo);
				}
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			return list;
			
			
		}
		
		public static List selectbookmohuwriter(String writer){
			List list=new ArrayList();
			String sql="select * from tb_bookInfo where writer like '%"+writer+"%'";
			System.out.print(sql);
			ResultSet s=Dao.executeQuery(sql);
			try {
				while(s.next()){
					BookInfo bookinfo=new BookInfo();
					bookinfo.setBookISBN(s.getString("ISBN"));
					bookinfo.setTypeId(s.getString("typeId"));
					bookinfo.setBookName(s.getString("bookName"));
					bookinfo.setWriter(s.getString("writer"));
					bookinfo.setTranslator(s.getString("translator"));
					bookinfo.setPublisher(s.getString("publisher"));
					bookinfo.setDate(s.getDate("date"));
					bookinfo.setPrice(s.getDouble("price"));
					list.add(bookinfo);
				}
			} catch (SQLException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			return list;
			
			
		}
		public static int Insertoperator(String name,String sex,int age,String identityCard,Date workdate,String tel,String password){
			int i=0;
			try{
				String sql="insert into tb_operator(name,sex,age,identityCard,workdate,tel,password) values('"+name+"','"+sex+"',"+age+",'"+identityCard+"','"+workdate+"','"+tel+"','"+password+"')";
				System.out.println(sql);
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
		}
		
		public static List selectuser() {
			List list=new ArrayList();
			String sql = "select id,name,sex,age,identityCard,workdate,tel,password  from tb_operator where admin=0";
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					user user=new user();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setSex(rs.getString(3));
					user.setAge(rs.getInt(4));
					user.setIdentityCard(rs.getString(5));
					user.setWorkdate(rs.getDate(6));
					user.setTel(rs.getString(7));
					user.setPassword(rs.getString(8));
					list.add(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
		}
		
		public static int Deluser(int id){
			int i=0;
			try{
				String sql="delete from tb_operator where id='"+id+"'";
				//System.out.println(sql);
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
		}
		
		public static int Updateuser(int id,String name,String sex,int age,String identityCard,Date workdate,String tel,String password){
			int i=0;
			try{
				String sql="update tb_operator set name='"+name+"',sex='"+sex+"',age="+age+",identityCard='"+identityCard+"',workdate='"+workdate+"',tel='"+tel+"',password='"+password+"' where id='"+id+"'";
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
		}
		
		public static int Updatepass(String password,String name){
			int i=0;
			try{
				String sql="update tb_operator set password='"+password+"' where name='"+name+"'";
				
				i=Dao.executeUpdate(sql);
			}catch(Exception e){
				e.printStackTrace();
			}
			Dao.close();
			return i;
		}
		
		
		public static List selectBookTypeFk(String bookType) {//取每种书超过规定时间罚款金额
			List list=new ArrayList();
			String sql = "select *  from tb_bookType where typeName='"+bookType+"'";
			ResultSet rs = Dao.executeQuery(sql);
			try {
				while (rs.next()) {
					BookType type=new BookType();
					type.setFinePerDay(rs.getString("finePerDay"));
					type.setDays(rs.getString("days"));
					list.add(type);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Dao.close();
			return list;
			
		}
}
