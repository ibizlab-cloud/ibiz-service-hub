package net.ibizsys.central.cloud.core.dataentity.security;

import java.util.List;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;

/**
 * 系统访问控制管理器对象接口
 * @author lionlau
 *
 */
public interface IDataEntityAccessManager extends net.ibizsys.central.dataentity.security.IDataEntityAccessManager{

	
//	/**
//	 * 判断数据访问标识
//	 * @param iEmployeeContext 用户上下文
//	 * @param parentDataEntityRuntime
//	 * @param strParentKey
//	 * @param objKey
//	 * @param iEntityDTO 
//	 * @param strAccessAction
//	 * @return
//	 */
//	boolean testDataAccessAction(IEmployeeContext iEmployeeContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, Object objKey, IEntityDTO iEntityDTO, String strAccessAction) throws Exception;
//	
//	
//	
//	
//	/**
//	 * 判断数据访问标识
//	 * @param iEmployeeContext 用户上下文
//	 * @param parentDataEntityRuntime
//	 * @param strParentKey
//	 * @param objKey
//	 * @param iEntityDTO 
//	 * @param strAccessAction
//	 * @return
//	 */
//	boolean testDataAccessAction(IEmployeeContext iEmployeeContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception;
//	
//	
	
	
	/**
	 * 填充传入数据的数据操作标识
	 * @param iEmployeeContext
	 * @param entityDTOList
	 * @param strDataAccessActions
	 * @return
	 * @throws Exception
	 */
	void fillDataAccessActions(IEmployeeContext iEmployeeContext, List<IEntityDTO> entityDTOList, String strDataAccessActions, String strFieldName) throws Exception;
	
	
	
	/**
	 * 移除传入数据没有权限的属性
	 * @param iEmployeeContext
	 * @param entityDTOList
	 * @throws Exception
	 */
	void removeUnauthorizedFields(IEmployeeContext iEmployeeContext, List<IEntityDTO> entityDTOList) throws Exception;
	
	
	
	/**
	 * 为搜索上下文附加传入用户数据权限
	 * @param searchContext
	 * @param iEmployeeContext
	 * @param action
	 */
	void addAuthorityConditionsIf(IEmployeeContext iEmployeeContext, ISearchContextDTO searchContext, String action);
	
	
	/**
	 * 为搜索上下文附加实体数据范围权限条件
	 * @param searchContext
	 * @param iEmployeeContext
	 * @param iPSDEDataRange
	 */
	void addAuthorityConditions(IEmployeeContext iEmployeeContext, ISearchContextDTO searchContext, IPSDEDataRange iPSDEDataRange);
	
}
