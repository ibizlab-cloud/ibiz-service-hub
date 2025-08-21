package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏直接内容项模型对象接口
 * <P>
 * 扩展父接口类型[RAWITEM]
 *
 */
public interface IPSDETBRawItem extends net.ibizsys.model.control.toolbar.IPSDEToolbarItem
		,net.ibizsys.model.control.IPSRawItem
		,net.ibizsys.model.control.IPSRawItemContainer{

	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
}