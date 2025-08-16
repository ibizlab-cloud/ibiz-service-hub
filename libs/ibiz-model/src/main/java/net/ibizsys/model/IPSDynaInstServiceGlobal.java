package net.ibizsys.model;

/**
 * 动态实例服务全局对象接口
 * @author lionlau
 *
 */
public interface IPSDynaInstServiceGlobal {

	
	/**
	 * 获取动态实例模型服务对象
	 * @param strPSDynaInstId
	 * @param bReload
	 * @return
	 * @throws Exception
	 */
	IPSDynaInstService getPSDynaInstService(String strPSDynaInstId, boolean bReload)throws Exception;
	
	
	
	/**
	 * 获取缓存的动态实例模型服务对象
	 * @param strPSDynaInstId
	 * @return
	 */
	IPSDynaInstService getCachePSDynaInstService(String strPSDynaInstId);
	
	
	
	/**
	 * 重置动态实例模型服务对象
	 * @param strPSDynaInstId
	 */
	void resetPSDynaInstService(String strPSDynaInstId);
	
	
	
	/**
	 * 获取核心系统服务对象
	 * @return
	 */
	IPSSystemService getPSSystemService() ;
}
