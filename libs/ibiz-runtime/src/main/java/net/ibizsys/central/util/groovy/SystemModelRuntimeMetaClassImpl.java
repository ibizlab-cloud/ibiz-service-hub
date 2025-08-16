package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.ISystemModelRuntime;

public class SystemModelRuntimeMetaClassImpl extends ModelRuntimeMetaClassImpl{

	public SystemModelRuntimeMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public SystemModelRuntimeMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public SystemModelRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public SystemModelRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}
	
	
	
	@Override
	protected ISystemRuntime getSystemRuntime(Object object) {
		if(object instanceof ISystemModelRuntime) {
			return (ISystemRuntime)((ISystemModelRuntime)object).getSystemRuntime();
		}
		return super.getSystemRuntime(object);
	}
	
	
}
