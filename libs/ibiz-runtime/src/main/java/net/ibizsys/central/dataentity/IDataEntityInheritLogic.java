package net.ibizsys.central.dataentity;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 实体继承逻辑
 * @author lionlau
 *
 */
public interface IDataEntityInheritLogic{

	/**
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @return 返回是否已处理
	 * @throws Throwable
	 */
	default void translateEntityBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
	}
	
	
	default void translateSearchContextBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		
	}
	
	default void translateSearchContextBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Throwable {
		
	}

	
	default void translateEntityAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
	}
	
	default void translateEntitiesAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> entityDTOList, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Throwable {
	}
	
	default void translateEntitiesAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> entityDTOList, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		
	}
	
	/**
	 * 填充数据对象默认值
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void fillEntityDefaultValues(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 填充数据对象完整信息
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void fillEntityFullInfo(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	
	
	/**
	 * 执行行为附加逻辑
	 * @param iDataEntityRuntimeContext
	 * @param args
	 * @param ret
	 * @param iPSDEAction
	 * @param strAttachMode
	 * @return
	 * @throws Throwable
	 */
	default Object executeActionLogics(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object[] args, Object ret, IPSDEAction iPSDEAction, String strAttachMode) throws Throwable{
		return ret;
	}
	
	
	
	/**
	 * 填充数据对象序列值
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void fillEntitySequenceValues(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 处理之前检查数据对象
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void checkEntityBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 处理之后检查数据对象
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void checkEntityAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	
	
	/**
	 * 处理之前检查数据对象嵌套关系数据
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void checkEntityNestedDERsBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	
	
	/**
	 * 处理之前转换数据对象嵌套关系
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void translateEntityNestedDERsBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 处理之后转换数据对象嵌套关系
	 * @param iDataEntityRuntimeContext
	 * @param iEntityDTO
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void translateEntityNestedDERsAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	
	
	/**
	 * 删除之前检查引用数据
	 * @param iDataEntityRuntimeContext
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void checkReferenceBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 删除之前重置引用数据
	 * @param iDataEntityRuntimeContext
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void resetReferenceBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	/**
	 * 删除之前删除引用数据
	 * @param iDataEntityRuntimeContext
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @throws Throwable
	 */
	default void removeReferenceBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	
//	/**
//	 * 处理之前检查数据对象动态属性
//	 * @param arg0
//	 * @param strActionName
//	 * @param iPSDEAction
//	 * @throws Throwable
//	 */
//	default void checkEntityDynaFieldsBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
//		
//	}
	
	
//	/**
//	 * 处理之前转换数据对象动态属性
//	 * @param arg0
//	 * @param strActionName
//	 * @param iPSDEAction
//	 * @throws Throwable
//	 */
//	default void translateEntityDynaFieldsBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
//		
//	}
//	
//	
//	/**
//	 * 处理之后转换数据对象动态属性
//	 * @param arg0
//	 * @param objRet
//	 * @param strActionName
//	 * @param iPSDEAction
//	 * @throws Throwable
//	 */
//	default void translateEntityDynaFieldsAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction)throws Throwable{
//		
//	}
	
	
//	/**
//	 * 删除之前移除数据对象动态属性
//	 * @param arg0
//	 * @param strActionName
//	 * @param iPSDEAction
//	 * @throws Throwable
//	 */
//	default void removeEntityDynaFieldsBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
//		
//	}
//	
	
	
//	/**
//	 * 处理之前转换搜索上下文动态属性
//	 * @param arg0
//	 * @param strDataSetName
//	 * @param iPSDEDataSet
//	 * @throws Throwable
//	 */
//	default void translateSearchContextDynaFieldsBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable{
//		
//	}
//	
//	
//
//	/**
//	 * 处理之后转换数据对象动态属性
//	 * @param arg0
//	 * @param list
//	 * @param strDataSetName
//	 * @param iPSDEDataSet
//	 * @throws Throwable
//	 */
//	default void translateEntityDynaFieldsAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable{
//		
//	}
	
	
	/**
	 * 是否支持指定数据集
	 * @param iDataEntityRuntimeContext
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @return
	 */
	default boolean isEnableDataSet(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) {
		return false;
	}
	
	
	
	
	/**
	 * 是否支持指定行为
	 * @param iDataEntityRuntimeContext
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	default boolean isEnableAction(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args) {
		return false;
	}
	
	/**
	 * 获取结果集合
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	default Page fetchDataSet(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable{
		return null;
	}

	/**
	 * 执行行为
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	default Object executeAction(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable{
		return null;
	}
	
	
	default void buildParentPathBeforeProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
	
	default void buildParentPathAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable{
		
	}
}
