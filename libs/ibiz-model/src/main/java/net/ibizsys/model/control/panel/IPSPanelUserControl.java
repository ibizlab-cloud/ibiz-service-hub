package net.ibizsys.model.control.panel;



/**
 * 面板自定义部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO}运行时对象
 * <P>
 * 扩展父接口类型[USERCONTROL]
 *
 */
public interface IPSPanelUserControl extends net.ibizsys.model.control.panel.IPSPanelItem{

	
	
	/**
	 * 获取部件参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams();
	
	
	/**
	 * 获取预置类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_PREDEFINEDTYPE}
	 * @return
	 */
	java.lang.String getPredefinedType();
}