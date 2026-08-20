package net.ibizsys.central.cloud.core.util.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface DEDataExportRuntime {

	/** 
     * 实体数据导出标识
     * @return 
     */  
    String value() default "";  
}
