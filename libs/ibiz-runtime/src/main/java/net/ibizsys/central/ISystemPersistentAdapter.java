package net.ibizsys.central;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.ISystemRuntimeUtil;


/**
 * 系统持久化适配器
 * @author lionlau
 *
 */
public interface ISystemPersistentAdapter extends ISystemRuntimeUtil{

	
	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception;
	
	
	/**
	 *  建立数据
	 * @param iDataEntityRuntime 实体名称
	 * @param datas 数据集合
	 * @param inputFields 指定输入的属性集合，null 为未指定
	 * @param bGet 指定是否返回建立的数据
	 * @param outputFields 指定返回的属性集合，null 为未指定
	 * @param bSysMode 系统操作模式
	 * @return
	 * @throws Throwable
	 */
	Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 建立单行数据
	 * @param iDataEntityRuntime
	 * @param iEntity
	 * @param inputFields
	 * @param bGet
	 * @param outputFields
	 * @param bSysMode 系统操作模式
	 * @return
	 * @throws Throwable
	 */
	Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable;
	
	
	/**
	 *  更新数据
	 * @param iDataEntityRuntime
	 * @param datas
	 * @param inputFields
	 * @param bGet
	 * @param outputFields
	 * @param bSysMode 系统操作模式
	 * @return
	 * @throws Throwable
	 */
	Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 更新单行数据 
	 * @param iDataEntityRuntime
	 * @param iEntity
	 * @param inputFields
	 * @param bGet
	 * @param outputFields
	 * @param bSysMode 系统操作模式
	 * @return
	 * @throws Throwable
	 */
	Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 获取数据
	 * @param iDataEntityRuntime 实体名称
	 * @param keys 键值集合
	 * @param outputFields 指定返回的属性集合，null 为未指定
	 * @return
	 * @throws Throwable
	 */
	List get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, String[] outputFields) throws Throwable;
	
	
	/**
	 * 获取单行数据
	 * @param iDataEntityRuntime
	 * @param key
	 * @param outputFields
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, String[] outputFields, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 获取单行数据
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery
	 * @param key
	 * @param outputFields
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object key, String[] outputFields, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 删除数据
	 * @param iDataEntityRuntime 实体名称
	 * @param keys
	 * @param bSysMode 系统操作模式
	 * @return
	 * @throws Throwable
	 */
	void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, boolean bSysMode) throws Throwable;
	
	
	/**
	 *  删除数据
	 * @param iDataEntityRuntime
	 * @param key
	 * @param bSysMode 系统操作模式
	 * @throws Throwable
	 */
	void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 检查指定键值的状态，返回值参考 net.ibizsys.runtime.dataentity.CheckKeyStates
	 * @param iDataEntityRuntime
	 * @param objKey
	 * @return
	 */
	int checkKeyState(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objKey)throws Throwable;
	

	/**
	 * 查询数据
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery 指定数据查询对象
	 * @param filter
	 * @param pageable
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable;
	
	
	
	
	/**
	 * 查询数据
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery 指定数据查询对象
	 * @param filter
	 * @param pageable
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable;
	
	
	
	/**
	 * 获取数据集合
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @param filter
	 * @param pageable 指定分页参数，不指定时按默认分页处理
	 * @param bCount 指定是否计数操作
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable;
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.ISystemRuntimeUtil#getSystemRuntime()
	 */
	ISystemRuntime getSystemRuntime();
}
