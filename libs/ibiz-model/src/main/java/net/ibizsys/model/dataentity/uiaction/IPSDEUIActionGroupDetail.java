package net.ibizsys.model.dataentity.uiaction;



/**
 * 实体界面行为组成员模型对象接口
 *
 */
public interface IPSDEUIActionGroupDetail extends net.ibizsys.model.view.IPSUIActionGroupDetail{

	
	
	/**
	 * 获取后置内容
	 * @return
	 */
	java.lang.String getAfterContent();
	
	
	/**
	 * 获取后置内容类型
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
	 * @return
	 */
	java.lang.String getBeforeContent();
	
	
	/**
	 * 获取前置内容类型
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UAGroupDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
	/**
	 * 获取引用界面行为组对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getRefPSUIActionGroup();


	/**
	 * 获取引用界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getRefPSUIActionGroupMust();
	
	
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