package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Map;

import org.springframework.data.domain.Page;

/**
 * Cloud体系存储服务功能运行时接口
 * @author lionlau
 *
 */
public interface ICloudOSSUtilRuntime extends ICloudUtilRuntime{
	
	/**
	 * OSS预览插件前缀
	 */
	public final static String ADDIN_OSSPREVIEW_PREFIX = "OSSPREVIEW:";
	
	
	/**
	 * OSS文本插件前缀
	 */
	public final static String ADDIN_OSSTEXT_PREFIX = "OSSTEXT:";
	
	
	/**
	 * 对象唯一键标识
	 */
	public final static String OBJECT_UNIQUEKEY = "_id";
	
	
	/**
	 * 请求参数：返回的属性集合
	 */
	public final static String PARAM_FIELDS = "fields";
	
	
	/**
	 * 获取对象
	 * @param strDBName
	 * @param strTableName
	 * @param strKey
	 * @return
	 */
	Map getObject(String strDBName, String strTableName, String strKey);
	
	/**
	 * 建立对象
	 * @param strDBName
	 * @param strTableName
	 * @param data
	 * @return
	 */
	String createObject(String strDBName, String strTableName, Map<String, Object> data);
	
	
	
	
	/**
	 * 更新对象
	 * @param strDBName
	 * @param strTableName
	 * @param strKey
	 * @param data
	 * @param bAppend
	 * @return
	 */
	int updateObject(String strDBName, String strTableName, String strKey, Map<String, Object> data, boolean bAppend);
	
	
	
	/**
	 * 删除对象
	 * @param strDBName
	 * @param strTableName
	 * @param strKey
	 * @return
	 */
	int deleteObject(String strDBName, String strTableName, String strKey);
	
	
	
	/**
	 * 查询对象集合
	 * @param strDBName
	 * @param strTableName
	 * @param data
	 * @return
	 */
	Page fetchObjects(String strDBName, String strTableName, Map<String, Object> data);
	

}
