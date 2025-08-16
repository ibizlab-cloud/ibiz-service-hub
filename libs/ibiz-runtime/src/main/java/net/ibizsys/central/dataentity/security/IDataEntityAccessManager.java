package net.ibizsys.central.dataentity.security;

import java.util.Set;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 系统访问控制管理器对象接口
 * @author lionlau
 *
 */
public interface IDataEntityAccessManager {

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISystemAccessManager iSystemAccessManager) throws Exception;
	
	
	/**
	 * 获取实体的默认操作角色运行时集合
	 * @return
	 */
	java.util.List<IDEUserRoleRuntime> getDefaultDEUserRoleRuntimes();
	
	
	
	/**
	 * 获取指定用户角色模型
	 * @param strUserRoleTag
	 * @param bTryMode
	 * @return
	 */
	IDEUserRoleRuntime getDEUserRoleRuntime(String strUserRoleTag, boolean bTryMode);
	
	
	
	/**
	 *  获取实体数据访问控制方式
	 * @return
	 */
	int getDataAccCtrlMode();
	
	
	/**
	 * 获取系统访问管理对象
	 * @return
	 */
	ISystemAccessManager getSystemAccessManager();
	
	
	
	
	/**
	 * 判断数据访问标识
	 * @param iUserContext 用户上下文
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @param objKey
	 * @param iEntityDTO 
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, Object objKey, IEntityDTO iEntityDTO, String strAccessAction) throws Exception;
	
	
	
	

	/**
	 * 判断数据访问标识
	 * @param iUserContext
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @param iSearchContextDTO
	 * @param strAccessAction
	 * @return
	 * @throws Exception
	 */
	boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception;
	
	
	
	/**
	 * 判断数据访问标识
	 * @param objKey
	 * @param iEntityDTO 
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessAction(Object objKey, IEntityDTO iEntityDTO, String strAccessAction) throws Exception;
	
	
	
	
	/**
	 * 判断数据访问标识
	 * @param iSearchContextDTO 
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessAction(ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception;
	
	
	
	/**
	 * 判断数据访问标识
	 * @param iUserContext 用户上下文
	 * @param objKey
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessActionIf(IUserContext iUserContext, Object objKey, String strAccessAction) throws Exception;
	
	
	/**
	 * 判断数据访问标识
	 * @param iUserContext 用户上下文
	 * @param keys 主键集合
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessActionIf(IUserContext iUserContext, Set<Object> keys, String strAccessAction) throws Exception;
	
	
	/**
	 * 获取实体操作标识对象
	 * @param parentDataEntityRuntime
	 * @param strAccessAction
	 * @param bMustMapMode
	 * @return
	 */
	IPSDEOPPriv getPSDEOPPriv(IDataEntityRuntime parentDataEntityRuntime, String strAccessAction);
	
	/**
	 * 获取实体操作标识对象
	 * @param parentDataEntityRuntime
	 * @param strAccessAction
	 * @param bMustMapMode
	 * @return
	 */
	IPSDEOPPriv getPSDEOPPriv(IDataEntityRuntime parentDataEntityRuntime, String strAccessAction, boolean bMustMapMode);
	
}
