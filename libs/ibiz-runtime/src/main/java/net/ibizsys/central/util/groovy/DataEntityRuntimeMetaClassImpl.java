package net.ibizsys.central.util.groovy;

import groovy.lang.MetaClassRegistry;
import groovy.lang.MetaMethod;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public class DataEntityRuntimeMetaClassImpl extends SystemModelRuntimeMetaClassImpl {

	public DataEntityRuntimeMetaClassImpl(Class theClass, MetaMethod[] add) {
		super(theClass, add);
	}

	public DataEntityRuntimeMetaClassImpl(Class theClass) {
		super(theClass);
	}

	public DataEntityRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass, MetaMethod[] add) {
		super(registry, theClass, add);
	}

	public DataEntityRuntimeMetaClassImpl(MetaClassRegistry registry, Class theClass) {
		super(registry, theClass);
	}
	
	@Override
	protected Object onInvokeMethod(Class sender, Object object, String methodName, Object[] originalArguments, boolean isCallToSuper, boolean fromInsideClass) {
		
		if(object instanceof IDataEntityRuntime) {
			IDataEntityRuntime dataEntityRuntime = (IDataEntityRuntime)object;
			IPSDEAction iPSDEAction = dataEntityRuntime.getPSDEActionByCodeName(methodName, true);
			if(iPSDEAction == null) {
				iPSDEAction = dataEntityRuntime.getPSDEAction(methodName);
			}
			if(iPSDEAction != null) {
				try {
					return dataEntityRuntime.executeAction(iPSDEAction.getName(), iPSDEAction, originalArguments);
				}
				catch (Throwable ex) {
					if(ex instanceof RuntimeException) {
						throw (RuntimeException)ex;
					}
					throw new RuntimeException(ex);
				}
			}
			
			IPSDEDataSet iPSDEDataSet = dataEntityRuntime.getPSDEDataSetByCodeName(methodName, true);
			if(iPSDEDataSet == null) {
				iPSDEDataSet = dataEntityRuntime.getPSDEDataSet(methodName);
			}
			if(iPSDEDataSet != null) {
				try {
					return dataEntityRuntime.fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, originalArguments);
				}
				catch (Throwable ex) {
					if(ex instanceof RuntimeException) {
						throw (RuntimeException)ex;
					}
					throw new RuntimeException(ex);
				}
			}
			
		}
		
		return super.onInvokeMethod(sender, object, methodName, originalArguments, isCallToSuper, fromInsideClass);
	}

	@Override
	protected ISystemRuntime getSystemRuntime(Object object) {

		if (object instanceof IDataEntityRuntime) {
			return ((IDataEntityRuntime) object).getSystemRuntime();
		}

		return super.getSystemRuntime(object);
	}
}
