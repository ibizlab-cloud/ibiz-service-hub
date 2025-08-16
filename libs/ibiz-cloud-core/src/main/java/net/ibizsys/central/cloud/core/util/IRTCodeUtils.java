package net.ibizsys.central.cloud.core.util;

import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntityObject;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.system.IPSSystemModule;

/**
 * 运行时代码组件对象
 * @author lionlau
 *
 */
public interface IRTCodeUtils {

	/**
	 * 获取实体模型对象运行时对象名称
	 * @param iPSDataEntity
	 * @return
	 * @throws Exception
	 */
	String getRTObjectName(IPSDataEntity iPSDataEntity) throws Exception;
	
	
	
	/**
	 * 获取实体服务接口对象名称
	 * @param iPSDataEntity
	 * @return
	 * @throws Exception
	 */
	String getDEServiceObjectName(IPSDataEntity iPSDataEntity) throws Exception;
	
	
	/**
	 * 获取实体访问控制对象名称
	 * @param iPSDataEntity
	 * @return
	 * @throws Exception
	 */
	String getDEAccessManagerObjectName(IPSDataEntity iPSDataEntity) throws Exception;
	
	
	/**
	 * 获取实体逻辑模型对象运行时对象名称
	 * @param iPSDELogic
	 * @return
	 * @throws Exception
	 */
	String getRTObjectName(IPSDELogic iPSDELogic) throws Exception;
	
	
	
	/**
	 * 获取实体方法DTO模型对象运行时对象名称
	 * @param iPSDEMethodDTO
	 * @return
	 * @throws Exception
	 */
	String getRTObjectName(IPSDEMethodDTO iPSDEMethodDTO) throws Exception;
	
	
	/**
	 * 获取实体自动填充模型对象运行时对象名称
	 * @param iPSDEACMode
	 * @return
	 * @throws Exception
	 */
	String getRTObjectName(IPSDEACMode iPSDEACMode) throws Exception;
	
	
	
	/**
	 * 获取实体模型相关对象运行时包名称
	 * @param iPSDataEntityObject
	 * @param strPackageName
	 * @return
	 * @throws Exception
	 */
	String getPKGCodeName(IPSDataEntityObject iPSDataEntityObject, String strPackageName) throws Exception;
	
	/**
	 * 获取系统模型对象运行时包名称
	 * @param iPSSystem
	 * @return
	 * @throws Exception
	 */
	String getPKGCodeName(IPSSystem iPSSystem) throws Exception;
	
	
	
	/**
	 * 获取系统模块模型对象运行时包名称
	 * @param iPSSystemModule
	 * @return
	 * @throws Exception
	 */
	String getPKGCodeName(IPSSystemModule iPSSystemModule) throws Exception;
	
	
	
	
	/**
	 * 获取驼峰（首字母大写）代码标识
	 * @param strCodeName
	 * @return
	 * @throws Exception
	 */
	String getUpperCamelCodeName(String strCodeName) throws Exception; 
	
	
//	/**
//	 * 获取驼峰（首字母小写）代码标识
//	 * @param strCodeName
//	 * @return
//	 * @throws Exception
//	 */
//	String getLowerCamelCodeName(String strCodeName) throws Exception; 
//	
//	
//	
//	
//	/**
//	 * 获取大写+下划线代码标识
//	 * @param strCodeName
//	 * @return
//	 * @throws Exception
//	 */
//	String getUpperUnderscoreCodeName(String strCodeName) throws Exception; 
//	
//	
//	/**
//	 * 获取小写+下划线代码标识
//	 * @param strCodeName
//	 * @return
//	 * @throws Exception
//	 */
//	String getLowerUnderscoreCodeName(String strCodeName) throws Exception; 
//	
//	
//	
//	/**
//	 * 获取小写+中划线代码标识
//	 * @param strCodeName
//	 * @return
//	 * @throws Exception
//	 */
//	String getLowerHyphenCodeName(String strCodeName) throws Exception; 
}
