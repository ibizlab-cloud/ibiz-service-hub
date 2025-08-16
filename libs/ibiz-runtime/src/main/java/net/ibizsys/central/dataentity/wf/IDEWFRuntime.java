package net.ibizsys.central.dataentity.wf;

import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.IDynaInstRuntime;

/**
 * 实体工作流运行时对象接口
 * @author lionlau
 *
 */
public interface IDEWFRuntime extends IDataEntityModelRuntime{

	/**
	 * 工作流权限（拒绝访问）
	 */
	public static final int ACCESSMODE_DENY = 0;
	/**
	 * 工作流权限（只读）
	 */
	public static final int ACCESSMODE_READ = 1;

	/**
	 * 工作流权限（读写）
	 */
	public static final int ACCESSMODE_UPDATE = 3;


	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEWF
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEWF iPSDEWF) throws Exception;



	/**
	 * 获取实体工作流
	 * @return
	 */
	IPSDEWF getPSDEWF();

	/**
	 * 初始化流程数据
	 * @param arg0
	 * @param iPSDEAction
	 * @param actionData
	 * @throws Throwable
	 */
	void init(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable;



	/**
	 * 启动流程
	 * @param arg0
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	void start(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	
	/**
	 * 提交流程操作
	 * @param arg0
	 * @param wfAction
	 * @param params
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	Object submit(Object arg0, String wfAction, Map<String, Object> params, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;
	
	
	/**
	 * 取消流程
	 * @param arg0
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	void cancel(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	/**
	 * 流程发生错误时触发
	 * @param arg0
	 * @param iPSDEAction
	 * @param actionData
	 * @throws Throwable
	 */
	void error(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable;





	/**
	 * 更新
	 * @param arg0
	 * @param iPSDEAction
	 * @param actionData
	 * @throws Throwable
	 */
	void update(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable;



	/**
	 * 流程发生错误回滚时触发
	 * @param arg0
	 * @param iPSDEAction
	 * @param actionData
	 * @throws Throwable
	 */
	void rollback(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable;


	/**
	 * 流程注册
	 * @param arg0
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	void register(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	/**
	 * 流程注销
	 * @param arg0
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	void unregister(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	/**
	 * 填充流程标识
	 * @param arg0
	 * @param iPSDEAction
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	void fillWFTag(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	/**
	 * 获取传入数据访问模式
	 * @param arg0
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	int getAccessMode(Object arg0, Object actionData) throws Throwable;


	/**
	 * 流程结束时触发
	 * @param arg0
	 * @param iPSDEAction
	 * @param actionData
	 * @throws Throwable
	 */
	void finish(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable;


}
