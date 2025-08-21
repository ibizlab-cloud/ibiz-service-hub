package net.ibizsys.model.control.dataview;



/**
 * 实体看板部件模型对象接口
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