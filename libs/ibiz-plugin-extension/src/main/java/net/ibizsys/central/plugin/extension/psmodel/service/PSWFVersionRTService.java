package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.sysutil.ISysWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflowDefinition;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.codegen.groovy.engine.GroovyCodeGenEngine;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.model.wf.PSWorkflowImpl;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWFDEFilter;
import net.ibizsys.psmodel.core.filter.PSWFVersionFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.util.JsonUtils;

public class PSWFVersionRTService extends net.ibizsys.psmodel.runtime.service.PSWFVersionRTService {

	private static final Log log = LogFactory.getLog(PSWFVersionRTService.class);

	/**
	 * 行为：应用指定扩展流程版本
	 */
	final public static String METHOD_APPLY = "APPLY";

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSWFVersion domain = this.getDomain(params);
			return this.apply(domain);
		}

		return super.doInvoke(methodName, key, params);
	}


	
	@Override
	protected PSWFVersion doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSWFId = getParentId(key);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.WORKFLOW.value);
			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_WORKFLOW_TAG, strPSWFId);
			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_SCOPE_TAG, strPSWFId);
			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_WORKFLOW_DEFINITION_TAG, key);

			Page<V2SystemExtensionWorkflowDefinition> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflowDefinitions(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSWFVersion> psWFVersionList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflowDefinition.FIELD_WORKFLOW_DEFINITION_TAG, PSWFVersion.class);
				if (!ObjectUtils.isEmpty(psWFVersionList)) {
					return fillPSWFDE(psWFVersionList.get(0));
				}
			}

		}
		return fillPSWFDE(super.doGet(key, tryMode));
	}

	@Override
	protected void doCreate(PSWFVersion m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}

		PSWorkflow psWorkflow = (PSWorkflow) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSWORKFLOW, m.getPSWFId());

		V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition = new V2SystemExtensionWorkflowDefinition();
		v2SystemExtensionWorkflowDefinition.setScopeType(V2SystemExtensionScopeType.WORKFLOW.value);
		v2SystemExtensionWorkflowDefinition.setScopeTag(m.getPSWFId());
		v2SystemExtensionWorkflowDefinition.setWorkflowDefinitionTag(m.getId());
		v2SystemExtensionWorkflowDefinition.setWorkflowTag(psWorkflow.getPSWorkflowId());
		v2SystemExtensionWorkflowDefinition.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionWorkflowDefinition.setApplyFlag(0);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionWorkflowDefinition(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionWorkflowDefinition);
		m.set("applyflag", 0);
		
		fillPSWFDE(m);
	}

	@Override
	protected List<PSWFVersion> getDomainList(String strDataSetName, PSWFVersionFilter f) throws Exception {

		IPSWorkflow iPSWorkflow = null;
		Object objPSWFId = f.getFieldCond(PSWFVersion.FIELD_PSWFID, IPSModelFilter.EQ);
		List<PSWFVersion> list = null;
		if (!ObjectUtils.isEmpty(objPSWFId)) {
			iPSWorkflow = getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)objPSWFId, true);
			list = iPSWorkflow!=null? super.getDomainList(strDataSetName, f):new ArrayList<PSWFVersion>();
		}
		else {
			list = super.getDomainList(strDataSetName, f);
		}
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return fillPSWFDE(list);
		}

		if (ObjectUtils.isEmpty(objPSWFId)) {
			return fillPSWFDE(list);
		}

		String strPSWFId = objPSWFId.toString();

		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.WORKFLOW.value);
			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_WORKFLOW_TAG, strPSWFId);
			searchContextDTO.eq(V2SystemExtensionWorkflowDefinition.FIELD_SCOPE_TAG, strPSWFId);
			Page<V2SystemExtensionWorkflowDefinition> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionWorkflowDefinitions(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSWFVersion> psWFVersionList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionWorkflowDefinition.FIELD_WORKFLOW_DEFINITION_TAG, PSWFVersion.class);
				list = ExtensionUtils.replacePSModelList(list, psWFVersionList, PSWFVersion.class);
			}
		}
		
