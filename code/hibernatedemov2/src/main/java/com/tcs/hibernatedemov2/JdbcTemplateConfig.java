package com.tcs.hibernatedemov2;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateConfig {
    public static JdbcTemplate getJdbcTemplate(){
        DataSource dataSource = DBConfig.getDataSource();
        return new JdbcTemplate(dataSource);
    }
}
