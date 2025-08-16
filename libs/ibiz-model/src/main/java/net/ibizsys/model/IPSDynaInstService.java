package net.ibizsys.model;

/**
 * 动态实例服务对象接口
 * @author lionlau
 *
 */
public interface IPSDynaInstService extends IPSSystemService{

	/**
	 * 获取动态实例标识
	 * @return
	 */
	String getPSDynaInstId();
	
	/**
	 * 获取父动态实例标识
	 * @return
	 */
	String getPPSDynaInstId();
	
	/**
	 * 获取动态实例模式
	 * @return
	 */
	int getDynaInstMode();
	
	/**
	 * 获取动态实例标记
	 * @return
	 */
	String getDynaInstTag();
	
	
	
	/**
	 * 获取模型文件夹路径
	 * @return
	 */
	String getPSModelFolderPath();
	
	
	/**
	 * 获取动态实例标记2
	 * @return
	 */
	String getDynaInstTag2();
	

	/**
	 * 获取子动态实例服务对象
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @return
	 * @throws Exception
	 */
	IPSDynaInstService getChildPSDynaInstService(String strDynaInstTag,String strDynaInstTag2)throws Exception;
	
	
	
	/**
	 * 获取当前动态实例的父实例服务对象
	 * @return
	 * @throws Exception
	 */
	IPSDynaInstService getParentPSDynaInstService() throws Exception;
	
	
	
	/**
	 * 获取子动态实例对象
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @return
	 * @throws Exception
	 */
	IPSDynaInst getChildPSDynaInst(String strDynaInstTag,String strDynaInstTag2);
	
	
	
	/**
	 * 获取动态实例的核心系统模型服务
	 * @return
	 */
	IPSSystemService getPSSystemService();
	
	
	
	/**
	 * 获取安装的标记
	 * @return
	 */
	String getInstallTag();
}
