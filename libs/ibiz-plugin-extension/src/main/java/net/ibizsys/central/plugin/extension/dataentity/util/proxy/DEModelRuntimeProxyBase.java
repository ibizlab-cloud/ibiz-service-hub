package net.ibizsys.central.plugin.extension.dataentity.util.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.runtime.dataentity.IDataEntityModelRuntime;

public abstract class DEModelRuntimeProxyBase<T extends IDataEntityModelRuntime> implements IDEModelRuntimeProxy<T> {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEModelRuntimeProxyBase.class);
	
	private T proxyObject = null;
	private T realObject = null;
	private IDEExtensionUtilRuntimeContext iDEExtensionUtilRuntimeContext = null;
	private String strModelTag = null;
	
	public DEModelRuntimeProxyBase(IDEExtensionUtilRuntimeContext iDEExtensionUtilRuntimeContext, T realObject) throws Exception{
		this.iDEExtensionUtilRuntimeContext = iDEExtensionUtilRuntimeContext;
		this.realObject = realObject;
		this.strModelTag = PSModelUtils.calcUniqueTag2(realObject.getPSModelObject(), false);
		this.prepareProxyObject();
	}
	
	public T getProxyObject() {
		return this.proxyObject;
	}
	
	protected IDEExtensionUtilRuntimeContext getContext() {
		return this.iDEExtensionUtilRuntimeContext;
	}
	
	public IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.getContext().getDEExtensionUtilRuntime();
	}
	
	/**
	 * 获取模型类型
	 * @return
	 */
	public abstract String getModelType();
	
	
	public String getModelTag() {
		return this.strModelTag;
	}
	
	protected T getRealObject(Method method, Object[] args) {
		return this.realObject;
	}
	
	protected String[] getExtensionTags(Method method, Object[] args) {
		return new String[] {this.getModelTag()};
	}
		
	protected void prepareProxyObject() throws Exception{
		MethodInterceptor methodInterceptor = new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				if(!method.isAccessible()) {
					method.setAccessible(true);
				}
				try {
					return method.invoke(getRealObject(method, args), args);
				}
				catch (InvocationTargetException ex) {
					throw ex.getTargetException();
				}
				catch (Throwable ex) {
					log.error(ex);
					throw ex;
				}
			}
		};
		
		this.proxyObject = ((T)Enhancer.create(this.realObject.getClass(), methodInterceptor));
	}
}
