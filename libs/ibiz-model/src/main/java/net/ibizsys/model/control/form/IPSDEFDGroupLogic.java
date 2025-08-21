package net.ibizsys.model.control.form;



/**
 * 实体表单成员分组逻辑模型对象接口
 * <P>
 * 扩展父接口类型[GROUP]
 *
 */
public interface IPSDEFDGroupLogic extends net.ibizsys.model.control.form.IPSDEFDLogic{

	
	
	/**
	 * 获取组逻辑
	 * @return
	 */
	java.lang.String getGroupOP();
	
	
	/**
	 * 获取逻辑项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> getPSDEFDLogics();
	
	/**
	 * 获取逻辑项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFDLogic getPSDEFDLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑项集合
	 * @param list 逻辑项集合
	 */
	void setPSDEFDLogics(java.util.List<net.ibizsys.model.control.form.IPSDEFDLogic> list);
	
	
	/**
	 * 获取是否逻辑取反
	 * @return
	 */
	boolean isNotMode();
}