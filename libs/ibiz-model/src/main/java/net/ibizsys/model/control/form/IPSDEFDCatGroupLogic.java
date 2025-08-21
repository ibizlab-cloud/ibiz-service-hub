package net.ibizsys.model.control.form;



/**
 * 实体表单成员分类逻辑模型对象接口
 *
 */
public interface IPSDEFDCatGroupLogic extends net.ibizsys.model.control.form.IPSDEFDGroupLogic{

	
	
	/**
	 * 获取逻辑类别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat}
	 * @return
	 */
	java.lang.String getLogicCat();
	
	
	/**
	 * 获取关联成员名称集合
	 * @return
	 */
	java.util.List<java.lang.String> getRelatedDetailNames();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
}