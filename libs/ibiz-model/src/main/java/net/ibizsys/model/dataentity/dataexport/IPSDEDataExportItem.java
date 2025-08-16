package net.ibizsys.model.dataentity.dataexport;



/**
 * 实体数据导出数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO}运行时对象
 *
 */
public interface IPSDEDataExportItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取水平对齐
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_ALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
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
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.Object getDefaultValue();
	
	
	/**
	 * 获取格式化
	 * @return
	 */
	java.lang.String getFormat();
	
	
	/**
	 * 获取应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取数据导出分组
	 * @return
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getPSDEDataExportGroup();


	/**
	 * 获取数据导出分组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getPSDEDataExportGroupMust();
	
	
	/**
	 * 获取实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO#FIELD_PSDEFID}
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
	 * 获取权限标识
	 * @return
	 */
	java.lang.String getPrivilegeId();
	
	
	/**
	 * 获取是否隐藏项
	 * @return
	 */
	boolean isHidden();
}