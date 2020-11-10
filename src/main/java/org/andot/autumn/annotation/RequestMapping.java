package org.andot.autumn.annotation;

import java.lang.annotation.*;

/**
 * 请求映射
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface RequestMapping {
    /**
     * 接口请求的地址
     * @return
     */
    String value() default "";
}
