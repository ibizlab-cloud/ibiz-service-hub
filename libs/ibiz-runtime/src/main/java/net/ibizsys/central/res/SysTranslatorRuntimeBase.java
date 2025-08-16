package net.ibizsys.central.res;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

public abstract class SysTranslatorRuntimeBase extends net.ibizsys.runtime.res.SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysTranslatorRuntimeBase.class);
	
	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		return onTranslate(objValue, bIn, (IEntityDTO)iEntityBase, iPSDEField, entityDataEntityRuntime);
	}
	
	
	protected Object onTranslate(Object objValue, boolean bIn, IEntityDTO iEntityDTO, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		return onTranslate(objValue, bIn);
	}
	
	
	protected Object onTranslate(Object objValue, boolean bIn) throws Throwable {
		return objValue;
	}
	
	
	

}
