package net.ibizsys.model.dataentity.priv;



/**
 * 实体数据范围接口
 *
 */
public interface IPSDEDataRange extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自定义数据范围模式，等同调用{@link #getPSSysUserDR}.getCustomMode()
	 * @return
	 */
	java.lang.String getCustomDRMode();
	
	
	/**
	 * 获取自定义数据范围模式2，等同调用{@link #getPSSysUserDR2}.getCustomMode()
	 * @return
	 */
	java.lang.String getCustomDRMode2();
	
	
	/**
	 * 获取自定义数据范围2参数
	 * @return
	 */
	java.lang.String getCustomDRMode2Param();
	
	
	/**
	 * 获取自定义数据范围参数
	 * @return
	 */
	java.lang.String getCustomDRModeParam();
	
	
	/**
	 * 获取机构数据范围
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OrgScope}
	 * @return
	 */
	long getOrgDR();
	
	
	/**
	 * 获取部门业务条件
	 * @return
	 */
	java.lang.String getSecBC();
	
	
	/**
	 * 获取部门数据范围
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DeptScope}
	 * @return
	 */
	long getSecDR();
	
	
	/**
	 * 获取数据访问使用操作标识
	 * @return
	 */
	java.lang.String getUserDRAction();
	
	
	/**
	 * 获取是否支持机构数据范围
	 * @return
	 */
	boolean isEnableOrgDR();
	
	
	/**
	 * 获取是否支持部门业务条线
	 * @return
	 */
	boolean isEnableSecBC();
	
	
	/**
	 * 获取是否支持部门数据范围
	 * @return
	 */
	boolean isEnableSecDR();
	
	
	/**
	 * 获取是否启用用户数据范围
	 * @return
	 */
	boolean isEnableUserDR();
}