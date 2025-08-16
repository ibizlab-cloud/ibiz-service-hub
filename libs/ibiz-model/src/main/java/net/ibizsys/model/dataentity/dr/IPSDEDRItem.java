package net.ibizsys.model.dataentity.dr;



/**
 * 实体关系数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getItemType}
 *
 */
public interface IPSDEDRItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
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
	 * 获取计数项标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_COUNTERID}
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_COUNTERMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取启用模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_ENABLEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDRDetailEnableMode}
	 * @return
	 */
	java.lang.String getEnableMode();
	
	
	/**
	 * 获取头部前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPlugin();


	/**
	 * 获取头部前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPluginMust();
	
	
	/**
	 * 获取关系项类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_DRITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDRItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取项图标资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取视图父数据对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO();
	
	
	/**
	 * 获取启用判断处理逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_TESTPSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogic();


	/**
	 * 获取启用判断处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogicMust();
	
	
	/**
	 * 获取判断输出实体操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_PSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();


	/**
	 * 获取判断输出实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	
	/**
	 * 获取启用统一资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_PSSYSUNIRESID}
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniRes();


	/**
	 * 获取启用统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniResMust();
	
	
	/**
	 * 获取启用判断脚本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_TESTCUSTOMCODE}
	 * @return
	 */
	java.lang.String getTestScriptCode();
	
	
	/**
	 * 获取视图代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_VIEWCODENAME}
	 * @return
	 */
	java.lang.String getViewCodeName();
	
	
	/**
	 * 获取视图相关实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_VIEWPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntity();


	/**
	 * 获取视图相关实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntityMust();
	
	
	/**
	 * 获取视图参数对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getViewParamJO();
}