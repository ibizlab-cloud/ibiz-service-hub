package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBICubeMeasure extends net.ibizsys.model.bi.IPSBICubeObject{

	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AGGTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取反查扩展条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DRILLDETAILCUSTOMCOND}
	 * @return
	 */
	java.lang.String getDrillDetailCustomCond();
	
	
	/**
	 * 获取Json值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_JSONFORMAT}
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
	/**
	 * 获取指标公式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MEASUREFORMULA}
	 * @return
	 */
	java.lang.String getMeasureFormula();
	
	
	/**
	 * 获取指标组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIMEASUREGROUP}
	 * @return
	 */
	java.lang.String getMeasureGroup();
	
	
	/**
	 * 获取指标标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BICUBEMEASURETAG}
	 * @return
	 */
	java.lang.String getMeasureTag();
	
	
	/**
	 * 获取指标标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BICUBEMEASURETAG2}
	 * @return
	 */
	java.lang.String getMeasureTag2();
	
	
	/**
	 * 获取指标类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIMEASURETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIMeasureType}
	 * @return
	 */
	java.lang.String getMeasureType();
	
	
	/**
	 * 获取阈值代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取阈值代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEFID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取文本绘制模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TEXTTEMPLATE}
	 * @return
	 */
	java.lang.String getTextTemplate();
	
	
	/**
	 * 获取提示绘制模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TIPTEMPLATE}
	 * @return
	 */
	java.lang.String getTipTemplate();
	
	
	/**
	 * 获取值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取是否数据项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_HIDDENDATAITEM}
	 * @return
	 */
	boolean isDataItem();
}