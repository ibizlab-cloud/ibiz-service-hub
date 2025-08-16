package net.ibizsys.model.control.panel;



/**
 * 面板项组合逻辑模型对象接口
 * <P>
 * 扩展父接口类型[GROUP]
 *
 */
public interface IPSPanelItemGroupLogic extends net.ibizsys.model.control.panel.IPSPanelItemLogic{

	
	
	/**
	 * 获取组逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_GROUPOP}
	 * @return
	 */
	java.lang.String getGroupOP();
	
	
	/**
	 * 获取逻辑项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> getPSPanelItemLogics();
	
	/**
	 * 获取逻辑项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelItemLogic getPSPanelItemLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑项集合
	 * @param list 逻辑项集合
	 */
	void setPSPanelItemLogics(java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> list);
	
	
	/**
	 * 获取是否逻辑取反
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_GROUPNOTFLAG}
	 * @return
	 */
	boolean isNotMode();
}