package net.ibizsys.model.dataentity;



/**
 *
 */
public interface IPSDEGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取成员数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取成员参数
	 * @return
	 */
	java.lang.String getDetailParam();
	
	
	/**
	 * 获取成员参数2
	 * @return
	 */
	java.lang.String getDetailParam2();
	
	
	/**
	 * 获取成员标记
	 * @return
	 */
	java.lang.String getDetailTag();
	
	
	/**
	 * 获取成员标记2
	 * @return
	 */
	java.lang.String getDetailTag2();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}