package net.ibizsys.model.dataentity.dr;



/**
 * 实体关系数据分组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO}运行时对象
 *
 */
public interface IPSDEDRGroup extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取标题语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_PSDEDRGROUPNAME}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * 获取分组图标资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取分组图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取是否隐藏分组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_HIDDENFLAG}
	 * @return
	 */
	boolean isHidden();
}