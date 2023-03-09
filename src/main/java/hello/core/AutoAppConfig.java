package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) // 자동으로 스프링빈으로 등록!
// @Configuration을 전부 자동 등록해주니까
// 그전에 뺄거 지정하자! -> Appconfig가 수동 등록이라서!
//
public class AutoAppConfig {

}
