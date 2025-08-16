package net.ibizsys.model.wf;



/**
 * 工作流调用实体行为处理模型对象接口
 * <P>
 * 扩展父接口类型[PROCESS]
 * <P>
 * 用于调用外部服务
 *
 */
public interface IPSWFDEActionProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}