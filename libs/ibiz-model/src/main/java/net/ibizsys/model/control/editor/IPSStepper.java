package net.ibizsys.model.control.editor;



/**
 * 步进编辑器模型对象接口
 * <P>
 * 扩展父接口类型[STEPPER,MOBSTEPPER]
 *
 */
public interface IPSStepper extends net.ibizsys.model.control.editor.IPSNumberEditor{

	
	
	/**
	 * 获取步进值[STEPVALUE]
	 * @return
	 */
	java.lang.Double getStepValue();
}