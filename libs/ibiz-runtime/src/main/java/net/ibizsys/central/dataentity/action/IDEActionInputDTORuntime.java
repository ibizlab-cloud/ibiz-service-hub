package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.model.dataentity.action.IPSDEActionInputDTO;

/**
 * 实体行为输入DTO运行时对象接口
 * @author lionlau
 *
 */
public interface IDEActionInputDTORuntime extends IDEMethodDTORuntime {

	/**
	 * 获取实体行为输入DTO模型对象
	 * @return
	 */
	IPSDEActionInputDTO getPSDEActionInputDTO();
}
