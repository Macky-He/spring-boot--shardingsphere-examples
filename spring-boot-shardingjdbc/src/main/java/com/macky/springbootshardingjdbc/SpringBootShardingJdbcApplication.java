package com.macky.springbootshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.macky.springbootshardingjdbc.mapper")
@SpringBootApplication
public class SpringBootShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootShardingJdbcApplication.class, args);
    }

}
