package net.ibizsys.model.dataentity.der;



/**
 * 实体1：1关系模型对象接口
 * <P>
 * 扩展父接口类型[DER11]
 *
 */
public interface IPSDER11 extends net.ibizsys.model.dataentity.der.IPSDERBase
		,net.ibizsys.model.dataentity.der.IPSDER1N{

	
	
	/**
	 * 获取一对一关系数据属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField getPSOne2OneDataDEField();


	/**
	 * 获取一对一关系数据属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField getPSOne2OneDataDEFieldMust();
}