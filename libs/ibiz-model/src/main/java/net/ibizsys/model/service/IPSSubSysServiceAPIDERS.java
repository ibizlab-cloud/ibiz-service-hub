package net.ibizsys.model.service;



/**
 * 外部系统服务接口实体关系模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDERS extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取主接口实体
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getMajorPSSubSysServiceAPIDE();


	/**
	 * 获取主接口实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getMajorPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取主控排序
	 * @return
	 */
	int getMasterOrder();
	
	
	/**
	 * 获取从接口实体
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getMinorPSSubSysServiceAPIDE();


	/**
	 * 获取从接口实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getMinorPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取关系项
	 * @return
	 */
	java.lang.String getParentFilter();
	
	
	/**
	 * 获取关系标记
	 * @return
	 */
	java.lang.String getRSTag();
	
	
	/**
	 * 获取关系标记
	 * @return
	 */
	java.lang.String getRSTag2();
	
	
	/**
	 * 获取是否数组模式
	 * @return
	 */
	boolean isArray();
}