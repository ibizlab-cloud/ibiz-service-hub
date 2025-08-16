package net.ibizsys.model.control.grid;



/**
 * 实体表格逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGridLogicDTO}运行时对象
 *
 */
public interface IPSDEGridLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取表格列名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridLogicDTO#FIELD_PSDEGRIDCOLNAME}
	 * @return
	 */
	java.lang.String getPSDEGridColumnName();
}