package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑参数模型基础对象接口
 *
 */
public interface IPSDELogicParamBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取是否默认参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFAULTPARAM}
	 * @return
	 */
	boolean isDefault();
}