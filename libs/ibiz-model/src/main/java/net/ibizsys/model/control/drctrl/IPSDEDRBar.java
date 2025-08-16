package net.ibizsys.model.control.drctrl;



/**
 * 实体数据关系边栏部件模型对象接口
 *
 */
public interface IPSDEDRBar extends net.ibizsys.model.control.drctrl.IPSDRBar
		,net.ibizsys.model.control.drctrl.IPSDEDRCtrl{

	
	
	/**
	 * 获取实体数据关系栏分组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> getPSDEDRBarGroups();
	
	/**
	 * 获取实体数据关系栏分组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据关系栏分组集合
	 * @param list 实体数据关系栏分组集合
	 */
	void setPSDEDRBarGroups(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> list);
}