package net.ibizsys.model.control.form;



/**
 * 实体表单逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFormLogicDTO}运行时对象
 *
 */
public interface IPSDEFormLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取表单成员名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormLogicDTO#FIELD_PSDEFORMDETAILNAME}
	 * @return
	 */
	java.lang.String getPSDEFormDetailName();
}