package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO}运行时对象
 *
 */
public interface IPSDELogicParam extends net.ibizsys.model.dataentity.logic.IPSDELogicParamBase{

	
	
	/**
	 * 获取默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_DEFAULTVALUE}
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值类型
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取文件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_FILETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicParamFileType}
	 * @return
	 */
	java.lang.String getFileType();
	
	
	/**
	 * 获取文件路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_FILEURL}
	 * @return
	 */
	java.lang.String getFileUrl();
	
	
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
	 * 获取值转换器对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取值转换器对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取参数实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getParamPSDataEntity();


	/**
	 * 获取参数实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getParamPSDataEntityMust();
	
	
	/**
	 * 获取参数标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMTAG}
	 * @return
	 */
	java.lang.String getParamTag();
	
	
	/**
	 * 获取参数标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMTAG2}
	 * @return
	 */
	java.lang.String getParamTag2();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParams();
	
	
	/**
	 * 获取简单数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否应用上下文变量
	 * @return
	 */
	boolean isAppContextParam();
	
	
	/**
	 * 获取是否应用全局变量
	 * @return
	 */
	boolean isAppGlobalParam();
	
	
	/**
	 * 获取是否克隆传入参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_CLONEPARAMFLAG}
	 * @return
	 */
	boolean isCloneParam();
	
	
	/**
	 * 获取是否数据对象列表变量
	 * @return
	 */
	boolean isEntityListParam();
	
	
	/**
	 * 获取是否数据对象字典变量
	 * @return
	 */
	boolean isEntityMapParam();
	
	
	/**
	 * 获取是否分页查询结果变量
	 * @return
	 */
	boolean isEntityPageParam();
	
	
	/**
	 * 获取是否数据对象变量
	 * @return
	 */
	boolean isEntityParam();
	
	
	/**
	 * 获取是否系统环境变量
	 * @return
	 */
	boolean isEnvParam();
	
	
	/**
	 * 获取是否文件对象列表变量
	 * @return
	 */
	boolean isFileListParam();
	
	
	/**
	 * 获取是否文件对象变量
	 * @return
	 */
	boolean isFileParam();
	
	
	/**
	 * 获取是否过滤器对象变量
	 * @return
	 */
	boolean isFilterParam();
	
	
	/**
	 * 获取是否最后数据变量
	 * @return
	 */
	boolean isLastParam();
	
	
	/**
	 * 获取是否上一次调用返回变量
	 * @return
	 */
	boolean isLastReturnParam();
	
	
	/**
	 * 获取是否原始数据对象
	 * @return
	 */
	boolean isOriginEntity();
	
	
	/**
	 * 获取是否操作会话变量
	 * @return
	 */
	boolean isSessionParam();
	
	
	/**
	 * 获取是否简单数据列表变量
	 * @return
	 */
	boolean isSimpleListParam();
	
	
	/**
	 * 获取是否简单数据变量
	 * @return
	 */
	boolean isSimpleParam();
	
	
	/**
	 * 获取是否Web上下文变量
	 * @return
	 */
	boolean isWebContextParam();
	
	
	/**
	 * 获取是否Web反馈变量
	 * @return
	 */
	boolean isWebResponseParam();
}