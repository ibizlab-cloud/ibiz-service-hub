package net.ibizsys.central.database;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 系统数据表运行时
 * @author lionlau
 *
 */
public interface ISysDBTableRuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iSysDBSchemeRuntime
	 * @param iPSSysDBTable
	 * @throws Exception
	 */
	void init(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IPSSysDBTable iPSSysDBTable) throws Exception;
	
	
	/**
	 * 获取系统数据库表对象
	 * @return
	 */
	IPSSysDBTable getPSSysDBTable();
	
	
	/**
	 * 获取系统数据库列集合
	 * @return
	 */
	List<ISysDBColumnRuntime> getSysDBColumnRuntimes();
	
	
	
	
	/**
	 * 获取系统数据库列集合（短写法）
	 * @return
	 */
	Map<String, ISysDBColumnRuntime> getColumns();
	
	
	
	/**
	 * 获取标准名称
	 * @return
	 */
	String getStandardName();
	
	
	/**
	 * 是否为多租户模式
	 * @return
	 */
	boolean isTenantMode();
	
	
	/**
	 * 设置租户模式
	 * @param bTenantMode
	 */
	void setTenantMode(boolean bTenantMode);
	
	
	
	/**
	 * 获取租户列名称
	 * @return
	 */
	String getTenantColumnName();
	
	
	/**
	 * 设置租户列
	 * @param strTenantColumnName
	 */
	void setTenantColumnName(String strTenantColumnName);
	
	
	/**
	 * 获取相关的实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 设置相关的实体运行时对象
	 * @param iDataEntityRuntime
	 */
	void setDataEntityRuntime(IDataEntityRuntime iDataEntityRuntime);
	
	
	
	/**
	 * 获取系统数据库体系
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime();
	
	/**
	 * 获取系统数据库体系（短写法）
	 * @return
	 */
	ISysDBSchemeRuntime getSchema();
	
	

	
}
