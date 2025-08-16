package net.ibizsys.central.plugin.cloud.service.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.ibizsys.central.cloud.core.security.EmployeeContext;

public class APIWebClientInvocationHandler implements InvocationHandler{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(APIWebClientInvocationHandler.class);
	
	private final Object real;
	private final Object proxy;
	
	public APIWebClientInvocationHandler(Object real, Class<?> cls) {
		this.real = real;
		this.proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {cls}, this);
	}
	
	public Object getProxyObject() {
		return this.proxy;
	}
	
	private Object getRealObject() {
		return this.real;
	}
	
	
	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		
		boolean lastDisabled = EmployeeContext.isCurrentDisabled();
		EmployeeContext.setCurrentDisabled(true);
		try {
			return method.invoke(getRealObject(), arg2);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			EmployeeContext.setCurrentDisabled(lastDisabled);
		}
	}

}
