package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态关系模型对象接口
 *
 */
public interface IPSDEMainStateRS extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取进入主状态
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getNextPSDEMainState();


	/**
	 * 获取进入主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getNextPSDEMainStateMust();
	
	
	/**
	 * 获取前序主状态
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainState();


	/**
	 * 获取前序主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainStateMust();
}