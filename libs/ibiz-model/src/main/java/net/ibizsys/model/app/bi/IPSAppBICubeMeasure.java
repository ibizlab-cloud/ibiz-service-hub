package net.ibizsys.model.app.bi;



/**
 * 应用智能立方体指标模型对象接口
 *
 */
public interface IPSAppBICubeMeasure extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取反查数据展示视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DRILLDETAILPSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppView();


	/**
	 * 获取反查数据展示视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppViewMust();
	
	
	/**
	 * 获取钻取数据展示视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DRILLDOWNPSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppView();


	/**
	 * 获取钻取数据展示视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppViewMust();
	
	
	/**
	 * 获取Json值格式化
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
	/**
	 * 获取指标公式
	 * @return
	 */
	java.lang.String getMeasureFormula();
	
	
	/**
	 * 获取指标组
	 * @return
	 */
	java.lang.String getMeasureGroup();
	
	
	/**
	 * 获取指标标记
	 * @return
	 */
	java.lang.String getMeasureTag();
	
	
	/**
	 * 获取指标标记2
	 * @return
	 */
	java.lang.String getMeasureTag2();
	
	
	/**
	 * 获取指标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIMeasureType}
	 * @return
	 */
	java.lang.String getMeasureType();
	
	
	/**
	 * 获取阈值应用代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取阈值应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取相关应用属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取相关应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取参数配置界面行为对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAMPSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIAction();


	/**
	 * 获取参数配置界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIActionMust();
	
	
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
	 * 获取是否数据项
	 * @return
	 */
	boolean isDataItem();
}