//		IPSWFDEService iPSWFDEService =	(IPSWFDEService)iExtensionPSModelRTServiceSession.getPSModelService(PSModels.PSWFDE);
//		PSWFDEFilter psWFDEFilter = new PSWFDEFilter();
//		psWFDEFilter.pswfid__eq(strPSWFId);
	//	iPSWFDEService.selectOne(f);

		fillPSWFDE(list);
		return this.filterDomainList(list, strDataSetName, f);
	}

	@Override
	public void update(PSWFVersion m, boolean get) throws Exception {
		PSWFVersion last = this.getLast(m);
		String strPSDynaInstId = (String) last.get("psdynainstid");
		if (!StringUtils.hasLength(strPSDynaInstId)) {
			m.setPSWFId(getParentId(m.getPSWFVersionId()));
			m.resetPSWFVersionId();
			m.resetPSWFVersionName();
			m.resetWFVersion();
			this.create(m, get);
			return;
		}

		super.update(m, get);
	}

	@Override
	protected PSWFVersion getLast(PSWFVersion m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSWFVersion m, PSWFVersion last) throws Exception {
		String strPSDynaInstId = (String) last.get("psdynainstid");
		if (!StringUtils.hasLength(strPSDynaInstId)) {
			throw new Exception("不能更新预置版本");
		}

		m.resetPSWFVersionName();
		m.resetPSWFId();
		m.resetWFVersion();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSWFVersion m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		String strPSDynaInstId = (String) m.get("psdynainstid");

		V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition = new V2SystemExtensionWorkflowDefinition();
		v2SystemExtensionWorkflowDefinition.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionWorkflowDefinition.setApplyFlag(0);

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionWorkflowDefinition(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionWorkflowDefinition);
		m.set("applyflag", 0);
		fillPSWFDE(m);
	}

	public Object apply(PSWFVersion m) throws Exception {
		return this.doApply(m);
	}

	protected Object doApply(PSWFVersion m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSWFVersion psWFVersion = this.get(m.getId(), false);
		String strPSDynaInstId = (String) psWFVersion.get("psdynainstid");
		if (!StringUtils.hasLength(strPSDynaInstId)) {
			throw new Exception("无法应用非动态扩展流程版本");
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSWFVersion.class, false).compile(iExtensionPSModelRTServiceSession, psWFVersion, null);

		IPSWorkflow iPSWorkflow = getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), psWFVersion.getPSWFId(), true);
		if(iPSWorkflow==null) {
			//非默认模型
			IPSModelService iPSWorkflowService = (IPSModelService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSWORKFLOW);
			IPSModelService iPSWFDEService = (IPSModelService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSWFDE);
			
			PSWorkflow psWorkflow = (PSWorkflow)iPSWorkflowService.get(psWFVersion.getPSWFId(), false);
			ObjectNode workflowNode = iExtensionPSModelRTServiceSession.getPSModelListTranspiler(IPSWorkflow.class, false).compile(iExtensionPSModelRTServiceSession, psWorkflow, null);
			
			PSWFDEFilter psWFDEFilter = new PSWFDEFilter();
			psWFDEFilter.pswfid__eq(psWFVersion.getPSWFId());
			psWFDEFilter.setSize(Integer.MAX_VALUE);
			Page<PSWFDE> psWFDEPage = iPSWFDEService.fetch(DATASET_DEFAULT, psWFDEFilter);
			if(!ObjectUtils.isEmpty(psWFDEPage.getContent())) {
				ArrayNode psWFDENodes = workflowNode.putArray(PSWorkflowImpl.ATTR_GETPSWFDES);
				for(PSWFDE psWFDE : psWFDEPage.getContent()) {
					ObjectNode psWFDENode = iExtensionPSModelRTServiceSession.getPSModelListTranspiler(IPSWFDE.class, false).compile(iExtensionPSModelRTServiceSession, psWFDE, null);
					psWFDENodes.add(psWFDENode);
				}
			}
			
			iPSWorkflow = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iExtensionPSModelRTServiceSession.getPSSystemService().getPSSystem(), IPSWorkflow.class, workflowNode);
		}
		IPSWFVersion iPSWFVersion = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSWorkflow, IPSWFVersion.class, objectNode);
		// 验证模型
		PSModelMergeUtils.verify(iPSWFVersion, true);

		this.installCloudDefinition(iPSWFVersion, strPSDynaInstId);
		// 更新
		
		//获取当前模型
		//V2SystemExtensionWorkflowDefinition lastV2SystemExtensionWorkflowDefinition = iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionWorkflowDefinition(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId);
   		
		V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition = new V2SystemExtensionWorkflowDefinition();
		v2SystemExtensionWorkflowDefinition.setExtensionModel(ExtensionUtils.toExtensionModel(psWFVersion));
		v2SystemExtensionWorkflowDefinition.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionWorkflowDefinition.setPendingExtensionModel(null);
		v2SystemExtensionWorkflowDefinition.setApplyFlag(1);
		v2SystemExtensionWorkflowDefinition.setName(psWFVersion.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionWorkflowDefinition(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionWorkflowDefinition);

		return null;
	}

	protected void installCloudDefinition(IPSWFVersion iPSWFVersion, String strPSDynaInstId) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		// 生成文件
		GroovyCodeGenEngine groovyCodeGenEngine = new GroovyCodeGenEngine();
		groovyCodeGenEngine.init("/ibiz/template/runtime/v1", true, null);
		
		String strContent = groovyCodeGenEngine.getContent(iPSWFVersion, "/workflow/definition.bpmn.tpl");
		List<Map<String, Object>> models = new ArrayList<>();
		Map<String, Object> fileMap = new HashMap<String, Object>();
		//默认实例占位
		//strPSDynaInstId = "___srfDefualtInst___";
		strPSDynaInstId = "___srfDefaultInst___";
		fileMap.put(String.format("%1$s.json.bpmn", iPSWFVersion.getCodeName()) + ":" + strPSDynaInstId + ":" + iExtensionPSModelRTServiceSession.getSystemRuntime().getDeploySystemId(), strContent);
		models.add(fileMap);
		
		
		ISysWFUtilRuntime iSysWFUtilRuntime = iExtensionPSModelRTServiceSession.getSystemRuntime().getSysUtilRuntime(ISysWFUtilRuntime.class, false);
		try {
			iSysWFUtilRuntime.createWFDefinitions(models);
		} catch (Throwable ex) {
			throw new Exception(String.format("部署工作流发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<PSWFVersion> fillPSWFDE(List<PSWFVersion> psWFVersions) throws Exception{
		if(!ObjectUtils.isEmpty(psWFVersions)) {
			for(PSWFVersion psWFVersion : psWFVersions) {
				fillPSWFDE(psWFVersion);
			}
		}
		return psWFVersions;
	}
	
	protected PSWFVersion fillPSWFDE(PSWFVersion psWFVersion) throws Exception{
		if(psWFVersion != null) {
			String strPSWFDETag = String.format("_PSWFDE_%1$s", psWFVersion.getPSWFId());
			PSWFDE psWFDE = (PSWFDE)this.getPSModelRTServiceSession().getParam(strPSWFDETag);
			if(psWFDE == null) {
				IPSModelService iPSWFDEService = (IPSModelService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSWFDE);
				PSWFDEFilter psWFDEFilter = new PSWFDEFilter();
				psWFDEFilter.pswfid__eq(psWFVersion.getPSWFId());
				psWFDE = (PSWFDE)iPSWFDEService.selectOne(psWFDEFilter, true);
				if(psWFDE != null) {
					this.getPSModelRTServiceSession().setParam(strPSWFDETag, psWFDE);
				}
			}
			if(psWFDE != null) {
				psWFVersion.set(PSWFDE.FIELD_PSWFDEID, psWFDE.getPSWFDEId());
				psWFVersion.set(PSWFDE.FIELD_PSWFDENAME, psWFDE.getPSWFDEName());
				psWFVersion.set(PSWFDE.FIELD_PSDEID, psWFDE.getPSDEId());
				psWFVersion.set(PSWFDE.FIELD_PSDENAME, psWFDE.getPSDEName());
			}
		}
		return psWFVersion;
	}
}
