package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询条件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getCondType}
 *
 */
public interface IPSDEDQCondition extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_PSDBVALUEOPID}
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取条件标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_CONDTAG}
	 * @return
	 */
	java.lang.String getCondTag();
	
	
	/**
	 * 获取条件标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_CONDTAG2}
	 * @return
	 */
	java.lang.String getCondTag2();
	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_CONDTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CondType}
	 * @return
	 */
	java.lang.String getCondType();
}