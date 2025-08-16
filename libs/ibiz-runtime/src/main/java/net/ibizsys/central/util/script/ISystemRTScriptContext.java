package net.ibizsys.central.util.script;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.util.script.IScriptEntity;

public interface ISystemRTScriptContext extends net.ibizsys.runtime.util.script.ISystemRTScriptContext {

	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	/**
	 * 获取数据对象的脚本调用对象
	 * @param obj 
		 * @return
	 */
	IScriptEntity entity(Object obj);
	
	
	/**
	 * 获取数据对象的脚本调用对象
	 * @param obj 
	 * @param data 序列化数据
	 * @return
	 */
	IScriptEntity entity(Object obj, Object data);
	
	
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @return
	 */
	IScriptList list();
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @param obj 
	 * @return
	 */
	IScriptList list(Object obj);
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @param obj 
	 * @param data 序列化数据
	 * @return
	 */
	IScriptList list(Object obj, Object data);
	
	
	/**
	 * 获取通用分页结果的脚本调用对象
	 * @return
	 */
	IScriptPage page();
	
	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj 
	 * @return
	 */
	IScriptPage page(Object obj);
	

	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj 
	 * @param data 序列化数据
	 * @return
	 */
	IScriptPage page(Object obj, Object data);

	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj
	 * @param data 序列化数据
	 * @param pageNo 页码
	 * @param size 每页行数
	 * @return
	 */
	IScriptPage page(Object obj, Object data, int pageNo, int size);
	
	/**
	 * 获取指定值序列脚本调用对象
	 * @param strTag
	 * @return
	 */
	IScriptSequence sequence(String strTag);

	
	
	/**
	 * 获取指定值转换器脚本调用对象
	 * @param strTag
	 * @return
	 */
	IScriptTranslator translator(String strTag);
	
	
	
	/**
	 * 获取系统默认的Web客户端
	 * @return
	 */
	IScriptWebClient webclient();
	
	
	/**
	 * 获取指定外部接口客户端
	 * @param strTag
	 * @return
	 */
	IScriptWebClient webclient(String strTag);
	
	
	/**
	 * 获取系统配置
	 * @param strKey
	 * @param defValue
	 * @return
	 */
	Object config(String strKey, Object defValue);
	
	
	/**
	 * 查询指定实体第一个符合要求的数据（等同 selectone ）
	 * 
	 * @param strName 实体名称
	 * @param strCondition 条件表达式
	 * @return 返回符合条件的实体脚本对象，无数据时返回null
	 * @exception 实体不存在时将抛出系统运行时异常
	 */
	IScriptEntity selectone(String strName, String strCondition);
	
	
	/**
	 * 输出系统运行一般信息
	 * 
	 * @param strInfo 一般信息
	 */
	void info(String strInfo, Object... infos);
	
	
	
	/**
	 * 输出系统运行警告信息
	 * 
	 * @param strInfo 警告信息
	 */
	void warn(String strInfo, Object... infos);
	
	
	
	/**
	 * 输出系统运行错误信息
	 * 
	 * @param strInfo 错误信息
	 */
	void error(String strInfo, Object... infos);
}
