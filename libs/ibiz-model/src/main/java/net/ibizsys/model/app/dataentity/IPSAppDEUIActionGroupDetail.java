package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面行为组成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO}运行时对象
 *
 */
public interface IPSAppDEUIActionGroupDetail extends net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroupDetail{

	
	
	/**
	 * 获取后置内容界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_AFTERPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getAfterPSSysCss();


	/**
	 * 获取后置内容界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getAfterPSSysCssMust();
	
	
	/**
	 * 获取前置内容界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_BEFOREPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getBeforePSSysCss();


	/**
	 * 获取前置内容界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getBeforePSSysCssMust();
	
	
	/**
	 * 获取界面行为界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面行为界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取界面行为图标资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDetailDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取界面行为图标资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
}