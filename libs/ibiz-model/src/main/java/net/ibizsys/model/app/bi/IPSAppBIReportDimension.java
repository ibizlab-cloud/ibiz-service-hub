package net.ibizsys.model.app.bi;



/**
 * 应用智能报表维度模型对象接口
 *
 */
public interface IPSAppBIReportDimension extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取维度公式
	 * @return
	 */
	java.lang.String getDimensionFormula();
	
	
	/**
	 * 获取维度名称
	 * @return
	 */
	java.lang.String getDimensionName();
	
	
	/**
	 * 获取维度项动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getDimensionParams();
	
	
	/**
	 * 获取维度标记
	 * @return
	 */
	java.lang.String getDimensionTag();
	
	
	/**
	 * 获取维度类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIDimensionType}
	 * @return
	 */
	java.lang.String getDimensionType();
	
	
	/**
	 * 获取报表项标记
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取报表项标记2
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取应用智能立方体维度
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimension();


	/**
	 * 获取应用智能立方体维度，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimensionMust();
	
	
	/**
	 * 获取应用代码表对象
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
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取相关应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取放置类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlaceType}
	 * @return
	 */
	java.lang.String getPlaceType();
	
	
	/**
	 * 获取放置位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlacement}
	 * @return
	 */
	java.lang.String getPlacement();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取文本应用属性
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
	 * @return
	 */
	java.lang.String getTextTemplate();
	
	
	/**
	 * 获取提示绘制模板
	 * @return
	 */
	java.lang.String getTipTemplate();
}