package net.ibizsys.model.system;



/**
 * 系统模型组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO}运行时对象
 *
 */
public interface IPSSysModelGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取分组标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_GROUPTAG}
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_GROUPTAG2}
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取分组标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_GROUPTAG3}
	 * @return
	 */
	java.lang.String getGroupTag3();
	
	
	/**
	 * 获取分组标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_GROUPTAG4}
	 * @return
	 */
	java.lang.String getGroupTag4();
	
	
	/**
	 * 获取包代码名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_PKGCODENAME}
	 * @return
	 */
	java.lang.String getPKGCodeName();
	
	
	/**
	 * 获取运行时类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO#FIELD_RUNTIMETYPE}
	 * @return
	 */
	java.lang.String getRuntimeType();
}