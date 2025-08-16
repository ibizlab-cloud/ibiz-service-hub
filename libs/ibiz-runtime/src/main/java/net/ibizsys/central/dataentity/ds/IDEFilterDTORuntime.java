package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTO;

/**
 * 实体过滤器DTO运行时对象接口
 * @author lionlau
 *
 */
public interface IDEFilterDTORuntime extends IDEMethodDTORuntime{

	/**
	 * 获取实体过滤器DTO模型对象
	 * @return
	 */
	IPSDEFilterDTO getPSDEFilterDTO();
	
}