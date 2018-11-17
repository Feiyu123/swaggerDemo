package com.example.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created By Liurenquan on 2018/11/17
 */
@Configuration //用@Configuration注解该类，等价于XML中配置beans
public class Swagger2 {

    @Bean //用@Bean标注方法等价于XML中配置bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // 用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
                .select() //函数返回一个 ApiSelectorBuilder 实例用来控制哪些接口暴露给Swagger2来展现
                .apis(RequestHandlerSelectors.basePackage("com.example.swagger.controller")) // 指明要展示的api在那个包下面
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档") // api 标题
                .description("简单优雅的restfun风格，https://blog.csdn.net/HaleyLiu123")  // api描述
                .termsOfServiceUrl("https://blog.csdn.net/HaleyLiu123") // 服务条款链接
                .version("1.0") // 版本号
                .build();
    }
}
