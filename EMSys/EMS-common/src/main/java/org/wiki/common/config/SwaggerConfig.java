package org.wiki.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Packagename: org.wiki.common.config
 * @Classname: SwaggerConfig
 * @Description: swagger接口文档配置类
 * @Author: WiKi
 * @Date: 23/08/17 11:10 AM
 */
@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
                .apiInfo(apiInfo())
                // select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，
                // 本例采用指定扫描的包路径来定义指定要建立API的目录。
                .select()
                // apis()指定要生成文档的接口包基本路径
                .apis(RequestHandlerSelectors.basePackage("org.wiki.admin.controller"))
                .apis(RequestHandlerSelectors.basePackage("org.wiki.service.controller"))
                .apis(RequestHandlerSelectors.basePackage("org.wiki.activiti.controller"))
                // paths()指定要生成文档的接口的基本路径
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // title()用来设置文档的标题
                .title("WiKi-EMS接口文档")
                // description()用来设置文档的描述
                .description("WiKi-EMS接口文档")
                // version()用来设置文档的版本信息
                .version("2.0")
                .build();
    }
    
}
