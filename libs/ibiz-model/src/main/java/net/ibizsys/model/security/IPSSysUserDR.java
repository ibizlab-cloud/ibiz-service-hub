package net.ibizsys.model.security;



/**
 * 系统用户自定义数据范围模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysUserDRDTO}运行时对象
 *
 */
public interface IPSSysUserDR extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自定义模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUserDRDTO#FIELD_USERDRTAG}
	 * @return
	 */
	java.lang.String getCustomMode();
}