package net.ibizsys.central.system;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.security.ISysUniResRuntime;
import net.ibizsys.central.security.ISysUserRoleRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeBase;
import net.ibizsys.central.testing.ISysTestCaseRuntime;
import net.ibizsys.central.testing.ISysTestDataRuntime;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.testing.IPSSysTestCase;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;

/**
 * 系统模块功能组件运行时接口
 * @author lionlau
 *
 */
public interface ISystemModuleUtilRuntime extends ISysUtilRuntimeBase, ISystemModelRuntime, net.ibizsys.runtime.system.ISystemModuleUtilRuntime {

	/**
	 * 获取系统模块
	 * @return
	 */
	IPSSystemModule getPSSystemModule();
	
	
	/**
	 * 通过实体获取持久化对象
	 * @param iPSDataEntity
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapter(IPSDataEntity iPSDataEntity) throws Exception;
	
	
	
	/**
	 * 获取传入实体的存储模式
	 * @param iPSDataEntity
	 * @return
	 */
	int getStorageMode(IPSDataEntity iPSDataEntity);
	
	
	
	/**
	 * 获取实体对象的运行时对象
	 * @param iPSDataEntity
	 * @return
	 */
	IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity);
	
	
	
	/**
	 * 设置功能参数
	 * @param strName
	 * @param objValue
	 */
	void setUtilParam(String strName, Object objValue);
	
	
	/**
	 * 获取功能参数
	 * @param strName
	 * @return
	 */
	Object getUtilParam(String strName);
//
//	
//	
//	/**
//	 * 是否支持指定实体逻辑
//	 * @param iDataEntityRuntime
//	 * @param iPSDELogic
//	 * @return
//	 */
//	boolean supportDELogic(IDataEntityRuntime iDataEntityRuntime, IPSDELogic iPSDELogic);
//	
//	
//	
//	/**
//	 * 执行实体逻辑
//	 * @param iDataEntityRuntime
//	 * @param iPSDELogic
//	 * @param arg0
//	 * @param iDynaInstRuntime
//	 * @param actionData
//	 * @return
//	 * @throws Throwable
//	 */
//	Object executeDELogic(IDataEntityRuntime iDataEntityRuntime, IPSDELogic iPSDELogic, Object arg0, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;
	
	
	
	/**
	 * 建立实体逻辑运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic);
	
	
	
	/**
	 * 建立实体主状态逻辑运行时对象
	 * @param iPSDEMSLogic
	 * @return
	 */
	IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic);
	
	
	/**
	 * 建立实体数据集运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDEDataSetRuntime createDEDataSetRuntime(IPSDEDataSet iPSDEDataSet);
	
	
	/**
	 * 建立实体行为运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDEActionRuntime createDEActionRuntime(IPSDEAction iPSDEAction);
	
	
	/**
	 * 建立实体数据导入运行时对象
	 * @param iPSDEDataImport
	 * @return
	 */
	IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport);
	
	
	/**
	 * 建立实体数据导出运行时对象
	 * @param iPSDEDataExport
	 * @return
	 */
	IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport);
	
	
	
	/**
	 * 建立实体关系运行时对象
	 * @param iPSDERBase
	 * @return
	 */
	IDERRuntime createDERRuntime(IPSDERBase iPSDERBase);
	
	
	
	/**
	 * 建立实体通知运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify);
	
	
	/**
	 * 获取系统测试用例运行时对象接口
	 * @param iPSSysTestCase
	 * @return
	 */
	default ISysTestCaseRuntime createSysTestCaseRuntime(IPSSysTestCase iPSSysTestCase){
		return null;
	}
	
	
	
	/**
	 * 获取系统测试数据运行时对象接口
	 * @param iPSSysTestData
	 * @return
	 */
	default ISysTestDataRuntime createSysTestDataRuntime(IPSSysTestData iPSSysTestData){
		return null;
	}
	
	
	/**
	 * 建立系统资源运行时对象
	 * @param iPSSysResource
	 * @return
	 */
	default ISysResourceRuntime createSysResourceRuntime(IPSSysResource iPSSysResource){
		return null;
	}
	
	
	/**
	 * 建立大数据体系运行时对象
	 * @param iPSSysBDScheme
	 * @return
	 */
	default ISysBDSchemeRuntime createSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme){
		return null;
	}
	
	
	
	/**
	 * 建立智能报表体系运行时对象
	 * @param iPSSysBIScheme
	 * @return
	 */
	default ISysBISchemeRuntime createSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme){
		return null;
	}
	
	
	
	/**
	 * 建立外部服务接口运行时对象
	 * @param iPSSubSysServiceAPI
	 * @return
	 */
	default ISubSysServiceAPIRuntime createSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI){
		return null;
	}
	

	
	/**
	 * 建立系统全文检索体系运行时对象
	 * @param iPSSysSearchScheme
	 * @return
	 */
	default ISysSearchSchemeRuntime createSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme){
		return null;
	}
	
	
	
	/**
	 * 建立系统引用运行时对象
	 * @param iPSSysRef
	 * @return
	 */
	default ISysRefRuntime createSysRefRuntime(IPSSysRef iPSSysRef) {
		return null;
	}
	
	
	/**
	 * 建立指定实体的访问控制对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	default IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
		return null;
	}
	
	
	/**
	 * 建立系统用户角色运行时对象
	 * @param iPSSysUserRole
	 * @return
	 */
	default ISysUserRoleRuntime createSysUserRoleRuntime(IPSSysUserRole iPSSysUserRole) {
		return null;
	}
	
	/**
	 * 建立系统统一资源运行时对象
	 * @param iPSysUniRes
	 * @return
	 */
	default ISysUniResRuntime createSysUniResRuntime(IPSSysUniRes iPSysUniRes) {
		return null;
	}
	
	
	/**
	 * 建立实体查询代码运行时对象
	 * @param iPSDEDataQueryCode
	 * @return
	 */
	default IDEDataQueryCodeRuntime createDEDataQueryCodeRuntime(IPSDEDataQueryCode iPSDEDataQueryCode){
		return null;
	}
}
