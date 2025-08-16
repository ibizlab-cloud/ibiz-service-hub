package net.ibizsys.runtime;

import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;

/**
 * 动态实例运行时接口
 * @author lionlau
 *
 */
public interface IDynaInstRuntime extends ISystemRuntimeBase{

	/**
	 * 初始化动态实例运行时
	 * @param iPSDynaInstService
	 * @param iSystemRuntimeContext
	 * @throws Exception
	 */
	void init(IPSDynaInstService iPSDynaInstService, ISystemRuntimeContext iSystemRuntimeContext)throws Exception;
	
	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 获取动态实例服务对象
	 * @return
	 */
	IPSDynaInstService getPSDynaInstService();
	
	/**
	 * 获取系统模型
	 * @return
	 * @throws Exception
	 */
	IPSSystem getPSSystem();
	
	
	/**
	 * 获取加载的时间
	 * @return
	 */
	long getLoadedTime();
	
	
	/**
	 * 激活，标记使用
	 */
	void active();
	
	
	/**
	 * 获取最后的激活时间
	 * @return
	 */
	long getLastActiveTime();
	
	
	/**
	 * 获取最后的模型实例检查时间
	 * @return
	 */
	long getLastCheckTime();
	
	
	/**
	 * 标记模型实例已检查
	 */
	void markChecked();
	
	/**
	 * 获取子动态实例标识
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @return
	 * @throws Exception
	 */
	String getChildDynaInstId(String strDynaInstTag,String strDynaInstTag2);
	
	
	
	/**
	 * 获取模型文件夹路径
	 * @return
	 */
	String getDynaInstFolderPath();
	
	
	
	 /**
	 * 获取指定动态实例实体运行时对象
	 * @param strIdOrName
	 * @return
	 * @throws Exception
	 */
	IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime(String strIdOrName);
	
	
	/**
	 * 检查是否有效
	 * @return
	 */
	boolean check();
	
	
	
	/**
	 * 获取动态实例模式
	 * @return
	 */
	int getDynaInstMode();
}
