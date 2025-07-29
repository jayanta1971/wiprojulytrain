package com.tcs.hibernatedemov2.repo;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tcs.hibernatedemov2.JdbcTemplateConfig;
import com.tcs.hibernatedemov2.entity.Employee;
import com.tcs.hibernatedemov2.mapper.*;


public class JDBCDao {
	 private JdbcTemplate jdbcTemplate;

     public JDBCDao() {
          this.jdbcTemplate = JdbcTemplateConfig.getJdbcTemplate();
     }

     public List<Employee> getAllNames(){
         String sql = "select * from employee";
         return jdbcTemplate.query(sql, new StudentRowMapper());
     }

     public String getNameById(int id){
         String sql = "SELECT name FROM employee WHERE id = ?";
         return jdbcTemplate.queryForObject(sql, String.class, id);
     }
}
