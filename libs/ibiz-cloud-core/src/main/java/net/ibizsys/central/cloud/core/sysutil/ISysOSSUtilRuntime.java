package net.ibizsys.central.cloud.core.sysutil;

import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.util.ISearchContext;

public interface ISysOSSUtilRuntime extends net.ibizsys.central.sysutil.ISysOSSUtilRuntime {

	/**
	 * 对象唯一键标识
	 */
	public final static String OBJECT_UNIQUEKEY = "_id";
	
	/**
	 * 请求参数：返回的属性集合
	 */
	public final static String PARAM_FIELDS = "fields";
	
	
	/**
	 * 建立对象
	 * @param strDBName
	 * @param strTableName
	 * @param data
	 * @return 返回数据标识
	 */
	String createObject(String strDBName, String strTableName, Map<String, Object> data);

	
	
	/**
	 * 更新对象
	 * @param strDBName
	 * @param strTableName
	 * @param data
	 * @param bAppendMode 是否附加
	 * @return 返回更新数据数量
	 */
	int updateObject(String strDBName, String strTableName, Map<String, Object> data, boolean bAppendMode);
	
	
	
	
	
	/**
	 * 删除对象
	 * @param strDBName
	 * @param strTableName
	 * @param key
	 * @return 返回删除数据数量
	 */
	int deleteObject(String strDBName, String strTableName, String key);
	
	
	
	
	/**
	 * 获取对象
	 * @param strDBName
	 * @param strTableName
	 * @param key
	 * @return 返回获取数据
	 */
	Map getObject(String strDBName, String strTableName, String key);
	
	
	
	/**
	 * 获取数据对象分页数据
	 * @param strDBName
	 * @param strTableName
	 * @param iSearchContext
	 * @return
	 */
	Page fetchObjects(String strDBName, String strTableName, ISearchContext iSearchContext);
	
}
