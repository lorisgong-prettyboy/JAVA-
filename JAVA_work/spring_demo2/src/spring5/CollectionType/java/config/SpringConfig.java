package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//全注解的配置方式
@Configuration//作为配置类替代xml文件
@ComponentScan(basePackages = {"dao_annotation"})
public class SpringConfig {

}
