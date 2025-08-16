package net.ibizsys.model.security;



/**
 * 系统用户模式模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysUserModeDTO}运行时对象
 *
 */
public interface IPSSysUserMode extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUserModeDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取用户模式编号
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUserModeDTO#FIELD_USERMODESN}
	 * @return
	 */
	java.lang.String getUserModeSN();
	
	
	/**
	 * 获取用户模式标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUserModeDTO#FIELD_PSSYSUSERMODENAME}
	 * @return
	 */
	java.lang.String getUserModeTag();
}