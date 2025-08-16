package net.ibizsys.central.util.groovy;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.ISystemRuntime;

public class ModelRuntimeMetaClassImpl extends MetaClassImplBase{

	private static final Log log = LogFactory.getLog(ModelRuntimeMetaClassImpl.class);
	private static Map<Class<?>, Log> logMap = new HashMap<Class<?>, Log>();

	
	public ModelRuntimeMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public ModelRuntimeMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public ModelRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public ModelRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}

	
	@Override
	protected Object onGetProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		
		if (ISystemRTGroovyContext.PROPERTY_LOG.equals(name)) {
			Log log = logMap.get(sender);
			if(log == null) {
				log = LogFactory.getLog(sender);
				logMap.put(sender, log);
			}
			return log;
		}
		
		ISystemRuntime iSystemRuntime = getSystemRuntime(object);
		if(iSystemRuntime != null) {
			if (ISystemRTGroovyContext.PROPERTY_SYS.equals(name)) {
				return iSystemRuntime;
			}
			
			if (ISystemRTGroovyContext.PROPERTY_USER.equals(name)) {
				return iSystemRuntime.getSystemRTGroovyContext().user();
			}
			
			if (ISystemRTGroovyContext.PROPERTY_CONTEXT.equals(name)) {
				return iSystemRuntime.getSystemRTGroovyContext().context();
			}
		}
		

		return super.onGetProperty(sender, object, name, useSuper, fromInsideClass);
	}



	protected ISystemRuntime getSystemRuntime(Object object) {

		return null;
	}

	

	
}
