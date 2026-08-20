package net.ibizsys.central.util.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface DEDataSetLogic {

	/** 
     * 行为标识
     * @return 
     */  
    String name() default "";  
    
	/** 
     * 附加模式 
     * @return 
     */  
    String mode() default "";  
}
