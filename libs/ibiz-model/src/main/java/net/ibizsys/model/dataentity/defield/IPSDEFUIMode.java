package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性界面配置模式模型对象接口
 *
 */
public interface IPSDEFUIMode extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取属性表单项模式
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFFormItem getPSDEFFormItem();


	/**
	 * 获取属性表单项模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFFormItem getPSDEFFormItemMust();
	
	
	/**
	 * 获取应用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFUIMode}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否移动端模式
	 * @return
	 */
	boolean isMobileMode();
}