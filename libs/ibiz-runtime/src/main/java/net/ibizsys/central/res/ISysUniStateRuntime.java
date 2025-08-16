package net.ibizsys.central.res;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntimeBase;
import net.ibizsys.model.PSModelEnums.UniStateMode;
import net.ibizsys.model.PSModelEnums.UniStateType;
import net.ibizsys.model.res.IPSSysUniState;

/**
 * 系统统一状态运行时对象接口
 * @author lionlau
 *
 */
public interface ISysUniStateRuntime extends ISystemModelRuntime,ISysUniStateUtilRuntimeBase {

	/**
	 * 路径参数：前缀
	 */
	public final static String PARAM_PREFIX = "prefix";
	
	
	/**
	 * 路径参数：主键
	 */
	public final static String PARAM_KEY = "key";
	
	
	/**
	 * 路径参数：统一标记
	 */
	public final static String PARAM_UNIQUETAG = "uniquetag";
	
	/**
	 * 路径参数：系统标识
	 */
	public final static String PARAM_SYSTEM = "system";
	
	
	/**
	 * 路径参数：目录
	 */
	public final static String PARAM_FOLDER = "folder";
	
	/**
	 * 路径参数：目录2
	 */
	public final static String PARAM_FOLDER2 = "folder2";
	
	
	/**
	 * 路径参数：目录3
	 */
	public final static String PARAM_FOLDER3 = "folder3";
	
	
	/**
	 * 路径参数：目录4
	 */
	public final static String PARAM_FOLDER4 = "folder4";
	
	/**
	 * 路径参数：目录5
	 */
	public final static String PARAM_FOLDER5 = "folder5";
	
	/**
	 * 路径参数：目录6
	 */
	public final static String PARAM_FOLDER6 = "folder6";
	
	/**
	 * 路径参数：目录7
	 */
	public final static String PARAM_FOLDER7 = "folder7";
	
	
	/**
	 * 路径参数：目录8
	 */
	public final static String PARAM_FOLDER8 = "folder8";
	
	
	/**
	 * 初始化系统统一状态运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysUniState
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUniState iPSSysUniState) throws Exception;
	
	
	
	/**
	 * 获取系统统一状态模型对象
	 * @return
	 */
	IPSSysUniState getPSSysUniState();
	
	
	
	
	/**
	 * 获取系统统一状态功能组件
	 * @return
	 */
	ISysUniStateUtilRuntimeBase getSysUniStateUtilRuntimeBase();
	
	
	/**
	 * 获取监控器路径
	 * @return
	 */
	String getMonitorPath();
	
	/**
	 * 获取统一状态类型
	 * @return
	 */
	UniStateType getUniStateType();
	
	
	/**
	 * 获取统一状态模式
	 * @return
	 */
	UniStateMode getUniStateMode();
}
