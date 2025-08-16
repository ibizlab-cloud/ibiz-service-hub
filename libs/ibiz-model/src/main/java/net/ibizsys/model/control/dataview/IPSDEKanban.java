package net.ibizsys.model.control.dataview;



/**
 * 实体看板部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataViewDTO}运行时对象
 *
 */
public interface IPSDEKanban extends net.ibizsys.model.control.dataview.IPSDEDataView{

	
	
	/**
	 * 获取更新分组行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdateGroupPSControlAction();


	/**
	 * 获取更新分组行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdateGroupPSControlActionMust();
}