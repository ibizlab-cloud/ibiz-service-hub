package net.ibizsys.model.control.toolbar;



/**
 * 上下文直接内容菜单项模型对象接口
 * <P>
 * 扩展父接口类型[RAWITEM]
 *
 */
public interface IPSDECMRawItem extends net.ibizsys.model.control.toolbar.IPSDEContextMenuItem
		,net.ibizsys.model.control.IPSRawItem
		,net.ibizsys.model.control.IPSRawItemContainer{

	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
}