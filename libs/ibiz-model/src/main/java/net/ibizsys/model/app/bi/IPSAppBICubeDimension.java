package net.ibizsys.model.app.bi;



/**
 * 应用智能立方体维度模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO}运行时对象
 *
 */
public interface IPSAppBICubeDimension extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取维度公式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_DIMENSIONFORMULA}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_BIDIMENSIONTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIDimensionType}
	 * @return
	 */
	java.lang.String getDimensionType();
	
	
	/**
	 * 获取智能立方体维度体系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> getPSAppBICubeHierarchies();
	
	/**
	 * 获取智能立方体维度体系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeHierarchy getPSAppBICubeHierarchy(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体维度体系集合
	 * @param list 智能立方体维度体系集合
	 */
	void setPSAppBICubeHierarchies(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> list);
	
	
	/**
	 * 获取应用代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取相关应用属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_PSDEFID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_PARAMPSDEUIACTIONID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取文本应用属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_TEXTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取文本应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取文本绘制模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_TEXTTEMPLATE}
	 * @return
	 */
	java.lang.String getTextTemplate();
	
	
	/**
	 * 获取提示绘制模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO#FIELD_TIPTEMPLATE}
	 * @return
	 */
	java.lang.String getTipTemplate();
}