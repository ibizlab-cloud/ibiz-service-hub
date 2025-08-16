package net.ibizsys.model.control;



/**
 *
 */
public interface IPSControlItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取部件注入属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes();
	
	/**
	 * 获取部件注入属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件注入属性集合
	 * @param list 部件注入属性集合
	 */
	void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list);
	
	
	/**
	 * 获取部件逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics();
	
	/**
	 * 获取部件逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件逻辑集合
	 * @param list 部件逻辑集合
	 */
	void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list);
	
	
	/**
	 * 获取部件绘制器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders();
	
	/**
	 * 获取部件绘制器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件绘制器集合
	 * @param list 部件绘制器集合
	 */
	void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list);
}