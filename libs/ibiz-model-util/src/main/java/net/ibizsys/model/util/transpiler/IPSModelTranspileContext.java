package net.ibizsys.model.util.transpiler;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.app.IPSApplication;

public interface IPSModelTranspileContext {

	/**
	 * 获取参数
	 * @param strKey
	 * @return
	 */
	Object getParam(String strKey);
	
	
	/**
	 * 设置参数
	 * @param strKey
	 * @param objValue
	 */
	void setParam(String strKey, Object objValue);
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getParam(String strKey, String strDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getParam(String strKey, int nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	long getParam(String strKey, long nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getParam(String strKey, double fDefault);
	
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getParam(String strKey, boolean bDefault);
	
	
	/**
	 * 获取模型转译器
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSModelTranspiler getPSModelTranspiler(Class<?> cls, boolean bTryMode) throws Exception;
	
	/**
	 * 获取模型列表转译器
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSModelListTranspiler getPSModelListTranspiler(Class<?> cls, boolean bTryMode) throws Exception;
	
	
	
	
	/**
	 * 获取模型唯一标记
	 * @param iPSModelObject
	 * @return
	 * @throws Exception
	 */
	String getPSModelUniqueTag(IPSModelObject iPSModelObject) throws Exception;
	
	
	/**
	 * 获取系统运行时模型服务
	 * @return
	 */
	IPSSystemService getPSSystemService();
	

//	
//	/**
//	 * 获取编译所有者
//	 * @return
//	 */
//	IPSModelObject getCompileOwner();
//	
	
	
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
