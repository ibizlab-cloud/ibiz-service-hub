package net.ibizsys.central.util.groovy;

import org.springframework.util.ObjectUtils;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class EntityDTOMetaClassImpl extends MetaClassImplBase{

	public final static String FIELD_ID = "id";
	
	public final static String FIELD_NAME = "name";
	
	
	public EntityDTOMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public EntityDTOMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public EntityDTOMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public EntityDTOMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}


	
	@Override
	protected Object onInvokeMethod(Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if((object instanceof IEntityDTO ) && ObjectUtils.isEmpty(originalArguments)) {
			iEntityDTO = (IEntityDTO)object;
		}
		return this.onInvokeMethod(iEntityDTO, sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
	}
	
	protected Object onInvokeMethod(IEntityDTO iEntityDTO, Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		if(iEntityDTO!=null) {
			IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
			if(iDEMethodDTORuntime != null) {
				IDataEntityRuntime dataEntityRuntime = iDEMethodDTORuntime.getDataEntityRuntime();
				IPSDEAction iPSDEAction = dataEntityRuntime.getPSDEAction(methodName);
				if(iPSDEAction != null) {
					try {
						return dataEntityRuntime.executeAction(iPSDEAction.getName(), iPSDEAction, new Object[] {iEntityDTO});
					}
					catch (Throwable ex) {
						if(ex instanceof RuntimeException) {
							throw (RuntimeException)ex;
						}
						throw new RuntimeException(ex);
					}
				}
			}
		}
		
		return super.onInvokeMethod(sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
	}
	
	
	@Override
	protected void onSetProperty(Class sender, Object object, String name, Object newValue, boolean useSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if(object instanceof IEntityDTO) {
			iEntityDTO = (IEntityDTO)object;
		}
		
		this.onSetProperty(iEntityDTO, sender, object, name, newValue, useSuper, fromInsideClass);
	}
	
	protected void onSetProperty(IEntityDTO iEntityDTO, Class sender, Object object, String name, Object newValue, boolean useSuper, boolean fromInsideClass) {
		if(iEntityDTO!=null) {
			IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
			if(iDEMethodDTORuntime != null) {
				String lowerName = name.toLowerCase();
				IPSDEMethodDTOField iPSDEMethodDTOField = iDEMethodDTORuntime.getPSDEMethodDTOField(lowerName, true);
				if(iPSDEMethodDTOField != null) {
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						iEntityDTO.set(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), newValue);
						return;
					}
				}
				iPSDEMethodDTOField = iDEMethodDTORuntime.getPSDEMethodDTOFieldByDEField(lowerName, true);
				if(iPSDEMethodDTOField != null) {
					iEntityDTO.set(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), newValue);
					return;
				}
				
				if(FIELD_ID.equalsIgnoreCase(name)) {
					if(iDEMethodDTORuntime.getDataEntityRuntime().getKeyPSDEField()!=null) {
						iEntityDTO.set(iDEMethodDTORuntime.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), newValue);
						return;
					}
				}
				
				if(FIELD_NAME.equalsIgnoreCase(name)) {
					if(iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField()!=null) {
						iEntityDTO.set(iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField().getLowerCaseName(), newValue);
						return;
					}
				}
				
				throw new DataEntityRuntimeException(iDEMethodDTORuntime.getDataEntityRuntime(), iDEMethodDTORuntime, String.format("指定属性[%1$s]不存在", name));
			}
		}
		
		super.onSetProperty(sender, object, name, newValue, useSuper, fromInsideClass);
	}
	
	@Override
	protected Object onGetProperty(Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		IEntityDTO iEntityDTO = null;
		if(object instanceof IEntityDTO) {
			iEntityDTO = (IEntityDTO)object;
		}
		
		
		return this.onGetProperty(iEntityDTO, sender, object, name, useSuper, fromInsideClass);
	}
	
	protected Object onGetProperty(IEntityDTO iEntityDTO, Class sender, Object object, String name, boolean useSuper, boolean fromInsideClass) {
		if(iEntityDTO != null) {
			IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
			if(iDEMethodDTORuntime != null) {
				String lowerName = name.toLowerCase();
				IPSDEMethodDTOField iPSDEMethodDTOField = iDEMethodDTORuntime.getPSDEMethodDTOField(lowerName, true);
				if(iPSDEMethodDTOField != null) {
					if(iPSDEMethodDTOField.getPSDEField() != null) {
						return iEntityDTO.get(iPSDEMethodDTOField.getPSDEField().getLowerCaseName());
					}
				}
				iPSDEMethodDTOField = iDEMethodDTORuntime.getPSDEMethodDTOFieldByDEField(lowerName, true);
				if(iPSDEMethodDTOField != null) {
					return iEntityDTO.get(iPSDEMethodDTOField.getPSDEField().getLowerCaseName());
				}
				
				if(FIELD_ID.equalsIgnoreCase(name)) {
					if(iDEMethodDTORuntime.getDataEntityRuntime().getKeyPSDEField()!=null) {
						return iEntityDTO.get(iDEMethodDTORuntime.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
					}
				}
				
				if(FIELD_NAME.equalsIgnoreCase(name)) {
					if(iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField()!=null) {
						return iEntityDTO.get(iDEMethodDTORuntime.getDataEntityRuntime().getMajorPSDEField().getLowerCaseName());
					}
				}
				
				throw new DataEntityRuntimeException(iDEMethodDTORuntime.getDataEntityRuntime(), iDEMethodDTORuntime, String.format("指定属性[%1$s]不存在", name));
			}
		}
		return super.onGetProperty(sender, object, name, useSuper, fromInsideClass);
	}
	
}
