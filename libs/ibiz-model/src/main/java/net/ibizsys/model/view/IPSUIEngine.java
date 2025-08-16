package net.ibizsys.model.view;



/**
 * 界面引擎模型基础对象接口
 *
 */
public interface IPSUIEngine extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取引擎参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.view.IPSUIEngineParam> getPSUIEngineParams();
	
	/**
	 * 获取引擎参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.view.IPSUIEngineParam getPSUIEngineParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置引擎参数集合
	 * @param list 引擎参数集合
	 */
	void setPSUIEngineParams(java.util.List<net.ibizsys.model.view.IPSUIEngineParam> list);
}