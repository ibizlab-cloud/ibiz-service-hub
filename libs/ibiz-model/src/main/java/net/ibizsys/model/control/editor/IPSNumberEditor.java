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
	java.lang.Double getMaxValue();
	
	
	/**
	 * 获取最小值[MINVALUE]
	 * @return
	 */
	java.lang.Double getMinValue();
	
	
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
	java.lang.Integer getPrecision();
}