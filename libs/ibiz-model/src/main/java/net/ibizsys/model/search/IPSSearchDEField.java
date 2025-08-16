package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchDEField extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.search.IPSSearchDEObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFAULTVALUE}
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFAULTVALUETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType}
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取属性标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDTAG}
	 * @return
	 */
	java.lang.String getFieldTag();
	
	
	/**
	 * 获取属性标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FIELDTAG2}
	 * @return
	 */
	java.lang.String getFieldTag2();
	
	
	/**
	 * 获取更多属性集合
	 * @return
	 */
	java.lang.String[] getFields();
	
	
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
	 * 获取系统值转换器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
}