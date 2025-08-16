package net.ibizsys.model.dataentity.dr;



/**
 * 实体关系界面组逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRLogicDTO}运行时对象
 *
 */
public interface IPSDEDRLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取向导步骤名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRLogicDTO#FIELD_PSDEDRDETAILNAME}
	 * @return
	 */
	java.lang.String getPSDEDRDetailName();
}