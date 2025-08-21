package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性界面配置项模型基础对象接口
 *
 */
public interface IPSDEFUIItem extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject
		,net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取编辑器参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getEditorParams();
	
	
	/**
	 * 获取编辑器样式
	 * @return
	 */
	java.lang.String getEditorStyle();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	java.lang.String getEditorType();
	
	
	/**
	 * 获取最大值（字符串）
	 * @return
	 */
	java.lang.String getMaxValueString();
	
	
	/**
	 * 获取最小字符串长度
	 * @return
	 */
	int getMinStringLength();
	
	
	/**
	 * 获取最小值（字符串）
	 * @return
	 */
	java.lang.String getMinValueString();
	
	
	/**
	 * 获取原始标题
	 * @return
	 */
	java.lang.String getOriginCaption();
	
	
	/**
	 * 获取输出代码表配置模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OutputCodeListMode}
	 * @return
	 */
	int getOutputCodeListConfigMode();
	
	
	/**
	 * 获取输入提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageRes();


	/**
	 * 获取输入提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageResMust();
	
	
	/**
	 * 获取图标图片资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标图片资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取输入提示信息
	 * @return
	 */
	java.lang.String getPlaceHolder();
	
	
	/**
	 * 获取数据精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取引用链接实体视图代码标识
	 * @return
	 */
	java.lang.String getRefLinkPSDEViewCodeName();
	
	
	/**
	 * 获取引用多项选择实体视图代码标识
	 * @return
	 */
	java.lang.String getRefMPickupPSDEViewCodeName();
	
	
	/**
	 * 获取引用实体自填模式
	 * @return
	 */
	net.ibizsys.model.dataentity.ac.IPSDEACMode getRefPSDEACMode();


	/**
	 * 获取引用实体自填模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ac.IPSDEACMode getRefPSDEACModeMust();
	
	
	/**
	 * 获取引用实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet();


	/**
	 * 获取引用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust();
	
	
	/**
	 * 获取引用实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity();


	/**
	 * 获取引用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust();
	
	
	/**
	 * 获取引用单项选择实体视图代码标识
	 * @return
	 */
	java.lang.String getRefPickupPSDEViewCodeName();
	
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	int getStringLength();
	
	
	/**
	 * 获取应用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFUIMode}
	 * @return
	 */
	java.lang.String getUIMode();
	
	
	/**
	 * 获取值格式化
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取是否允许空值输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否移动端模式
	 * @return
	 */
	boolean isMobileMode();
	
	
	/**
	 * 获取是否需要代码表配置
	 * @return
	 */
	boolean isNeedCodeListConfig();
}