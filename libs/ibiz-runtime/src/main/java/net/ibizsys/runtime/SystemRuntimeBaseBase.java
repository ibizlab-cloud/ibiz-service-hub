package net.ibizsys.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEngine;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.codelist.CodeListTypes;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.util.ModelRuntimeUtils;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

public abstract class SystemRuntimeBaseBase extends ModelRuntimeBase implements ISystemRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemRuntimeBaseBase.class);

	private Map<String, IPSSysLogic> psSysLogicMap = new HashMap<String, IPSSysLogic>();

	private Map<String, ISysValueRuleRuntime> sysValueRuleRuntimeMap = new HashMap<String, ISysValueRuleRuntime>();

	private Map<String, ISysSequenceRuntime> sysSequenceRuntimeMap = new HashMap<String, ISysSequenceRuntime>();

	private Map<String, ISysTranslatorRuntime> sysTranslatorRuntimeMap = new HashMap<String, ISysTranslatorRuntime>();

	private Map<String, ICodeListRuntime> codeListRuntimeMap = new HashMap<String, ICodeListRuntime>();

	private Map<String, ISysDataSyncAgentRuntime> sysDataSyncAgentRuntimeMap = new HashMap<String, ISysDataSyncAgentRuntime>();

	private List<ISysDataSyncAgentRuntime> inSysDataSyncAgentRuntimeList = new ArrayList<ISysDataSyncAgentRuntime>();

	private Map<String, ISysMsgQueueRuntime> sysMsgQueueRuntimeMap = new HashMap<String, ISysMsgQueueRuntime>();

	private Map<String, ISysMsgTemplRuntime> sysMsgTemplRuntimeMap = new HashMap<String, ISysMsgTemplRuntime>();

	private Map<String, ISysMsgTargetRuntime> sysMsgTargetRuntimeMap = new HashMap<String, ISysMsgTargetRuntime>();

	private Map<String, ISysLogicRuntime> sysLogicRuntimeMap = new HashMap<String, ISysLogicRuntime>();
	
	private Map<String, IPSWFRole> psWFRoleMap = new HashMap<String, IPSWFRole>();
	
	private Map<String, IWFRoleRuntime> wfRoleRuntimeMap = new HashMap<String, IWFRoleRuntime>();
	
	private Map<String, ISysDTSQueueRuntime> sysDTSQueueRuntimeMap = new HashMap<String, ISysDTSQueueRuntime>();

	private List<ISysDTSQueueRuntime> sysDTSQueueRuntimeList = new ArrayList<ISysDTSQueueRuntime>();
	
	private ISysNotifyAgentRuntime iSysNotifyAgentRuntime = null;

	protected abstract ISystemRuntimeContext getSystemRuntimeContext();

	protected abstract ISystemRuntimeBaseContext getSystemRuntimeBaseContext();
	
	private Map<String, Object> globalParamMap = new HashMap<String, Object>();
	
	private int nEngineVer = PSModelEngine.VERSION_UNKNOWN;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

		List<IPSSysLogic> psSysLogics = this.getPSSystem().getAllPSSysLogics();
		if (psSysLogics != null) {
			for (IPSSysLogic iPSSysLogic : psSysLogics) {

				// this.psSysLogicMap.put(iPSSysLogic..toUpperCase(),
				// iPSSysLogic);

				String strCodeName = iPSSysLogic.getCodeName();
				if (!StringUtils.hasLength(strCodeName)) {
					continue;
				}
				this.psSysLogicMap.put(strCodeName.toUpperCase(), iPSSysLogic);
			}
		}
		
		//准备工作流运行时
		if(this.isEnableWFRuntime()) {
			List<IPSWFRole> psWFRoles = this.getPSSystem().getAllPSWFRoles();
			if(psWFRoles!=null) {
				for (IPSWFRole iPSWFRole : psWFRoles) {
					String strUniqueTag = iPSWFRole.getUniqueTag();
					if (StringUtils.hasLength(strUniqueTag)) {
						this.psWFRoleMap.put(strUniqueTag.toUpperCase(), iPSWFRole);
					}
					String strName =  iPSWFRole.getName();
					if (StringUtils.hasLength(strName)) {
						this.psWFRoleMap.put(strName.toUpperCase(), iPSWFRole);
					}
				}
			}
		}
		
		
		List<IPSSysDTSQueue> psSysDTSQueues = this.getPSSystem().getAllPSSysDTSQueues();
		if (psSysDTSQueues != null) {
			for (IPSSysDTSQueue iPSSysDTSQueue : psSysDTSQueues) {
				this.getSysDTSQueueRuntime(iPSSysDTSQueue);
			}
		}
	}

	
	@Override
	public int getPSModelEngineVer() {
		return this.nEngineVer;
	}
	
	protected void setPSModelEngineVer(int nEngineVer) {
		this.nEngineVer = nEngineVer;
	}
	

	@Override
	public ISysValueRuleRuntime getSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule) {
		ISysValueRuleRuntime iSysValueRuleRuntime = this.sysValueRuleRuntimeMap.get(iPSSysValueRule.getDynaModelFilePath());
		if (iSysValueRuleRuntime == null) {
			iSysValueRuleRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysValueRuleRuntime(iPSSysValueRule);
			try {
				iSysValueRuleRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysValueRule);
				this.sysValueRuleRuntimeMap.put(iPSSysValueRule.getDynaModelFilePath(), iSysValueRuleRuntime);
			} catch (Exception ex) {
				log.error(String.format("初始化系统值规则[%1$s]发生异常，%2$s", iPSSysValueRule.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统值规则[%1$s]发生异常，%2$s", iPSSysValueRule.getName(), ex.getMessage()), ex);
			}
		}
		return iSysValueRuleRuntime;
	}

	@Override
	public ISysSequenceRuntime getSysSequenceRuntime(IPSSysSequence iPSSysSequence) {
		Assert.notNull(iPSSysSequence,"传入系统值序列模型对象无效");
		ISysSequenceRuntime iSysSequenceRuntime = this.sysSequenceRuntimeMap.get(iPSSysSequence.getDynaModelFilePath());
		if (iSysSequenceRuntime == null) {
			iSysSequenceRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysSequenceRuntime(iPSSysSequence);
			try {
				iSysSequenceRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysSequence);
				this.sysSequenceRuntimeMap.put(iPSSysSequence.getDynaModelFilePath(), iSysSequenceRuntime);
			} catch (Exception ex) {
				log.error(String.format("初始化系统值序列[%1$s]发生异常，%2$s", iPSSysSequence.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统值序列[%1$s]发生异常，%2$s", iPSSysSequence.getName(), ex.getMessage()),  ex);
			}
		}
		return iSysSequenceRuntime;
	}

	@Override
	public ISysTranslatorRuntime getSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator) {
		Assert.notNull(iPSSysTranslator,"传入系统值转换器模型对象无效");
		ISysTranslatorRuntime iSysTranslatorRuntime = this.sysTranslatorRuntimeMap.get(iPSSysTranslator.getDynaModelFilePath());
		if (iSysTranslatorRuntime == null) {
			iSysTranslatorRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysTranslatorRuntime(iPSSysTranslator);
			try {
				iSysTranslatorRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysTranslator);
				this.sysTranslatorRuntimeMap.put(iPSSysTranslator.getDynaModelFilePath(), iSysTranslatorRuntime);
			} catch (Exception ex) {
				log.error(String.format("初始化系统值转换器[%1$s]发生异常，%2$s", iPSSysTranslator.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统值转换器[%1$s]发生异常，%2$s", iPSSysTranslator.getName(), ex.getMessage()), ex);
			}
		}
		return iSysTranslatorRuntime;
	}

	@Override
	public ICodeListRuntime getCodeListRuntime(IPSCodeList iPSCodeList) {
		Assert.notNull(iPSCodeList,"传入系统代码表模型对象无效");
		String strCodeListType = iPSCodeList.getCodeListType();
		if(!StringUtils.hasLength(strCodeListType) 
				|| CodeListTypes.INLINE.equals(strCodeListType)) {
			ICodeListRuntime iCodeListRuntime = this.getSystemRuntimeContext().getSystemRuntime().createCodeListRuntime(iPSCodeList);
			try {
				iCodeListRuntime.init(this.getSystemRuntimeBaseContext(), iPSCodeList);
				
			} catch (Exception ex) {
				log.error(String.format("初始化系统代码表[%1$s]发生异常，%2$s", iPSCodeList.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统代码表[%1$s]发生异常，%2$s", iPSCodeList.getName(), ex.getMessage()), ex);
			}
			return iCodeListRuntime;
		}
		else {
			ICodeListRuntime iCodeListRuntime = this.codeListRuntimeMap.get(iPSCodeList.getDynaModelFilePath());
			if (iCodeListRuntime == null) {
				iCodeListRuntime = this.getSystemRuntimeContext().getSystemRuntime().createCodeListRuntime(iPSCodeList);
				try {
					iCodeListRuntime.init(this.getSystemRuntimeBaseContext(), iPSCodeList);
					this.codeListRuntimeMap.put(iPSCodeList.getDynaModelFilePath(), iCodeListRuntime);
					if(StringUtils.hasLength(iPSCodeList.getCodeListTag())) {
						this.codeListRuntimeMap.put(iPSCodeList.getCodeListTag(), iCodeListRuntime);
					}
				} catch (Exception ex) {
					log.error(String.format("初始化系统代码表[%1$s]发生异常，%2$s", iPSCodeList.getName(), ex.getMessage()), ex);
					throw new SystemRuntimeException(this, String.format("初始化系统代码表[%1$s]发生异常，%2$s", iPSCodeList.getName(), ex.getMessage()), ex);
				}
			}
			return iCodeListRuntime;
		}
	}

	@Override
	public ISysDataSyncAgentRuntime getSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		Assert.notNull(iPSSysDataSyncAgent,"传入系统数据同步代理模型对象无效");
		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.sysDataSyncAgentRuntimeMap.get(iPSSysDataSyncAgent.getDynaModelFilePath());
		if (iSysDataSyncAgentRuntime == null) {
			iSysDataSyncAgentRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
			try {
				iSysDataSyncAgentRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysDataSyncAgent);
				this.sysDataSyncAgentRuntimeMap.put(iPSSysDataSyncAgent.getDynaModelFilePath(), iSysDataSyncAgentRuntime);

				if (SysDataSyncAgentDirs.IN.equals(iPSSysDataSyncAgent.getSyncDir())
						||SysDataSyncAgentDirs.INOUT.equals(iPSSysDataSyncAgent.getSyncDir())) {
					this.inSysDataSyncAgentRuntimeList.add(iSysDataSyncAgentRuntime);
				}

			} catch (Exception ex) {
				log.error(String.format("初始化系统数据同步代理[%1$s]发生异常，%2$s", iPSSysDataSyncAgent.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统数据同步代理[%1$s]发生异常，%2$s", iPSSysDataSyncAgent.getName(), ex.getMessage()),ex);
			}
		}
		return iSysDataSyncAgentRuntime;
	}

	@Override
	public Collection<ISysDataSyncAgentRuntime> getInSysDataSyncAgentRuntimes() {
		if (ObjectUtils.isEmpty(this.inSysDataSyncAgentRuntimeList)) {
			return null;
		}
		return this.inSysDataSyncAgentRuntimeList;
	}

	@Override
	public ISysNotifyAgentRuntime getSysNotifyAgentRuntime() {
		if (this.iSysNotifyAgentRuntime == null) {
			ISysNotifyAgentRuntime iSysNotifyAgentRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysNotifyAgentRuntime();
			try {
				iSysNotifyAgentRuntime.init(this.getSystemRuntimeBaseContext());
				this.iSysNotifyAgentRuntime = iSysNotifyAgentRuntime;
			} catch (Exception ex) {
				log.error(String.format("初始化系统通知代理[%1$s]发生异常，%2$s", "默认", ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统数据同步代理[%1$s]发生异常，%2$s", "默认", ex.getMessage()), ex);
			}
		}
		return this.iSysNotifyAgentRuntime;
	}

	@Override
	public ISysMsgQueueRuntime getSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue) {
		Assert.notNull(iPSSysMsgQueue,"传入系统数据消息队列模型对象无效");
		ISysMsgQueueRuntime iSysMsgQueueRuntime = this.sysMsgQueueRuntimeMap.get(iPSSysMsgQueue.getDynaModelFilePath());
		if (iSysMsgQueueRuntime == null) {
			iSysMsgQueueRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysMsgQueueRuntime(iPSSysMsgQueue);
			try {
				iSysMsgQueueRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysMsgQueue);
				this.sysMsgQueueRuntimeMap.put(iPSSysMsgQueue.getDynaModelFilePath(), iSysMsgQueueRuntime);

			} catch (Exception ex) {
				log.error(String.format("初始化系统消息队列[%1$s]发生异常，%2$s", iPSSysMsgQueue.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统消息队列[%1$s]发生异常，%2$s", iPSSysMsgQueue.getName(), ex.getMessage()), ex);
			}
		}
		return iSysMsgQueueRuntime;
	}

	@Override
	public ISysMsgTemplRuntime getSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl) {
		Assert.notNull(iPSSysMsgTempl,"传入系统数据消息模板模型对象无效");
		ISysMsgTemplRuntime iSysMsgTemplRuntime = this.sysMsgTemplRuntimeMap.get(iPSSysMsgTempl.getDynaModelFilePath());
		if (iSysMsgTemplRuntime == null) {
			iSysMsgTemplRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysMsgTemplRuntime(iPSSysMsgTempl);
			try {
				iSysMsgTemplRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysMsgTempl);
				this.sysMsgTemplRuntimeMap.put(iPSSysMsgTempl.getDynaModelFilePath(), iSysMsgTemplRuntime);

			} catch (Exception ex) {
				log.error(String.format("初始化系统消模板[%1$s]发生异常，%2$s", iPSSysMsgTempl.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统消息模板[%1$s]发生异常，%2$s", iPSSysMsgTempl.getName(), ex.getMessage()), ex);
			}
		}
		return iSysMsgTemplRuntime;
	}

	@Override
	public ISysMsgTargetRuntime getSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget) {
		Assert.notNull(iPSSysMsgTarget,"传入系统数据消息目标模型对象无效");
		ISysMsgTargetRuntime iSysMsgTargetRuntime = this.sysMsgTargetRuntimeMap.get(iPSSysMsgTarget.getDynaModelFilePath());
		if (iSysMsgTargetRuntime == null) {
			iSysMsgTargetRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysMsgTargetRuntime(iPSSysMsgTarget);
			try {
				iSysMsgTargetRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysMsgTarget);
				this.sysMsgTargetRuntimeMap.put(iPSSysMsgTarget.getDynaModelFilePath(), iSysMsgTargetRuntime);

			} catch (Exception ex) {
				log.error(String.format("初始化系统消息目标[%1$s]发生异常，%2$s", iPSSysMsgTarget.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统消息目标[%1$s]发生异常，%2$s", iPSSysMsgTarget.getName(), ex.getMessage()), ex);
			}
		}
		return iSysMsgTargetRuntime;
	}

	@Override
	public IPSSysLogic getPSSysLogic(String strName) {
		return this.psSysLogicMap.get(strName.toUpperCase());
	}

	@Override
	public ISysLogicRuntime getSysLogicRuntime(IPSSysLogic iPSSysLogic) {
		Assert.notNull(iPSSysLogic,"传入系统预置逻辑模型对象无效");
		
		ISysLogicRuntime iSysLogicRuntime = this.sysLogicRuntimeMap.get(iPSSysLogic.getDynaModelFilePath());
		if (iSysLogicRuntime == null) {
			iSysLogicRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysLogicRuntime(iPSSysLogic);
			try {
				iSysLogicRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysLogic);
				this.sysLogicRuntimeMap.put(iPSSysLogic.getDynaModelFilePath(), iSysLogicRuntime);
			} catch (Exception ex) {
				log.error(String.format("初始化系统逻辑[%1$s]发生异常，%2$s", iPSSysLogic.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统逻辑[%1$s]发生异常，%2$s", iPSSysLogic.getName(), ex.getMessage()), ex);
			}
		}
		return iSysLogicRuntime;
	}

	@Override
	public IPSWFRole getPSWFRole(String strName) {
		return this.psWFRoleMap.get(strName.toUpperCase());
	}

	@Override
	public IWFRoleRuntime getWFRoleRuntime(IPSWFRole iPSWFRole) {
		Assert.notNull(iPSWFRole,"传入系统工作流角色模型对象无效");
		IWFRoleRuntime iWFRoleRuntime = this.wfRoleRuntimeMap.get(iPSWFRole.getDynaModelFilePath());
		if (iWFRoleRuntime == null) {
			iWFRoleRuntime = this.getSystemRuntimeContext().getSystemRuntime().createWFRoleRuntime(iPSWFRole);
			try {
				iWFRoleRuntime.init(this.getSystemRuntimeBaseContext(), iPSWFRole);
				this.wfRoleRuntimeMap.put(iPSWFRole.getDynaModelFilePath(), iWFRoleRuntime);
			} catch (Exception ex) {
				log.error(String.format("初始化工作流角色[%1$s]发生异常，%2$s", iPSWFRole.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化工作流角色[%1$s]发生异常，%2$s", iPSWFRole.getName(), ex.getMessage()), ex);
			}
		}
		return iWFRoleRuntime;
	}
	
	
	@Override
	public ISysDTSQueueRuntime getSysDTSQueueRuntime(IPSSysDTSQueue iPSSysDTSQueue) {
		Assert.notNull(iPSSysDTSQueue,"传入系统数据异步处理队列模型对象无效");
		ISysDTSQueueRuntime iSysDTSQueueRuntime = this.sysDTSQueueRuntimeMap.get(iPSSysDTSQueue.getDynaModelFilePath());
		if (iSysDTSQueueRuntime == null) {
			iSysDTSQueueRuntime = this.getSystemRuntimeContext().getSystemRuntime().createSysDTSQueueRuntime(iPSSysDTSQueue);
			try {
				iSysDTSQueueRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysDTSQueue);
				this.sysDTSQueueRuntimeMap.put(iPSSysDTSQueue.getDynaModelFilePath(), iSysDTSQueueRuntime);
				this.sysDTSQueueRuntimeList.add(iSysDTSQueueRuntime);

			} catch (Exception ex) {
				log.error(String.format("初始化系统异步处理队列[%1$s]发生异常，%2$s", iPSSysDTSQueue.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this, String.format("初始化系统异步处理队列[%1$s]发生异常，%2$s", iPSSysDTSQueue.getName(), ex.getMessage()), ex);
			}
		}
		return iSysDTSQueueRuntime;
	}
	
	
	@Override
	public Collection<ISysDTSQueueRuntime> getSysDTSQueueRuntimes() {
		if (ObjectUtils.isEmpty(this.sysDTSQueueRuntimeList)) {
			return null;
		}
		return this.sysDTSQueueRuntimeList;
	}
	
	
	
	
	
	@Override
	public Object getGlobalParam(String strKey) {
		return globalParamMap.get(strKey);
	}
	
	@Override
	public void setGlobalParam(String strKey, Object objValue) {
		this.globalParamMap.put(strKey, objValue);
	}
	
	
	@Override
	public IPSDERBase getPSDER(String strPSDERId, boolean tryMode) {
		Assert.hasLength(strPSDERId, "传入关系标识无效");
		List<IPSDataEntity> psDataEntityList = this.getPSSystem().getAllPSDataEntities();
		if(!ObjectUtils.isEmpty(psDataEntityList)) {
			for(IPSDataEntity iPSDataEntity : psDataEntityList) {
				List<IPSDERBase> psDERBaseList = iPSDataEntity.getMinorPSDERs();
				if(!ObjectUtils.isEmpty(psDERBaseList)) {
					for(IPSDERBase iPSDERBase : psDERBaseList) {
						if(strPSDERId.equals(iPSDERBase.getId())) {
							return iPSDERBase;
						}
					}
				}
			}
		}
		if(tryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, String.format("指定实体关系模型对象[%1$s]不存在", strPSDERId));
	}
	
	
	/**
	 * 是否支持工作流相关运行时
	 * @return
	 */
	protected boolean isEnableWFRuntime() {
		return false;
	}
	
	protected void onBeforeInit() throws Exception {
		
	}
	
	protected void onBeforeStart() throws Exception {
		
	}
	
	protected void onStart() throws Exception {
		
	}
	
	protected void onAfterStart() throws Exception {
		
	}


	/**
	 * 系统加载触发
	 * @throws Exception
	 */
	protected void onLoad() throws Exception {
	
	}
	
	
	
	
	/**
	 * 系统关闭触发
	 * @throws Exception
	 */
	protected void onShutdown() throws Exception {
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysValueRuleRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysSequenceRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysTranslatorRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.codeListRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysDataSyncAgentRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysMsgQueueRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysMsgTemplRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysMsgTargetRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysLogicRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.wfRoleRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysDTSQueueRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysValueRuleRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntime(this.iSysNotifyAgentRuntime);
	}
	
	
	
	
}
