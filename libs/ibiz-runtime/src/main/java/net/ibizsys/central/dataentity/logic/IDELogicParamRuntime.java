package net.ibizsys.central.dataentity.logic;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 实体处理逻辑变量运行时对象接口
 * @author lionlau
 *
 */
public interface IDELogicParamRuntime extends IModelRuntime{

	/**
	 * 参数标识：列表长度
	 */
	public static String PARAM_SIZE = "size";
	
	
	/**
	 * 参数标识：列表长度
	 */
	public static String PARAM_LENGTH = "length";
	
	
	
	/**
	 * 参数标识：总记录数
	 */
	public final String PARAM_TOTAL = "total";
	
	
	/**
	 * 参数标识：文件Url来源
	 */
	public final String PARAM_URL = "url";
	
	
	
	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDELogic
	 * @param iDynaInstRuntime
	 * @throws Exception
	 */
	void init(IDELogicRuntimeContext iDELogicRuntimeContext, IPSDELogicParam iPSDELogicParam) throws Exception;
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	/**
	 * 获取实体逻辑运行时对象
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime();
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	/**
	 * 获取实体处理逻辑参数对象
	 * @return
	 */
	IPSDELogicParam getPSDELogicParam();

	
	/**
	 * 开始会话
	 * @param iDELogicSession
	 * @throws Throwable
	 */
	void beginSession(IDELogicSession iDELogicSession)throws Throwable ;
	
	
	
	/**
	 * 结束会话
	 * @param iDELogicSession
	 */
	void endSession(IDELogicSession iDELogicSession);
	
	
	/**
	 * 获取脚本对象
	 * @param iDELogicSession
	 * @return
	 * @throws Throwable
	 */
	Object getScriptObject(IDELogicSession iDELogicSessione)throws Throwable ;
	
	
	
	
	
	/**
	 * 获取实际参数对象
	 * @param iDELogicSession
	 * @return
	 * @throws Throwable
	 */
	@Deprecated
	Object getParamObject(IDELogicSession iDELogicSession)throws Throwable ;
	
	
	/**
	 * 获取实际对象
	 * @param iDELogicSession
	 * @return
	 * @throws Throwable
	 */
	Object getReal(IDELogicSession iDELogicSession)throws Throwable ;
	
	/**
	 * 获取实际参数直接变量清单对象
	 * @param iDELogicSession
	 * @return
	 * @throws Throwable
	 */
	Map<String, Object> any(IDELogicSession iDELogicSession) throws Throwable;

	/**
	 * 设置指定属性值
	 * @param iDELogicSession
	 * @param strName
	 * @param objValue
	 * @throws Throwable
	 */
	void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable;

	/**
	 * 重置指定属性变量
	 * @param iDELogicSession
	 * @param strName
	 * @throws Throwable
	 */
	void reset(IDELogicSession iDELogicSession, String strName) throws Throwable;

	/**
	 * 重置全部属性
	 * @param iDELogicSession
	 * @throws Throwable
	 */
	void resetAll(IDELogicSession iDELogicSession) throws Throwable;

	/**
	 * 拷贝当前变量到指定变量
	 * @param iDELogicSession
	 * @param dstDELogicParamRuntime
	 * @throws Throwable
	 */
	void copyTo(IDELogicSession iDELogicSession, Object dstParam) throws Throwable;
	

	/**
	 * 拷贝当前变量到指定变量
	 * @param iDELogicSession
	 * @param dstParam
	 * @param fieldList 拷贝的属性集合
	 * @param bCopyIfNotExists 是否仅拷贝不存在的属性
	 * @throws Throwable
	 */
	void copyTo(IDELogicSession iDELogicSession, Object dstParam, List<String> fieldList, boolean bCopyIfNotExists) throws Throwable;

	/**
	 * 拷贝当前变量到指定变量
	 * @param dstParam
	 * @param fieldList 拷贝的属性集合
	 * @param bCopyIfNotExists 是否仅拷贝不存在的属性
	 * @throws Throwable
	 */
	void copyTo(Object dstParam, List<String> fieldList, boolean bCopyIfNotExists) throws Throwable;
	
	/**
	 * 获取指定属性值
	 * @param iDELogicSession
	 * @param strName
	 * @return
	 * @throws Throwable
	 */
	Object get(IDELogicSession iDELogicSession, String strName) throws Throwable;

	
	/**
	 * 判断是否包括指定属性
	 * @param iDELogicSession
	 * @param strName
	 * @return
	 * @throws Throwable
	 */
	boolean contains(IDELogicSession iDELogicSession, String strName) throws Throwable;
	
	
	
