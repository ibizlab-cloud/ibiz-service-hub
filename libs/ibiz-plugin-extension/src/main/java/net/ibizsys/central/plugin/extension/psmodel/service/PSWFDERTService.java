package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflow;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.PredefinedViewType;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWFDEFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSWFDERTService extends net.ibizsys.psmodel.runtime.service.PSWFDERTService {

	private static final Log log = LogFactory.getLog(PSWFDERTService.class);
	
	@Override
	protected PSWFDE doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSWFId = getParentId(key);
			
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, strPSWFId);
			
//			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_SCOPE_TAG, strPSDEId);
//			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_FIELD_TAG, key);
			
			Page<V2SystemExtensionWorkflow> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflows(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSWorkflow> psWorkflowList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, PSWorkflow.class);
				if(!ObjectUtils.isEmpty(psWorkflowList)) {
					PSWorkflow psWorkflow = psWorkflowList.get(0);
					PSWFDE psWFDE = new PSWFDE();
					int nPos = psWorkflow.getPSWorkflowId().lastIndexOf("_wf");
					if(nPos!=-1) {
						psWFDE.setPSDEId(psWorkflow.getPSWorkflowId().substring(0, nPos));
						IPSModelRTService iPSModelRTService = (IPSModelRTService)iExtensionPSModelRTServiceSession.getPSModelService(PSModels.PSDATAENTITY, false);
						IPSDataEntity iPSDataEntity = (IPSDataEntity)iPSModelRTService.getPSModelObject(psWFDE.getPSDEId(), IPSDataEntity.class, false);
						List<IPSDEWF> psDEWFList = iPSDataEntity.getAllPSDEWFs();
						if(!ObjectUtils.isEmpty(psDEWFList)) {
							PSWFDE defaultPSWFDE = (PSWFDE)iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEWF.class, false).decompile(iExtensionPSModelRTServiceSession, psDEWFList.get(0), null, false);
							defaultPSWFDE.copyTo(psWFDE);
						}
					}
					
					psWFDE.setCodeName("default");
					psWFDE.setPSWFId(psWorkflow.getPSWorkflowId());
					psWFDE.setPSWFName(psWorkflow.getPSWorkflowName());
					psWFDE.setPSWFDEName(psWorkflow.getPSWorkflowName());
					psWFDE.setWFCodeName(psWorkflow.getCodeName());
					psWFDE.setWFCatCode(psWorkflow.getWFCatCode());
					
					psWFDE.setPSWFDEId(String.format("%1$s.%2$s", psWFDE.getPSWFId(), psWFDE.getCodeName()));
					psWFDE.set(ExtensionUtils.FIELD_PSDYNAINSTID, psWorkflow.get(ExtensionUtils.FIELD_PSDYNAINSTID));
					
					return fillPSDEViewInfo(psWFDE);
				}
			}
		}
		return fillPSDEViewInfo(super.doGet(key, tryMode));
	}
	
	
	@Override
	protected List<PSWFDE> getDomainList(String strDataSetName, PSWFDEFilter f) throws Exception {
		IPSWorkflow iPSWorkflow = null;
		Object objPSWFId = f.getFieldCond(PSWFVersion.FIELD_PSWFID, IPSModelFilter.EQ);
		List<PSWFDE> list = null;
		if (!ObjectUtils.isEmpty(objPSWFId)) {
			iPSWorkflow = getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)objPSWFId, true);
			list = iPSWorkflow!=null? super.getDomainList(strDataSetName, f):new ArrayList<PSWFDE>();
		}
		else {
			list = super.getDomainList(strDataSetName, f);
		}
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}
		
		Object objPSDEId = f.getFieldCond(PSWFDE.FIELD_PSDEID, IPSModelFilter.EQ);
		
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();
		if(objPSDEId!=null) {
			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_DATA_ENTITY_TAG, objPSDEId);
		}
	
		Page<V2SystemExtensionWorkflow> page =	iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflows(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
		if(ObjectUtils.isEmpty(page) ||ObjectUtils.isEmpty(page.getContent())) {
			return list;
		}
		
		List<PSWorkflow> psWorkflowList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, PSWorkflow.class);
		if(!ObjectUtils.isEmpty(psWorkflowList)) {
			List<PSWFDE> list2 = new ArrayList<PSWFDE>();
			for(PSWorkflow psWorkflow : psWorkflowList) {
				PSWFDE psWFDE = new PSWFDE();
				int nPos = psWorkflow.getPSWorkflowId().lastIndexOf("_wf");
				if(nPos!=-1) {
					psWFDE.setPSDEId(psWorkflow.getPSWorkflowId().substring(0, nPos));
					IPSModelRTService iPSModelRTService = (IPSModelRTService)iExtensionPSModelRTServiceSession.getPSModelService(PSModels.PSDATAENTITY, false);
					IPSDataEntity iPSDataEntity = (IPSDataEntity)iPSModelRTService.getPSModelObject(psWFDE.getPSDEId(), IPSDataEntity.class, false);
					List<IPSDEWF> psDEWFList = iPSDataEntity.getAllPSDEWFs();
					if(!ObjectUtils.isEmpty(psDEWFList)) {
						PSWFDE defaultPSWFDE = (PSWFDE)iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEWF.class, false).decompile(iExtensionPSModelRTServiceSession, psDEWFList.get(0), null, false);
						defaultPSWFDE.copyTo(psWFDE);
					}
				}
				psWFDE.setCodeName("default");
				psWFDE.setPSWFId(psWorkflow.getPSWorkflowId());
				psWFDE.setPSWFName(psWorkflow.getPSWorkflowName());
				psWFDE.setPSWFDEName(psWorkflow.getPSWorkflowName());
				psWFDE.setPSWFDEId(String.format("%1$s.%2$s", psWFDE.getPSWFId(), psWFDE.getCodeName()));
				psWFDE.setWFCodeName(psWorkflow.getCodeName());
				psWFDE.setWFCatCode(psWorkflow.getWFCatCode());
				
				list2.add(psWFDE);
			}
			list = ExtensionUtils.replacePSModelList(list, list2, PSWFDE.class);
		}
		return this.filterDomainList(list, strDataSetName, f);
 	}
	

	@Override
	protected void doCreate(PSWFDE m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		
		if(!StringUtils.hasLength(m.getPSDEId())) {
			throw new Exception("未传入实体标识");
		}
		
		PSDataEntity psDataEntity = (PSDataEntity) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY).get(m.getPSDEId(), false);
		
		String strCodeName = String.format("wf%1$s", new Random().nextInt(999999));
		String strWFId = String.format("%1$s_%2$s", m.getPSDEId(), strCodeName);
		
		String[] items = strWFId.split("[.]");
		strCodeName = items[items.length - 1];
		
		PSWorkflow psWorkflow = new PSWorkflow();
		psWorkflow.setPSWorkflowId(strWFId);
		psWorkflow.setPSWorkflowName(m.getPSWFDEName());
		psWorkflow.setPSModuleId(psDataEntity.getPSModuleId());
		psWorkflow.setPSModuleName(psDataEntity.getPSModuleName());
		psWorkflow.setCodeName(strCodeName);
	
		
		V2SystemExtensionWorkflow v2SystemExtensionWorkflow = new V2SystemExtensionWorkflow();
		v2SystemExtensionWorkflow.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		v2SystemExtensionWorkflow.setScopeTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionWorkflow.setWorkflowTag(strWFId);
		v2SystemExtensionWorkflow.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionWorkflow.setExtensionModel(JsonUtils.toString(psWorkflow));
		v2SystemExtensionWorkflow.setPendingExtensionModel(v2SystemExtensionWorkflow.getExtensionModel());
		
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionWorkflow(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionWorkflow);
		
		
		m.setCodeName("default");
		m.setPSWFId(strWFId);
		m.setPSWFName(m.getPSDEName());
		m.setPSWFDEId(String.format("%1$s.%2$s", m.getPSWFId(), m.getCodeName()));
		m.setWFCodeName(psWorkflow.getCodeName());
		m.setWFCatCode(psWorkflow.getWFCatCode());
	}
	
	@Override
	protected PSWFDE getLast(PSWFDE m) throws Exception {
		return this.get(m.getId(), false);
	}
	
	@Override
	protected void doMergeLast(PSWFDE m, PSWFDE last) throws Exception {
		m.resetPSWFId();
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.resetWFCodeName();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}
	
	@Override
	protected void doUpdate(PSWFDE m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSDynaInstId = ExtensionUtils.getApplyPSDynaInstId(m, false);
		
		PSWorkflow psWorkflow = (PSWorkflow) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSWORKFLOW).get(m.getPSWFId(), false);
		
		
		String strWFId = getParentId(m.getId());
		
		psWorkflow.setPSWorkflowId(strWFId);
		psWorkflow.setPSWorkflowName(m.getPSWFDEName());
		psWorkflow.setCodeName(PSModelUtils.getSimpleId(strWFId));
		if(StringUtils.hasLength(m.getWFCatCode())) {
			psWorkflow.setWFCatCode(m.getWFCatCode());
		}
		
		V2SystemExtensionWorkflow v2SystemExtensionWorkflow = new V2SystemExtensionWorkflow();
		v2SystemExtensionWorkflow.setName(psWorkflow.getPSWorkflowName());
		v2SystemExtensionWorkflow.setPendingExtensionModel(ExtensionUtils.toExtensionModel(psWorkflow));
		v2SystemExtensionWorkflow = iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionWorkflow(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionWorkflow);
	
	
		m.setPSWFName(psWorkflow.getPSWorkflowName());
	}
	
	protected PSWFDE fillPSDEViewInfo(PSWFDE psWFDE) throws Exception{
		//获取实体
		if(!StringUtils.hasLength(psWFDE.getPSDEId())) {
			return psWFDE;
		}
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		
		//获取相关实体
		IPSModelRTService<?> iPSDataEntityRTService = (IPSModelRTService<?>)iExtensionPSModelRTServiceSession.getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = iPSDataEntityRTService.getPSModelObject(psWFDE.getPSDEId(), IPSDataEntity.class, false);
		
//		IPSApplication webPSApplication = null;
//		IPSApplication mobPSApplication = null;
		IPSAppDEView webPSAppDEView = null;
		IPSAppDEView mobPSAppDEView = null;
		//枚举应用
		List<IPSApplication> psApplications = iExtensionPSModelRTServiceSession.getPSSystemService().getPSSystem().getAllPSApps();
		if(!ObjectUtils.isEmpty(psApplications)) {
			for(IPSApplication iPSApplication : psApplications) {
				if(!iPSApplication.isMobileApp()) {
					if(webPSAppDEView == null) {
						webPSAppDEView = getPSAppDEView(iPSApplication, iPSDataEntity, PredefinedViewType.EDITVIEW.value, true);
					}
					
				}
				else {
					if(mobPSAppDEView == null) {
						mobPSAppDEView = getPSAppDEView(iPSApplication, iPSDataEntity, PredefinedViewType.MOBEDITVIEW.value, true);
					}
					
				}
			}
			if(webPSAppDEView != null) {
				psWFDE.setEditViewUri(String.format("view://%1$s?srfwftag=%2$s", webPSAppDEView.getCodeName(), psWFDE.getWFCodeName()));
			}
			if(mobPSAppDEView != null) {
				psWFDE.setMobEditViewUri(String.format("view://%1$s?srfwftag=%2$s", mobPSAppDEView.getCodeName(), psWFDE.getWFCodeName()));
			}
		}
		
	//	iExtensionPSModelRTServiceSession.getSystemRuntime().
		
		
		return psWFDE;
	}
	
	protected IPSAppDEView getPSAppDEView(IPSApplication iPSApplication, IPSDataEntity iPSDataEntity, String strFuncViewMode, boolean bTryMode) throws Exception{
		
		List<IPSAppView> psAppViews = iPSApplication.getAllPSAppViews();
		if(!ObjectUtils.isEmpty(psAppViews)) {
			for(IPSAppView iPSAppView : psAppViews) {
				if(!(iPSAppView instanceof IPSAppDEView)) {
					continue;
				}
				
				IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSAppView;
				if(!StringUtils.hasLength(iPSAppDEView.getFuncViewMode())) {
					continue;
				}
				
				if(!strFuncViewMode.equals(iPSAppDEView.getFuncViewMode())) {
					continue;
				}
				
				if(iPSAppDEView.getPSAppDataEntityMust().getPSDataEntityMust().getId().equals(iPSDataEntity.getId())) {
					return iPSAppDEView;
				}
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("无法从应用[%1$s]获取指定实体[%2$s]功能视图[%3$s]", iPSApplication.getName(), iPSDataEntity.getName(), strFuncViewMode));
		
	}
}
