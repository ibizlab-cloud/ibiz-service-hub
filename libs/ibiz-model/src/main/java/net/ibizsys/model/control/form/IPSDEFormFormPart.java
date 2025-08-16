package net.ibizsys.model.control.form;



/**
 *
 */
public interface IPSDEFormFormPart extends net.ibizsys.model.control.form.IPSDEFormGroupPanel{

	
	
	/**
	 * 获取表单部件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CONTENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormPartType}
	 * @return
	 */
	java.lang.String getFormPartType();
}