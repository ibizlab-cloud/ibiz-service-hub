package net.ibizsys.central;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.demap.IDEMapRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIScriptLogicRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.testing.ISysTestCaseRuntime;
import net.ibizsys.central.testing.ISysTestDataRuntime;
import net.ibizsys.central.util.IWebResponse;
import net.ibizsys.central.util.script.IScriptList;
import net.ibizsys.central.util.script.IScriptPage;
import net.ibizsys.central.util.script.IScriptWebResponse;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.testing.IPSSysTestCase;
import net.ibizsys.model.testing.IPSSysTestData;

public interface ISystemUtilRuntime extends net.ibizsys.runtime.ISystemUtilRuntime{

	/**
	 * 建立Web客户端对象
	 * @param data
	 * @return
	 */
	IWebClient createWebClient(Object data);
	
	
	/**
	 * 建立用于脚本调用的数据对象分页对象（默认小写转换属性名称）
	 * @param list
	 * @return
	 */
	IScriptPage createScriptPage(Page<?> page);
	
	/**
	 * 建立用于脚本调用的数据对象分页对象
	 * @param list
	 * @param bLowerCaseFieldName 转化数据对象属性到小写
	 * @return
	 */
	IScriptPage createScriptPage(Page<?> page, boolean bLowerCaseFieldName);
	
	
	
	/**
	 * 建立用于脚本调用的通用列表对象
	 * @param list
	 * @return
	 */
	IScriptList createScriptList(List<?> list);
	
	
	/**
	 * 建立用于脚本调用的数据对象列表对象
	 * @param list
	 * @param bLowerCaseFieldName 转化数据对象属性到小写
	 * @return
	 */
	IScriptList createScriptList(List<?> list, boolean bLowerCaseFieldName);
	
	
	
	
	/**
	 * 建立传入对象的脚本调用对象
	 * @param obj
	 * @return
	 */
	Object createScriptObject(Object obj);
	
	
	
	
	/**
	 * 建立外部服务接口脚本逻辑运行时对象
	 * @param strLogicMode
	 * @return
	 */
	ISubSysServiceAPIScriptLogicRuntime createSubSysServiceAPIScriptLogicRuntime(String strLogicMode);
	
	
	
	
	/**
	 * 获取系统测试用例运行时对象接口
	 * @param iPSSysTestCase
	 * @return
	 */
	ISysTestCaseRuntime createSysTestCaseRuntime(IPSSysTestCase iPSSysTestCase);
	
	
	
	/**
	 * 获取系统测试数据运行时对象接口
	 * @param iPSSysTestData
	 * @return
	 */
	ISysTestDataRuntime createSysTestDataRuntime(IPSSysTestData iPSSysTestData);
	
	
	
	/**
	 * 建立默认的实体映射运行时对象
	 * @return
	 */
	IDEMapRuntime createDefaultDEMapRuntime();
	
	
	
	/**
	 * 建立用于脚本调用的Web反馈对象
	 * @param iWebResponse
	 * @return
	 */
	IScriptWebResponse createScriptWebResponse(IWebResponse iWebResponse);
	
	
	
	/**
	 * 建立系统资源运行时对象
	 * @param iPSSysResource
	 * @return
	 */
	ISysResourceRuntime createSysResourceRuntime(IPSSysResource iPSSysResource);
	
	
	/**
	 * 建立大数据体系运行时对象
	 * @param iPSSysBDScheme
	 * @return
	 */
	ISysBDSchemeRuntime createSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme);
	
	
	
	/**
	 * 建立智能报表体系运行时对象
	 * @param iPSSysBIScheme
	 * @return
	 */
	ISysBISchemeRuntime createSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme);
	
	
	
	/**
	 * 建立外部服务接口运行时对象
	 * @param iPSSubSysServiceAPI
	 * @return
	 */
	ISubSysServiceAPIRuntime createSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI);
	
	
	/**
	 * 建立系统后台任务运行时对象
	 * @param iPSSysBackService
	 * @return
	 */
	ISysBackendTaskRuntime createSysBackendTaskRuntime(IPSSysBackService iPSSysBackService);
	
	
	
	/**
	 * 建立系统服务接口运行时对象
	 * @param iPSSysServiceAPI
	 * @return
	 */
	ISysServiceAPIRuntime createSysServiceAPIRuntime(IPSSysServiceAPI iPSSysServiceAPI);
	
	
	/**
	 * 建立系统全文检索体系运行时对象
	 * @param iPSSysSearchScheme
	 * @return
	 */
	ISysSearchSchemeRuntime createSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme);
	
	
	
	
	/**
	 * 建立系统关系数据库体系运行时对象
	 * @param iPSSysDBScheme
	 * @return
	 */
	ISysDBSchemeRuntime createSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme);
	
	
	/**
	 * 建立系统引用运行时对象
	 * @param iPSSysRef
	 * @return
	 */
	ISysRefRuntime createSysRefRuntime(IPSSysRef iPSSysRef);
}
