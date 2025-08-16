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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_CONDOP}
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取模型属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_DSTFIELDNAME}
	 * @return
	 */
	java.lang.String getDstModelField();
	
	
	/**
	 * 获取条件值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSPanelItemLogicDTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getValue();
}