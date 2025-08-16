package net.ibizsys.model.control.panel;



/**
 *
 */
public interface IPSPanelModel extends net.ibizsys.model.control.panel.IPSPanelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlModelDataType}
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取模型类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PanelModelType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否部件模型
	 * @return
	 */
	boolean isCtrlModel();
	
	
	/**
	 * 获取是否面板模型
	 * @return
	 */
	boolean isPanelModel();
	
	
	/**
	 * 获取是否视图模型
	 * @return
	 */
	boolean isViewModel();
}