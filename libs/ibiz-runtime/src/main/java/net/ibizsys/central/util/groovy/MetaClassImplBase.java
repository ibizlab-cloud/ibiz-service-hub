package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import groovy.lang.MetaProperty;

public abstract class MetaClassImplBase extends groovy.lang.MetaClassImpl {

	public MetaClassImplBase(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public MetaClassImplBase(Class theClass) {
		super(theClass);
	}

	public MetaClassImplBase(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public MetaClassImplBase(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}
	
	@Override
	public Object invokeMethod(Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		if(isCallToSuper) {
			return super.invokeMethod(sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
		}
		MetaMethod metaMethod = this.getMetaMethod(methodName, originalArguments);
		if(metaMethod != null) {
			return metaMethod.invoke(object, originalArguments);
		}
		
		return this.onInvokeMethod(sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
		
	}
	
	protected Object onInvokeMethod(Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		return super.invokeMethod(sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
	}
	
	@Override
	public Object getProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		
		MetaProperty metaProperty = this.getMetaProperty(name);
		if(metaProperty != null) {
			return metaProperty.getProperty(object);
		}
		
		return this.onGetProperty(sender, object, name, useSuper, fromInsideClass);
	}
	
	
	protected Object onGetProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		
		return super.getProperty(sender, object, name, useSuper, fromInsideClass);
	}
	
	@Override
	public void setProperty(Class sender, Object object, String name, Object newValue, boolean useSuper, boolean fromInsideClass) {
		MetaProperty metaProperty = this.getMetaProperty(name);
		if(metaProperty != null) {
			metaProperty.setProperty(object, newValue);
			return;
		}
		
		this.onSetProperty(sender, object, name, newValue, useSuper, fromInsideClass);
	}
	
	protected void onSetProperty(Class sender, Object object, String name, Object newValue, boolean useSuper, boolean fromInsideClass) {
		
		super.setProperty(sender, object, name, newValue, useSuper, fromInsideClass);
	}
}
