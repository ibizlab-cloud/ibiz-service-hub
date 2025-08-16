package net.ibizsys.model.dataentity.uiaction;



/**
 * 实体界面行为组成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO}运行时对象
 *
 */
public interface IPSDEUIActionGroupDetail extends net.ibizsys.model.view.IPSUIActionGroupDetail{

	
	
	/**
	 * 获取后置内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_AFTERCONTENT}
	 * @return
	 */
	java.lang.String getAfterContent();
	
	
	/**
	 * 获取后置内容类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_AFTERITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UAGroupDetailAppendItemType}
	 * @return
	 */
	java.lang.String getAfterItemType();
	
	
	/**
	 * 获取后置内容语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getAfterPSLanguageRes();


	/**
	 * 获取后置内容语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getAfterPSLanguageResMust();
	
	
	/**
	 * 获取前置内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_BEFORECONTENT}
	 * @return
	 */
	java.lang.String getBeforeContent();
	
	
	/**
	 * 获取前置内容类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_BEFOREITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UAGroupDetailAppendItemType}
	 * @return
	 */
	java.lang.String getBeforeItemType();
	
	
	/**
	 * 获取前置内容语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getBeforePSLanguageRes();


	/**
	 * 获取前置内容语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getBeforePSLanguageResMust();
	
	
	/**
	 * 获取标题语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_DETAILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UAGroupDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
	/**
	 * 获取提示语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
}