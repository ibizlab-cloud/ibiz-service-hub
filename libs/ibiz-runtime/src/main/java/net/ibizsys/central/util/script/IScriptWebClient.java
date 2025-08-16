package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * 脚本调用的Web客户端对象接口
 * @author lionlau
 *
 */
public interface IScriptWebClient extends IScriptUtil{

	/**
	 * 扩展方式：下载文件
	 */
	final static String METHOD_DOWNLOAD = "DOWNLOAD";
	
	
	/**
	 * 扩展方式：上传文件
	 */
	final static String METHOD_UPLOAD = "UPLOAD";
	
	
	/**
	 * 获取基本服务路径
	 * @return
	 */
	String getServiceUrl();
	
	
	/**
	 * 执行 get 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity get(Object param);
	
	
	/**
	 * 执行 head 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity head(Object param);

	/**
	 * 执行 post 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity post(Object param);
	
	/**
	 * 执行 put 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity put(Object param);
	
	/**
	 * 执行 patch 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity patch(Object param);
	
	
	/**
	 * 执行 delete 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity delete(Object param);


	/**
	 * 执行 options 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity options(Object param);
	
	
	
	/**
	 * 执行 trace 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity trace(Object param);
	
	
	
	/**
	 * 执行 upload 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity upload(Object param);
	
	
	
	/**
	 * 执行 download 请求操作
	 * @param param
	 * @return
	 */
	IScriptEntity download(Object param);
	
	
	
	/**
	 * 执行指定方式 请求操作
	 * @param strMethod
	 * @param param
	 * @return
	 */
	IScriptEntity execute(String strMethod, Object param);
}
