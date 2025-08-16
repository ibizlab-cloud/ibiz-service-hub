package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性搜索模式模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO}运行时对象
 *
 */
public interface IPSDEFSearchMode extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject
		,net.ibizsys.model.IPSModelObject{

	
	String getLowerCaseName();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取目标实体属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDstPSDEFSearchMode();


	/**
	 * 获取目标实体属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDstPSDEFSearchModeMust();
	
	
	/**
	 * 获取目标实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEField();


	/**
	 * 获取目标实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDstPSDEFieldMust();
	
	
	/**
	 * 获取目标实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
	
	
	/**
	 * 获取项标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_ITEMTAG}
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取项标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_ITEMTAG2}
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取搜索模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_SEARCHMODE}
	 * @return
	 */
	java.lang.String getMode();
	
	
	/**
	 * 获取相关实体关系对象
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取相关实体关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统值转换器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_PSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取标准数据类型，根据条件操作输出，如定义值函数则使用值函数的返回值类型，默认使用属性的标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取值处理
	 * @return
	 */
	java.lang.String getValueFunc();
	
	
	/**
	 * 获取值操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_PSDBVALUEOPID}
	 * @return
	 */
	java.lang.String getValueOP();
	
	
	/**
	 * 获取值分隔符
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_VALUESEPERATOR}
	 * @return
	 */
	java.lang.String getValueSeparator();
	
	
	/**
	 * 获取是否属性为数组
	 * @return
	 */
	boolean isArray();
	
	
	/**
	 * 获取是否默认搜索项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFSFItemDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefault();
}