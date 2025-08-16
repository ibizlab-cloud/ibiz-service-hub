package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.dataentity.service.DEMethodDTORuntime;
import net.ibizsys.model.dataentity.action.IPSDEActionInputDTO;

/**
 * 实体行为输入DTO运行时对象实现
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class DEActionInputDTORuntime extends DEMethodDTORuntime implements IDEActionInputDTORuntime {

	@Override
	public IPSDEActionInputDTO getPSDEActionInputDTO() {
		return (IPSDEActionInputDTO) this.getPSDEMethodDTO();
	}

	@Override
	protected boolean isPreparePSDEFieldMap() {
		return false;
	}
	
	
	@Override
	public boolean isEnableAny() {
		return false;
	}
}
