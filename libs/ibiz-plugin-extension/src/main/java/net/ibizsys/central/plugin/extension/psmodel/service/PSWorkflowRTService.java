package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflow;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWorkflowFilter;

public class PSWorkflowRTService extends net.ibizsys.psmodel.runtime.service.PSWorkflowRTService {

	@Override
	protected PSWorkflow doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, key);
			
//			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_SCOPE_TAG, strPSDEId);
//			searchContextDTO.eq(V2SystemExtensionWorkflow.FIELD_FIELD_TAG, key);
			
			Page<V2SystemExtensionWorkflow> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflows(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSWorkflow> psWorkflowList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, PSWorkflow.class);
				if(!ObjectUtils.isEmpty(psWorkflowList)) {
					return psWorkflowList.get(0);
				}
			}
		}
		return super.doGet(key, tryMode);
	}
	
	@Override
	protected List<PSWorkflow> getDomainList(String strDataSetName, PSWorkflowFilter f) throws Exception {
		List<PSWorkflow> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}
		
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.all();
		
	
		Page<V2SystemExtensionWorkflow> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflows(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
		if(ObjectUtils.isEmpty(page) ||ObjectUtils.isEmpty(page.getContent())) {
			return list;
		}
		
		List<PSWorkflow> psWorkflowList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflow.FIELD_WORKFLOW_TAG, PSWorkflow.class);
		return this.filterDomainList(ExtensionUtils.replacePSModelList(list, psWorkflowList, PSWorkflow.class), strDataSetName, f);
	}
	
	@Override
	public <T> T getPSModelObject(String key, Class<T> cls, boolean tryMode) throws Exception {
		// TODO Auto-generated method stub
		return super.getPSModelObject(key, cls, tryMode);
	}
}
