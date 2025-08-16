package net.ibizsys.model.wf;



/**
 * 工作流实体配置模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFDEDTO}运行时对象
 *
 */
public interface IPSWFDE extends net.ibizsys.model.dataentity.wf.IPSDEWF{

	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFDEDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
}