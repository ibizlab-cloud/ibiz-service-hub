package net.ibizsys.model.dataentity.dataimport;



/**
 * 实体数据导入数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO}运行时对象
 *
 */
public interface IPSDEDataImportItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取建立默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_CREATEDV}
	 * @return
	 */
	java.lang.String getCreateDV();
	
	
	/**
	 * 获取建立默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_CREATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getCreateDVT();
	
	
	/**
	 * 获取代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_PSCODELISTID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取值转换器
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取更新默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_UPDATEDV}
	 * @return
	 */
	java.lang.String getUpdateDV();
	
	
	/**
	 * 获取更新默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_UPDATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getUpdateDVT();
	
	
	/**
	 * 获取是否隐藏数据项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_HIDDENDATAITEM}
	 * @return
	 */
	boolean isHiddenDataItem();
	
	
	/**
	 * 获取是否数据识别项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_KEYFLAG}
	 * @return
	 */
	boolean isUniqueItem();
}