package net.ibizsys.model.system;



/**
 * 子系统引用模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysRefDTO}运行时对象
 *
 */
public interface IPSSysRef extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取引用参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_REFPARAM}
	 * @return
	 */
	java.lang.String getRefParam();
	
	
	/**
	 * 获取引用参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_REFPARAM2}
	 * @return
	 */
	java.lang.String getRefParam2();
	
	
	/**
	 * 获取引用参数3
	 * @return
	 */
	java.lang.String getRefParam3();
	
	
	/**
	 * 获取引用参数4
	 * @return
	 */
	java.lang.String getRefParam4();
	
	
	/**
	 * 获取引用参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getRefParams();
	
	
	/**
	 * 获取引用服务标识
	 * @return
	 */
	java.lang.String getRefServiceId();
	
	
	/**
	 * 获取系统代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SYSCODENAME}
	 * @return
	 */
	java.lang.String getSysCodeName();
	
	
	/**
	 * 获取系统名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SYSNAME}
	 * @return
	 */
	java.lang.String getSysName();
	
	
	/**
	 * 获取系统包名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SYSPKGNAME}
	 * @return
	 */
	java.lang.String getSysPkgName();
	
	
	/**
	 * 获取引用系统标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_REALSYSID}
	 * @return
	 */
	java.lang.String getSysRefTag();
	
	
	/**
	 * 获取引用系统类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SYSREFTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysRefType}
	 * @return
	 */
	java.lang.String getSysRefType();
	
	
	/**
	 * 获取系统服务发布名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SRVCODENAME}
	 * @return
	 */
	java.lang.String getSysSrvCodeName();
	
	
	/**
	 * 获取系统版本名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysRefDTO#FIELD_SYSVCNAME}
	 * @return
	 */
	java.lang.String getSysVCName();
}