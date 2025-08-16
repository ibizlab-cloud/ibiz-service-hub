package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.Version;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysDevOpsUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.testing.IDETestCaseRuntime;
import net.ibizsys.central.testing.TestCaseRunResult;
import net.ibizsys.model.PSSystemImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.PSSysSFPluginImpl;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 系统DevOps功能运行时对象实现基类
 * @author lionlau
 *
 */
public abstract class SysDevOpsUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysDevOpsUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDevOpsUtilRuntimeBase.class);
	
	@Override
	public Object executeAction(String strAction, Object objBody, String strKey, Object objTag) {
		return this.executeAction("执行操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteAction(strAction, objBody, strKey, objTag);
			}
		}, null);
	}

	protected Object onExecuteAction(String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		return this.onExecuteAction(this.getSystemRuntime(), strAction, objBody, strKey, objTag);
		
	}

	protected Object onExecuteAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		if(iSystemRuntime == null) {
			throw new Exception(String.format("传入系统运行时对象无效"));
		}
		
		if(DEVOPSACTION_RUNTESTPROJECT.equalsIgnoreCase(strAction)) {
			return this.onRunTestProject(iSystemRuntime, strAction, objBody, strKey, objTag);
		}
		
		if(DEVOPSACTION_LISTPSSYSSFPLUGINS.equalsIgnoreCase(strAction)) {
			return this.onListPSSysSFPlugins(iSystemRuntime, strAction, objBody, strKey, objTag);
		}
		
		
		if(DEVOPSACTION_GETSYSTEMINFO.equalsIgnoreCase(strAction)) {
			return this.onGetSystemInfo(iSystemRuntime, strAction, objBody, strKey, objTag);
		}
		
		throw new Exception(String.format("无法识别的DevOps操作[%1$s]", strAction));
	}
	
	
	protected Object onRunTestProject(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		List<IPSDataEntity> psDataEntityList = iSystemRuntime.getPSSystem().getAllPSDataEntities();
		if(ObjectUtils.isEmpty(psDataEntityList)) {
			return null;
		}
		
		List<TestCaseRunResult> list = new ArrayList<TestCaseRunResult>();
		
		for(IPSDataEntity iPSDataEntity : psDataEntityList) {
			if(ObjectUtils.isEmpty(iPSDataEntity.getAllPSSysTestCases())) {
				continue;
			}
			
			IDataEntityRuntime iDataEntityRuntime = iSystemRuntime.getDataEntityRuntime(iPSDataEntity.getId());
			java.util.List<IDETestCaseRuntime> deTestCaseRuntimeList = iDataEntityRuntime.getDETestCaseRuntimes();
			if(ObjectUtils.isEmpty(deTestCaseRuntimeList)) {
				continue;
			}
			
			for(IDETestCaseRuntime iDETestCaseRuntime : deTestCaseRuntimeList) {
				
				TestCaseRunResult testCaseRunResult	= iDETestCaseRuntime.run();
//				if(testCaseRunResult == null) {
//					testCaseRunResult = new TestCaseRunResult();
//					testCaseRunResult.setStatus(TestCaseRunResult.STATUS_FAILURE);
//					testCaseRunResult.setActualResult("测试用例未返回结果对象，按失败处理");
//				}
				if(testCaseRunResult == null) {
					continue;
				}
				list.add(testCaseRunResult);
				
			}
		}
		
		return list;
	}
	
	
	protected Object onListPSSysSFPlugins(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		ArrayNode arrayNode = JsonUtils.createArrayNode();
		List<IPSSysSFPlugin> psSysSFPluginList = iSystemRuntime.getPSSystem().getAllPSSysSFPlugins();
		if(!ObjectUtils.isEmpty(psSysSFPluginList)) {
			for(IPSSysSFPlugin iPSSysSFPlugin : psSysSFPluginList) {
				if(!iPSSysSFPlugin.isRuntimeObject()) {
					continue;
				}
				ISysSFPluginRuntime iSysSFPluginRuntime = iSystemRuntime.getSysSFPluginRuntime(iPSSysSFPlugin.getId(), true);
				if(iSysSFPluginRuntime == null) {
					log.warn(String.format("未获取系统后台插件[%1$s][%2$s]运行时对象", iPSSysSFPlugin.getName(), iPSSysSFPlugin.getId()));
					continue;
				}
				
				ObjectNode objectNode = arrayNode.addObject();
				objectNode.put(PSSysSFPluginImpl.ATTR_GETID, iPSSysSFPlugin.getId());
				objectNode.put(PSSysSFPluginImpl.ATTR_GETNAME, iPSSysSFPlugin.getName());
//				objectNode.put(PSSysSFPluginImpl.ATTR_GETRTOBJECTNAME, iSysSFPluginRuntime.getRTObjectName());
//				objectNode.put(PSSysSFPluginImpl.ATTR_GETTEMPLCODE, iSysSFPluginRuntime.getRTObjectCode());
//				objectNode.put("groovyRTObject", iSysSFPluginRuntime.isGroovyRTObject());
				objectNode.put("rtobjectname", iSysSFPluginRuntime.getRTObjectName());
				objectNode.put("templcode", iSysSFPluginRuntime.getRTObjectCode());
				objectNode.put("groovyrtobject", iSysSFPluginRuntime.isGroovyRTObject());
			}
		}
		
		return arrayNode;
	}
	
	
	protected Object onGetSystemInfo(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		ObjectNode objectNode = JsonUtils.createObjectNode();
		
		objectNode.put(PSSystemImpl.ATTR_GETID, iSystemRuntime.getDeploySystemId());
		objectNode.put(PSSystemImpl.ATTR_GETNAME, iSystemRuntime.getName());
//		objectNode.put("rtModelEngineVer", Version.toVersionString());
//		objectNode.put("psModelEngineVer", iSystemRuntime.getPSModelEngineVer());
//		objectNode.put("modelDigest", iSystemRuntime.getPSSystemService().getModelDigest());
		objectNode.put("rtmodelenginever", Version.toVersionString());
		objectNode.put("psmodelenginever", iSystemRuntime.getPSModelEngineVer());
		objectNode.put("modeldigest", iSystemRuntime.getPSSystemService().getModelDigest());
		if(iSystemRuntime.getLoadedDate() != null) {
			objectNode.put("loadeddate", DateUtils.toDateTimeString(iSystemRuntime.getLoadedDate()));
		}
		
		return objectNode;
	}
}
