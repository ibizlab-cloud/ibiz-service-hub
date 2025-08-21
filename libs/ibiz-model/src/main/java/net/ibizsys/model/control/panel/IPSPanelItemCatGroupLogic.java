package net.ibizsys.model.control.panel;



/**
 * 面板项分类组合逻辑模型对象接口
 *
 */
public interface IPSPanelItemCatGroupLogic extends net.ibizsys.model.control.panel.IPSPanelItemGroupLogic{

	
	
	/**
	 * 获取逻辑类别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat}
	 * @return
	 */
	java.lang.String getLogicCat();
	
	
	/**
	 * 获取关联成员名称集合
	 * @return
	 */
	java.util.List<java.lang.String> getRelatedItemNames();
}