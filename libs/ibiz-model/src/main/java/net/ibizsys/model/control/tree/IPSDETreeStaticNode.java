package net.ibizsys.model.control.tree;



/**
 * 实体树视图静态节点模型对象接口
 * <P>
 * 扩展父接口类型[STATIC]
 *
 */
public interface IPSDETreeStaticNode extends net.ibizsys.model.control.tree.IPSDETreeNode{

	
	
	/**
	 * 获取静态节点值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_NODEVALUE}
	 * @return
	 */
	java.lang.String getNodeValue();
	
	
	/**
	 * 获取节点文本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getText();
	
	
	/**
	 * 获取提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_TOOLTIPINFO}
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取提示语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_TIPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
}