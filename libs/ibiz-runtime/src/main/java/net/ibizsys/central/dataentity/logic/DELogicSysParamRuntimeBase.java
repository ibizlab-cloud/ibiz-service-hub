package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 系统相关逻辑参数运行时基类
 * @author lionlau
 *
 */
public abstract class DELogicSysParamRuntimeBase extends DELogicParamRuntimeBase{

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), this.getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持bindParamObject操作", getCodeName()));
	}
}
