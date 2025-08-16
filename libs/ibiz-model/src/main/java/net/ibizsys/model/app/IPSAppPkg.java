package net.ibizsys.model.app;



/**
 * 应用附加组件包模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppPkgDTO}运行时对象
 *
 */
public interface IPSAppPkg extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取版本参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPkgDTO#FIELD_PKGPARAM}
	 * @return
	 */
	java.lang.String getVerParam();
	
	
	/**
	 * 获取版本参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPkgDTO#FIELD_PKGPARAM2}
	 * @return
	 */
	java.lang.String getVerParam2();
	
	
	/**
	 * 获取版本参数3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPkgDTO#FIELD_PKGPARAM3}
	 * @return
	 */
	java.lang.String getVerParam3();
	
	
	/**
	 * 获取版本参数4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPkgDTO#FIELD_PKGPARAM4}
	 * @return
	 */
	java.lang.String getVerParam4();
	
	
	/**
	 * 获取版本标记
	 * @return
	 */
	java.lang.String getVerTag();
	
	
	/**
	 * 获取版本标记2
	 * @return
	 */
	java.lang.String getVerTag2();
}