	/**
	 * 绑定指定参数对象
	 * @param iDELogicSession
	 * @param paramObject
	 * @throws Throwable
	 */
	void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable;
	
	
	/**
	 *重新建立参数对象
	 * @param iDELogicSession
	 * @throws Throwable
	 */
	void renew(IDELogicSession iDELogicSession) throws Throwable;
	
	
	
	/**
	 * 附加参数对象
	 * @param iDELogicSession
	 * @param nPos
	 * @param paramObject
	 * @param nSrcPos
	 * @param nSrcLength
	 * @throws Throwable
	 */
	void append(IDELogicSession iDELogicSession, int nPos, Object paramObject, int nSrcPos, int nSrcLength) throws Throwable;
	
	
	
	/**
	 * 排序参数对象
	 * @param iDELogicSession
	 * @param strField
	 * @param strSortDir
	 * @throws Throwable
	 */
	void sort(IDELogicSession iDELogicSession, String strField, String strSortDir) throws Throwable;
	
	
	
	/**
	 * 获取变量数组长度
	 * @param iDELogicSession
	 * @throws Throwable
	 */
	int count(IDELogicSession iDELogicSession) throws Throwable;
	
	

	/**
	 * 对数据变量进行相关聚合计算
	 * @param iDELogicSession
	 * @param strField
	 * @param strAggMode
	 * @throws Throwable
	 */
	Object aggregate(IDELogicSession iDELogicSession, String strField, String strAggMode) throws Throwable;
	
	
	
	/**
	 * 输出调试信息
	 * @param iDELogicSession
	 * @param objectNode
	 */
	void debug(IDELogicSession iDELogicSession, ObjectNode objectNode);
	
	
	
	/**
	 * 获取实际对象
	 * @return
	 * @throws Throwable
	 */
	Object getReal()throws Throwable ;
	
	/**
	 * 获取实际参数直接变量清单对象
	 * @return
	 * @throws Throwable
	 */
	Map<String, Object> any() throws Throwable;

	/**
	 * 设置指定属性值
	 * @param strName
	 * @param objValue
	 * @throws Throwable
	 */
	void set(String strName, Object objValue) throws Throwable;

	/**
	 * 重置指定属性变量
	 * @param strName
	 * @throws Throwable
	 */
	void reset(String strName) throws Throwable;

	/**
	 * 重置全部属性
	 * @param iDELogicSession
	 * @throws Throwable
	 */
	void resetAll() throws Throwable;

	/**
	 * 拷贝当前变量到指定变量
	 * @param dstParam
	 * @throws Throwable
	 */
	void copyTo(Object dstParam) throws Throwable;

	/**
	 * 获取指定属性值
	 * @param strName
	 * @return
	 * @throws Throwable
	 */
	Object get(String strName) throws Throwable;

	
	/**
	 * 判断是否包括指定属性
	 * @param iDELogicSession
	 * @param strName
	 * @return
	 * @throws Throwable
	 */
	boolean contains(String strName) throws Throwable;
	
	
	
	/**
	 * 绑定指定参数对象
	 * @param paramObject
	 * @throws Throwable
	 */
	void bind(Object paramObject) throws Throwable;
	
	
	/**
	 *重新建立参数对象
		 * @throws Throwable
	 */
	void renew() throws Throwable;
	
	
	
	/**
	 * 附加参数对象
	 * @param nPos
	 * @param paramObject
	 * @param nSrcPos
	 * @param nSrcLength
	 * @throws Throwable
	 */
	void append(int nPos, Object paramObject, int nSrcPos, int nSrcLength) throws Throwable;
	
	
	
	/**
	 * 排序参数对象
	 * @param strField
	 * @param strSortDir
	 * @throws Throwable
	 */
	void sort(String strField, String strSortDir) throws Throwable;
	
	
	
	/**
	 * 获取变量数组长度
	 * @throws Throwable
	 */
	int count() throws Throwable;
	
	

	/**
	 * 对数据变量进行相关聚合计算
	 * @param strField
	 * @param strAggMode
	 * @throws Throwable
	 */
	Object aggregate(String strField, String strAggMode) throws Throwable;
	
}
