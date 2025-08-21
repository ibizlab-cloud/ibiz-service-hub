package net.ibizsys.model.res;



/**
 * 部件消息项模型对象接口
 *
 */
public interface IPSCtrlMsgItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();


	/**
	 * 获取内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	
	/**
	 * 获取显示时长（毫秒）
	 * @return
	 */
	int getTimeout();
}