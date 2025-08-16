package net.ibizsys.model.control.panel;



/**
 * 面板项逻辑项模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getLogicType}
 *
 */
public interface IPSPanelItemLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取逻辑类别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_LOGICCAT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat}
	 * @return
	 */
	java.lang.String getLogicCat();
	
	
	/**
	 * 获取逻辑类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_LOGICTYPE}
	 * @return
	 */
	java.lang.String getLogicType();
}