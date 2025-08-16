package net.ibizsys.model.control.editor;



/**
 * 直接内容编辑器模型对象接口
 * <P>
 * 扩展父接口类型[RAW]
 *
 */
public interface IPSRaw extends net.ibizsys.model.control.IPSEditor{

	
	
	/**
	 * 获取内容类型[CONTENTTYPE]{RAW|HTML|IMAGE|MARKDOWN}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取模板内容[TEMPLATE]
	 * @return
	 */
	java.lang.String getTemplate();
}