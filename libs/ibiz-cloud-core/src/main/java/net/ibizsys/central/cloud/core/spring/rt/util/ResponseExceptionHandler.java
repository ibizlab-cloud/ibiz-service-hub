package net.ibizsys.central.cloud.core.spring.rt.util;


import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import net.ibizsys.central.cloud.core.service.util.IResponseExceptionHandler;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;

@ControllerAdvice
public class ResponseExceptionHandler extends net.ibizsys.central.cloud.core.service.util.ResponseExceptionHandler {

    private Log log = LogFactory.getLog(ResponseExceptionHandler.class);

    @PostConstruct
    public void postConstruct() {
       RuntimeObjectFactory.getInstance().registerObject(IResponseExceptionHandler.class, null, this);
    }
    
    @ExceptionHandler(value = Throwable.class)
    @ResponseBody
    public ResponseEntity<?> handlerException(Throwable throwable) {
    	if( throwable instanceof HttpMessageNotReadableException) {
    		return null;
    	}
    	return getResponseEntity(throwable);
        
    }

   

}
