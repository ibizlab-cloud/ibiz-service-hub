package net.ibizsys.model.control.form;



/**
 * 实体表单分页部件分页成员模型对象接口
 * <P>
 * 扩展父接口类型[TABPAGE]
 *
 */
public interface IPSDEFormTabPage extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.form.IPSDEFormGroupPanel{

	
	
	/**
	 * 获取实体关系项标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_DRITEMTAG}
	 * @return
	 */
	java.lang.String getDRItemTag();
}