package net.ibizsys.model.control.drctrl;



/**
 * 实体数据关系边栏项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO}运行时对象
 *
 */
public interface IPSDEDRBarItem extends net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取关系栏项分组
	 * @return
	 */
	net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroup();


	/**
	 * 获取关系栏项分组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroupMust();
}