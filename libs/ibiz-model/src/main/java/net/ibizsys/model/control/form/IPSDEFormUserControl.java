package net.ibizsys.model.control.form;



/**
 * 实体表单自定义部件成员模型对象接口
 * <P>
 * 扩展父接口类型[USERCONTROL]
 *
 */
public interface IPSDEFormUserControl extends net.ibizsys.model.control.form.IPSDEFormDetail{

	
	
	/**
	 * 获取部件参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	java.lang.String getPredefinedType();
}