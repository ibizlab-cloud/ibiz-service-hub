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
	 * @return
	 */
	java.lang.String getDRItemTag();
}