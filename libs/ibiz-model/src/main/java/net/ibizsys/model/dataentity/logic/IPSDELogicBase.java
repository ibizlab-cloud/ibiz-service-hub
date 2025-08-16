package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑模型基础对象接口
 *
 */
public interface IPSDELogicBase extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认参数名称
	 * @return
	 */
	java.lang.String getDefaultParamName();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDELOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
}