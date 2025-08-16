package net.ibizsys.runtime.msg;

import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统消息模板运行时
 * @author lionlau
 *
 */
public interface ISysMsgTemplRuntime extends ISystemModelRuntime {

	
	/**
	 * 模板参数：当前数据
	 */
	public final static String TEMPLPARAM_DATA = "data";
	
	/**
	 * 模板参数：当前数据
	 */
	public final static String TEMPLPARAM_ENTITY = "entity";
	
	/**
	 * 模板参数：系统
	 */
	public final static String TEMPLPARAM_SYS = "sys";
	
	/**
	 * 初始化消息模板运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysMsgTempl
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgTempl iPSSysMsgTempl) throws Exception;

	
	/**
	 * 获取消息模板
	 * @return
	 */
	IPSSysMsgTempl getPSSysMsgTempl();
	
	/**
	 * 获取内容类型
	 * @return
	 */
	String getContentType();
	
	
	
	/**
	 * 获取内容
	 * @param iEntityBase
	 * @return
	 */
	String getContent(IEntityBase iEntityBase);
	
	
	
	/**
	 * 获取标题内容
	 * @param iEntityBase
	 * @return
	 */
	String getSubject(IEntityBase iEntityBase);
	
	
	
	/**
	 * 获取短消息内容
	 * @param iEntityBase
	 * @return
	 */
	String getSMSContent(IEntityBase iEntityBase);
	
	
	/**
	 * 获取微信消息内容
	 * @param iEntityBase
	 * @return
	 */
	String getWXContent(IEntityBase iEntityBase);
	
	
	
	/**
	 * 获取钉钉消息内容
	 * @param iEntityBase
	 * @return
	 */
	String getDDContent(IEntityBase iEntityBase);
	
	
	
	/**
	 * 获取即时消息内容
	 * @param iEntityBase
	 * @return
	 */
	String getIMContent(IEntityBase iEntityBase);
	
	
	/**
	 * 获取Url链接
	 * @param iEntityBase
	 * @return
	 */
	String getUrl(IEntityBase iEntityBase);
	
	
	
	/**
	 * 获取移动端Url链接
	 * @param iEntityBase
	 * @return
	 */
	String getMobileUrl(IEntityBase iEntityBase);
	
	
	
	
	/**
	 * 重置消息模板
	 */
	void reset();
	
}
