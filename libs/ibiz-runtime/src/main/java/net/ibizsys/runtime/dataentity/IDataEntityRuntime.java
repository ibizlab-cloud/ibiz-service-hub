package net.ibizsys.runtime.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Sort;

import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERInherit;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainState;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.IModelRuntimeSetting;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.dataentity.util.IDEFileUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptSearchContext;

/**
 * 实体模型对象接口
 * @author lionlau
 *
 */
public interface IDataEntityRuntime extends IDataEntityRuntimeBase,IDataEntityUtilRuntime {

	/**
	 * 数据源标记前置：关系数据库
	 */
	public static final String DATASOURCETAGPREFIX_DB = "DB:";
	
	/**
	 * 数据源标记前置：大数据库
	 */
	public static final String DATASOURCETAGPREFIX_BD = "BD:";
	
	
	/**
	 * 数据集标记，排序范围
	 */
	public static final String DATASETTAG_ORDER_SCOPE = "ORDER_SCOPE";
	

	/**
	 * 获取实体的存储模式
	 * @return
	 */
	int getStorageMode();
	
	/**
	 * 获取实体的SaaS模式
	 * @return
	 */
	int getSaaSMode();
	
	
	/**
	 * 获取系统模型对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 获取动态实例模式
	 * @return
	 */
	int getDynaInstMode();
	
	
	
	/**
	 * 获取动态实例标记
	 * @return
	 */
	String getDynaInstTag();
	
	/**
	 * 获取主键属性
	 * @return
	 */
	IPSDEField getKeyPSDEField();
	
	
	/**
	 * 获取主信息属性
	 * @return
	 */
	IPSDEField getMajorPSDEField();
	
	
	
	/**
	 * 获取键名属性
	 * @return
	 */
	IPSDEField getKeyNamePSDEField();
	
	
	/**
	 * 获取机构属性
	 * @return
	 */
	IPSDEField getOrgIdPSDEField();
	
	
	/**
	 * 获取部门属性
	 * @return
	 */
	IPSDEField getDeptIdPSDEField();
	
//	/**
//	 * 获取组织业务条线属性
//	 * @return
//	 */
//	IPSDEField getBCPSDEField();
	
	
	/**
	 * 获取数据属性
	 * @return
	 */
	IPSDEField getDataTypePSDEField();
	
	

	/**
	 * 获取统一标记属性
	 * @return
	 */
	IPSDEField getUniTagPSDEField();
	
	
	/**
	 * 获取递归父值路径存储属性
	 * @return
	 */
	IPSDEField getParentIdPathPSDEField();
	
	/**
	 * 获取递归父名称路径存储属性
	 * @return
	 */
	IPSDEField getParentNamePathPSDEField();
	
	
	/**
	 * 获取指定数据的相关主状态
	 * @param objKeyOrEntity
	 * @return
	 * @throws Exception
	 */
	IPSDEMainState getPSDEMainState(Object objKeyOrEntity) throws Exception;
	
	
	
	
	/**
	 * 建立实体服务相应的数据对象
	 * @return
	 */
	IEntityBase createEntity();
	
	
	
	
	/**
	 * 建立实体服务相应的数据对象列表
	 * @return
	 */
	List<? extends IEntityBase> createEntityList();
	
	
	
	/**
	 * 将数据反序列化到对象
	 * @param objData
	 * @return
	 */
	IEntityBase deserializeEntity(Object objData); 
	
	
	/**
	 * 将数据反序列化到对象集合
	 * @param objData
	 * @return
	 */
	IEntityBase[] deserializeEntities(Object objData); 
	
	
	/**
	 * 将序列化对象到数据
	 * @param iEntityBase
	 * @return
	 */
	Object serializeEntity(IEntityBase iEntityBase); 
	
	
	/**
	 * 将对象集合序列化到数据
	 * @param list
	 * @return
	 */
	Object serializeEntities(IEntityBase[] list); 
	
	
	
