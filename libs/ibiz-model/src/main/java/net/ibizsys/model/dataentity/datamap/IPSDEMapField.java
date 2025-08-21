package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射属性模型对象接口
 *
 */
public interface IPSDEMapField extends net.ibizsys.model.dataentity.datamap.IPSDEMapObject{

	
	
	/**
	 * 获取目标属性名称
	 * @return
	 */
	java.lang.String getDstFieldName();
	
	
	/**
	 * 获取目标实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEField();


	/**
	 * 获取目标实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEFieldMust();
	
	
	/**
	 * 获取表达式
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取映射类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMapFieldSrcType}
	 * @return
	 */
	java.lang.String getMapType();
	
	
	/**
	 * 获取系统值转换器
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取直接值
	 * @return
	 */
	java.lang.String getRawValue();
	
	
	/**
	 * 获取源属性名称
	 * @return
	 */
	java.lang.String getSrcFieldName();
	
	
	/**
	 * 获取源实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSrcPSDEField();


	/**
	 * 获取源实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSrcPSDEFieldMust();
}