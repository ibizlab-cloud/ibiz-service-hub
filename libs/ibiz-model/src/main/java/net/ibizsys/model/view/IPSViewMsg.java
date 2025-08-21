package net.ibizsys.model.view;



/**
 * 视图消息模型基础对象接口
 *
 */
public interface IPSViewMsg extends net.ibizsys.model.IPSModelObject{

	
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();


	/**
	 * 获取内容多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	int getDynamicMode();
	
	java.lang.String getEnableMode();
	
	java.lang.String getMessage();
	
	java.lang.String getMessageType();
	
	net.ibizsys.model.res.IPSSysCss getPSSysCss();

net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	net.ibizsys.model.res.IPSSysImage getPSSysImage();

net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	java.lang.String getPosition();
	
	int getRemoveMode();
	
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();

net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	java.lang.String getTestScriptCode();
	
	java.lang.String getTitle();
	
	java.lang.String getTitleLanResTag();
	
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();

net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取消息唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	boolean isEnableRemove();
}