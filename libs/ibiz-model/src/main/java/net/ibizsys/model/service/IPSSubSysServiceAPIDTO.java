package net.ibizsys.model.service;



/**
 * 外部系统服务接口DTO模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDTO extends net.ibizsys.model.service.IPSServiceAPIDTO{

	
	
	/**
	 * 获取外部服务接口DTO属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> getPSSubSysServiceAPIDTOFields();
	
	/**
	 * 获取外部服务接口DTO属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTOField getPSSubSysServiceAPIDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置外部服务接口DTO属性集合
	 * @param list 外部服务接口DTO属性集合
	 */
	void setPSSubSysServiceAPIDTOFields(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTOField> list);
	
	
	/**
	 * 获取标记
	 * @return
	 */
	java.lang.String getTag();
	
	
	/**
	 * 获取标记2
	 * @return
	 */
	java.lang.String getTag2();
}