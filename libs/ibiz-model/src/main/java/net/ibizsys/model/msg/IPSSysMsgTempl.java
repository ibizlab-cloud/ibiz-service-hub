package net.ibizsys.model.msg;



/**
 * 系统消息模板模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO}运行时对象
 *
 */
public interface IPSSysMsgTempl extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取模板内容值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_CONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEField();


	/**
	 * 获取模板内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEFieldMust();
	
	
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MsgContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取内容类型值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_CONTENTTYPEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEField();


	/**
	 * 获取内容类型值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEFieldMust();
	
	
	/**
	 * 获取钉钉内容
	 * @return
	 */
	java.lang.String getDDContent();
	
	
	/**
	 * 获取钉钉消息模板内容值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_DDCONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEField();


	/**
	 * 获取钉钉消息模板内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEFieldMust();
	
	
	/**
	 * 获取钉钉内容多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getDDPSLanguageRes();


	/**
	 * 获取钉钉内容多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getDDPSLanguageResMust();
	
	
	/**
	 * 获取即时消息内容
	 * @return
	 */
	java.lang.String getIMContent();
	
	
	/**
	 * 获取即时消息模板内容值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_IMCONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEField();


	/**
	 * 获取即时消息模板内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEFieldMust();
	
	
	/**
	 * 获取即时消息多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getIMPSLanguageRes();


	/**
	 * 获取即时消息多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getIMPSLanguageResMust();
	
	
	/**
	 * 获取语言值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_LANPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getLanPSDEField();


	/**
	 * 获取语言值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getLanPSDEFieldMust();
	
	
	/**
	 * 获取移动端任务操作路径
	 * @return
	 */
	java.lang.String getMobTaskUrl();
	
	
	/**
	 * 获取移动端任务路径值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_MOBTASKURLPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEField();


	/**
	 * 获取移动端任务路径值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEFieldMust();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_MSGTEMPLPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMsgTemplParams();
	
	
	/**
	 * 获取消息模板标记
	 * @return
	 */
	java.lang.String getMsgTemplTag();
	
	
	/**
	 * 获取消息模板标记2
	 * @return
	 */
	java.lang.String getMsgTemplTag2();
	
	
	/**
	 * 获取消息模板类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MsgTemplType}
	 * @return
	 */
	java.lang.String getMsgTemplType();
	
	
	/**
	 * 获取目标数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取目标数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取后台扩展插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_PSSYSSFPLUGINID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取短消息内容
	 * @return
	 */
	java.lang.String getSMSContent();
	
	
	/**
	 * 获取短消息模板内容值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_SMSCONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEField();


	/**
	 * 获取短消息模板内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEFieldMust();
	
	
	/**
	 * 获取短消息多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSMSPSLanguageRes();


	/**
	 * 获取短消息多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSMSPSLanguageResMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取脚本模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ScriptMode}
	 * @return
	 */
	int getScriptMode();
	
	
	/**
	 * 获取标题多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubPSLanguageRes();


	/**
	 * 获取标题多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getSubject();
	
	
	/**
	 * 获取标题值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_SUBJECTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSubjectPSDEField();


	/**
	 * 获取标题值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSubjectPSDEFieldMust();
	
	
	/**
	 * 获取任务操作路径
	 * @return
	 */
	java.lang.String getTaskUrl();
	
	
	/**
	 * 获取任务路径值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_TASKURLPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEField();


	/**
	 * 获取任务路径值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEFieldMust();
	
	
	/**
	 * 获取消息模板引擎
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MsgTemplEngine}
	 * @return
	 */
	java.lang.String getTemplEngine();
	
	
	/**
	 * 获取模板标记值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_TEMPLTAGPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTemplTagPSDEField();


	/**
	 * 获取模板标记值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTemplTagPSDEFieldMust();
	
	
	/**
	 * 获取用户自定义2值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_USER2PSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEField();


	/**
	 * 获取用户自定义2值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEFieldMust();
	
	
	/**
	 * 获取用户自定义值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_USERPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEField();


	/**
	 * 获取用户自定义值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEFieldMust();
	
	
	/**
	 * 获取微信内容
	 * @return
	 */
	java.lang.String getWXContent();
	
	
	/**
	 * 获取微信消息模板内容值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO#FIELD_WCCONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEField();


	/**
	 * 获取微信消息模板内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEFieldMust();
	
	
	/**
	 * 获取微信内容多语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getWXPSLanguageRes();


	/**
	 * 获取微信内容多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getWXPSLanguageResMust();
	
	
	/**
	 * 获取是否邮件群组发送
	 * @return
	 */
	boolean isMailGroupSend();
}