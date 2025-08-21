package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态属性模型对象接口
 *
 */
public interface IPSDEMainStateField extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType}
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取是否属性允许模式，由实体主状态控制{@link net.ibizsys.model.dataentity.mainstate.IPSDEMainState#isFieldAllowMode}
	 * @return
	 */
	boolean isAllowMode();
}