package net.ibizsys.central.cloud.core.util.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface DELogicNode {

	/** 
     * 逻辑节点标识 
     * @return 
     */  
    String value() default "";  
}
