package net.ibizsys.runtime.msg;

import java.util.Map;

import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统消息目标运行时
 * @author lionlau
 *
 */
public interface ISysMsgTargetRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化消息目标运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysMsgTarget
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgTarget iPSSysMsgTarget) throws Exception;

	

	/**
	 * 获取消息目标
	 * @param iEntityBase
	 * @return
	 */
	Map<String,String> get(IEntityBase iEntityBase);
	
}
