package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  启动类
 */
@SpringBootApplication//标记这是一个Spring Boot项目
@MapperScan("com.qf.home.user.dao")
@EnableSwagger2//启用Swagger2的扫描
public class LjApplication {

    //main方法
    public static void main(String[] args) {
        //加载初始信息
        SpringApplication.run(LjApplication.class, args);
    }

}
