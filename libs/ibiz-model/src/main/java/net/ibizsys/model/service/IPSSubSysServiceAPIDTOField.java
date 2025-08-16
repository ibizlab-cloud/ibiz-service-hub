package net.ibizsys.model.service;



/**
 * 外部系统服务接口DTO属性模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDTOField extends net.ibizsys.model.service.IPSServiceAPIDTOField
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取中文名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取引用服务接口DTO对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTO getRefPSSubSysServiceAPIDTO();


	/**
	 * 获取引用服务接口DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTO getRefPSSubSysServiceAPIDTOMust();
	
	
	/**
	 * 获取外部服务接口DTO属性来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubSysServiceAPIDTOFieldSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
}