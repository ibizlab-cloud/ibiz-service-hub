package net.ibizsys.runtime.res;

import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.domain.DataSyncOut;

/**
 * 系统数据同步代理运行时
 * @author lionlau
 *
 */
public interface ISysDataSyncAgentRuntime extends ISystemModelRuntime {

	/**
	 * 同步包属性：代理标识
	 */
	public final static String PACKAGE_AGENT = "agent";
	
	
	/**
	 * 同步包属性：数据
	 */
	public final static String PACKAGE_DATA = "data";
	
	
	/**
	 * 初始化系统数据同步代理运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysDataSyncAgent
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysDataSyncAgent iPSSysDataSyncAgent) throws Exception;

	
	/**
	 * 获取相同数据同步代理
	 * @return
	 */
	IPSSysDataSyncAgent getPSSysDataSyncAgent();
	
	
	
	
	/**
	 * 发送数据
	 * @param dataSyncOuts
	 */
	void send(DataSyncOut[] dataSyncOuts);
	
	
	
	/**
	 * 接收数据
	 * @param dataSyncIns
	 */
	void recv(DataSyncIn[] dataSyncIns);
	
	
	
	/**
	 * 注册消费此同步代理的实体数据同步运行时
	 * @param iDEDataSyncInRuntime
	 */
	void registerDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime);
	
	
	/**
	 * 注销消费此同步代理的实体数据同步运行时
	 * @param iDEDataSyncInRuntime
	 */
	void unregisterDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime);
	
	/**
	 * 是否为系统内部同步代理
	 * @return
	 */
	boolean isInternalAgent();
	
	
	
	/**
	 * 是否使用直接数据模式
	 * @return
	 */
	boolean isRawDataMode();
	
	
	
	/**
	 * 获取代理类型
	 * @return
	 */
	String getAgentType();
	
}
