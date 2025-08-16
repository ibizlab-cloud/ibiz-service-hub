package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBICubeLevel extends net.ibizsys.model.bi.IPSBICubeDimensionObject{

	
	
	/**
	 * 获取层级标记
	 * @return
	 */
	java.lang.String getLevelTag();
	
	
	/**
	 * 获取层级标记2
	 * @return
	 */
	java.lang.String getLevelTag2();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取是否全部层级
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ALLLEVELFLAG}
	 * @return
	 */
	boolean isAllLevel();
}