package net.ibizsys.model.wf;



/**
 * 工作流实体配置模型对象接口
 *
 */
public interface IPSWFDE extends net.ibizsys.model.dataentity.wf.IPSDEWF{

	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}