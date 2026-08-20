package net.ibizsys.model.view;



/**
 * 视图消息模型基础对象接口
 *
 */
public interface IPSViewMsg extends net.ibizsys.model.IPSModelObject{

	
	String getCodeName();
	
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();

net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgContentType}
	 * @return
	 */
	String getContentType();
	
	int getDynamicMode();
	
	String getEnableMode();
	
	String getMessage();
	
	String getMessageType();
	
	net.ibizsys.model.res.IPSSysCss getPSSysCss();

net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	net.ibizsys.model.res.IPSSysImage getPSSysImage();

net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	String getPosition();
	
	int getRemoveMode();
	
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();

net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	String getTestScriptCode();
	
	String getTitle();
	
	String getTitleLanResTag();
	
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();

net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取消息唯一标记
	 * @return
	 */
	String getUniqueTag();
	
	boolean isEnableRemove();
}