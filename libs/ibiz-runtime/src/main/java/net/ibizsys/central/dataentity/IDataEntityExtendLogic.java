package net.ibizsys.central.dataentity;

import java.util.List;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;

/**
 * 实体扩展逻辑
 * @author lionlau
 *
 */
public interface IDataEntityExtendLogic {

	/**
	 * 获取扩展的属性集合
	 * @return
	 */
	List<IPSDEField> getPSDEFields();
	
	
	
	/**
	 * 获取扩展的系统运行时
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 获取扩展的实体模型
	 * @return
	 */
	IPSDataEntity getPSDataEntity();
	
	
	/**
	 * 获取默认实体数据查询
	 * @return
	 */
	IPSDEDataQuery getDefaultPSDEDataQuery();
	
	
	/**
	 * 获取视图视图数据查询
	 * @return
	 */
	IPSDEDataQuery getViewPSDEDataQuery();
	
	
	/**
	 * 获取传入实体数据查询的数据库代码
	 * @param iPSDEDataQuery
	 * @param dbType
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	IPSDEDataQueryCode getPSDEDataQueryCode(IPSDEDataQuery iPSDEDataQuery, String dbType, boolean tryMode) throws Exception;
}
