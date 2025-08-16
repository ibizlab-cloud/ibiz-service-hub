package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 简单数据类型参数运行时对象实现
 * @author lionlau
 *
 */
public class DELogicSimpleParamRuntime extends DELogicParamRuntimeBase{

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		
		if(paramObject != null) {
			//判断是否为简单类型
			Object objValue = asSimple(paramObject);
			if(objValue!=null) {
				super.bind(iDELogicSession, objValue);
				return;
			}
			
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非简单数据类型参数[%2$s]", getCodeName(), paramObject.getClass().getName()));
		}
		else {
			super.bind(iDELogicSession, paramObject);
		}
	}
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return iDELogicSession.getParamObject(this.getCodeName(), true);
	}
}
