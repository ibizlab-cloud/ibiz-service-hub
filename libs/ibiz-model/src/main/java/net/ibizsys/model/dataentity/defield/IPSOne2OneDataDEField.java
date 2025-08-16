package net.ibizsys.model.dataentity.defield;



/**
 * 实体一对一数据存储属性模型对象接口
 *
 */
public interface IPSOne2OneDataDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取一对一关系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_O2OPSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取一对一关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}