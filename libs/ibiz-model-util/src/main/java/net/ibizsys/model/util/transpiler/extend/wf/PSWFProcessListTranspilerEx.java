package net.ibizsys.model.util.transpiler.extend.wf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWFEmbedWFProcessBase;
import net.ibizsys.model.wf.IPSWFInteractiveProcess;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWFProcessParam;
import net.ibizsys.model.wf.IPSWFProcessRole;
import net.ibizsys.model.wf.IPSWFProcessSubWF;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.model.wf.PSWFEmbedWFProcessBaseImpl;
import net.ibizsys.model.wf.PSWFInteractiveProcessImpl;
import net.ibizsys.model.wf.PSWFProcessImpl;
import net.ibizsys.model.wf.StartPSWFProcessImpl;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.domain.PSWFProcParam;
import net.ibizsys.psmodel.core.domain.PSWFProcRole;
import net.ibizsys.psmodel.core.domain.PSWFProcSubWF;
import net.ibizsys.psmodel.core.domain.PSWFProcess;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSWFProcessListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFProcessListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		if(bFullMode) {
			IPSWFProcess iPSWFProcess = (IPSWFProcess)iPSModelObject;
			PSWFProcess psWFProcess = (PSWFProcess)domain;
			
			//获取工作流
			IPSWorkflow iPSWorkflow = iPSWFProcess.getParentPSModelObject(IPSWorkflow.class);
			Map<String, PSWFDE> psWFDEMap = new HashMap<String, PSWFDE>();
			
			PSWFDE defaultPSWFDE = null;
			
			if(!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
				List<PSWFDE> psWFDEList = new ArrayList<PSWFDE>();
				iPSModelTranspileContext.getPSModelListTranspiler(IPSWFDE.class, false).decompile(iPSModelTranspileContext, iPSWorkflow.getPSWFDEs(), psWFDEList, bFullMode);
				for(PSWFDE psWFDE : psWFDEList) {
					psWFDEMap.put(psWFDE.getPSDEId(), psWFDE);
					if(DataTypeUtils.getBooleanValue(psWFDE.getDefaultMode(), false)) {
						defaultPSWFDE = psWFDE;
					}
				}
				if(defaultPSWFDE == null && psWFDEList.size()>0) {
					defaultPSWFDE = psWFDEList.get(0);
				}
			}
			
			PSWFDE psWFDE = null;
			if(StringUtils.hasLength(psWFProcess.getPSDEId())) {
				psWFDE = psWFDEMap.get(psWFProcess.getPSDEId());
			}
			
			if(psWFDE == null) {
				psWFDE = defaultPSWFDE;
			}
			
			if(psWFDE!=null) {
				psWFProcess.setPSWFDEId(psWFDE.getId());
				psWFProcess.setPSWFDEName(psWFDE.getName());
				psWFProcess.setPSDEId(psWFDE.getPSDEId());
				
				
				
				if(StringUtils.hasLength(psWFProcess.getFormCodeName())) {
					psWFProcess.setPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getFormCodeName()));
					if(!StringUtils.hasLength(psWFProcess.getPSDEFormName())) {
						psWFProcess.setPSDEFormName(psWFProcess.getFormCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobFormCodeName())) {
					psWFProcess.setMobPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobFormCodeName()));
					if(!StringUtils.hasLength(psWFProcess.getMobPSDEFormName())) {
						psWFProcess.setMobPSDEFormName(psWFProcess.getMobFormCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFProcess.getUtilFormCodeName())) {
					psWFProcess.setUtilPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getUtilFormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getUtil2FormCodeName())) {
					psWFProcess.setUtil2PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getUtil2FormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getUtil3FormCodeName())) {
					psWFProcess.setUtil3PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getUtil3FormCodeName()));
				}
				
				
				if(StringUtils.hasLength(psWFProcess.getUtil4FormCodeName())) {
					psWFProcess.setUtil4PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getUtil4FormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getUtil5FormCodeName())) {
					psWFProcess.setUtil5PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getUtil5FormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobUtilFormCodeName())) {
					psWFProcess.setMobUtilPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobUtilFormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobUtil2FormCodeName())) {
					psWFProcess.setMobUtil2PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobUtil2FormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobUtil3FormCodeName())) {
					psWFProcess.setMobUtil3PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobUtil3FormCodeName()));
				}
				
				
				if(StringUtils.hasLength(psWFProcess.getMobUtil4FormCodeName())) {
					psWFProcess.setMobUtil4PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobUtil4FormCodeName()));
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobUtil5FormCodeName())) {
					psWFProcess.setMobUtil5PSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobUtil5FormCodeName()));
				}
				
				
				
				if(StringUtils.hasLength(psWFProcess.getViewCodeName())) {
					psWFProcess.setPSDEViewBaseId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getViewCodeName()));
					if(!StringUtils.hasLength(psWFProcess.getPSDEViewBaseName())) {
						psWFProcess.setPSDEViewBaseName(psWFProcess.getViewCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFProcess.getMobViewCodeName())) {
					psWFProcess.setMobPSDEViewId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFProcess.getMobViewCodeName()));
					if(!StringUtils.hasLength(psWFProcess.getMobPSDEViewName())) {
						psWFProcess.setMobPSDEViewName(psWFProcess.getMobViewCodeName());
					}
				}
			}
			
			if(iPSWFProcess.getPSWFProcessParams()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessParam.class, false).decompile(iPSModelTranspileContext, iPSWFProcess.getPSWFProcessParams(), psWFProcess.getPSWFProcParamsIf(), bFullMode);
				int nOrder = 100;
				for(PSWFProcParam child : psWFProcess.getPSWFProcParamsIf()) {
					child.setPSWFProcessId(psWFProcess.getId());
					child.setPSWFProcessName(psWFProcess.getName());
//					child.setOrderValue(nOrder);
//					nOrder += 100;
				}
			}
			
			if(iPSWFProcess instanceof IPSWFInteractiveProcess) {
				IPSWFInteractiveProcess iPSWFInteractiveProcess = (IPSWFInteractiveProcess)iPSWFProcess;
				if(iPSWFInteractiveProcess.getPSWFProcessRoles()!=null) {
					iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessRole.class, false).decompile(iPSModelTranspileContext, iPSWFInteractiveProcess.getPSWFProcessRoles(), psWFProcess.getPSWFProcRolesIf(), bFullMode);
					int nOrder = 100;
					for(PSWFProcRole child : psWFProcess.getPSWFProcRolesIf()) {
						child.setPSWFProcessId(psWFProcess.getId());
						child.setPSWFProcessName(psWFProcess.getName());
//						child.setOrderValue(nOrder);
//						nOrder += 100;
					}
				}
			}
			
			if(iPSWFProcess instanceof IPSWFEmbedWFProcessBase) {
				IPSWFEmbedWFProcessBase iPSWFEmbedWFProcessBase = (IPSWFEmbedWFProcessBase)iPSWFProcess;
				if(iPSWFEmbedWFProcessBase.getPSWFProcessSubWFs()!=null) {
					iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessSubWF.class, false).decompile(iPSModelTranspileContext, iPSWFEmbedWFProcessBase.getPSWFProcessSubWFs(), psWFProcess.getPSWFProcSubWFsIf(), bFullMode);
					int nOrder = 100;
					for(PSWFProcSubWF child : psWFProcess.getPSWFProcSubWFsIf()) {
						child.setPSWFProcessId(psWFProcess.getId());
						child.setPSWFProcessName(psWFProcess.getName());
//						child.setOrderValue(nOrder);
//						nOrder += 100;
					}
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSWFProcess psWFProcess = (PSWFProcess)domain;
		
		
		//合成表单标识
		if(StringUtils.hasLength(psWFProcess.getPSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETFORMCODENAME, getSimpleId(psWFProcess.getPSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getPSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETFORMNAME, psWFProcess.getPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETFORMNAME, getSimpleId(psWFProcess.getPSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getUtilPSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTILFORMCODENAME, getSimpleId(psWFProcess.getUtilPSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getUtilPSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTILFORMNAME, psWFProcess.getUtilPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTILFORMNAME, getSimpleId(psWFProcess.getUtilPSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getUtil2PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL2FORMCODENAME, getSimpleId(psWFProcess.getUtil2PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getUtil2PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL2FORMNAME, psWFProcess.getUtil2PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL2FORMNAME, getSimpleId(psWFProcess.getUtil2PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getUtil3PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL3FORMCODENAME, getSimpleId(psWFProcess.getUtil3PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getUtil3PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL3FORMNAME, psWFProcess.getUtil3PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL3FORMNAME, getSimpleId(psWFProcess.getUtil3PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getUtil4PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL4FORMCODENAME, getSimpleId(psWFProcess.getUtil4PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getUtil4PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL4FORMNAME, psWFProcess.getUtil4PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL4FORMNAME, getSimpleId(psWFProcess.getUtil4PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getUtil5PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL5FORMCODENAME, getSimpleId(psWFProcess.getUtil5PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getUtil5PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL5FORMNAME, psWFProcess.getUtil5PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETUTIL5FORMNAME, getSimpleId(psWFProcess.getUtil5PSDEFormId()));
			}
		}
		
		
		if(StringUtils.hasLength(psWFProcess.getMobPSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBFORMCODENAME, getSimpleId(psWFProcess.getMobPSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobPSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBFORMNAME, psWFProcess.getMobPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBFORMNAME, getSimpleId(psWFProcess.getMobPSDEFormId()));
			}
		}
				
		if(StringUtils.hasLength(psWFProcess.getMobUtilPSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTILFORMCODENAME, getSimpleId(psWFProcess.getMobUtilPSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobUtilPSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTILFORMNAME, psWFProcess.getMobUtilPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTILFORMNAME, getSimpleId(psWFProcess.getMobUtilPSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getMobUtil2PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL2FORMCODENAME, getSimpleId(psWFProcess.getMobUtil2PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobUtil2PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL2FORMNAME, psWFProcess.getMobUtil2PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL2FORMNAME, getSimpleId(psWFProcess.getMobUtil2PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getMobUtil3PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL3FORMCODENAME, getSimpleId(psWFProcess.getMobUtil3PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobUtil3PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL3FORMNAME, psWFProcess.getMobUtil3PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL3FORMNAME, getSimpleId(psWFProcess.getMobUtil3PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getMobUtil4PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL4FORMCODENAME, getSimpleId(psWFProcess.getMobUtil4PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobUtil4PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL4FORMNAME, psWFProcess.getMobUtil4PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL4FORMNAME, getSimpleId(psWFProcess.getMobUtil4PSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getMobUtil5PSDEFormId())) {
			objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL5FORMCODENAME, getSimpleId(psWFProcess.getMobUtil5PSDEFormId()));
			if(StringUtils.hasLength(psWFProcess.getMobUtil5PSDEFormName())) {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL5FORMNAME, psWFProcess.getMobUtil5PSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveProcessImpl.ATTR_GETMOBUTIL5FORMNAME, getSimpleId(psWFProcess.getMobUtil5PSDEFormId()));
			}
		}
		
		
		
		if(StringUtils.hasLength(psWFProcess.getPSDEViewBaseId())) {
			objectNode.put(StartPSWFProcessImpl.ATTR_GETSTARTVIEWCODENAME, getSimpleId(psWFProcess.getPSDEViewBaseId()));
			if(StringUtils.hasLength(psWFProcess.getPSDEViewBaseName())) {
				objectNode.put(StartPSWFProcessImpl.ATTR_GETSTARTVIEWNAME, psWFProcess.getPSDEViewBaseName());
			}
			else {
				objectNode.put(StartPSWFProcessImpl.ATTR_GETSTARTVIEWNAME, getSimpleId(psWFProcess.getPSDEViewBaseId()));
			}
		}
		
		if(StringUtils.hasLength(psWFProcess.getMobPSDEViewId())) {
			objectNode.put(StartPSWFProcessImpl.ATTR_GETMOBSTARTVIEWCODENAME, getSimpleId(psWFProcess.getMobPSDEViewId()));
			if(StringUtils.hasLength(psWFProcess.getMobPSDEViewName())) {
				objectNode.put(StartPSWFProcessImpl.ATTR_GETMOBSTARTVIEWNAME, psWFProcess.getMobPSDEViewName());
			}
			else {
				objectNode.put(StartPSWFProcessImpl.ATTR_GETMOBSTARTVIEWNAME, getSimpleId(psWFProcess.getMobPSDEViewId()));
			}
		}
		
		
		
		if(!ObjectUtils.isEmpty(psWFProcess.getPSWFProcParams())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFProcessImpl.ATTR_GETPSWFPROCESSPARAMS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessParam.class, false).compile(iPSModelTranspileContext, psWFProcess.getPSWFProcParams(), arrayNode);
		}
		
		if(!ObjectUtils.isEmpty(psWFProcess.getPSWFProcRoles())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFInteractiveProcessImpl.ATTR_GETPSWFPROCESSROLES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessRole.class, false).compile(iPSModelTranspileContext, psWFProcess.getPSWFProcRoles(), arrayNode);
		}
		
		if(!ObjectUtils.isEmpty(psWFProcess.getPSWFProcSubWFs())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFEmbedWFProcessBaseImpl.ATTR_GETPSWFPROCESSSUBWFS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcessSubWF.class, false).compile(iPSModelTranspileContext, psWFProcess.getPSWFProcSubWFs(), arrayNode);
		}

		if(!ObjectUtils.isEmpty(psWFProcess.getPSDEActionId())){
			objectNode.put("normalProcType", "DEACTION");
		}else {
			objectNode.put("normalProcType", "NONE" );
		}
	}
}