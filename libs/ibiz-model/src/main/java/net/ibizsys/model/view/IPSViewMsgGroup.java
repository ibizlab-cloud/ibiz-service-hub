package net.ibizsys.model.view;



/**
 * 视图消息组模型基础对象接口
 *
 */
public interface IPSViewMsgGroup extends net.ibizsys.model.IPSModelObject{

	
	String getBodyStyle();
	
	String getBottomStyle();
	
	String getCodeName();
	
	String getTopStyle();
	
	
	/**
	 * 获取消息组唯一标记
	 * @return
	 */
	String getUniqueTag();
}