	/**
	 * 执行实体行为
	 * @param strActionName 行为名称
	 * @param iPSDEAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable;
	
	
	
	
	/**
	 * 查询实体数据集
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable;
	
	/**
	 * 获取指定属性的值
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	Object getFieldValue(IEntityBase iEntityBase, IPSDEField iPSDEField);
	
	
	
	
	
	/**
	 * 设置指定属性的值
	 * @param objEntity
	 * @param iPSDEField
	 * @param objValue
	 */
	void setFieldValue(IEntityBase iEntityBase, IPSDEField iPSDEField, Object objValue);
	
	/**
	 * 判断是否包括指定属性值
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	boolean containsFieldValue(IEntityBase iEntityBase, IPSDEField iPSDEField);
	
	
	/**
	 * 重置指定属性值
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	void resetFieldValue(IEntityBase iEntityBase, IPSDEField iPSDEField);
	
	
	/**
	 * 获取指定属性的值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	Object getFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	/**
	 * 设置指定属性的值
	 * @param objEntity
	 * @param strFieldName
	 * @param objValue
	 */
	void setFieldValue(IEntityBase iEntityBase, String strFieldName, Object objValue);
	
	
	
	/**
	 * 判断是否包括指定属性值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	boolean containsFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	/**
	 * 重置指定属性值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	void resetFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	
	/**
	 * 获取指定主键属性的值
	 * @param objEntity
	 * @return
	 */
	Object getKeyFieldValue(IEntityBase iEntityBase);
	
	
	
	/**
	 * 检查指定键值的状态，返回值参考 net.ibizsys.runtime.dataentity.CheckKeyStates
	 * @param objKey
	 * @return
	 */
	int checkKeyState(Object objKey);
	
	
	
	/**
	 * 计算实体的统一标记值
	 * @param iEntityBase
	 * @param unionKeyValuePSDEFieldList
	 * @return
	 */
	String getUniTagValue(IEntityBase iEntityBase, List<IPSDEField> unionKeyValuePSDEFieldList);
	
	
	
	/**
	 * 填充数据对象键值
	 * @param iEntityBase
	 */
	boolean fillEntityKeyValue(IEntityBase iEntityBase);
	
	
	
	
	/**
	 * 获取当前数据的动态实例标识，未定义时使用用户的动态实例标识
	 * @param iEntityBase
	 * @return
	 */
	String getDynaInstId(Object iEntityBase);
	
	
	
