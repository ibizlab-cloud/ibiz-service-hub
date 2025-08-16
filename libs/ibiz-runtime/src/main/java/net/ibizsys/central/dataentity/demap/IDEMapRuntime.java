package net.ibizsys.central.dataentity.demap;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.datamap.IPSDEMap;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

/**
 * 实体映射运行时接口
 * @author lionlau
 *
 */
public interface IDEMapRuntime extends IDataEntityModelRuntime{

	
	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEMap
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEMap iPSDEMap) throws Exception;
	
	
	/**
	 * 获取相关的实体映射模型对象
	 * @return
	 */
	IPSDEMap getPSDEMap();
	
	
	/**
	 * 获取目标实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDstDataEntityRuntime();
	
	
	/**
	 * 转化到目标实体DTO对象
	 * @param srcEntityDTO
	 * @return
	 */
	IEntityDTO toEntityDTO(IEntityDTO srcEntityDTO);
	
	
	/**
	 * 转化目标实体数据对象到源数据对象
	 * @param dstEntityDTO
	 * @return
	 */
	IEntityDTO fromEntityDTO(IEntityDTO dstEntityDTO);
	
	/**
	 * 转化到目标实体DTO对象
	 * @param srcEntityDTO
	 * @param dstEntityDTO
	 * @return
	 */
	IEntityDTO toEntityDTO(IEntityDTO srcEntityDTO, IEntityDTO dstEntityDTO);
	
	
	/**
	 * 转化目标实体数据对象到源数据对象
	 * @param dstEntityDTO
	 * @param srcEntityDTO 
	 * @return
	 */
	IEntityDTO fromEntityDTO(IEntityDTO dstEntityDTO, IEntityDTO srcEntityDTO);
	
	
	
	/**
	 * 转化源搜索上下文对象到目标实体
	 * @param srcSearchContextDTO
	 * @return
	 */
	ISearchContextDTO toSearchContextDTO(ISearchContextDTO srcSearchContextDTO);
	
	
	
	/**
	 * 获取结果集合
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;

	/**
	 * 执行行为
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	
	
	/**
	 * 是否支持指定数据集
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @return
	 */
	boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet);
	
	
	
	
	/**
	 * 是否支持指定行为
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction);
	
	
	/**
	 * 是否支持指定数据集
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param strMode 映射模式
	 * @return
	 */
	boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, String strMode);
	
	
	
	
	/**
	 * 是否支持指定行为
	 * @param strActionName
	 * @param iPSDEAction
	 * @param strMode 映射模式
	 * @return
	 */
	boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, String strMode);
	
	
	
//	/**
//	 * 查询数据
//	 * @param iPSDEDataQuery
//	 * @param iSearchContext
//	 * @param outputFields
//	 * @return
//	 * @throws Throwable
//	 */
//	List query(IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable;
//	
//	
//	
//	/**
//	 * 查询数据
//	 * @param iPSDEDataQuery
//	 * @param iSearchContext
//	 * @param outputFields
//	 * @return
//	 * @throws Throwable
//	 */
//	List query(IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable;
	
	
	
}
