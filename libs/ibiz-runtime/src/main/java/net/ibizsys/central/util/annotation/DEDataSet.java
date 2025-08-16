package net.ibizsys.central.util.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface DEDataSet {

	/** 
     * 数据集标识 
     * @return 
     */  
    String name() default "";  
    
	/** 
     * 数据集标识
     * @return 
     */  
    String value() default "";  
}
