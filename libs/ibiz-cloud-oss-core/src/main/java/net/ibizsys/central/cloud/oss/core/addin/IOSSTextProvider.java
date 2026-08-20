package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;
import java.util.Map;

public interface IOSSTextProvider extends ICloudOSSUtilRTAddin{

	/**
	 * 文本类型：md
	 */
	public final static String TYPE_MD  = "md";
	
	/**
	 * 文本类型：html
	 */
	public final static String TYPE_HTML  = "html";
	
	/**
	 * 文本类型：plain
	 */
	public final static String TYPE_PLAIN  = "plain";
	
	/**
	 * 文本类型：pageindex 页面索引
	 */
	public final static String TYPE_PAGEINDEX  = "pageindex";
	
	/**
	 * 文本类型：JSON数据文件
	 */
	public final static String TYPE_JSON  = "json";
	
	
	public final static String TYPE_BASE64_PREFIX = "base64_";
	
	/**
	 * 参数：文本类型
	 */
	public final static String PARAM_TYPE = "type";
	
	/**
	 * 参数：重新构建
	 */
	public final static String PARAM_REBUILD = "rebuild";
	
	
	/**
	 * 参数：提示词
	 */
	public final static String PARAM_PROMPT = "prompt";
	
	/**
	 * 参数：完整
	 */
	public final static String PARAM_FULL = "full";
	
	
	/**
	 * 参数：AI摘要模式
	 */
	public final static String PARAM_AIDIGEST = "aidigest";
	
	
	/**
	 * 参数：指定处理引擎
	 */
	public final static String PARAM_ENGINE = "engine";
	
	
	/**
	 * 参数：提示词标识
	 */
	public final static String PARAM_PROMPTID = "promptid";
	
	/**
	 * 获取传入文件的文本
	 * @param file
	 * @param type 类型
	 */
	default String getText(String cat, String fileId, File file, Map<String, Object> params) throws Throwable{
		return getText(cat, fileId, file, TYPE_MD, params);
	}
	
	/**
	 * 获取传入文件的文本
	 * @param file
	 * @param type 类型
	 */
	String getText(String cat, String fileId, File file, String type, Map<String, Object> params) throws Throwable;
}
