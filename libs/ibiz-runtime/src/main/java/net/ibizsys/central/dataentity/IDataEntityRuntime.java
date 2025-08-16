package net.ibizsys.central.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntime;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.dataflow.IDEDataFlowRuntime;
import net.ibizsys.central.dataentity.datasync.IDEDataSyncOutRuntimeBase;
import net.ibizsys.central.dataentity.defield.IDEFGroupRuntime;
import net.ibizsys.central.dataentity.defield.IDEFValueRuleRuntimeBase;
import net.ibizsys.central.dataentity.demap.IDEMapRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntimeBase;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataSetLogicRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.dataentity.search.IDESearchRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.dataentity.state.IDEUniStateRuntimeBase;
import net.ibizsys.central.dataentity.testing.IDETestCaseRuntime;
import net.ibizsys.central.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.central.dataentity.util.IDENotifySettingUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionStorageUtilRuntime;
import net.ibizsys.central.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.res.ISysDEUniStateRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.system.ISystemModuleRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.model.database.IPSDEDBConfig;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTO;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.unistate.IPSDEUniState;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.action.IDEActionLogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchFieldCond;

/**
 * 业务中台实体运行时对象接口
 * 
 * @author lionlau
 *
 */
public interface IDataEntityRuntime extends net.ibizsys.runtime.dataentity.IDataEntityRuntime {

	/**
	 * 初始化实体运行时
	 * 
	 * @param iSystemRuntimeContext
	 * @param iPSDataEntity
	 * @param data
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDataEntity iPSDataEntity, Object data) throws Exception;

	/**
	 * 获取实体的属性集合
	 * 
	 * @param bExtension
	 * @return
	 */
	List<IPSDEField> getPSDEFields(boolean bExtension);

	/**
	 * 获取指定属性
	 * 
	 * @param bExtension
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEField(boolean bExtension, String strName, boolean bTryMode);

	// /**
	// * 设置实体服务对象
	// * @param iDEService
	// */
	// void setDEService(IDEService iDEService);
	//

	/**
	 * 获取实体服务对象
	 * 
	 * @return
	 */
	IDEService getDEService();

	/**
	 * 获取系统模型对象
	 * 
	 * @return
	 */
	ISystemRuntime getSystemRuntime();

	/**
	 * 获取默认的实体方法DTO对象
	 * 
	 * @return
	 */
	IPSDEMethodDTO getDefaultPSDEMethodDTO();

	/**
	 * 获取默认的实体过滤器DTO对象
	 * 
	 * @return
	 */
	IPSDEFilterDTO getDefaultPSDEFilterDTO();

	/**
	 * 获取实体方法DTO对象
	 * 
	 * @param iPSDEMethodDTO
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	IDEMethodDTO getDEMethodDTO(IPSDEMethodDTO iPSDEMethodDTO, Object obj) throws Exception;

	/**
	 * 获取实体方法DTO对象
	 * 
	 * @param iPSDEMethodDTO
	 * @param obj
	 * @param bDTOMode
	 *            传入数据为DTO数据
	 * @return
	 * @throws Exception
	 */
	IDEMethodDTO getDEMethodDTO(IPSDEMethodDTO iPSDEMethodDTO, Object objData, boolean bDTOMode) throws Exception;

	/**
	 * 调用实体方法
	 * 
	 * @param strMethodName
	 * @param objArg
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeMethod(String strMethodName, Object objArg, Object objTag) throws Throwable;

	/**
	 * 调用实体方法
	 * 
	 * @param strMethodName
	 * @param args
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeMethod(String strMethodName, Object[] args, Object objTag) throws Throwable;

	/**
	 * 获取系统持久化设配器
	 * 
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapter();

	/**
	 * 获取系统持久化设配器（必须存在）
	 * 
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapterMust();

	/**
	 * 获取实体相关的数据库体系运行时
	 * 
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime();

	/**
	 * 获取实体相关的数据库体系运行时（必须存在）
	 * 
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntimeMust();

	/**
	 * 获取当前默认的实体数据库配置
	 * 
	 * @return
	 */
	IPSDEDBConfig getDefaultPSDEDBConfig();

	/**
	 * 获取默认的实体工作流运行时
	 * 
	 * @return
	 */
	IDEWFRuntime getDefaultDEWFRuntime();

	/**
	 * 获取指定实体工作流运行时对象
	 * 
	 * @param iPSDEWF
	 * @return
	 */
	IDEWFRuntime getDEWFRuntime(IPSDEWF iPSDEWF);

	/**
	 * 获取子系统服务接口运行时对象
	 * 
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();

	/**
	 * 获取子系统服务接口实体运行时对象
	 * 
	 * @return
	 */
	ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime();

	/**
	 * 获取表名称
	 * 
	 * @return
	 */
	String getTableName();

	/**
	 * 获取实体数据查询代码运行时对象
	 * 
	 * @param iPSDEDataQuery
	 * @param strDBType
	 * @param bTryMode
	 * @return
	 */
	IDEDataQueryCodeRuntime getDEDataQueryCodeRuntime(IPSDEDataQuery iPSDEDataQuery, String strDBType, boolean bTryMode);

