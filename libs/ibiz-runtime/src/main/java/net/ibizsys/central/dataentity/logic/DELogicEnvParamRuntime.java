package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ActionSessionManager;

/**
 * 处理逻辑环境参数对象
 * 
 * @author lionlau
 *
 */
public class DELogicEnvParamRuntime extends DELogicParamRuntimeBase{

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return ActionSessionManager.getCurrentSessionMust().getEnvEntity(true);
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), this.getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持bindParamObject操作", getCodeName()));
	}

	
	
	
}
