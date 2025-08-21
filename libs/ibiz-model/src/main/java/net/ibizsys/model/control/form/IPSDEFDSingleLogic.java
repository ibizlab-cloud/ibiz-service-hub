package net.ibizsys.model.control.form;



/**
 * 实体表单成员单项逻辑模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEFDSingleLogic extends net.ibizsys.model.control.form.IPSDEFDLogic{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	java.lang.String getCondOP();
	
	
	/**
	 * 获取表单项名称
	 * @return
	 */
	java.lang.String getDEFDName();
	
	
	/**
	 * 获取条件值
	 * @return
	 */
	java.lang.String getValue();
}