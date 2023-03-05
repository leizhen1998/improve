package com.lazy.improve.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName: Knife4jConfig
 * Package: com.lazy.improve.config
 * Description:
 *
 * @Author leizhen
 * @Create 2023/3/4 18:51
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)//导入其他的配置类 让配置生效
public class Knife4jConfig {
    @Bean
    public Docket buildDocket() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                //分组名称
                .groupName("1.0")
                .select()
                //这里指定扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.lazy.improve.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo buildApiInfo() {
        Contact contact = new Contact("self-improve","","");
        return new ApiInfoBuilder()
                .title("show me your code")
                .description("0 error（s），0 warning（s）")
                .contact(contact)
                .version("1.0.0").build();
    }
}
