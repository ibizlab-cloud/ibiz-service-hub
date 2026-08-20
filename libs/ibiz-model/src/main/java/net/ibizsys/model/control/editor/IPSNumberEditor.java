package net.ibizsys.model.control.editor;



/**
 * 数值编辑器模型对象接口
 * <P>
 * 扩展父接口类型[NUMBER,MOBNUMBER]
 *
 */
public interface IPSNumberEditor extends net.ibizsys.model.control.IPSEditor{

	
	
	/**
	 * 获取最大值[MAXVALUE]
	 * @return
	 */
	Double getMaxValue();
	
	
	/**
	 * 获取最小值[MINVALUE]
	 * @return
	 */
	Double getMinValue();
	
	
	/**
	 * 获取值规则
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule();


	/**
	 * 获取值规则，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRuleMust();
	
	
	/**
	 * 获取浮点精度[PRECISION]
	 * @return
	 */
	@Deprecated
	Integer getPrecision();
	
	
	/**
	 * 获取小数点位数[SCALE]
	 * @return
	 */
	Integer getScale();
}