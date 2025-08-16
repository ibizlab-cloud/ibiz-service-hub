package net.ibizsys.central.plugin.extension.system.util;

import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.DataEntityExtendLogicBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.defield.IDEFValueRuleRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.plugin.extension.dataentity.action.AddinDEActionLogicRuntimeBase;
import net.ibizsys.central.plugin.extension.dataentity.defield.AddinDEFValueRuleRuntimeBase;
import net.ibizsys.central.plugin.extension.system.IMainSysProxySystemModuleUtilRuntimeContext;
import net.ibizsys.model.PSModelEnums.ModuleUtilType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.dataentity.action.DEActionLogicTypes;

public class MainSysDataEntityRuntimeProxy extends MainSysModelRuntimeProxyBase<IPSDataEntity, IDataEntityRuntime> {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MainSysDataEntityRuntimeProxy.class);
	
	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();
	
	public MainSysDataEntityRuntimeProxy(IMainSysProxySystemModuleUtilRuntimeContext iMainSysProxySystemModuleUtilRuntimeContext, IPSDataEntity iPSModelObject, IDataEntityRuntime realObject) throws Exception {
		super(iMainSysProxySystemModuleUtilRuntimeContext, iPSModelObject, realObject);
	}
	
	@Override
	protected void onInit() throws Exception {
		this.deMethodPluginRuntimeRepo.init(this.getContext().getSystemRuntimeContext().getSystemRuntime(), true);
		super.onInit();
		
		
	}
	
	@Override
	protected void onAsyncInit() throws Exception {
		super.onAsyncInit();
		
		this.getDEMethodPluginRuntimeRepo().registerDataEntityExtendLogic(this.getRealObject(), new DataEntityExtendLogicBase(this.getContext().getSystemRuntimeContext().getSystemRuntime(), this.getPSModelObject()) {
		});
		
		this.prepareDEActionLogicRuntimes();
		this.prepareDEFValueRuleRuntimes();
		this.prepareDERRuntimes();
	}
	
	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}
	
	protected void prepareDEActionLogicRuntimes() throws Exception {
		List<IPSDEAction> psDEActions = this.getPSModelObject().getAllPSDEActions();
		if(ObjectUtils.isEmpty(psDEActions)) {
			return;
		}
		
		for(IPSDEAction iPSDEAction : psDEActions) {
			prepareDEActionLogicRuntimes(iPSDEAction, iPSDEAction.getPreparePSDEActionLogics());
			prepareDEActionLogicRuntimes(iPSDEAction, iPSDEAction.getCheckPSDEActionLogics());
			prepareDEActionLogicRuntimes(iPSDEAction, iPSDEAction.getBeforePSDEActionLogics());
			prepareDEActionLogicRuntimes(iPSDEAction, iPSDEAction.getAfterPSDEActionLogics());
		}
	}
	
	protected void prepareDEActionLogicRuntimes(IPSDEAction iPSDEAction, List<IPSDEActionLogic> list) throws Exception {
		if(ObjectUtils.isEmpty(list)) {
			return ;
		}
		
		for(IPSDEActionLogic iPSDEActionLogic : list) {
			if(this.isEnablePSDEActionLogic(iPSDEActionLogic)) {
				this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeBaseIf(this.getRealObject(), iPSDEAction.getName(), this.createDEActionLogicRuntimeBase(iPSDEActionLogic));
			}
			else {
				log.warn(String.format("实体[%1$s]行为[%2$s]附加逻辑类型[%3$s]未支持，忽略注入", this.getRealObject().getFullUniqueTag(), iPSDEAction.getName(), iPSDEActionLogic.getActionLogicType()));
			}
		}
	}
	
	protected IDEActionLogicRuntimeBase createDEActionLogicRuntimeBase(IPSDEActionLogic iPSDEActionLogic) throws Exception{
		return new AddinDEActionLogicRuntimeBase(this.getContext().getSystemRuntimeContext().getSystemRuntime(), iPSDEActionLogic);
	}
	
	protected boolean isEnablePSDEActionLogic(IPSDEActionLogic iPSDEActionLogic) {
		switch(iPSDEActionLogic.getActionLogicType()) {
		case DEActionLogicTypes.EXTERNAL:
		case DEActionLogicTypes.DSTDELOGIC:
			return true;
		default:
			return false;
		}
	}
	
	protected void prepareDEFValueRuleRuntimes() throws Exception {
		List<IPSDEField> psDEFields = this.getPSModelObject().getAllPSDEFields();
		if(ObjectUtils.isEmpty(psDEFields)) {
			return;
		}
		
		for(IPSDEField iPSDEField : psDEFields) {
			prepareDEFValueRuleRuntimes(iPSDEField, iPSDEField.getAllPSDEFValueRules());
		}
	}
	
	protected void prepareDEFValueRuleRuntimes(IPSDEField iPSDEField, List<IPSDEFValueRule> list) throws Exception {
		if(ObjectUtils.isEmpty(list)) {
			return;
		}
		
		for(IPSDEFValueRule iPSDEFValueRule : list) {
			if(this.isEnablePSDEFValueRule(iPSDEFValueRule)) {
				this.getDEMethodPluginRuntimeRepo().registerDEFValueRuleRuntimeBaseIf(this.getRealObject(), iPSDEField.getName(), this.createDEFValueRuleRuntimeBase(iPSDEFValueRule));
			}
			else {
				log.warn(String.format("实体[%1$s]属性[%2$s]值规则[%3$s]未支持，忽略注入", this.getRealObject().getFullUniqueTag(), iPSDEField.getName(), iPSDEFValueRule.getName()));
			}
		}
	}
	
	protected IDEFValueRuleRuntimeBase createDEFValueRuleRuntimeBase(IPSDEFValueRule iPSDEFValueRule) throws Exception{
		return new AddinDEFValueRuleRuntimeBase(this.getContext().getSystemRuntimeContext().getSystemRuntime(), this.getRealObject(), iPSDEFValueRule);
	}
	
	protected boolean isEnablePSDEFValueRule(IPSDEFValueRule iPSDEFValueRule) {
		if(iPSDEFValueRule.isDefaultMode()) {
			return false;
		}
		return iPSDEFValueRule.isCheckDefault();
	}

	
	protected void prepareDERRuntimes() throws Exception {
		//实体主关系
		List<IPSDERBase> psDERBaseList = this.getPSModelObject().getMajorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				
				//判断从实体非主系统代理
				IPSDataEntity minorPSDataEntity = iPSDERBase.getMinorPSDataEntityMust();
				if(ModuleUtilType.MAINSYSPROXY.value.equals(minorPSDataEntity.getPSSystemModuleMust().getUtilType())) {
					continue;
				}
				
				this.deMethodPluginRuntimeRepo.registerDERRuntimeBaseIf(iPSDERBase);
				continue;
			}
		}
	}
	
	@Override
	protected void onStop() throws Exception {
		this.deMethodPluginRuntimeRepo.shutdown();
		super.onStop();
	}
}
