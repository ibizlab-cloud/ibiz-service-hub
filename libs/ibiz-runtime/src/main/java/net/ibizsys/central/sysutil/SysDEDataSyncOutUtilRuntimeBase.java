package net.ibizsys.central.sysutil;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;

public abstract class SysDEDataSyncOutUtilRuntimeBase extends SysUtilRuntimeBase implements ISysDEDataSyncOutUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDEDataSyncOutUtilRuntimeBase.class);
	
	private Map<String, IPSDEGroupDetail> psDEGroupDetailMap = new LinkedHashMap<String, IPSDEGroupDetail>();

	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	@Override
	protected void onInit() throws Exception {

		if(ObjectUtils.isEmpty(this.getPSDEGroupDetails())) {
			if (this.getPSSysUtil().getPSSysDEGroup() == null) {
				throw new Exception("未指定系统实体组模型对象");
			}
			
			List<IPSDEGroupDetail> psDEGroupDetailList = this.getPSSysUtil().getPSSysDEGroupMust().getPSDEGroupDetails();
			if(ObjectUtils.isEmpty(psDEGroupDetailList)) {
				throw new Exception("指定系统实体组未包含成员对象");
			}
			
			for(IPSDEGroupDetail psDEGroupDetail : psDEGroupDetailList) {
				this.psDEGroupDetailMap.put(psDEGroupDetail.getPSDataEntityMust().getId(), psDEGroupDetail);
			}
		}

		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
		super.onInit();
	}
	
	protected Collection<IPSDEGroupDetail> getPSDEGroupDetails() {
		return this.psDEGroupDetailMap.values();
	}
	
	protected IPSDEGroupDetail getPSDEGroupDetail(String strPSDEId, boolean bTryMode) throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = this.psDEGroupDetailMap.get(strPSDEId);
		if(iPSDEGroupDetail != null || bTryMode) {
			return iPSDEGroupDetail;
		}
		throw new Exception(String.format("无法获取指定实体[%1$s]对应的实体组成员模型对象", strPSDEId));
	}
	
	protected IPSDEGroupDetail tryGetPSDEGroupDetail(String strPSDEId) {
		try {
			return this.getPSDEGroupDetail(strPSDEId, true);
		} catch (Exception ex) {
			log.error(ex);
			return null;
		}
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

		this.onRegisterDEMethodPluginRuntimes();
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {
		
		Collection<IPSDEGroupDetail> psDEGroupDetailList = this.getPSDEGroupDetails();
		if(!ObjectUtils.isEmpty(psDEGroupDetailList)) {
			for(IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
				IPSDataEntity iPSDataEntity = iPSDEGroupDetail.getPSDataEntityMust();
				List<IPSDEAction> psDEActions = iPSDataEntity.getAllPSDEActions();
				if(!ObjectUtils.isEmpty(psDEActions)) {
					for(IPSDEAction iPSDEAction : psDEActions) {
						if(DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
							
							this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
								@Override
								public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
									return doCreate(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
								}
							});
							continue;
						}
						
						if(DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
							this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
								@Override
								public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
									return doUpdate(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
								}
							});
							continue;
						}
						
						if(DEActionModes.REMOVE.equals(iPSDEAction.getActionMode())
								|| DEActionModes.DELETE.equals(iPSDEAction.getActionMode())){
							this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
								@Override
								public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
									return doRemove(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
								}
							});
							continue;
						}
						
						if(DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
							this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntimeIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionPluginRuntime() {
								@Override
								public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
									return doGet(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
								}
							});
							continue;
						}
					}
				}
				
				List<IPSDEDataSet> psDEDataSets = iPSDataEntity.getAllPSDEDataSets();
				if(!ObjectUtils.isEmpty(psDEDataSets)) {
					for(IPSDEDataSet iPSDEDataSet : psDEDataSets) {
						this.getDEMethodPluginRuntimeRepo().registerDEDataSetPluginRuntimeIf(iPSDataEntity.getId(), iPSDEDataSet.getName(), new IDEDataSetPluginRuntime() {
							@Override
							public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
								return doFetch(iDataEntityRuntimeContext, iPSDEDataSet, args, actionData);
							}
						});
						continue;
					}
				}
			}
		}
	}
	
	protected abstract Object doCreate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	protected abstract Object doUpdate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	protected abstract Object doRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	protected abstract Object doGet(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	protected abstract Object doFetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;
	

	@Override
	protected void onUninstall() throws Throwable {
		this.getDEMethodPluginRuntimeRepo().shutdown();
		super.onUninstall();
	}
}
