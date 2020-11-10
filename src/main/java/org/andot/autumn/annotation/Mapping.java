package org.andot.autumn.annotation;

import java.lang.annotation.*;

/**
 * 映射器 接口类，规范
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface Mapping {
}
