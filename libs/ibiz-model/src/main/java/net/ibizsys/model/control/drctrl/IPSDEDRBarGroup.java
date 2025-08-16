package net.ibizsys.model.control.drctrl;



/**
 * 实体数据关系边栏部件分组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO}运行时对象
 *
 */
public interface IPSDEDRBarGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取标题语言系统对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_cappslanresid}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言系统对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_psdedrgroupname}
	 * @return
	 */
	java.lang.String getCaption();
	
	
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
	 * 获取分组图片资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_pssysimageid}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取分组图片资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取是否隐藏分组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRGroupDTO#FIELD_hiddenflag}
	 * @return
	 */
	boolean isHidden();
}