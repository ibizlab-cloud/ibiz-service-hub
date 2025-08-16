package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.ISystemRuntime;

/**
 * 系统运行时脚本上下文接口
 * @author lionlau
 *
 */
public interface ISystemRTScriptContext extends IScriptUtil{

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 通用数据对象
	 * @return
	 */
	IScriptEntity entity();
	
	
	/**
	 * 获取指定实体的脚本对象
	 * 
	 * @param strName 实体名称
	 * @return 返回新建的实体脚本对象
	 * 
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptEntity entity(String strName);
	
	
	
	/**
	 * 查询指定实体的符合条件数据
	 * 
	 * @param strName 实体名称
	 * @param strCondition 条件表达式
	 * @return 返回符合条件的实体脚本对象数组，无数据时返回null
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptEntity[] select(String strName, String strCondition);
	
	
	
	/**
	 * 查询指定实体第一个符合要求的数据
	 * 
	 * @param strName 实体名称
	 * @param strCondition 条件表达式
	 * @return 返回符合条件的实体脚本对象，无数据时返回null
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptEntity selectOne(String strName, String strCondition);
	
	
	/**
	 * 查询指定实体第一个符合要求的数据
	 * 
	 * @param strName 实体名称
	 * @param strCondition 条件表达式
	 * @return 返回符合条件的实体脚本对象，无数据时返回null
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptEntity selectone(String strName, String strCondition);
	
	/**
	 * 删除指定实体符合条件的数据
	 * 
	 * @param strName 实体名称
	 * @param strCondition 条件表达式
	 * @return 返回删除的数量
	 * @exception 实体不存在时将抛出系统运行时异常，删除数据失败时将抛出实体运行时异常
	 */
	int remove(String strName, String strCondition);
	
	
	
	
	/**
	 * 抛出系统运行时异常，停止处理
	 * 
	 * @param strErrorInfo 异常信息
	 */
	void exception(String strErrorInfo);
	
	
	/**
	 * 抛出系统运行时异常，停止处理
	 * 
	 * @param strErrorInfo 异常信息
	 * @param nErrorCode 错误代码
	 */
	void exception(String strErrorInfo, int nErrorCode);
	
	/**
	 * 输出系统运行一般信息
	 * 
	 * @param strInfo 一般信息
	 */
	void info(String strInfo);
	
	
	
	/**
	 * 输出系统运行警告信息
	 * 
	 * @param strInfo 警告信息
	 */
	void warn(String strInfo);
	
	
	
	/**
	 * 输出系统运行错误信息
	 * 
	 * @param strInfo 错误信息
	 */
	void error(String strInfo);
	
	
	
	/**
	 * 获取脚本辅助对象
	 * @return
	 */
	IScriptUtil getUtil();
	
	
	
	/**
	 * 调用预定义的全局脚本逻辑
	 * @param strName 脚本逻辑标识
	 * @param objects 传入到逻辑的不定长参数列表
	 * @return
	 */
	Object call(String strName, Object ...objects);
	
	
	/**
	 * 设置会话参数，会话是指整个操作序列，会话参数存储跨行为的共享变量
	 * 
	 * @param strName 会话标识，忽略大小写
	 * @param objValue
	 */
	void setSessionParam(String strName, Object objValue);

	/**
	 * 移除会话参数
	 * 
	 * @param strName 会话标识，忽略大小写
	 * @return
	 */
	Object removeSessionParam(String strName);
	
	
	
	/**
	 * 判断是否存在指定会话参数
	 * 
	 * @param strName 会话标识，忽略大小写
	 * @return
	 */
	boolean containsSessionParam(String strName);

	/**
	 * 获取会话参数
	 * 
	 * @param strName 会话标识，忽略大小写
	 * @return
	 */
	Object getSessionParam(String strName) ;
	
	
	/**
	 * 设置行为参数，行为参数仅用于当前行为及相关的附加逻辑共享变量
	 * 
	 * @param strName 会话标识，忽略大小写
	 * @param objValue
	 */
	void setActionParam(String strName, Object objValue);

	/**
	 * 移除行为参数
	 * 
	 * @param strName
	 * @return
	 */
	Object removeActionParam(String strName);
	
	
	
	/**
	 * 判断是否存在指定行为参数
	 * 
	 * @param strName
	 * @return
	 */
	boolean containsActionParam(String strName);

	/**
	 * 获取行为参数
	 * 
	 * @param strName
	 * @return
	 */
	Object getActionParam(String strName) ;
	
	
	
	/**
	 * 获取用户上下文对象
	 * @return
	 */
	//IUserContext getUserContext();
	IScriptUserContext user();
	
	
	/**
	 * 获取应用上下文
	 * @return
	 */
	//IAppContext getAppContext();
	IScriptAppContext context();

	
	/**
	 * 获取代码表脚本对象
	 * @param strTag
	 * @return
	 */
	 IScriptCodeList codelist(String strTag);
	
	 
	/**
	 * 获取指定实体过滤器的脚本对象
	 * 
	 * @param strName 实体名称
	 * @return 返回新建的实体过滤器脚本对象
	 * 
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptSearchContext filter(String strName);
	
	
	
	
	/**
	 * 获取唯一标识
	 * @param args
	 * @return
	 */
	String uniqueid(Object... args);
	
	
	
	
	/**
	 * 格式化输出
	 * @param value
	 * @param strFormat
	 * @return
	 */
	String format(Object value, String strFormat);
	
	
	
	/**
	 * 获取Web上下文
	 * @return
	 */
	IScriptWebContext request();
	
	
	/**
	 * 获取Web上下文
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IScriptWebContext request(boolean bTryMode);
	
//	/**
//	 * 获取指定实体名称的脚本实体对象，并完成数据加载
//	 * @param strName
//	 * @param objKey 
//	 * @return
//	 */
//	IScriptEntity entity(String strName,Object objKey);
}
