package net.ibizsys.central.dataentity.service;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;

/**
 * 实体方法DTO运行时对象接口
 * @author lionlau
 *
 */
public interface IDEMethodDTORuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEMethodDTO
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEMethodDTO iPSDEMethodDTO)throws Exception;
	
	
	/**
	 * 获取实体方法DTO模型对象
	 * @return
	 */
	IPSDEMethodDTO getPSDEMethodDTO();

	
	/**
	 * 获取DTO属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> getPSDEMethodDTOFields();
	
	
	
	/**
	 * 获取实体方法DTO属性
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEMethodDTOField getPSDEMethodDTOField(String strName, boolean bTryMode);
	
	
	/**
	 * 通过实体属性获取实体方法DTO属性
	 * @param iPSDEField
	 * @param bTryMode
	 * @return
	 */
	IPSDEMethodDTOField getPSDEMethodDTOFieldByDEField(IPSDEField iPSDEField, boolean bTryMode);
	
	
	/**
	 * 通过实体属性获取实体方法DTO属性
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEMethodDTOField getPSDEMethodDTOFieldByDEField(String strName, boolean bTryMode);
	
	

	/**
	 * 通过实体关系获取实体方法DTO属性
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEMethodDTOField getPSDEMethodDTOFieldByDER(String strName, boolean bTryMode);
	
	
	
	/**
	 * 是否支持任意属性
	 * @return
	 */
	boolean isEnableAny();
	
	
	/**
	 * 获取嵌套的实体方法DTO运行时集合
	 * @return
	 */
	java.util.List<IDEMethodDTORuntime> getNestedDEMethodDTORuntimes();
}
