package net.ibizsys.model.dataentity.der;



/**
 * 实体关系组成员模型对象接口
 *
 */
public interface IPSDERGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取实体关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取实体关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}