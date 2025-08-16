package net.ibizsys.model.control.tree;



/**
 * 实体树视图代码表节点模型对象接口
 * <P>
 * 扩展父接口类型[CODELIST]
 *
 */
public interface IPSDETreeCodeListNode extends net.ibizsys.model.control.tree.IPSDETreeNode{

	
	
	/**
	 * 获取应用代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取是否附加节点标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_APPENDCAPFLAG}
	 * @return
	 */
	boolean isAppendCaption();
}