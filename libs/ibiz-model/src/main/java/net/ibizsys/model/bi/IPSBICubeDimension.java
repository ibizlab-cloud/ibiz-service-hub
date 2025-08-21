package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBICubeDimension extends net.ibizsys.model.bi.IPSBICubeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取维度公式
	 * @return
	 */
	java.lang.String getDimensionFormula();
	
	
	/**
	 * 获取维度标记
	 * @return
	 */
	java.lang.String getDimensionTag();
	
	
	/**
	 * 获取维度标记2
	 * @return
	 */
	java.lang.String getDimensionTag2();
	
	
	/**
	 * 获取维度类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIDimensionType}
	 * @return
	 */
	java.lang.String getDimensionType();
	
	
	/**
	 * 获取代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
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
	 * 获取参数配置界面行为标记
	 * @return
	 */
	java.lang.String getParamPSDEUIActionTag();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取文本实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField();


	/**
	 * 获取文本实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust();
	
	
	/**
	 * 获取文本绘制模板
	 * @return
	 */
	java.lang.String getTextTemplate();
	
	
	/**
	 * 获取提示绘制模板
	 * @return
	 */
	java.lang.String getTipTemplate();
	
	
	/**
	 * 获取是否全部维度体系
	 * @return
	 */
	boolean isAllHierarchy();
	
	
	/**
	 * 获取是否默认维度
	 * @return
	 */
	boolean isDefault();
}