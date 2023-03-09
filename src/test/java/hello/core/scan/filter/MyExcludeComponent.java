package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 찾아보자!
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface MyExcludeComponent {
}
