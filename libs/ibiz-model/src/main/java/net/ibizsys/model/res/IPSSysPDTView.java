package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysPDTView extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CAPPSLANRESID}
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
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取移动端视图代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MOBVIEWCODENAME}
	 * @return
	 */
	java.lang.String getMobViewCodeName();
	
	
	/**
	 * 获取移动端视图相关实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MOBVIEWPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMobViewPSDataEntity();


	/**
	 * 获取移动端视图相关实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMobViewPSDataEntityMust();
	
	
	/**
	 * 获取系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取视图代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWCODENAME}
	 * @return
	 */
	java.lang.String getViewCodeName();
	
	
	/**
	 * 获取视图相关实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntity();


	/**
	 * 获取视图相关实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntityMust();
	
	
	/**
	 * 获取是否从实体视图定向预置视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_FROMDEVIEWFLAG}
	 * @return
	 */
	boolean isFromDEViewToPDTView();
}