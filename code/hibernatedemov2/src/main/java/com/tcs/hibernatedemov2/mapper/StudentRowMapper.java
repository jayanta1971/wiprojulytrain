package com.tcs.hibernatedemov2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.hibernatedemov2.entity.Employee;

public class StudentRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setEmpName(rs.getString("empl_name"));
		emp.setEmpSalary(rs.getDouble("emp_salary"));
		
		return emp;
	}

}
