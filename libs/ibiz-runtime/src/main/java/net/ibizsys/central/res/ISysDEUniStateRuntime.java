package net.ibizsys.central.res;

import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.runtime.util.IEntity;

/**
 * 系统实体统一状态运行时对象接口
 * @author lionlau
 *
 */
public interface ISysDEUniStateRuntime extends ISysUniStateRuntime {

	
	/**
	 * 数据对象参数：路径
	 */
	public final static String ENTITYFIELD_PATH = "srfpath";
	
	/**
	 * 数据对象参数：监控模式
	 */
	public final static String ENTITYFIELD_MONITORPATH = "srfmonitorpath";
	
	
	/**
	 * 获取传入数据的状态路径
	 * @param iEntity
	 * @return
	 */
	String getPath(IEntity iEntity);
	
	/**
	 * 读取传入数据状态
	 * @param iEntity
	 * @return
	 */
	IEntity getEntity(IEntity iEntity);
	
	
	/**
	 * 读取传入数据状态（不存在时构建）
	 * @param iEntity
	 * @return
	 */
	IEntity getEntityIf(IEntity iEntity);
	

	/**
	 * 写入数据状态
	 * @param iEntity
	 */
	void setEntity(IEntity iEntity);
	
	
	/**
	 * 移除数据状态
	 * @param iEntity
	 */
	void resetEntity(IEntity iEntity);
	
	
	/**
	 * 同步数据对象
	 * @param nEvent
	 * @param arg0
	 */
	void syncEntity(int nEvent, Object arg0);
	
	/**
	 * 是否支持侦听器
	 * @return
	 */
	boolean isEnableListener();
	
	
	/**
	 * 注册统一状态侦听器
	 * @param iSysUniStateListener
	 */
	void registerListener(IEntity iEntity, ISysUniStateListener iSysUniStateListener);
	
	
	/**
	 * 注销统一状态侦听器
	 * @param iSysUniStateListener
	 */
	void unregisterListener(IEntity iEntity, ISysUniStateListener iSysUniStateListener);
	
	
	
	
}
