package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIReport extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取前端扩展插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSPFPLUGINID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
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
	 * 获取权限统一资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSUNIRESID}
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取权限统一资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取报表模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTMODEL}
	 * @return
	 */
	java.lang.String getReportModel();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getReportParams();
	
	
	/**
	 * 获取报表标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTTAG}
	 * @return
	 */
	java.lang.String getReportTag();
	
	
	/**
	 * 获取报表标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTTAG2}
	 * @return
	 */
	java.lang.String getReportTag2();
	
	
	/**
	 * 获取报表界面模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTUIMODEL}
	 * @return
	 */
	java.lang.String getReportUIModel();
	
	
	/**
	 * 获取系统统一资源代码，等同调用{@link #getPSSysUniRes}.getResCode()
	 * @return
	 */
	java.lang.String getSysUniResCode();
}