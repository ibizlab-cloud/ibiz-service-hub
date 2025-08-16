package net.ibizsys.psmodel.runtime.util;

import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelServiceSession;

public interface IPSModelRTServiceSession extends IPSModelServiceSession, IPSModelTranspileContext{

	/**
	 * 获取系统运行时模型服务
	 * @return
	 */
	IPSSystemService getPSSystemService();
	
	
	/**
	 * 获取当前会话缓存的模型
	 * @param strPSModelName
	 * @param strKey
	 * @return
	 * @throws Exception
	 */
	IPSModel getCachePSModel(String strPSModelName, String strKey) throws Exception;
	
	
	
	/**
	 * 获取当前系统
	 * @return
	 */
	IPSSystem getPSSystem();
	
	
	/**
	 * 获取当前应用
	 * @return
	 */
	IPSApplication getPSApplication();
	
	
	
	
	
}
