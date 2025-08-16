package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 获取实体操作之前的变量
 * @author lionlau
 *
 */
public class DELogicLastParamRuntime extends DELogicParamRuntimeBase {

	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntityBase) {
			if(this.getDataEntityRuntime()!=null) {
				return this.getDataEntityRuntime().createScriptEntity((IEntityBase)objParam);
			}
		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof IEntity)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象类型", getCodeName()));
			}
			return object;
		}
		//获取操作之前的变量
		object = this.getDELogicRuntimeContext().getDataEntityRuntime().getLastEntity();
		
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), this.getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持bindParamObject操作", getCodeName()));
	}

}
