package com.qf.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration//配置文件
public class SwaggerConfig {

    //创建文档说明
    private ApiInfo createAl() {
        return new ApiInfoBuilder().title("链家项目后端数据接口").description("包含dar的主体和后台系统的所有接口，可以查看对应的接口信息和对接口进行测试").contact(
                new Contact("Feri", "http://www.17feri.top", "xingfei_work@163.com")).build();
    }

    //创建Swagger扫描信息
    @Bean
    public Docket createD() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAl()).select().apis(RequestHandlerSelectors.basePackage("com.qf.home")).build();
    }
}
