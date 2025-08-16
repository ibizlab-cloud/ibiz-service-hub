package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射数据集模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMapDSDTO}运行时对象
 *
 */
public interface IPSDEMapDataSet extends net.ibizsys.model.dataentity.datamap.IPSDEMapObject{

	
	
	/**
	 * 获取目标实体数据集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDSDTO#FIELD_DSTPSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取映射模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDSDTO#FIELD_MAPMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMapObjectMapMode}
	 * @return
	 */
	java.lang.String getMapMode();
	
	
	/**
	 * 获取映射动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMapParams();
	
	
	/**
	 * 获取源实体数据集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDSDTO#FIELD_PSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getSrcPSDEDataSet();


	/**
	 * 获取源实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getSrcPSDEDataSetMust();
	
	
	/**
	 * 获取是否启用查询条件附加
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDSDTO#FIELD_ENABLEDQCOND}
	 * @return
	 */
	boolean isEnableDQCond();
}