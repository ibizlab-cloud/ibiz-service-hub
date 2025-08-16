package net.ibizsys.model.control.map;



/**
 * 系统地图部件逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysMapLogicDTO}运行时对象
 *
 */
public interface IPSSysMapLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取地图项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapLogicDTO#FIELD_PSSYSMAPITEMNAME}
	 * @return
	 */
	java.lang.String getPSSysMapItemName();
}