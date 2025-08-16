package net.ibizsys.model.control.form;



/**
 * 实体编辑表单参数模型对象接口
 *
 */
public interface IPSDEEditFormParam extends net.ibizsys.model.control.form.IPSDEFormParam
		,net.ibizsys.model.control.IPSSDAjaxControlParam{

	
	
	/**
	 * 获取自动保存
	 * @return
	 */
	java.lang.Boolean isEnableAutoSave();
}