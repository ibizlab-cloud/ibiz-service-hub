package net.ibizsys.model.app.dataentity;



/**
 * 应用实体映射数据集模型对象接口
 *
 */
public interface IPSAppDEMapDataSet extends net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet{

	
	
	/**
	 * 获取目标应用实体数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSet();


	/**
	 * 获取目标应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSetMust();
	
	
	/**
	 * 获取源应用实体数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getSrcPSAppDEDataSet();


	/**
	 * 获取源应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getSrcPSAppDEDataSetMust();
}