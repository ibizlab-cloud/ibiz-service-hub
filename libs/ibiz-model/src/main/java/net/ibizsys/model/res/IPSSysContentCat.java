package net.ibizsys.model.res;



/**
 * 系统预置内容分类模型对象接口
 *
 */
public interface IPSSysContentCat extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取分类标记
	 * @return
	 */
	java.lang.String getCatTag();
	
	
	/**
	 * 获取分类标记2
	 * @return
	 */
	java.lang.String getCatTag2();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysContent> getPSSysContents();
	
	/**
	 * 获取内容集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysContent getPSSysContent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置内容集合
	 * @param list 内容集合
	 */
	void setPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list);
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
}