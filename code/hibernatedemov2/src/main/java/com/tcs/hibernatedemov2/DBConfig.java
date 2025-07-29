package com.tcs.hibernatedemov2;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfig {
	 public static DataSource getDataSource() {
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://localhost:3306/tcs_jfs_may_db?useSSL=false");
         dataSource.setUsername("root");
         dataSource.setPassword("Calcutta202012$");
         return dataSource;
}
}
