package net.ibizsys.model.control.editor;



/**
 * 代码表编辑器模型基础对象接口
 *
 */
public interface IPSCodeListEditor extends net.ibizsys.model.control.IPSEditor{

	
	
	/**
	 * 获取全部项文本[ALLITEMSTEXT]
	 * @return
	 */
	java.lang.String getAllItemsText();
	
	
	/**
	 * 获取代码表（运行时内联）
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getInlinePSAppCodeList();


	/**
	 * 获取代码表（运行时内联），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getInlinePSAppCodeListMust();
	
	
	/**
	 * 获取应用代码表对象
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取是否输出全部项[ALLITEMS]
	 * @return
	 */
	boolean isAllItems();
	
	
	/**
	 * 获取是否值为数组形式
	 * @return
	 */
	boolean isArray();
}