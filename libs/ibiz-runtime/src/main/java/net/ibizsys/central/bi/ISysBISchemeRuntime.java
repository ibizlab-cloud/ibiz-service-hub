package net.ibizsys.central.bi;

import java.util.Map;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 系统智能报表架构运行时
 * @author lionlau
 *
 */
public interface ISysBISchemeRuntime extends ISystemModelRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{


	/**
	 * 初始化系统智能报表架构运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysBIScheme
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBIScheme iPSSysBIScheme) throws Exception;

	
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	
	
	/**
	 * 获取系统智能报表架构模型
	 * @return
	 */
	IPSSysBIScheme getPSSysBIScheme();
	

//	
//	/**
//	 * 获取相关的大数据运行时
//	 * @return
//	 */
//	ISysBDSchemeRuntime getSysBDSchemeRuntime();
	
	/**
	 * 获取对象名称大小写转化
	 * @return
	 */
	String getDBObjNameCase();
	
	/**
	 * 获取智能报表类型
	 * @return
	 */
	String getBIEngineType();
	
	
	/**
	 * 设置智能报表类型
	 * @param strBIEngineType
	 */
	void setBIEngineType(String strBIEngineType);
	
	
	/**
	 * 是否更新结构
	 * @return
	 */
	boolean isUpdateSchema();
	
	
	/**
	 * 获取运行时的数据源标记
	 * @return
	 */
	Object getDataSourceTag();
	
	
	
	/**
	 * 设置运行时的数据源标记
	 * @param objDataSourceTag
	 */
	void setDataSourceTag(Object objDataSourceTag);
	
	
	
	/**
	 * 设置数据源配置
	 * @param map
	 */
	void setDataSourceProperties(Map<String, Object> map);
	
	
	/**
	 * 获取数据源属性
	 * @param strKey
	 * @param objDefault
	 * @return
	 */
	Object getDataSourceProperty(String strKey, Object objDefault);
	
	
	
	/**
	 * 获取数据库对象名转换模式
	 * @return
	 */
	DBObjNameCaseMode getDBObjNameCaseMode();
	
//	/**
//	 * 获取实际对象名称
//	 * @param strObjName
//	 * @return
//	 */
//	String getRealDBObjName(String strObjName);
	
	
	
	/**
	 * 获取指定系统智能报表立方体运行时对象
	 * @param strBICubeName
	 * @param bTryMode
	 * @return
	 */
	ISysBICubeRuntime getSysBICubeRuntime(String strBICubeName, boolean bTryMode);
	
	
	
	
	
	/**
	 * 获取指定系统智能报表立方体运行时对象
	 * @param iPSSysBICube
	 * @return
	 */
	ISysBICubeRuntime getSysBICubeRuntime(IPSSysBICube iPSSysBICube);
	
	
	
}
