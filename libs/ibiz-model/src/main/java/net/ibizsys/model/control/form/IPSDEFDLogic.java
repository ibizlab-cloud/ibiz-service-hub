package net.ibizsys.model.control.form;



/**
 * 实体表单成员逻辑模型基础对象接口
 *
 */
public interface IPSDEFDLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取逻辑类别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailLogicCat}
	 * @return
	 */
	java.lang.String getLogicCat();
	
	
	/**
	 * 获取逻辑类型
	 * @return
	 */
	java.lang.String getLogicType();
}