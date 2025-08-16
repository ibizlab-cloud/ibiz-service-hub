package net.ibizsys.central.cloud.core.dataentity.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.service.DEServiceBase;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

public class DEServiceInvocationHandler<T> implements InvocationHandler {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(DEServiceInvocationHandler.class);

	// private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private Class<T> cls = null;
	private T t = null;
	private IDEService realDEService = null;

	public DEServiceInvocationHandler(IDataEntityRuntimeContext iDataEntityRuntimeContext, Class<T> cls)
			throws Exception {
		// this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.iDataEntityRuntime = (IDataEntityRuntime) iDataEntityRuntimeContext.getDataEntityRuntime();
		this.cls = cls;
		try {
			this.t = (T) Proxy.newProxyInstance(iDataEntityRuntime.getSystemRuntime().getGroovyClassLoader(),
					new Class[] { cls }, this);
		} catch (Throwable ex) {
			log.error(ex);
			this.t = (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] { cls }, this);
		}
		this.prepareRealDEService();
	}
	
	protected void prepareRealDEService() throws Exception {
		if (IProxyDEService.class.isAssignableFrom(cls)) {
			this.realDEService = new ProxyDEServiceBase<IEntityDTO, ISearchContextDTO>() {

				@Override
				public String getDataEntityId() {
					return iDataEntityRuntime.getId();
				}

				@Override
				public IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
					return null;
				}

				@Override
				public ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
					return null;
				}
			};
			this.realDEService.init(this.iDataEntityRuntime.getSystemRuntime(), this.iDataEntityRuntime);
		} else if (IDEService.class.isAssignableFrom(cls)) {
			this.realDEService = new DEServiceBase<IEntityDTO, ISearchContextDTO>() {

				@Override
				public String getDataEntityId() {
					return iDataEntityRuntime.getId();
				}

				@Override
				public IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
					return null;
				}

				@Override
				public ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
					return null;
				}
			};
			this.realDEService.init(this.iDataEntityRuntime.getSystemRuntime(), this.iDataEntityRuntime);
		}
	}

	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	protected Class<T> getIntCls() {
		return this.cls;
	}

	public T getProxyDEService() {
		return t;
	}

	protected IDEService getRealDEService() {
		return this.realDEService;
	}
	
	protected void setRealDEService(IDEService realDEService) {
		this.realDEService = realDEService; 
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getDeclaringClass().equals(IDEService.class)
				|| method.getDeclaringClass().equals(IProxyDEService.class)) {
			return method.invoke(this.getRealDEService(), args);
		}

		return this.getDataEntityRuntime().invokeMethod(method.getName(), args, null);
	}

}