	/**
	 * 建立默认数据查询对象
	 * 
	 * @param params
	 * @return
	 */
	ISearchContextDTO createSearchContext(Map<String, Object> params);

	/**
	 * 建立默认数据查询对象
	 */
	ISearchContextDTO createSearchContext();

	/**
	 * 获取指定属性
	 * 
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEField(String strName, boolean bTryMode);

	/**
	 * 获取指定属性搜索模式
	 * 
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEFSearchMode getPSDEFSearchMode(String strName, boolean bTryMode);

	/**
	 * 建立实体服务相应的数据对象
	 * 
	 * @return
	 */
	IEntityDTO createEntity();

	/**
	 * 建立传入数据的数据对象
	 * 
	 * @param params
	 * @return
	 */
	IEntityDTO createEntity(Map<String, Object> params);

	/**
	 * 建立传入数据的数据对象
	 * 
	 * @param params
	 * @param bDTOData
	 * @return
	 */
	IEntityDTO createEntity(Map<String, Object> params, boolean bDTOData);

	/**
	 * 建立实体服务相应的数据对象列表
	 * 
	 * @return
	 */
	List<IEntityDTO> createEntityList();

	// /**
	// * 建立数据对象分页结果对象
	// * @return
	// */
	// Page<IEntityDTO> createEntityPage();
	//
	//
	//
	// /**
	// * 建立数据对象分页结果对象
	// * @param list
	// * @param pageable
	// * @param nTotal
	// * @return
	// */
	// Page<IEntityDTO> createEntityPage(List<IEntityDTO> list, Pageable
	// pageable, int nTotal);

	/**
	 * 获取实体访问控制管理对象
	 * 
	 * @return
	 */
	IDataEntityAccessManager getDataEntityAccessManager();

	/**
	 * 设置搜索上下文对象分页信息
	 * 
	 * @param iSearchContextBase
	 * @param nPageIndex
	 * @param nPageSize
	 */
	void setSearchPaging(ISearchContextDTO iSearchContextDTO, int nPageIndex, int nPageSize);

	/**
	 * 查询满足条件的一行数据
	 * 
	 * @param iSearchContextBase
	 * @return
	 */
	IEntityDTO selectOne(ISearchContextDTO iSearchContextDTO, boolean bTryMode);

	/**
	 * 获取支持快速搜索的属性集合
	 * 
	 * @return
	 */
	List<IPSDEField> getQuickSearchPSDEFields();

	/**
	 * 获取数据
	 * 
	 * @param objKey
	 */
	IEntityDTO get(Object objKey, boolean bTryMode);

	/**
	 * 获取简单数据对象
	 * 
	 * @param objKey
	 * @return
	 */
	IEntityDTO getSimpleEntity(Object objKey);

	/**
	 * 获取操作会话中的数据对象（没有则放入）
	 * 
	 * @param objKey
	 * @return
	 */
	IEntityDTO getSessionEntityIf(Object objKey) throws Throwable;

	/**
	 * 重置操作会话中的数据对象
	 * 
	 * @param objKey
	 */
	IEntityDTO resetSessionEntity(Object objKey);

