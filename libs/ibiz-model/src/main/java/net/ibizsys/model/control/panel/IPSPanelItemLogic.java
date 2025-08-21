package net.ibizsys.model.control.panel;



/**
 * 面板项逻辑项模型对象基础接口
 *
 */
public interface IPSPanelItemLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取逻辑类别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat}
	 * @return
	 */
	java.lang.String getLogicCat();
	
	
	/**
	 * 获取逻辑类型
	 * @return
	 */
	java.lang.String getLogicType();
}