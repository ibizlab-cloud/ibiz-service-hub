package net.ibizsys.central.sysutil;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.model.dataentity.PSDEGroupDetailImpl;
import net.ibizsys.model.dataentity.PSSysDEGroupImpl;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.DEActionLogicAttachModes;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysDEDataSyncOutUtilRuntimeBase extends SysUtilRuntimeBase implements ISysDEDataSyncOutUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDEDataSyncOutUtilRuntimeBase.class);
	
	private Map<String, IPSDEGroupDetail> psDEGroupDetailMap = new LinkedHashMap<String, IPSDEGroupDetail>();

	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	@Override
	protected void onInit() throws Exception {

		if(ObjectUtils.isEmpty(this.getPSDEGroupDetails())) {
			IPSSysDEGroup iPSDEGroup = this.getPSSysUtil().getPSSysDEGroup();
			if (iPSDEGroup == null) {
				if(this.getPSSysUtil().getUtilPSDE() != null) {
					ObjectNode psSysDEGroupNode = JsonUtils.createObjectNode();
					psSysDEGroupNode.put(PSSysDEGroupImpl.ATTR_GETID, this.getId());
					psSysDEGroupNode.put(PSSysDEGroupImpl.ATTR_GETNAME, String.format("系统实体数据同步组件[%1$s]自动实体组", this.getName()));
					psSysDEGroupNode.put(PSSysDEGroupImpl.ATTR_GETCODENAME, this.getPSSysUtil().getCodeName());
					ArrayNode psDEGroupDetailsNode = psSysDEGroupNode.putArray(PSSysDEGroupImpl.ATTR_GETPSDEGROUPDETAILS);
					ObjectNode psDEGroupDetailNode = psDEGroupDetailsNode.addObject();
					psDEGroupDetailNode.put(PSDEGroupDetailImpl.ATTR_GETID, this.getPSSysUtil().getUtilPSDE().getName());
					psDEGroupDetailNode.put(PSDEGroupDetailImpl.ATTR_GETNAME, this.getPSSysUtil().getUtilPSDE().getName());
					PSModelUtils.putRefPSModelObject(psDEGroupDetailNode, PSDEGroupDetailImpl.ATTR_GETPSDATAENTITY, this.getPSSysUtil().getUtilPSDE());
					iPSDEGroup = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(IPSSysDEGroup.class, psSysDEGroupNode);
				}
				else {
					throw new Exception("未指定系统实体组模型对象");
				}
				
			}
			
			List<IPSDEGroupDetail> psDEGroupDetailList = iPSDEGroup.getPSDEGroupDetails();
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
							
							this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeBaseIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionLogicRuntimeBase() {
								@Override
								public String getAttachMode() {
									return DEActionLogicAttachModes.AFTER;
								}
								
								@Override
								public Object execute(net.ibizsys.central.dataentity.IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable {
									return onAfterCreate(iDataEntityRuntimeContext, iPSDEAction, args, ret);
								}
							});
							continue;
						}
						
						if(DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
							this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeBaseIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionLogicRuntimeBase() {
								@Override
								public String getAttachMode() {
									return DEActionLogicAttachModes.AFTER;
								}
								
								@Override
								public Object execute(net.ibizsys.central.dataentity.IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable {
									return onAfterUpdate(iDataEntityRuntimeContext, iPSDEAction, args, ret);
								}
							});
							continue;
						}
						
						if(DEActionModes.REMOVE.equals(iPSDEAction.getActionMode())
								|| DEActionModes.DELETE.equals(iPSDEAction.getActionMode())){
							this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeBaseIf(iPSDataEntity.getId(), iPSDEAction.getName(), new IDEActionLogicRuntimeBase() {
								@Override
								public String getAttachMode() {
									return DEActionLogicAttachModes.BEFORE;
								}
								
								@Override
								public Object execute(net.ibizsys.central.dataentity.IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable {
									return onBeforeRemove(iDataEntityRuntimeContext, iPSDEAction, args, ret);
								}
							});
							continue;
						}
					}
				}
			}
		}
	}
	
	protected Object onAfterCreate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable{
		if(ret instanceof IEntityDTO) {
			onAfterCreate(iDataEntityRuntimeContext, iPSDEAction, (IEntityDTO)ret);
		}
		else
			if(args != null && args.length != 0 && args[0] instanceof IEntityDTO) {
				onAfterCreate(iDataEntityRuntimeContext, iPSDEAction, (IEntityDTO)args[0]);
			}
		return ret;
	}
	
	protected void onAfterCreate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable{
		
	}
	
	protected Object onAfterUpdate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable{
		if(ret instanceof IEntityDTO) {
			onAfterUpdate(iDataEntityRuntimeContext, iPSDEAction, (IEntityDTO)ret);
		}
		else
			if(args != null && args.length != 0 && args[0] instanceof IEntityDTO) {
				onAfterUpdate(iDataEntityRuntimeContext, iPSDEAction, (IEntityDTO)args[0]);
			}
		return ret;
	}
	
	protected void onAfterUpdate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable{
		
	}
	
	
	protected Object onBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable{
		Object key = null;
		if(args != null && args.length != 0 && args[0] instanceof IEntityDTO) {
			key = iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue((IEntityDTO)args[0]);
		}
		else
			if(args != null && args.length != 0) {
				key = DataTypeUtils.asSimple(args[0]);
			}
		
		if(!ObjectUtils.isEmpty(key)) {
			IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)iDataEntityRuntimeContext.getDataEntityRuntime();
			IEntityDTO iEntityDTO = iDataEntityRuntime.getLastEntity();
			if(iEntityDTO == null) {
				iEntityDTO = iDataEntityRuntime.getSessionEntityIf(key);
			}
			if(iEntityDTO != null) {
				onBeforeRemove(iDataEntityRuntimeContext, iPSDEAction, iEntityDTO);
			}
		}
		
		return ret;
	}
	
	protected void onBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable{
		
	}

	@Override
	protected void onUninstall() throws Throwable {
		this.getDEMethodPluginRuntimeRepo().shutdown();
		super.onUninstall();
	}
}
