package net.ibizsys.model.dataentity.dr;



/**
 * 实体关系数据组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO}运行时对象
 *
 */
public interface IPSDEDataRelation extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取编辑项标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMCAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getFormCapPSLanguageRes();


	/**
	 * 获取编辑项标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getFormCapPSLanguageResMust();
	
	
	/**
	 * 获取编辑项标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMCAPTION}
	 * @return
	 */
	java.lang.String getFormCaption();
	
	
	/**
	 * 获取编辑项图标资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMPSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getFormPSSysImage();


	/**
	 * 获取编辑项图标资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getFormPSSysImageMust();
	
	
	/**
	 * 获取实体关系组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> getPSDEDRDetails();
	
	/**
	 * 获取实体关系组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDRDetail getPSDEDRDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体关系组成员集合
	 * @param list 实体关系组成员集合
	 */
	void setPSDEDRDetails(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> list);
	
	
	/**
	 * 获取系统计数器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_PSSYSCOUNTERID}
	 * @return
	 */
	net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounter();


	/**
	 * 获取系统计数器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounterMust();
	
	
	/**
	 * 获取是否支持自定义关系项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_ENABLECUSTOMIZED}
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否默认隐藏编辑项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_HIDEEDITITEM}
	 * @return
	 */
	boolean isHideEditItem();
}