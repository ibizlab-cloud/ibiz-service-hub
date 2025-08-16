package net.ibizsys.model.view;



/**
 * 视图消息模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO}运行时对象
 *
 */
public interface IPSViewMsg extends net.ibizsys.model.IPSModelObject{

	
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容多语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO#FIELD_CONTENTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();


	/**
	 * 获取内容多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	int getDynamicMode();
	
	
	/**
	 * 获取视图消息启用模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO#FIELD_ENABLEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgEnableMode}
	 * @return
	 */
	java.lang.String getEnableMode();
	
	java.lang.String getMessage();
	
	java.lang.String getMessageType();
	
	
	/**
	 * 获取系统界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取系统图片
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	java.lang.String getPosition();
	
	int getRemoveMode();
	
	
	/**
	 * 获取启用判断操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();


	/**
	 * 获取启用判断操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	
	/**
	 * 获取启用判断脚本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgDTO#FIELD_TESTCUSTOMCODE}
	 * @return
	 */
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