	/**
	 * 是否包含指定引用外键数据
	 * @param iPSDEField
	 * @param objKey
	 * @param iPSDERBase
	 * @return
	 */
	boolean containsForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase);
	
	
	
	/**
	 * 重置引用指定外键数据的数据
	 * @param iPSDEField
	 * @param objKey
	 * @param iPSDERBase
	 * @return
	 */
	void resetByForeignKey(IPSDEField iPSDEField, Object objKey,IPSDERBase iPSDERBase);
	
	
	
	
	/**
	 * 删除引用指定外键数据的数据
	 * @param iPSDEField
	 * @param objKey
	 * @param iPSDERBase
	 * @return
	 */
	void removeByForeignKey(IPSDEField iPSDEField, Object objKey,IPSDERBase iPSDERBase);
	
	
	
	/**
	 * 建立搜索上下文对象
	 * @return
	 */
	ISearchContextBase createSearchContext();
	
	
	/**
	 * 设置查询条件
	 * @param searchContext
	 * @param iPSDEField
	 * @param strCondition
	 * @param objValue
	 */
	void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition, Object objValue);
	
	
	/**
	 * 设置查询条件
	 * @param searchContext
	 * @param iPSDEField
	 * @param iPSDEFSearchMode
	 * @param objValue
	 */
	void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode, Object objValue);
	
	
	
	/**
	 * 获取查询条件
	 * @param iSearchContextBase
	 * @param iPSDEField
	 * @param strCondition
	 * @return
	 */
	Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition);
	
	
	/**
	 * 获取查询条件
	 * @param iSearchContextBase
	 * @param iPSDEField
	 * @param iPSDEFSearchMode
	 * @return
	 */
	Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode);
	
	
	/**
	 * 设置查询自定义条件
	 * @param searchContext
	 * @param strCustomCondition
	 * @param objValue
	 */
	void setSearchCustomCondition(ISearchContextBase iSearchContextBase, String strCustomCondition);
	
	
	/**
	 * 设置查询分页信息
	 * @param searchContext
	 * @param nPageIndex 起始页号，从 1  开始
	 * @param nPageSize 每页数量
	 * @param sort 排序信息
	 */
	void setSearchPaging(ISearchContextBase iSearchContextBase, int nPageIndex, int nPageSize, Sort sort);
	
	
	/**
	 * 设置查询的数据上下文
	 * @param searchContext
	 * @param strParam
	 * @param objValue
	 */
	void setSearchDataContext(ISearchContextBase iSearchContextBase, String strParam, Object objValue);


	/**
	 * 获取查询的数据上下文
	 * @param iSearchContextBase
	 * @param strParam
	 * @return
	 */
	Object getSearchDataContext(ISearchContextBase iSearchContextBase, String strParam);
	
	
	
	/**
	 * 设置查询的模式
	 * @param iSearchContextBase
	 * @param bData
	 * @param bCount
	 */
	void setSearchMode(ISearchContextBase iSearchContextBase, boolean bData, boolean bCount);
	
	
	/**
	 * 重置指定搜索条件
	 * @param iSearchContextBase
	 * @param iPSDEField
	 * @param iPSDEFSearchMode
	 */
	void resetSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode);
	
	
	
	
	/**
	 * 获取指定搜索模式
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEFSearchMode getPSDEFSearchMode(String strName, boolean bTryMode);
	
	
	/**
	 * 判断是否存在复合条件的数据
	 * @param iSearchContextBase
	 * @return
	 */
	boolean existsData(ISearchContextBase iSearchContextBase);
	
	
	/**
	 * 搜索指定数据集
	 * @param iPSDEDataSet
	 * @param iSearchContextBase
	 * @return
	 */
	org.springframework.data.domain.Page<? extends IEntityBase> searchDataSet(IPSDEDataSet iPSDEDataSet, ISearchContextBase iSearchContextBase); 
	
	
	
	/**
	 * 搜索指定数据查询
	 * @param iPSDataQuery
	 * @param iSearchContextBase
	 * @return
	 */
	List<? extends IEntityBase> selectDataQuery(IPSDEDataQuery iPSDataQuery, ISearchContextBase iSearchContextBase); 
	
	
	/**
	 * 查询满足条件的一行数据
	 * @param iSearchContextBase
	 * @return
	 */
	IEntityBase selectOne(ISearchContextBase iSearchContextBase);
	
	
	
	/**
	 * 查询满足条件的数据
	 * @param iSearchContextBase
	 * @return
	 */
	List<? extends IEntityBase> select(ISearchContextBase iSearchContextBase);
	
	
	/**
	 * 查询满足条件的一行数据
	 * @param strCondition
	 * @return
	 */
	IEntityBase selectOne(String strCondition);
	
	
	
	/**
	 * 查询满足条件的数据
	 * @param strCondition
	 * @return
	 */
	List<? extends IEntityBase> select(String strCondition);
	
	
	/**
	 * 建立实体数据对象的脚本对象
	 * @param iEntityBase 代理数据对象
	 * @return
	 */
	IScriptEntity createScriptEntity(IEntityBase iEntityBase);
	
	
		
	/**
	 * 建立实体过滤器对象的脚本对象
	 * @param iSearchContextBase 代理过滤器对象
	 * @return
	 */
	IScriptSearchContext createScriptSearchContext(ISearchContextBase iSearchContextBase);
	
	
	
	
	/**
	 * 获取指定嵌套关系的值
	 * @param iEntityBase
	 * @param iPSDERBase
	 * @return
	 */
	IEntityBase[] getNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase);
	
	
	
	/**
	 * 设置指定嵌套关系的值
	 * @param objEntity
	 * @param iPSDEField
	 * @param objValue
	 */
	void setNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase, IEntityBase[] value);
	
	
	/**
	 * 判断是否包括指定嵌套关系值
	 * @param objEntity
	 * @param iPSDERBase
	 * @return
	 */
	boolean containsNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase);
	
	
	/**
	 * 重置指定嵌套关系值
	 * @param objEntity
	 * @param iPSDERBase
	 * @return
	 */
	void resetNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase);
	
	

	/**
	 * 获取指定标记的实体功能运行时对象
	 * @param strTag
	 * @return
	 */
	IDEUtilRuntime getDEUtilRuntime(String strTag) ;
	
	
	/**
	 * 获取指定类型实体功能运行时对象
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	<T> T getDEUtilRuntime(Class<T> cls, boolean bTryMode) ;
	
	
	
	
	/**
	 * 获取实体数据访问审计模式
	 * @return
	 */
	int getDataAuditMode();
	
	
	
	/**
	 *  获取实体数据访问控制方式
	 * @return
	 */
	int getDataAccCtrlMode();
	
	
	/**
	 * 建立数据
	 * @param iEntityBase
	 * @throws Throwable
	 */
	void create(IEntityBase iEntityBase) throws Throwable;
	
	
	
	/**
	 * 更新数据
	 * @param iEntityBase
	 * @throws Throwable
	 */
	void update(IEntityBase iEntityBase) throws Throwable;
	
	
	
	/**
	 * 系统更新数据
	 * @param iEntityBase
	 * @throws Throwable
	 */
	void sysUpdate(IEntityBase iEntityBase) throws Throwable;
	
	
	
	/**
	 * 系统更新数据
	 * @param iEntityBase
	 * @param bUpdateOnly 仅更新
	 * @throws Throwable
	 */
	void sysUpdate(IEntityBase iEntityBase, boolean bUpdateOnly) throws Throwable;
	
	
	
	/**
	 * 系统更新数据
	 * @param entityBases
	 * @param bUpdateOnly 仅更新
	 * @throws Throwable
	 */
	void sysUpdate(IEntityBase[] entityBases, boolean bUpdateOnly) throws Throwable;
	
	
	/**
	 * 获取数据
	 * @param objKey
	 * @throws Throwable
	 */
	IEntityBase get(Object objKey) throws Throwable;
	
	
	
	/**
	 * 删除数据
	 * @param objKey
	 * @throws Throwable
	 */
	void remove(Object objKey) throws Throwable;
	
	

	
	
	/**
	 * 克隆传入的对象
	 * @param iEntityBase
	 * @param bResetUncopyValues 是否重置不允许拷贝的数据
	 * @return
	 * @throws Throwable
	 */
	IEntityBase clone(IEntityBase iEntityBase, boolean bResetUncopyValues) throws Throwable;
	
	
	
	/**
	 * 获取最后一次的数据对象
	 * @return
	 */
	IEntityBase getLastEntity();
	
	
	/**
	 * 获取属性的查询表达式
	 * @param strFieldName
	 * @return
	 */
	String getFieldQueryExp(String strFieldName);
	
	
	
	/**
	 * 获取属性的查询表达式
	 * @param iPSDEField
	 * @return
	 */
	String getFieldQueryExp(IPSDEField iPSDEField);
	
	
	/**
	 * 是否启用工作流
	 * @return
	 */
	boolean isEnableWF();
	
	
	
	/**
	 * 判断数据是否在流程中
	 * @param iEntityBase
	 * @return
	 */
	boolean testDataInWF(IEntityBase iEntityBase);
	
	
	
	/**
	 * 输出报表
	 * @param strReportId
	 * @param outputStream
	 * @param iSearchContextBase
	 * @param strType
	 * @param bTestPriv 测试权限
	 * @throws Exception
	 */
	void outputReport(String strReportId, OutputStream outputStream, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable;
	
	
	
	
	/**
	 * 输出打印
	 * @param strPrintId
	 * @param outputStream
	 * @param keys
	 * @param strType
	 * @param bTestPriv 测试权限
	 * @throws Exception
	 */
	void outputPrint(String strPrintId, OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable;
	
	
	
//	/**
//	 * 测试数据访问行为
//	 * @param iEntityBase
//	 * @param strDataAccessAction
//	 * @return
//	 */
//	boolean testDataAccessAction(IEntityBase iEntityBase, String strDataAccessAction) throws Exception;
	
	
	/**
	 * 判断数据访问标识
	 * @param objKeyOrEntity
	 * @param strDataAccessAction
	 * @return
	 */
	boolean testDataAccessAction(Object objKeyOrEntity, String strDataAccessAction) throws Exception;
	
	
	/**
	 * 获取递归关系
	 * @return
	 */
	IPSDER1N getRecursivePSDER1N();
	
	
	
	/**
	 * 获取简单数据查询对象
	 * @return
	 */
	IPSDEDataQuery getSimplePSDEDataQuery();
	
	
	
	/**
	 * 获取默认数据查询对象
	 * @return
	 */
	IPSDEDataQuery getDefaultPSDEDataQuery();
	
	
	
	/**
	 * 获取全部数据使用数据查询对象
	 * @return
	 */
	IPSDEDataQuery getViewPSDEDataQuery();
	
	
	/**
	 * 获取默认数据集对象
	 * @return
	 */
	IPSDEDataSet getDefaultPSDEDataSet();
	
	
	/**
	 * 获取视图数据集对象
	 * @return
	 */
	IPSDEDataSet getViewPSDEDataSet();
	
	
	/**
	 * 获取当前实体是否为继承主实体
	 * @return
	 */
	boolean isInheritMajor();

	/**
	 * 获取当前实体是否为继承从实体
	 * @return
	 */
	boolean isInheritMinor();


	/**
	 * 获取当前实体是否为索引主实体
	 * @return
	 */
	boolean isIndexMajor();

	/**
	 * 获取当前实体是否为索引从实体
	 * @return
	 */
	boolean isIndexMinor();
	
	
	/**
	 * 是否为虚拟实体
	 * @return
	 */
	boolean isVirtual();
	
	
	/**
	 * 获取虚拟实体模式
	 * @return
	 */
	int getVirtualMode();
	
	
	/**
	 * 获取多继承关系集合
	 * @return
	 */
	java.util.List<IPSDERMultiInherit> getPSDERMultiInherits();
	
	
	/**
	 * 获取当前实体的继承关系
	 * @return
	 */
	IPSDERInherit getPSDERInherit();

	/**
	 * 
	 * 获取继承实体的运行时对象
	 * @return
	 */
	IDataEntityRuntime getInheritDataEntityRuntime();
	
	
	
	/**
	 * 获取指定预定义类型的属性
	 * @param strPredefinedType
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEFieldByPredefinedType(String strPredefinedType, boolean bTryMode);
	
	
	/**
	 * 获取指定预定义类型的属性
	 * @param predefinedFieldType
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEFieldByPredefinedType(PredefinedFieldType predefinedFieldType, boolean bTryMode);
	
	
	/**
	 * 获取指定标记属性
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSDEField getPSDEFieldByTag(String strTag, boolean bTryMode);
	
	
	/**
	 * 是否启用逻辑有效
	 * @return
	 */
	boolean isEnableLogicValid();
	
	
	/**
	 * 获取逻辑有效值
	 * @return
	 */
	Object getValidLogicValue();
	
	/**
	 * 获取逻辑无效值
	 * @return
	 */
	Object getInvalidLogicValue();
	
	
	
	/**
	 * 获取逻辑有效控制属性
	 * @return
	 */
	IPSDEField getLogicValidPSDEField();
	
	
	
	/**
	 * 注册实体行为运行时插件
	 * @param strAction
	 * @param iDEActionPluginRuntime
	 */
	void registerDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime);
	
	
	/**
	 * 注册实体数据集运行时插件
	 * @param strDataSet
	 * @param iDEDataSetPluginRuntime
	 */
	void registerDEDataSetPluginRuntime(String strDataSet, IDEDataSetPluginRuntime iDEDataSetPluginRuntime);
	
	
	/**
	 * 注销实体行为运行时插件
	 * @param strAction
	 * @param iDEActionPluginRuntime
	 */
	boolean unregisterDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime);
	
	
	/**
	 * 注销实体数据集运行时插件
	 * @param strDataSet
	 * @param iDEDataSetPluginRuntime
	 */
	boolean unregisterDEDataSetPluginRuntime(String strDataSet, IDEDataSetPluginRuntime iDEDataSetPluginRuntime);
	
	/**
	 * 存在实体行为运行时插件
	 * @param strAction
	 * @param iDEActionPluginRuntime
	 */
	boolean containsDEActionPluginRuntime(String strAction);
	
	
	/**
	 * 存在实体数据集运行时插件
	 * @param strDataSet
	 */
	boolean containsDEDataSetPluginRuntime(String strDataSet);
	
	
