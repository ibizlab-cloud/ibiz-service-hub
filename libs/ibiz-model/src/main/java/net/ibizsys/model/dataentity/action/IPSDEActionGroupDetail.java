package net.ibizsys.model.dataentity.action;



/**
 * 实体行为组成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEAGDetailDTO}运行时对象
 *
 */
public interface IPSDEActionGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEAGDetailDTO#FIELD_DETAILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodGroupDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEAGDetailDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取实体数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEAGDetailDTO#FIELD_PSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
}