	/**
	 * 选择指定数据查询数据
	 * 
	 * @param iPSDataQuery
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectDataQuery(IPSDEDataQuery iPSDataQuery, ISearchContextDTO iSearchContextDTO);

	/**
	 * 通过查询名称进行数据查询
	 * 
	 * @param strDataQueryName
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectDataQuery(String strDataQueryName, ISearchContextDTO iSearchContextDTO);

	/**
	 * 执行默认数据查询
	 * 
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> select(ISearchContextDTO iSearchContextDTO);

	/**
	 * 执行简单数据查询
	 * 
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectSimple(ISearchContextDTO iSearchContextDTO);

	/**
	 * 通过数据集进行数据查询
	 * 
	 * @param strDataSetName
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectDataSet(IPSDEDataSet iPSDataSet, ISearchContextDTO iSearchContextDTO);

	/**
	 * 通过数据集名称进行数据查询
	 * 
	 * @param strDataSetName
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectDataSet(String strDataSetName, ISearchContextDTO iSearchContextDTO);

	/**
	 * 检索实体数据集合
	 * 
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @param bIgnoreDEService
	 *            指定是否忽略指定的实体服务对象
	 * @return
	 * @throws Throwable
	 */
	Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, boolean bIgnoreDEService) throws Throwable;

	/**
	 * 执行实体行为
	 * 
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @param bIgnoreDEService
	 *            指定是否忽略指定的实体服务对象
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, boolean bIgnoreDEService) throws Throwable;

	/**
	 * 启动流程
	 * 
	 * @param iEntityBase
	 * @param 指定指定的实体工作流
	 * @param bIgnoreDEService
	 *            指定是否忽略指定的实体服务对象
	 * @throws Throwable
	 */
	void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF, boolean bIgnoreDEService) throws Throwable;

	/**
	 * 获取当前动态实例实体运行时
	 * 
	 * @param iEntityBase
	 * @param bModuleInst
	 * @return
	 */
	IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime(IEntityBase iEntityBase, boolean bModuleInst);

	/**
	 * 是否支持实体服务对象
	 * 
	 * @return
	 */
	boolean isEnableDEService();

	/**
	 * 设置查询分页信息
	 * 
	 * @param iSearchContextDTO
	 * @param nPageIndex
	 *            起始页号，从 1 开始
	 * @param nPageSize
	 *            每页数量
	 * @param sortPSDEField
	 *            排序属性
	 * @param strSortDir
	 *            排序方向
	 */
	void setSearchPaging(ISearchContextDTO iSearchContextDTO, int nPageIndex, int nPageSize, IPSDEField sortPSDEField, String strSortDir);

	/**
	 * 设置查询排序信息
	 * 
	 * @param iSearchContextDTO
	 * @param sortPSDEField
	 *            排序属性
	 * @param strSortDir
	 *            排序方向
	 */
	void setSearchSort(ISearchContextDTO iSearchContextDTO, IPSDEField sortPSDEField, String strSortDir);

	/**
	 * 获取实体所属的系统模块运行时
	 * 
	 * @return
	 */
	ISystemModuleRuntime getSystemModuleRuntime();

	/**
	 * 获取实体所属的系统模块运行时
	 * 
	 * @return
	 */
	ISystemModuleUtilRuntime getSystemModuleUtilRuntime();

	/**
	 * 获取实体关系运行时对象
	 * 
	 * @param iPSDERBase
	 * @param bTryMode
	 * @return
	 */
	IDERRuntime getDERRuntime(IPSDERBase iPSDERBase, boolean bTryMode);

	/**
	 * 获取指定实体映射运行时模型
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	IDEMapRuntime getDEMapRuntime(String strCodeName, boolean bTryMode);

	/**
	 * 获取实体方法DTO运行时对象
	 * 
	 * @param iPSDEMethodDTO
	 * @param bTryMode
	 * @return
	 */
	IDEMethodDTORuntime getDEMethodDTORuntime(IPSDEMethodDTO iPSDEMethodDTO, boolean bTryMode);

	/**
	 * 直接建立
	 * 
	 * @param t
	 * @throws Throwable
	 */
	void rawCreate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable;

	/**
	 * 直接更新
	 * 
	 * @param t
	 * @throws Throwable
	 */
	void rawUpdate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable;

	/**
	 * 直接保存
	 * 
	 * @param t
	 * @throws Throwable
	 */
	void rawSave(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable;

	/**
	 * 直接删除
	 * 
	 * @param t
	 * @throws Throwable
	 */
	void rawRemove(List<Object> list, boolean bSysMode) throws Throwable;

	/**
	 * 直接获取
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	IEntityDTO rawGet(Object key) throws Throwable;

	/**
	 * 直接查询默认数据查询
	 * 
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> rawSelect(ISearchContextDTO iSearchContextDTO);
	
	
	/**
	 * 直接查询单行数据
	 * @param iSearchContextDTO
	 * @param bTryMode
	 * @return
	 */
	IEntityDTO rawSelectOne(ISearchContextDTO iSearchContextDTO, boolean bTryMode);

	/**
	 * 直接查询指定数据查询
	 * 
	 * @param iPSDEDataQuery
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> rawSelect(IPSDEDataQuery iPSDEDataQuery, ISearchContextDTO iSearchContextDTO);

	/**
	 * 获取实体相关的大数据体系运行时对象
	 * 
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime();

	/**
	 * 获取实体相关的大数据体系运行时对象（必须存在）
	 * 
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntimeMust();

	// /**
	// * 建立用于脚本调用的数据对象列表对象
	// * @param list
	// * @return
	// */
	// IScriptEntityList createScriptEntityList(List<? extends IEntityDTO>
	// list);
	//
	//
	//
	// /**
	// * 建立用于脚本调用的数据对象分页对象
	// * @param list
	// * @return
	// */
	// IScriptEntityPage createScriptEntityPage(Page<? extends IEntityDTO>
	// page);

	/**
	 * 将对象集合序列化到数据
	 * 
	 * @param list
	 * @return
	 */
	Object serializeEntityList(List<? extends IEntityDTO> list);

	/**
	 * 反序列化数据对象列表
	 * 
	 * @param objData
	 * @return
	 */
	List<IEntityDTO> deserializeEntityList(Object objData);

	// /**
	// * 调用实体行为
	// * @param iPSDEAction
	// * @param args
	// * @return
	// * @throws Exception
	// */
	// Object invokeAction(IPSDEAction iPSDEAction, Object[] args, Object
	// objTag) throws Throwable;
	//
	//
	//
	// /**
	// * 调用实体数据集
	// * @param iPSDEDataSet
	// * @param args
	// * @return
	// * @throws Exception
	// */
	// Object invokeDataSet(IPSDEDataSet iPSDEDataSet, Object[] args, Object
	// objTag) throws Throwable;

	// /**
	// * 调用实体行为
	// * @param strActionName
	// * @param objArg
	// * @param iUserContext
	// * @param objTag
	// * @return
	// * @throws Exception
	// */
	// Object invokeAction(String strActionName, Object objArg, IUserContext
	// iUserContext, Object objTag) throws Exception;
	//
	//
	//
	// /**
	// * 调用实体数据集
	// * @param strActionName
	// * @param objArg
	// * @param iUserContext
	// * @param objTag
	// * @return
	// * @throws Exception
	// */
	// Object invokeDataSet(String strDataSetName, Object objArg, IUserContext
	// iUserContext, Object objTag) throws Exception;

	/**
	 * 执行行为（需要事务）
	 * 
	 * @param iAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Deprecated
	Object rawExecute(IAction iAction, Object[] args) throws Throwable;

	/**
	 * 执行行为
	 * 
	 * @param iAction
	 * @param args
	 * @param nTransactionalPropagation
	 * @return
	 * @throws Throwable
	 */
	@Deprecated
	Object rawExecute(IAction iAction, Object[] args, int nTransactionalPropagation) throws Throwable;

	/**
	 * 获取导入数据模板
	 * 
	 * @param strImportTag
	 * @oaram outputStream
	 * @param bTestPriv
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @return
	 * @throws Throwable
	 */
	void getImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;

	/**
	 * 获取实体运行时测试用例集合
	 * 
	 * @return
	 */
	List<IDETestCaseRuntime> getDETestCaseRuntimes();

	/**
	 * 填充数据对象的代码表文本
	 * 
	 * @param iEntity
	 */
	void fillEntityCodeListTexts(IEntity iEntity);

	/**
	 * 填充数据对象的代码表文本
	 * 
	 * @param iEntity
	 * @param strSuffix
	 *            后缀
	 */
	void fillEntityCodeListTexts(IEntity iEntity, String strSuffix);

	/**
	 * 建立数据
	 * 
	 * @param iEntityDTO
	 * @throws Throwable
	 */
	void create(IEntityDTO iEntityDTO) throws Throwable;

	/**
	 * 更新数据
	 * 
	 * @param iEntityDTO
	 * @throws Throwable
	 */
	void update(IEntityDTO iEntityDTO) throws Throwable;

	/**
	 * 系统更新数据
	 * 
	 * @param iEntityDTO
	 * @throws Throwable
	 */
	void sysUpdate(IEntityDTO iEntityDTO) throws Throwable;

	/**
	 * 系统更新数据
	 * 
	 * @param iEntityDTO
	 * @param bUpdateOnly
	 *            仅更新
	 * @throws Throwable
	 */
	void sysUpdate(IEntityDTO iEntityDTO, boolean bUpdateOnly) throws Throwable;

	/**
	 * 系统更新数据
	 * 
	 * @param entityDTOs
	 * @param bUpdateOnly
	 *            仅更新
	 * @throws Throwable
	 */
	void sysUpdate(IEntityDTO[] entityDTOs, boolean bUpdateOnly) throws Throwable;

	/**
	 * 获取数据
	 * 
	 * @param objKey
	 * @throws Throwable
	 */
	IEntityDTO get(Object objKey) throws Throwable;

	/**
	 * 保存
	 * 
	 * @param iEntityDTO
	 * @throws Throwable
	 */
	default void save(IEntityDTO iEntityDTO) throws Throwable {
		this.executeAction(DEActions.SAVE, null, new Object[] { iEntityDTO });
	}

	/**
	 * 保存
	 * 
	 * @param iEntityDTO
	 * @param 是否返回
	 * @throws Throwable
	 */
	default void save(IEntityDTO iEntityDTO, boolean bGet) throws Throwable {
		this.executeAction(DEActions.SAVE, null, new Object[] { iEntityDTO, bGet});
	}
	
	/**
	 * 获取草稿
	 * 
	 * @param iEntityDTO
	 * @return
	 * @throws Throwable
	 */
	default IEntityDTO getDraft(IEntityDTO iEntityDTO) throws Throwable {
		return (IEntityDTO) this.executeAction(DEActions.GETDRAFT, null, new Object[] { iEntityDTO });
	}

	/**
	 * 移除无效的用户输入
	 * 
	 * @param iPSDEAction
	 * @param iEntityDTO
	 */
	void removeInvalidUserInput(IPSDEAction iPSDEAction, IEntityDTO iEntityDTO);

	/**
	 * 导入数据2
	 * 
	 * @param strImportTag
	 *            导入标记
	 * @param baseEntity
	 * @param inputStream
	 *            数据流
	 * @param bTestPriv
	 *            是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey
	 * @return 错误信息
	 * @throws Throwable
	 */
	ImportDataResult importData2(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;

	/**
	 * 通过代码名称获取实体行为
	 * 
	 * @param actionCodeName
	 * @param bTryMode
	 * @return
	 */
	IPSDEAction getPSDEActionByCodeName(String actionCodeName, boolean bTryMode);

	/**
	 * 通过代码名称获取数据集
	 * 
	 * @param dataSetCodeName
	 * @param bTryMode
	 * @return
	 */
	IPSDEDataSet getPSDEDataSetByCodeName(String dataSetCodeName, boolean bTryMode);

	/**
	 * 通过代码名称获取属性
	 * 
	 * @param fieldCodeName
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEFieldByCodeName(String fieldCodeName, boolean bTryMode);

	/**
	 * 搜索数据查询
	 * 
	 * @param iPSDEDataQuery
	 * @param iSearchContextDTO
	 * @return
	 */
	Page<? extends IEntityDTO> searchDataQuery(IPSDEDataQuery iPSDEDataQuery, ISearchContextDTO iSearchContextDTO);

	/**
	 * 注册实体行为附加逻辑运行时插件
	 * 
	 * @param strAction
	 * @param iDEActionLogicRuntime
	 */
	void registerDEActionLogicRuntime(String strAction, IDEActionLogicRuntime iDEActionLogicRuntime);

	/**
	 * 注销实体行为附加逻辑插件
	 * 
	 * @param strAction
	 * @param iDEActionLogicRuntime
	 * @return
	 */
	boolean unregisterDEActionLogicRuntime(String strAction, IDEActionLogicRuntime iDEActionLogicRuntime);

	/**
	 * 注册实体行为附加逻辑插件
	 * 
	 * @param strAction
	 * @param iDEActionLogicRuntimeBase
	 */
	void registerDEActionLogicRuntimeBase(String strAction, IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase);

	/**
	 * 注销实体行为附加逻辑插件
	 * 
	 * @param strAction
	 * @param iDEActionLogicRuntimeBase
	 * @return
	 */
	boolean unregisterDEActionLogicRuntimeBase(String strAction, IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase);

	/**
	 * 注册实体数据集附加逻辑运行时插件
	 * 
	 * @param strDataSet
	 * @param iDEDataSetLogicRuntimeBase
	 */
	void registerDEDataSetLogicRuntimeBase(String strDataSet, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase);

	/**
	 * 注销实体数据集附加逻辑运行时插件
	 * 
	 * @param strDataSet
	 * @param iDEDataSetLogicRuntimeBase
	 * @return
	 */
	boolean unregisterDEDataSetLogicRuntimeBase(String strDataSet, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase);

	/**
	 * 注册实体数据同步输出运行时插件
	 * 
	 * @param iDEDataSyncOutRuntimeBase
	 */
	void registerDEDataSyncOutRuntimeBase(IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntimeBase);

	/**
	 * 注销实体数据同步输出运行时插件
	 * 
	 * @param iDEDataSyncOutRuntimeBase
	 * @return
	 */
	boolean unregisterDEDataSyncOutRuntimeBase(IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntimeBase);

	/**
	 * 注册实体统一状态运行时插件
	 * 
	 * @param iDEUniStateRuntimeBase
	 */
	void registerDEUniStateRuntimeBase(IDEUniStateRuntimeBase iDEUniStateRuntimeBase);

	/**
	 * 注销实体统一状态运行时插件
	 * 
	 * @param iDEUniStateRuntimeBase
	 * @return
	 */
	boolean unregisterDEUniStateRuntimeBase(IDEUniStateRuntimeBase iDEUniStateRuntimeBase);

	/**
	 * 填充DTO对象嵌套属性
	 * 
	 * @param page
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	void fillEntityDTOPageNestedFields(Page<? extends IEntityDTO> page, IPSDEDataSet iPSDEDataSet) throws Throwable;

	/**
	 * 填充DTO对象嵌套属性
	 * 
	 * @param list
	 * @param iPSDEFGroup
	 * @throws Throwable
	 */
	void fillEntityDTONestedFields(List<? extends IEntityDTO> list, IPSDEFGroup iPSDEFGroup) throws Throwable;

	/**
	 * 填充DTO对象嵌套属性
	 * 
	 * @param list
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	void fillEntityDTONestedFields(List<? extends IEntityDTO> list, IPSDEDataSet iPSDEDataSet) throws Throwable;

	/**
	 * 获取实体自填运行时对象（后续使用 getDEAutoCompleteRuntimeBase 替换）
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	@Deprecated
	IDEAutoCompleteRuntime getDEAutoCompleteRuntime(String strCodeName, boolean bTryMode);

	/**
	 * 获取实体数据流运行时对象
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	IDEDataFlowRuntime getDEDataFlowRuntime(String strCodeName, boolean bTryMode);

	/**
	 * 输出报表
	 * 
	 * @param strReportId
	 * @param outputStream
	 * @param iSearchContext
	 * @param strType
	 * @param bTestPriv
	 *            测试权限
	 * @throws Exception
	 */
	void outputReport(String strReportId, ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable;

	/**
	 * 输出打印
	 * 
	 * @param strPrintId
	 * @param outputStream
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 *            测试权限
	 * @throws Exception
	 */
	void outputPrint(String strPrintId, ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable;

	/**
	 * 获取传入数据的实体主状态运行时对象
	 * 
	 * @param iEntity
	 * @param bTryMode
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity, boolean bTryMode);

	/**
	 * 填充传入数据对象的数据访问操作
	 * 
	 * @param iEntityDTO
	 * @param map
	 * 
	 */
	void fillDataAccessActions(IEntityDTO iEntityDTO, Map<String, Object> map);

	/**
	 * 填充传入数据对象的数据访问操作
	 * 
	 * @param iEntityDTO
	 * @param map
	 * @param bIncludeMasterDE
	 *            包含控制实体
	 * @param bDEOPPrivLogicOnly
	 *            仅判断实体标识逻辑
	 * 
	 */
	void fillDataAccessActions(IEntityDTO iEntityDTO, Map<String, Object> map, boolean bIncludeMasterDE, boolean bDEOPPrivLogicOnly);

	/**
	 * 判断数据访问标识
	 * 
	 * @param iEntityDTO
	 * @param strDataAccessAction
	 * @return
	 * @throws Exception
	 */
	Object testDataAccessAction(IEntityDTO iEntityDTO, String strDataAccessAction);

	/**
	 * 获取指定属性组模型对象运行时对象
	 * 
	 * @param iPSDEFGroup
	 * @param bTryMode
	 * @return
	 */
	IDEFGroupRuntime getDEFGroupRuntime(IPSDEFGroup iPSDEFGroup, boolean bTryMode);

	/**
	 * 获取实体是否支持数据版本控制
	 * 
	 * @return
	 */
	boolean isEnableVersionControl();

	/**
	 * 获取实体数据版本控制功能运行时对象
	 * 
	 * @return
	 */
	IDEVersionControlUtilRuntime getDEVersionControlUtilRuntime();

	/**
	 * 获取实体是否支持数据版本存储
	 * 
	 * @return
	 */
	boolean isEnableVersionStorage();

	/**
	 * 获取实体数据版本存储功能运行时对象
	 * 
	 * @return
	 */
	IDEVersionStorageUtilRuntime getDEVersionStorageUtilRuntime();

	/**
	 * 是否支持动态存储
	 * 
	 * @return
	 */
	boolean isEnableDynaStorage();

	/**
	 * 获取动态存储功能运行时组件
	 * 
	 * @return
	 */
	IDEDynaStorageUtilRuntime getDEDynaStorageUtilRuntime();

	/**
	 * 获取实体全文检索运行时对象集合
	 * 
	 * @return
	 */
	java.util.List<IDESearchRuntime> getDESearchRuntimes();

	/**
	 * 获取传入条件使用的搜索模式
	 * 
	 * @param iSearchFieldCond
	 * @param bTryMode
	 * @return
	 */
	IPSDEFSearchMode getPSDEFSearchMode(ISearchFieldCond iSearchFieldCond, boolean bTryMode);

	/**
	 * 实体执行行为
	 * 
	 * @param iAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args) throws Throwable;

	/**
	 * 实体执行行为
	 * 
	 * @param iAction
	 * @param args
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, int nPropagation) throws Throwable;

	/**
	 * 实体执行行为
	 * 
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param strSessionId
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, int nPropagation) throws Throwable;

	/**
	 * 实体执行行为
	 * 
	 * @param iAction
	 * @param args
	 * @param strInterProcessLock
	 * @param strSessionId
	 * @param time
	 * @param unit
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, long time, TimeUnit unit, int nPropagation) throws Throwable;

	/**
	 * 获取传入分页对象的EntityDTO分页对象
	 * 
	 * @param page
	 * @param iPSDEDataSet
	 * @param pagable
	 * @return
	 * @throws Throwable
	 */
	Page<IEntityDTO> getEntityDTOPage(Page<?> page, IPSDEDataSet iPSDEDataSet, Pageable pagable) throws Throwable;

	/**
	 * 获取传入列表的EntityDTO列表
	 * 
	 * @param list
	 * @param iPSDEDataSet
	 * @return
	 * @throws Throwable
	 */
	List<IEntityDTO> getEntityDTOList(List<?> list, IPSDEDataSet iPSDEDataSet) throws Throwable;

	/**
	 * 获取传入分页对象的EntityDTO分页对象
	 * 
	 * @param page
	 * @param iPSDEDataQuery
	 * @param pagable
	 * @return
	 * @throws Throwable
	 */
	Page<IEntityDTO> getEntityDTOPage(Page<?> page, IPSDEDataQuery iPSDEDataQuery, Pageable pagable) throws Throwable;

	/**
	 * 获取传入列表的EntityDTO列表
	 * 
	 * @param list
	 * @param iPSDEDataQuery
	 * @return
	 * @throws Throwable
	 */
	List<IEntityDTO> getEntityDTOList(List<?> list, IPSDEDataQuery iPSDEDataQuery) throws Throwable;

	/**
	 * 是否启用实体映射
	 * 
	 * @return
	 */
	boolean isEnableDEMapping();

	/**
	 * 获取实体是否支持通知设置
	 * 
	 * @return
	 */
	boolean isEnableNotifySetting();

	/**
	 * 获取实体通知设置功能运行时对象
	 * 
	 * @return
	 */
	IDENotifySettingUtilRuntime getDENotifySettingUtilRuntime();

	/**
	 * 获取默认的实体统一状态运行时对象
	 * 
	 * @param bTryMode
	 * @return
	 */
	ISysDEUniStateRuntime getDefaultSysDEUniStateRuntime(boolean bTryMode);

	/**
	 * 获取默认的实体统一状态运行时对象
	 * 
	 * @return
	 */
	ISysDEUniStateRuntime getDefaultSysDEUniStateRuntime();

	/**
	 * 获取指定实体统一状态运行时对象
	 * 
	 * @param iPSSysDEUniState
	 * @return
	 */
	ISysDEUniStateRuntime getSysDEUniStateRuntime(IPSDEUniState iPSDEUniState);

	/**
	 * 获取实体统一状态运行时对象集合
	 * 
	 * @return
	 */
	java.util.List<ISysDEUniStateRuntime> getSysDEUniStateRuntimes();

	/**
	 * 存在数据
	 * 
	 * @param iPSDEDataSet
	 * @param iSearchContextDTO
	 * @return
	 */
	boolean existsData(IPSDEDataSet iPSDEDataSet, ISearchContextDTO iSearchContextDTO);

	/**
	 * 提交流程
	 * 
	 * @param iEntityDTO
	 * @param iPSDEWF
	 *            定实体工作流
	 * @param strWFAction
	 * @param params
	 * @throws Throwable
	 */
	Object wfSubmit(Object keyOrEntity, IPSDEWF iPSDEWF, String strWFAction, Map<String, Object> params) throws Throwable;

	/**
	 * 执行逻辑
	 * 
	 * @param strLogicTag
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeLogic(String strLogicTag, Object[] args) throws Throwable;

	/**
	 * 执行逻辑
	 * 
	 * @param iPSDELogic
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeLogic(IPSDELogic iPSDELogic, Object[] args) throws Throwable;

	/**
	 * 执行逻辑
	 * 
	 * @param iDELogicRuntime
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeLogic(IDELogicRuntime iDELogicRuntime, Object[] args) throws Throwable;

	/**
	 * 填充数据对象默认值
	 * 
	 * @param arg0
	 */
	void fillEntityDefaultValues(IEntity arg0);

	/**
	 * 填充数据对象默认值
	 * 
	 * @param arg0
	 * @param strActionName
	 */
	void fillEntityDefaultValues(IEntity arg0, String strActionName);

	/**
	 * 获取排序初始化值
	 * 
	 * @param 默认值
	 * @return
	 */
	int getOrderInitialValue(int nDefaultVale);

	/**
	 * 获取排序步进值
	 * 
	 * @return
	 */
	int getOrderStepValue(int nDefaultVale);

	/**
	 * 是否支持实体操作标识逻辑
	 * 
	 * @param bIncludeMasterDE
	 *            包含控制实体
	 * @return
	 */
	boolean isEnableDEOPPrivLogic(boolean bIncludeMasterDE);

	/**
	 * 引用EntityDTO需要引用检查的数据
	 * 
	 * @param map
	 * @param iEntityDTO
	 * @return
	 */
	Map<String, Set<Object>> fillEntityDTORefCheckData(Map<String, Set<Object>> map, IEntityDTO iEntityDTO);

	/**
	 * 获取实体逻辑运行时对象
	 * 
	 * @param strId
	 * @return
	 */
	net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(String strId);

	/**
	 * 获取实体逻辑运行时对象
	 * 
	 * @param strId
	 * @param bTryMode
	 * @return
	 */
	net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(String strId, boolean bTryMode);

	/**
	 * 获取实体逻辑运行时对象
	 * 
	 * @param iPSDELogic
	 * @return
	 */
	net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic);

	/**
	 * 检查传入属性值规则
	 * 
	 * @param objValue
	 * @param arg0
	 * @param iPSDEFValueRule
	 * @param entityError
	 * @return
	 */
	boolean checkFieldValueRule(Object objValue, IEntityDTO arg0, IPSDEFValueRule iPSDEFValueRule, EntityError entityError);

	/**
	 * 检查传入属性值规则
	 * 
	 * @param objValue
	 * @param arg0
	 * @param iPSDEFValueRule
	 * @param iPSDEField
	 * @param entityError
	 * @return
	 */
	boolean checkFieldValueRule(Object objValue, IEntityDTO arg0, IPSDEFValueRule iPSDEFValueRule, IPSDEField iPSDEField, EntityError entityError);

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.runtime.dataentity.IDataEntityRuntime#getLastEntity()
	 */
	IEntityDTO getLastEntity();
	
	
	/**
	 * 获取上一次的数据，必须存在
	 * @return
	 */
	IEntityDTO getLastEntityMust();
	

	/**
	 * 通过指定关系查询数据
	 * 
	 * @param iPSDER1NBase
	 * @param pickupValue
	 * @return
	 */
	List<IEntityDTO> selectByDER1N(IPSDER1NBase iPSDER1NBase, Object pickupValue);

	/**
	 * 通过指定关系查询数据
	 * 
	 * @param iPSDER1NBase
	 * @param pickupValue
	 * @param iSearchContextDTO
	 * @return
	 */
	List<IEntityDTO> selectByDER1N(IPSDER1NBase iPSDER1NBase, Object pickupValue, ISearchContextDTO iSearchContextDTO);

	
	
	/**
	 * 查询满足传入数据属性条件的数据对象
	 * 
	 * @param iEntityDTO
	 * @return
	 */
	boolean select(IEntityDTO iEntityDTO, boolean bTryMode);
	
	
	
	/**
	 * 直接查询满足传入数据属性条件的数据对象
	 * 
	 * @param iEntityDTO
	 * @return
	 */
	boolean rawSelect(IEntityDTO iEntityDTO, boolean bTryMode);
	
	
	
	/**
	 * 存在指定数据
	 * @param iEntityDTO
	 * @return
	 */
	boolean existsData(IEntityDTO iEntityDTO);
	
	
	/**
	 * 建立数据
	 * @param iEntityDTO
	 * @param bGet 返回建立后的数据
	 * @throws Throwable
	 */
	void create(IEntityDTO iEntityDTO, boolean bGet) throws Throwable;
	
	
	
	/**
	 * 更新数据
	 * @param iEntityBase
	 * @param bGet 返回更新后的数据
	 * @throws Throwable
	 */
	void update(IEntityDTO iEntityDTO, boolean bGet) throws Throwable;
	
	
	/**
	 * 注册实体自填运行时基对象
	 * @param strACTag
	 * @param iDEAutoCompleteRuntime
	 */
	void registerDEAutoCompleteRuntimeBase(String strACTag, IDEAutoCompleteRuntimeBase iDEAutoCompleteRuntimeBase);
		
	/**
	 * 注销实体自填运行时基对象
	 * @param strACTag
	 * @param iDEAutoCompleteRuntimeBase
	 * @return
	 */
	boolean unregisterDEAutoCompleteRuntimeBase(String strACTag, IDEAutoCompleteRuntimeBase iDEAutoCompleteRuntimeBase);
	
	
	
	/**
	 * 获取实体自填运行时基对象
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	IDEAutoCompleteRuntimeBase getDEAutoCompleteRuntimeBase(String strCodeName, boolean bTryMode);
	
	
	/**
	 * 注册实体属性值运行时插件
	 * 
	 * @param strDEFieldName
	 * @param iDEFValueRuleRuntimeBase
	 */
	void registerDEFValueRuleRuntimeBase(String strDEFieldName, IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase);

	/**
	 * 注销实体属性值运行时插件
	 * 
	 * @param strDEFieldName
	 * @param iDEFValueRuleRuntimeBase
	 * @return
	 */
	boolean unregisterDEFValueRuleRuntimeBase(String strDEFieldName, IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase);
	
	
	
	/**
	 * 注册实体继承逻辑插件
	 * 
	 * @param iDataEntityInheritLogic
	 */
	void registerDataEntityInheritLogic(IDataEntityInheritLogic iDataEntityInheritLogic);

	/**
	 * 注销实体继承逻辑插件
	 * 
	 * @param iDataEntityInheritLogic
	 * @return
	 */
	boolean unregisterDataEntityInheritLogic(IDataEntityInheritLogic iDataEntityInheritLogic);
	
	
	/**
	 * 获取实体继承逻辑集合
	 * @return
	 */
	List<IDataEntityInheritLogic> getDataEntityInheritLogics();
	
	/**
	 * 注册实体扩展逻辑插件
	 * 
	 * @param iDataEntityExtendLogic
	 */
	void registerDataEntityExtendLogic(IDataEntityExtendLogic iDataEntityExtendLogic);

	/**
	 * 注销实体扩展逻辑插件
	 * 
	 * @param iDataEntityExtendLogic
	 * @return
	 */
	boolean unregisterDataEntityExtendLogic(IDataEntityExtendLogic iDataEntityExtendLogic);
	
	/**
	 * 获取实体扩展逻辑集合
	 * @return
	 */
	List<IDataEntityExtendLogic> getDataEntityExtendLogics();
	
	
	/**
	 * 获取传入键值的上级数据集合
	 * @param key
	 * @param recursive
	 * @return
	 */
	//List<Object> getAncestorIds​​(Object key, boolean recursive);
	List<Object> getAncestorIds(Object key, boolean recursive);
	
	/**
	 * 获取传入键值的下级数据集合
	 * @param key
	 * @param recursive
	 * @return
	 */
	java.util.List<Object> getDescendantIds(Object key, boolean recursive);
	
	
	
	/**
	 * 注册实体关系运行时插件
	 * 
	 * @param iDERRuntimeBase
	 */
	void registerDERRuntimeBase(IDERRuntimeBase iDERRuntimeBase);

	/**
	 * 注销实体关系运行时插件
	 * 
	 * @param iDERRuntimeBase
	 * @return
	 */
	boolean unregisterDERRuntimeBase(IDERRuntimeBase iDERRuntimeBase);
	
	
	
	/**
	 * 获取动态存储的实体属性集合
	 * @return
	 */
	List<IPSDEField> getDynaStoragePSDEFields();
	
	
	/**
	 * 获取动态存储的实体属性集合
	 * 
	 * @param bExtension
	 * @return
	 */
	List<IPSDEField> getDynaStoragePSDEFields(boolean bExtension);

	
}	

