package net.ibizsys.central.cloud.core.dataentity.defield;

import net.ibizsys.central.dataentity.defield.IDEFGroupRuntime;
import net.ibizsys.central.util.IEntityDTO;

/**
 * AI信息实体属性运行时
 * @author lionlau
 *
 */
public interface IAIInfoDEFGroupRuntime extends IDEFGroupRuntime {

	
	/**
	 * 获取AI信息
	 * @param iEntityDTO
	 * @param args
	 * @return
	 */
	String getAIInfo(IEntityDTO iEntityDTO, Object[] args);
}
