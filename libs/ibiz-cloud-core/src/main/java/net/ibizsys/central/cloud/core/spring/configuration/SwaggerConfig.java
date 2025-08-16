package net.ibizsys.central.cloud.core.spring.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@ConditionalOnProperty(name = "springfox.documentation.enabled", havingValue = "true", matchIfMissing = true)
public class SwaggerConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //swagger资源配置
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.ibizsys.central.cloud"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("服务网关API")
                .version("1.0")
                .build();
    }
    
    @Bean
    public Docket createAutoRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(autoApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.ibizsys.central.cloud.auto"))
                .paths(PathSelectors.any())
                .build()
                .groupName("auto");
    }

    private ApiInfo autoApiInfo() {
        return new ApiInfoBuilder().title("自动注册API")
                .version("1.0")
                .build();
    }
}
