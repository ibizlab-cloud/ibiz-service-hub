package net.ibizsys.model.control.panel;



/**
 * 面板项单项逻辑模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSPanelItemSingleLogic extends net.ibizsys.model.control.panel.IPSPanelItemLogic{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取模型属性名称
	 * @return
	 */
	java.lang.String getDstModelField();
	
	
	/**
	 * 获取条件值
	 * @return
	 */
	java.lang.String getValue();
}