package net.ibizsys.model.view;



/**
 * 视图消息组模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO}运行时对象
 *
 */
public interface IPSViewMsgGroup extends net.ibizsys.model.IPSModelObject{

	
	java.lang.String getBodyStyle();
	
	java.lang.String getBottomStyle();
	
	java.lang.String getCodeName();
	
	java.lang.String getTopStyle();
	
	
	/**
	 * 获取消息组唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}