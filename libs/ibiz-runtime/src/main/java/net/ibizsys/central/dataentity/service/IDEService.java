package net.ibizsys.central.dataentity.service;

import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体服务对象接口，提供外部服务对象支持
 * @author lionlau
 *
 */
public interface IDEService<T extends IEntityDTO, F extends ISearchContextDTO> {

	/**
	 * 初始化
	 * @param iSystemRuntime
	 * @param iDataEntityRuntime
	 */
	void init(ISystemRuntime iSystemRuntime, IDataEntityRuntime iDataEntityRuntime) throws Exception;
	
	
//	/**
//	 * 初始化
//	 * @param iSystemRuntime
//	 * @param iDataEntityRuntimeContext
//	 */
//	void init(ISystemRuntime iSystemRuntime, IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception;
	
	
	/**
	 * 获取实体标识
	 * @return
	 */
	String getDataEntityId();
	
	
	/**
	 * 准备实体服务对象
	 */
	void prepare();
	
	/**
	 * 获取系统所在的运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime() ;
	
	
	/**
	 * 建立数据对象DTO
	 * @param iPSDEMethodDTO
	 * @return
	 */
	IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO);
	
	
	/**
	 * 建立数据对象DTO列表
	 * @param iPSDEMethodDTO
	 * @return
	 */
	List<IEntityDTO> createEntityDTOList(IPSDEMethodDTO iPSDEMethodDTO);
	
	
	/**
//	 * 建立数据对象DTO分页结果对象
//	 * @param iPSDEMethodDTO
//	 * @return
//	 */
//	Page<IEntityDTO> createEntityDTOPage(IPSDEMethodDTO iPSDEMethodDTO);
	

	
	/**
	 * 建立搜索上下文DTO
	 * @param iPSDEMethodDTO
	 * @return
	 */
	ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO);
	
	
	
	/**
	 * 建立默认上下文对象
	 * @param params
	 * @return
	 */
	ISearchContextDTO createSearchContextDTO(Map<String, Object> params);
	
	
	
	/**
	 * 执行实体行为
	 * @param iDataEntityRuntime 当前实体运行时对象
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	default Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable{
		return getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
	}
	
	
		
	
	/**
	 * 检索数据集合
	 * @param iDataEntityRuntime 当前实体运行时对象
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable{
		return getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
	}
	
	/**
	 * 执行实体行为
	 * @param iDataEntityRuntime 当前实体运行时对象
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	default Object executeActionReal(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable{
		Assert.notNull(iDataEntityRuntimeContext, "传入实体运行时上下文对象无效");
		return iDataEntityRuntimeContext.executeActionReal(strActionName, iPSDEAction, args, actionData);
	}
	
	
		
	
	/**
	 * 检索数据集合
	 * @param iDataEntityRuntime 当前实体运行时对象
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	default Object fetchDataSetReal(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable{
		Assert.notNull(iDataEntityRuntimeContext, "传入实体运行时上下文对象无效");
		return iDataEntityRuntimeContext.fetchDataSetReal(strDataSetName, iPSDEDataSet, args, actionData);
	}
	
	
	/**
	 * 启动工作流
	 * @param iDataEntityRuntime
	 * @param iEntityBase
	 * @param iPSDEWF
	 * @throws Throwable
	 */
	void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF) throws Throwable;
	
	
	
	
	/**
	 * 查询满足条件的一行数据
	 * @param iSearchContextBase
	 * @return
	 */
	T selectOne(F f, boolean bTryMode) throws Throwable;
	
	
	
	/**
	 * 判断是否存在符合条件的数据
	 * @param iSearchContextBase
	 * @return
	 */
	boolean existsData(F iSearchContextBase)throws Throwable;
	
	
	
	/**
	 * 直接执行查询SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	List<T> executeSelectSQL(String strSQL, List<Object> params) throws Throwable;
	
	
	
	
	/**
	 * 直接执行SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	int executeSQL(String strSQL, List<Object> params) throws Throwable;
	
	
	
	
	
	/**
	 * 获取数据
	 * @param t
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	boolean get(T t, boolean bTryMode) throws Throwable;
	
	
	
	/**
	 * 获取数据
	 * @param key
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	T get(Object key, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 直接建立
	 * @param t
	 * @throws Throwable
	 */
	void rawCreate(List<T> t) throws Throwable;
	
	
	/**
	 * 直接更新
	 * @param t
	 * @throws Throwable
	 */
	void rawUpdate(List<T> t) throws Throwable;
	
	
	/**
	 * 直接保存
	 * @param t
	 * @throws Throwable
	 */
	void rawSave(List<T> t) throws Throwable;
	
	/**
	 * 直接删除
	 * @param t
	 * @throws Throwable
	 */
	void rawRemove(List<Object> t) throws Throwable;
	
	/**
	 * 直接建立
	 * @param t
	 * @throws Throwable
	 */
	void rawCreate(List<T> t, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 直接更新
	 * @param t
	 * @throws Throwable
	 */
	void rawUpdate(List<T> t, boolean bSysMode) throws Throwable;
	
	
	/**
	 * 直接保存
	 * @param t
	 * @throws Throwable
	 */
	void rawSave(List<T> t, boolean bSysMode) throws Throwable;
	
	/**
	 * 直接删除
	 * @param t
	 * @throws Throwable
	 */
	void rawRemove(List<Object> t, boolean bSysMode) throws Throwable;
	
	
	
	/**
	 * 执行行为（需要事务）
	 * @param iAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object rawExecute(IAction iAction, Object[] args) throws Throwable;
	
	
	/**
	 * 执行行为
	 * @param iAction
	 * @param args
	 * @param nTransactionalPropagation
	 * @return
	 * @throws Throwable
	 */
	Object rawExecute(IAction iAction, Object[] args, int nTransactionalPropagation) throws Throwable;
	
	
	
	/**
	 * 删除符合条件的数据
	 * @param f
	 * @return
	 * @throws Throwable
	 */
	int remove(F f) throws Throwable;
	
	
	/**
	 * 直接删除符合条件的数据
	 * @param f
	 * @param bSysMode
	 * @return
	 * @throws Throwable
	 */
	int rawRemove(F f, boolean bSysMode) throws Throwable;
	
	
	
	/**
	 * 更新查询数据
	 * @param f
	 * @param objData
	 * @return
	 * @throws Throwable
	 */
	List<T> update(F f, Object objData)throws Throwable;
	
	
	/**
	 * 直接更新
	 * @param f
	 * @param objData
	 * @return
	 * @throws Throwable
	 */
	List<T> rawUpdate(F f, Object objData) throws Throwable;
	
	/**
	 * 直接更新
	 * @param f
	 * @param objData
	 * @param bSysMode
	 * @return
	 * @throws Throwable
	 */
	List<T> rawUpdate(F f, Object objData, boolean bSysMode) throws Throwable;
	
	
	
	/**
	 * 直接查询
	 * @param f
	 * @return
	 * @throws Throwable
	 */
	default List<T> rawSelect(F f) throws Throwable {
		return (List<T>)this.getDataEntityRuntime().rawSelect(f);
	}
	
	default boolean rawSelect(T t, boolean tryMode) throws Throwable{
		java.util.List<IPSDEField> psDEFieldList = this.getDataEntityRuntime().getPSDEFields(false);
		F iSearchContextDTO = (F)this.getDataEntityRuntime().createSearchContext();
		if(!ObjectUtils.isEmpty(psDEFieldList)) {
			for(IPSDEField iPSDEField : psDEFieldList) {
				if(!t.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object value = t.get(iPSDEField.getLowerCaseName());
				if(ObjectUtils.isEmpty(value)) {
					iSearchContextDTO.nvl(iPSDEField.getLowerCaseName());
				}
				else {
					iSearchContextDTO.eq(iPSDEField.getLowerCaseName(), value);
				}
			}
		}
		
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().rawSelectOne(iSearchContextDTO, tryMode);
		if(iEntityDTO == null) {
			return false;
		}
		t.reload(iEntityDTO, true);
		return true;
	}
	
	
	/**
	 * 获取会话中的数据对象
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	default T getSessionEntityIf(Object key) throws Throwable{
		return (T)this.getDataEntityRuntime().getSessionEntityIf(key);
	}
	
	
	/**
	 *  重置会话中的数据对象
	 * @param key
	 * @return
	 */
	default	T resetSessionEntity(Object key) {
		return (T)this.getDataEntityRuntime().resetSessionEntity(key);
	}
	
}
