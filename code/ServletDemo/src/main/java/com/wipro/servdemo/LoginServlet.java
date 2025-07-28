package com.wipro.servdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet{
	  static String url="jdbc:mysql://localhost:3306/wiprojdbc";
	  static String userId="root";
	  static String passWord="Calcutta202012$";

	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	{
		
		
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		String uname=req.getParameter("username");
		String passWord=req.getParameter("upassword");
//		System.out.println(uname);
//		System.out.println(passWord);
//		System.out.println("--received data--");
		System.out.println(checkCred(uname,passWord));
	}
	
	boolean checkCred(String uName,String password)
	{
		 	System.out.println("check cred");
		    String url="jdbc:mysql://localhost:3306/wiprojdbc";
		    String userId="root";
		    String passWord="Calcutta202012$";

		try {
			 Connection conn= DriverManager.getConnection(url, userId, passWord);
			String sql="select * from user where user_name=? and user_pwd=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,uName);
			ps.setString(2,password);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				return true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
