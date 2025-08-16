package net.ibizsys.model.control.tree;



/**
 * 实体甘特图部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeViewDTO}运行时对象
 *
 */
public interface IPSDEGantt extends net.ibizsys.model.control.tree.IPSDETreeGridEx{

	
	
	/**
	 * 获取开始时间数据项
	 * @return
	 */
	java.lang.String getBeginDataItemName();
	
	
	/**
	 * 获取结束时间数据项
	 * @return
	 */
	java.lang.String getEndDataItemName();
	
	
	/**
	 * 获取完成量数据项
	 * @return
	 */
	java.lang.String getFinishDataItemName();
	
	
	/**
	 * 获取前置数据项
	 * @return
	 */
	java.lang.String getPrevDataItemName();
	
	
	/**
	 * 获取编号数据项
	 * @return
	 */
	java.lang.String getSNDataItemName();
	
	
	/**
	 * 获取总量数据项
	 * @return
	 */
	java.lang.String getTotalDataItemName();
}