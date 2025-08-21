package net.ibizsys.model.dataentity.der;



/**
 * 实体关系属性映射模型对象接口
 *
 */
public interface IPSDERDEFieldMap extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取主实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEField();


	/**
	 * 获取主实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEFieldMust();
	
	
	/**
	 * 获取从实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEField();


	/**
	 * 获取从实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEFieldMust();
}