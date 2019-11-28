package com.springboot.mall;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MallSpringbootApplication启动类
 */
@SpringBootApplication
@MapperScan("com.springboot.mall.dao")
public class MallSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallSpringbootApplication.class, args);
	}

}
