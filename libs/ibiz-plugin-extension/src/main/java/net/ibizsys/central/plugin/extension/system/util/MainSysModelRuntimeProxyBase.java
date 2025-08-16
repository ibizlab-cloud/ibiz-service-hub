package net.ibizsys.central.plugin.extension.system.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.Assert;

import net.ibizsys.central.plugin.extension.system.IMainSysProxySystemModuleUtilRuntime;
import net.ibizsys.central.plugin.extension.system.IMainSysProxySystemModuleUtilRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.runtime.IModelRuntime;

public abstract class MainSysModelRuntimeProxyBase<M extends IPSModelObject, T extends IModelRuntime> implements IMainSysModelRuntimeProxy<T> {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MainSysModelRuntimeProxyBase.class);
	
	private T proxyObject = null;
	private final T realObject;
	private final IMainSysProxySystemModuleUtilRuntimeContext iMainSysProxySystemModuleUtilRuntimeContext;
	private String strModelTag = null;
	
	/**
	 * 方法：初始化
	 */
	public final static String METHOD_INIT = "INIT";
	
	
	/**
	 * 方法：初始化
	 */
	public final static String METHOD_SHUTDOWN = "SHUTDOWN";
	
	/**
	 * 方法：安装
	 */
	public final static String METHOD_INSTALL = "INSTALL";
	
	/**
	 * 方法：卸载
	 */
	public final static String METHOD_UNINSTALL = "UNINSTALL";
	
	
	/**
	 * 方法：hashCode
	 */
	public final static String METHOD_HASHCODE = "HASHCODE";
	
	/**
	 * 方法：toString
	 */
	public final static String METHOD_TOSTRING = "TOSTRING";
	
	
	
	private boolean bStarted = false;
	
	private final M iPSModelObject;
	
	
	
	public MainSysModelRuntimeProxyBase(IMainSysProxySystemModuleUtilRuntimeContext iMainSysProxySystemModuleUtilRuntimeContext, M iPSModelObject ,T realObject) throws Exception{
		Assert.notNull(iMainSysProxySystemModuleUtilRuntimeContext, "传入主系统代理功能模块运行时上下文对象无效");
		Assert.notNull(iPSModelObject, "传入模型对象无效");
		Assert.notNull(realObject, "传入实际运行时对象无效");
		
		this.iMainSysProxySystemModuleUtilRuntimeContext = iMainSysProxySystemModuleUtilRuntimeContext;
		this.realObject = realObject;
		this.iPSModelObject = iPSModelObject;
		this.strModelTag = PSModelUtils.calcUniqueTag2(realObject.getPSModelObject(), false);
		this.start();
	}
	
	@Override
	public void start() throws Exception {
		try {
			this.bStarted = true;
			this.prepareProxyObject();
			this.onStart();
		}
		catch (Exception ex) {
			this.bStarted = false;
			throw ex;
		}
	}
	
	protected void onStart() throws Exception{
		
	}
	
	public T getProxyObject() {
		return this.proxyObject;
	}
	
	public M getPSModelObject() {
		return this.iPSModelObject;
	}
	
	protected IMainSysProxySystemModuleUtilRuntimeContext getContext() {
		return this.iMainSysProxySystemModuleUtilRuntimeContext;
	}
	
	public IMainSysProxySystemModuleUtilRuntime getMainSysProxySystemModuleUtilRuntime() {
		return this.getContext().getModelRuntime();
	}
	
	
	public String getModelTag() {
		return this.strModelTag;
	}
	
	
	protected T getRealObject(Method method, Object[] args) {
		return this.realObject;
	}
	
	protected T getRealObject() {
		return this.realObject;
	}
		
	protected void prepareProxyObject() throws Exception{
		MethodInterceptor methodInterceptor = new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				return onIntercept(o, method, args, methodProxy);
			}
		};
		
		this.proxyObject = ((T)Enhancer.create(this.realObject.getClass(), methodInterceptor));
	}
	
	protected Object onIntercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
		switch(method.getName().toUpperCase()) {
		case METHOD_INIT:
			return this.doInit(o, method, args, methodProxy);
		case METHOD_SHUTDOWN:
			return this.doShutdown(o, method, args, methodProxy);
		case METHOD_INSTALL:
			return this.doInstall(o, method, args, methodProxy);
		case METHOD_UNINSTALL:
			return this.doUninstall(o, method, args, methodProxy);
		case METHOD_HASHCODE:
		case METHOD_TOSTRING:
			break;
		default:
			if(!this.isStarted()) {
				throw new Exception("代理功能未启动");
			}
			break;
		}
				
		
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
	
	protected Object doInit(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		onInit();
		this.getContext().getSystemRuntimeContext().getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				try {
					onAsyncInit();
				}
				catch (Exception ex) {
					log.error(String.format("异步初始化发生异常，%1$s", ex.getMessage()));
				}
			}
		});
		return null;
	}
	
	protected void onInit() throws Exception {
		
	}
	
	protected void onAsyncInit() throws Exception {
		
	}

	
	protected Object doShutdown(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		onShutdown();
		return null;
	}
	
	protected void onShutdown() throws Exception {
		stop();
	}
	
	protected Object doInstall(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		return null;
	}
	
	protected Object doUninstall(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		return null;
	}
	
	
	protected boolean isStarted() {
		return this.bStarted;
	}

	@Override
	public void stop() throws Exception{
		if(!isStarted()) {
			return;
		}
		this.onStop();
		this.bStarted = false;
		this.proxyObject = null;
	}
	
	protected void onStop() throws Exception{
		
	}
}
