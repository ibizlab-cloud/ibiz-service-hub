package net.ibizsys.model.wf;



/**
 * 工作流实体数据集角色模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO}运行时对象
 *
 */
public interface IPSWFDEDataSetRole extends net.ibizsys.model.wf.IPSWFRole{

	
	
	/**
	 * 获取数据源数据集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据源数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取数据源实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取数据源实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取流程用户标识存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_WFUSERIDPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFUserIdPSDEF();


	/**
	 * 获取流程用户标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFUserIdPSDEFMust();
	
	
	/**
	 * 获取流程用户名称存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_WFUSERNAMEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFUserNamePSDEF();


	/**
	 * 获取流程用户名称存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWFUserNamePSDEFMust();
}