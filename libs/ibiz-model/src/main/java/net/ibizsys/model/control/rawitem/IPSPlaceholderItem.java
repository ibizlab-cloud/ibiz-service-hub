package net.ibizsys.model.control.rawitem;



/**
 * 占位直接内容项模型对象接口
 * <P>
 * 扩展父接口类型[PLACEHOLDER]
 *
 */
public interface IPSPlaceholderItem extends net.ibizsys.model.control.IPSRawItemBase{

	
	
	/**
	 * 获取标题
	 * @return
	 */
	String getCaption();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	String getContent();
}