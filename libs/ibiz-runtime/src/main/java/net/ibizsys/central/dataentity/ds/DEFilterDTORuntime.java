package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.dataentity.service.DEMethodDTORuntime;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTO;

/**
 * 实体过滤器DTO运行时对象实现
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class DEFilterDTORuntime extends DEMethodDTORuntime implements IDEFilterDTORuntime {

	@Override
	public IPSDEFilterDTO getPSDEFilterDTO() {
		return (IPSDEFilterDTO)this.getPSDEMethodDTO();
	}

	
	@Override
	protected boolean isPreparePSDEFieldMap() {
		return false;
	}
	
}
