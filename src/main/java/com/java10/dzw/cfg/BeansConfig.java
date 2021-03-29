package com.java10.dzw.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.java10.dzw.dao" })
public class BeansConfig {


}