//	/**
//	 * 注册实体行为运行时插件
//	 * @param strAction
//	 * @param strStep
//	 * @param iDEActionPluginRuntime
//	 */
//	void registerDEActionPluginRuntime(String strAction, String strStep, IDEActionPluginRuntime iDEActionPluginRuntime);
	
	
	
	/**
	 * 获取指定实体相关的管理关系
	 * @param strDENameOrId
	 * @param bTryMode
	 * @return
	 */
	IPSDERBase getMasterPSDER(String strDENameOrId, boolean bTryMode);
	
	
	
	/**
	 * 获取传入数据的管理关系
	 * @param iEntityBase
	 * @param bTryMode
	 * @return
	 */
	IPSDERBase getMasterPSDER(IEntityBase iEntityBase, boolean bTryMode);
	
	
	
	/**
	 * 检查嵌套数据集合
	 * @param parentEntity
	 * @param entities
	 * @param iDynaInstRuntime
	 */
	void checkNestedEntities(IEntityBase parentEntity, IEntityBase[] entities, IDynaInstRuntime iDynaInstRuntime) throws Throwable;
	
	
	/**
	 * 填充嵌套数据排序值
	 * @param parentEntity
	 * @param entities
	 * @param iPSDERBase 嵌套数据关系
	 */
	void fillNestedEntitiesOrderValue(IEntityBase parentEntity, IEntityBase[] entities, IPSDERBase iPSDERBase, IDynaInstRuntime iDynaInstRuntime) throws Throwable;	

	/**
	 * 启动流程
	 * @param iEntityBase
	 * @throws Throwable
	 */
	void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF) throws Throwable;
	
	
	/**
	 * 获取实体类型
	 * @return
	 */
	int getDEType();
	
	
	/**
	 * 获取联合主键模式
	 * @return
	 */
	String getUnionKeyMode();
	
	
	/**
	 * 获取联合主键参数
	 * @return
	 */
	String getUnionKeyParam();
	
	/**
	 * 获取联合键值属性集合
	 * @return
	 */
	List<IPSDEField> getUnionKeyValuePSDEFields();
	
	
	
	
	/**
	 * 获取默认实体异步处理队列
	 * @return
	 */
	IPSDEDTSQueue getDefaultPSDEDTSQueue();
	
	
	
	/**
	 * 获取默认的实体数据导入模型
	 * @return
	 */
	IPSDEDataExport getDefaultPSDEDataExport();
	
	
	/**
	 * 获取默认的实体数据导入模型
	 * @return
	 */
	IPSDEDataImport getDefaultPSDEDataImport();

	
	/**
	 * 获取实体文件存储功能运行时对象
	 * @return
	 */
	IDEFileUtilRuntime getDEFileUtilRuntime();
	
	
	
	/**
	 * 导入数据
	 * @param strImportTag 导入标记
	 * @param baseEntity
	 * @param inputStream 数据流
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importData(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	
	
	
	/**
	 * 导出数据
	 * @param strExportTag
	 * @param objData
	 * @param outputStream
	 * @throws Throwable
	 */
	void exportData(String strExportTag, Object objData, OutputStream outputStream) throws Throwable;
	
	
	
	
	/**
	 * 获取设置对象
	 * @return
	 */
	IModelRuntimeSetting getSetting();
	
	
	/**
	 * 获取指定标识数据集
	 * @param strName
	 * @return
	 */
	IPSDEDataSet getPSDEDataSet(String strName);

	
	/**
	 * 获取指定标识数据查询
	 * @param strName
	 * @return
	 */
	IPSDEDataQuery getPSDEDataQuery(String strName);
	
	
	
	/**
	 * 填充数据对象完整信息
	 * @param iEntityBase
	 * @param strActionName 行为标识
	 */
	void fillEntityFullInfo(IEntityBase iEntityBase, String strActionName);
	
	
	/**
	 * 获取排序值存储属性
	 * @return
	 */
	IPSDEField getOrderValuePSDEField();
	
	
	/**
	 * 获取排序范围数据集
	 * @return
	 */
	IPSDEDataSet getOrderScopePSDEDataSet();
	
	/**
	 * 获取动态存储存储属性
	 * @return
	 */
	IPSDEField getDynaStoragePSDEField();
	
	/**
	 * 获取关闭标志存储属性
	 * @return
	 */
	IPSDEField getCloseFlagPSDEField();
	
	/**
	 * 获取锁定标志存储属性
	 * @return
	 */
	IPSDEField getLockFlagPSDEField();
	
	
	
	
	
	/**
	 * 获取实体的数据源标记
	 * @return
	 */
	String getDataSourceTag();
	
	
	/**
	 * 获取通知关系集合
	 * @return
	 */
	List<IPSDERBase> getNotifyPSDERs();
	
	
	
	
	
	/**
	 * 触发通知操作
	 * @param key 主键可能无值，需要从上一次数据中获取
	 * @param strEvent
	 * @param eventData
	 * @param eventData2
	 * @throws Throwable
	 */
	void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) throws Throwable;
	
	
	
	
	/**
	 * 获取指定标记行为
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSDEAction getPSDEActionByTag(String strTag, boolean bTryMode);
	
	
	
	
	
	/**
	 * 获取指定标记数据集
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSDEDataSet getPSDEDataSetByTag(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 增加配置侦听器对象
	 * @param listener
	 */
    void registerDataEntityEventListener(IDataEntityEventListener listener);
    
	/**
	 * 增加配置侦听器对象
	 * @param listener
	 * @param events
	 */
    void registerDataEntityEventListener(IDataEntityEventListener listener, String[] events);
    
    
    /**
     * 移除配置侦听器对象
     * @param listener
     */
    void unregisterDataEntityEventListener(IDataEntityEventListener listener);
    
    
    /**
	 * 增加配置侦听器对象
	 * @param listener
	 */
    void registerDataEntityOnChangeLogic(IDataEntityOnChangeLogic logic);
    
  
    /**
     * 移除配置侦听器对象
     * @param listener
     */
    void unregisterDataEntityOnChangeLogic(IDataEntityOnChangeLogic logic);
    
    
    /**
     * 获取实体的属性集合
     * @return
     */
    List<IPSDEField> getPSDEFields();
    
    
    /**
     * 获取排序初始化值
     * @return
     */
    Integer getOrderInitialValue(); 
    
    
    /**
     * 获取排序步进值
     * @return
     */
    Integer getOrderStepValue(); 
    
    
    /**
     * 获取主控关系集合
     * @return
     */
    List<IPSDERBase> getMasterPSDERs();
    
    
    /**
     * 获取克隆关系集合
     * @return
     */
    List<IPSDER1NBase> getClonePSDER1Ns();
    
    
    
    
	/**
	 * 获取通知关系集合，指定是否包括继承实体
	 * @param bIncludeInherit 
	 * @return
	 */
	List<IPSDERBase> getNotifyPSDERs(boolean bIncludeInherit);
    
    
	 /**
     * 获取主控关系集合，指定是否包括继承实体
     * @param bIncludeInherit 
     * @return
     */
    List<IPSDERBase> getMasterPSDERs(boolean bIncludeInherit);
    
    
    /**
     * 获取克隆关系集合，指定是否包括继承实体
     * @param bIncludeInherit 
     * @return
     */
    List<IPSDER1NBase> getClonePSDER1Ns(boolean bIncludeInherit);
    
    
    /**
     * 获取实体的关系集合（从关系）
     * @return
     */
    List<IPSDERBase> getPSDERBases();
    
    
    /**
     * 获取实体的关系集合（从关系）
     * @param bIncludeInherit 
     * @return
     */
    List<IPSDERBase> getPSDERBases(boolean bIncludeInherit);
    
    
    /**
     * 获取关系中的父类型
     * @return
     */
    String getDERParentType();
	
//    /**
//     * 是否启用父主状态控制
//     * @return
//     */
//    boolean isEnableParentMainState();
}
