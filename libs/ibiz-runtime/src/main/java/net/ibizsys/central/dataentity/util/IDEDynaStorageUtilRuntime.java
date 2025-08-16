package net.ibizsys.central.dataentity.util;

import java.util.List;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 实体动态存储功能运行时对象
 * 
 * @author lionlau
 *
 */
public interface IDEDynaStorageUtilRuntime extends net.ibizsys.runtime.dataentity.util.IDEDynaStorageUtilRuntime {

	public final static String ACTIONSESSION_DYNAFIELDS_PREFIX = "__DYNAFIELDS_";

	/**
	 * 预定义属性：属性名称
	 */
	public final static String PREDEFINEDFIELD_NAME = "NAME";

	/**
	 * 预定义属性：字符串
	 */
	public final static String PREDEFINEDFIELD_STRING_VALUE = "STRING_VALUE";

	/**
	 * 预定义属性：长字符串
	 */
	public final static String PREDEFINEDFIELD_LONGSTRING_VALUE = "LONGSTRING_VALUE";

	/**
	 * 预定义属性：双精
	 */
	public final static String PREDEFINEDFIELD_DOUBLE_VALUE = "DOUBLE_VALUE";

	/**
	 * 预定义属性：时间
	 */
	public final static String PREDEFINEDFIELD_DATETIME_VALUE = "DATETIME_VALUE";

	/**
	 * 预定义属性：数值
	 */
	public final static String PREDEFINEDFIELD_DECIMAL_VALUE = "DECIMAL_VALUE";

	/**
	 * 预定义属性：整形
	 */
	public final static String PREDEFINEDFIELD_INT_VALUE = "INT_VALUE";

	/**
	 * 预定义属性：大整形
	 */
	public final static String PREDEFINEDFIELD_BIGINT_VALUE = "BIGINT_VALUE";

	/**
	 * 存储模式：未知
	 */
	public final static int STORAGEMODE_UNKNOWN = 0;
	
	/**
	 * 外表KeyValue存储模式 使用外部表以键值对形式存储扩展属性
	 */
	public final static int STORAGEMODE_EXTERNAL_KEY_VALUE_TABLE = 1;

	/**
	 * 本表KeyValue集合属性模式 使用当前表的一个长文本字段存储JSON等格式的键值对集合
	 */
	public final static int STORAGEMODE_EMBEDDED_KEY_VALUE_COLUMN = 2;

	/**
	 * 外表实时添加字段模式 在外部表中实时添加新字段来存储扩展属性
	 */
	public final static int STORAGEMODE_EXTERNAL_DYNAMIC_COLUMNS = 3;

	/**
	 * 本表实时添加字段模式 在当前表中实时添加新字段来存储扩展属性
	 */
	public final static int STORAGEMODE_EMBEDDED_DYNAMIC_COLUMNS = 4;

	
	/**
	 * 获取存储模式
	 * @return
	 */
	default int getStorageMode() {
		return STORAGEMODE_UNKNOWN;
	}

	/**
	 * 处理之前检查数据对象动态属性
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	void checkEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable;

	/**
	 * 处理之前转换数据对象动态属性
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	void translateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable;

	/**
	 * 处理之后转换数据对象动态属性
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	void translateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction) throws Throwable;

	/**
	 * 删除之前移除数据对象动态属性
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	void removeEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable;

	/**
	 * 处理之前转换搜索上下文动态属性
	 * 
	 * @param arg0
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	void translateSearchContextDynaFieldsBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable;

	/**
	 * 处理之后转换数据对象动态属性
	 * 
	 * @param arg0
	 * @param list
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable;

	/**
	 * 获取传入属性的存储属性
	 * 
	 * @param iPSDEField
	 * @return
	 * @throws Exception
	 */
	IPSDEField getStoragePSDEField(IPSDEField iPSDEField) throws Exception;

	/**
	 * 获取指定模式的存储属性
	 * 
	 * @param strType
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	IPSDEField getStoragePSDEField(String strType, boolean tryMode) throws Exception;

	/**
	 * 获取存储的实体运行时
	 * 
	 * @return
	 */
	IDataEntityRuntime getStorageDataEntityRuntime();

	// /**
	// * 处理之后转换数据对象动态属性
	// * @param arg0
	// * @param list
	// * @param strDataQueryName
	// * @param iPSDEDataQuery
	// * @throws Throwable
	// */
	// void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0,
	// List<? extends IEntityBase> list, String strDataQueryName, IPSDEDataQuery
	// iPSDEDataQuery) throws Throwable;
}
