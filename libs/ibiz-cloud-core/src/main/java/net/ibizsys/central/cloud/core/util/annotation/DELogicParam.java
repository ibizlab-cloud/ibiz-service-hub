package net.ibizsys.central.cloud.core.util.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface DELogicParam {

	/** 
     * 逻辑参数标识 
     * @return 
     */  
    String value() default "";  
}
