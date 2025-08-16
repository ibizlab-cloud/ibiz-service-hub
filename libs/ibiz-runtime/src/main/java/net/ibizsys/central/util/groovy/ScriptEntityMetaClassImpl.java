package net.ibizsys.central.util.groovy;

import org.springframework.util.ObjectUtils;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.script.IScriptEntity;

public class ScriptEntityMetaClassImpl extends EntityDTOMetaClassImpl {

	public ScriptEntityMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public ScriptEntityMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public ScriptEntityMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public ScriptEntityMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}

	@Override
	protected Object onInvokeMethod(Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if((object instanceof IScriptEntity ) && ObjectUtils.isEmpty(originalArguments)) {
			IScriptEntity iScriptEntity = (IScriptEntity)object;
			if(iScriptEntity.getReal() instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)iScriptEntity.getReal();
			}
		
		}
		return this.onInvokeMethod(iEntityDTO, sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
	}

	@Override
	protected void onSetProperty(Class sender, Object object, String name, Object newValue, boolean useSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if(object instanceof IScriptEntity) {
			IScriptEntity iScriptEntity = (IScriptEntity)object;
			if(iScriptEntity.getReal() instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)iScriptEntity.getReal();
			}
		}
		
		this.onSetProperty(iEntityDTO, sender, object, name, newValue, useSuper, fromInsideClass);
	}

	@Override
	protected Object onGetProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if(object instanceof IScriptEntity) {
			IScriptEntity iScriptEntity = (IScriptEntity)object;
			if(iScriptEntity.getReal() instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)iScriptEntity.getReal();
			}
		}
		
		
		return this.onGetProperty(iEntityDTO, sender, object, name, useSuper, fromInsideClass);
	}
	
	

}
