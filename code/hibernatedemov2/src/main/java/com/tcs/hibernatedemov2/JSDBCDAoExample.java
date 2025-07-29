package com.tcs.hibernatedemov2;

import java.util.List;

import com.tcs.hibernatedemov2.entity.Employee;
import com.tcs.hibernatedemov2.repo.JDBCDao;

public class JSDBCDAoExample {

	public static void main(String[] args) {
		 
		JDBCDao dao=new JDBCDao();
		List<Employee> empList=dao.getAllNames();
		System.out.println(empList);
		
	}

}
