package net.ibizsys.central.sysutil;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 系统缓存组件对象接口
 * @author lionlau
 *
 */
public interface ISysCacheUtilRuntime extends ISysUtilRuntime, ISysUniStateUtilRuntimeBase{

	/**
	 * 获取指定属性值
	 * @param strName
	 * @return
	 */
	String get(String strName);
	
	
	/**
	 * 判断指定属性是否存在
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param strValue
	 */
	void set(String strName, String strValue);
	
	
	/**
	 * 设置指定属性值
	 * @param strName
	 * @param strValue
	 * @param nSeconds 超时
	 */
	void set(String strName, String strValue, int nSeconds);
	
	
	
	
	
	/**
	 * 设置指定属性对象值
	 * @param strName
	 * @param objValue
	 */
	void set(String strName, Object objValue);
	
	
	/**
	 * 设置指定属性对象值
	 * @param strName
	 * @param objValue
	 * @param nSeconds 超时
	 */
	void set(String strName, Object objValue, int nSeconds);
	
	
	/**
	 * 移除属性值
	 * @param strName
	 */
	void reset(String strName);
	
	
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strName
	 * @param cls
	 * @return
	 */
	<T> T get(String strName, Class<T> cls);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strName
	 * @param type
	 * @return
	 */
	<T> T get(String strName, TypeReference<T> type);
	
	
	
	/**
	 * 获取指定属性值
	 * @param strCat 分类
	 * @param strName
	 * @return
	 */
	String get(String strCat, String strName);
	
	
	/**
	 * 判断指定属性是否存在
	 * @param strCat 分类
	 * @param strName
	 * @return
	 */
	boolean contains(String strCat, String strName);
	
	/**
	 * 设置指定分类属性集合
	 * @param strCat 分类
	 * @param map
	 */
	void set(String strCat, Map<String, String> map);
	
	
	/**
	 * 设置指定分类属性集合
	 * @param strCat 分类
	 * @param map
	 * @param nSeconds 超时
	 */
	void set(String strCat, Map<String, String> map, int nSeconds);
	
	
	/**
	 * 设置指定属性值
	 * @param strCat 分类
	 * @param strName
	 * @param strValue
	 */
	void set(String strCat, String strName, String strValue);
	
	
	/**
	 * 设置指定属性值
	 * @param strCat 分类
	 * @param strName
	 * @param strValue
	 * @param nSeconds 超时
	 */
	void set(String strCat, String strName, String strValue, int nSeconds);
	
	
	/**
	 * 设置指定属性对象值
	 * @param strCat 分类
	 * @param strName
	 * @param objValue
	 */
	void set(String strCat, String strName, Object objValue);
	
	
	/**
	 * 设置指定属性对象值
	 * @param strCat 分类
	 * @param strName
	 * @param objValue
	 * @param nSeconds 超时
	 */
	void set(String strCat, String strName, Object objValue, int nSeconds);
	
	
	/**
	 * 移除属性值
	 * @param strCat 分类
	 * @param strName
	 */
	void reset(String strCat, String strName);
	
	
	/**
	 * 重置指定名称的缓存
	 * @param strCat 分类
	 */
	void resetAll(String strCat);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strCat 分类
	 * @param strName
	 * @param cls
	 * @return
	 */
	<T> T get(String strCat, String strName, Class<T> cls);
	
	
	/**
	 * 获取指定缓存，按类型返回
	 * @param strCat 分类
	 * @param strName
	 * @param type
	 * @return
	 */
	<T> T get(String strCat, String strName, TypeReference<T> type);

	
	
	/**
	 * 获取本地缓存组件
	 * @return
	 */
	ISysCacheUtilRuntime local();
	
	
	
	/**
	 * 过期指定项
	 * @param strName
	 * @param nSeconds
	 */
	void expire(String strName, int nSeconds);
	
	
	
	
	/**
	 * 重命名键名称
	 * @param strName
	 * @param strNewName
	 */
	void rename(String strName, String strNewName);
	
	
	/**
	 * 拷贝分类内容到目标分类
	 * @param strSrcName
	 * @param strDstName
	 */
	void copyAll(String strSrcCat, String strDstCat);
	
	
	
	/**
	 * 获取指定分类的全部子项数据
	 * @param strCat
	 * @return
	 */
	Map<String, String> getAll(String strCat);
	
	
	/**
	 * 自增指定键
	 * @param strName
	 * @return
	 */
	Long inc(String strName);
	
	
	/**
	 * 自增指定键，指定自增值
	 * @param strName
	 * @param nValue 
	 * @return
	 */
	Long inc(String strName, Long nValue);
	
	
	/**
	 * 自增指定键，指定自增值及超时时长
	 * @param strName
	 * @param nValue
	 * @param nSeconds
	 * @return
	 */
	Long inc(String strName, Long nValue, int nSeconds);
	
	
	/**
	 * 自增指定键，指定自增值
	 * @param strName
	 * @param fValue 
	 * @return
	 */
	Double inc(String strName, Double fValue);
	
	
	/**
	 * 自增指定键，指定自增值及超时时长
	 * @param strName
	 * @param fValue
	 * @param nSeconds
	 * @return
	 */
	Double inc(String strName, Double fValue, int nSeconds);
	
	
	/**
	 * 自增指定分类下的键
	 * @param strCat
	 * @param strName
	 * @return
	 */
	Long inc(String strCat, String strName);
	
	
	/**
	 * 自增指定分类下的键，指定自增值
	 * @param strCat
	 * @param strName
	 * @param nValue
	 * @return
	 */
	Long inc(String strCat, String strName, Long nValue);
	
	
	/**
	 * 自增指定分类下的键，指定自增值及超时时长
	 * @param strCat
	 * @param strName
	 * @param nValue
	 * @param nSeconds
	 * @return
	 */
	Long inc(String strCat, String strName, Long nValue, int nSeconds);
	
	
	/**
	 * 自增指定分类下的键，指定自增值
	 * @param strCat
	 * @param strName
	 * @param fValue
	 * @return
	 */
	Double inc(String strCat, String strName, Double fValue);
	
	
	/**
	 * 自增指定分类下的键，指定自增值及超时时长
	 * @param strCat
	 * @param strName
	 * @param fValue
	 * @param nSeconds
	 * @return
	 */
	Double inc(String strCat, String strName, Double fValue, int nSeconds);
	
	
}
