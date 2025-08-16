package net.ibizsys.central;

import javax.sql.DataSource;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;

/**
 * 业务中台系统网关上下文对象接口
 * @author lionlau
 *
 */
public interface ISystemGatewayContext {

	/**
	 * 是否启用多系统模式
	 * @return
	 */
	boolean isMultiSystemMode();
	
	
	/**
	 * 获取指定系统实体服务对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @return
	 */
	IDEService getDEService(String strSystemId, String strDataEntityId);
	
	
	
	
	/**
	 * 获取指定系统实体运行时对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime(String strSystemId, String strDataEntityId);
	
	
	
	/**
	 * 是否启用应用网关
	 * @return
	 */
	boolean isEnableAppGateway();
	
	
	
	
	
	/**
	 * 获取当前中台网关的报表存放目录
	 * @return
	 */
	String getReportFolder();
	
	
	/**
	 * 获取当前中台网关的临时文件存放目录
	 * @return
	 */
	String getTempFolder();
	

	/**
	 * 获取当前中台网关的文件存放目录
	 * @return
	 */
	String getFileFolder();
	
	
	
	/**
	 * 获取当前中台网关的字体文件存放目录
	 * @return
	 */
	String getFontFolder();
	
	
	/**
	 * 传入运行时对象是否为多实例模式
	 * @param runtimeClass
	 * @return
	 */
	boolean isMultiInstanceMode(Class<?> runtimeClass);
	
	/**
	 * 获取实体服务对象
	 * @param runtimeCls
	 * @param strDataEntityId
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IDEService getDEService(Class<?> runtimeCls, String strDataEntityId, boolean bTryMode);
	
	
	
	/**
	 * 获取网关数据源
	 * @param strDSTag 数据源标记
	 * @param bTryMode 尝试模式
	 * @return
	 */
	DataSource getDataSource(String strDSTag, boolean bTryMode);
	
	/**
	 * 获取网关默认数据源
	 * @return
	 */
	DataSource getDefaultDataSource();
}
