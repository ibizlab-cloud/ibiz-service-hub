package net.ibizsys.model.dataentity.action;



/**
 * 实体远程调用行为模型对象接口
 * <P>
 * 扩展父接口类型[REMOTE]
 *
 */
public interface IPSDERemoteAction extends net.ibizsys.model.dataentity.action.IPSDEAction{

	
	
	/**
	 * 获取外部服务接口方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionDTO#FIELD_PSSUBSYSSADETAILID}
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取外部服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
}