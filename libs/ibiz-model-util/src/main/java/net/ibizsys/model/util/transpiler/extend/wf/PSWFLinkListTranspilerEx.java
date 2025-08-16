package net.ibizsys.model.util.transpiler.extend.wf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWFLink;
import net.ibizsys.model.wf.IPSWFLinkCond;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.model.wf.PSWFInteractiveLinkImpl;
import net.ibizsys.model.wf.PSWFLinkImpl;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.domain.PSWFLink;
import net.ibizsys.psmodel.core.domain.PSWFLinkCond;
import net.ibizsys.psmodel.core.domain.PSWFProcess;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP;
import net.ibizsys.psmodel.core.util.PSModelEnums.WFLinkCondType;

public class PSWFLinkListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFLinkListTranspiler{
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSWFLink iPSWFLink = (IPSWFLink)iPSModelObject;
			PSWFLink psWFLink = (PSWFLink)domain;
			
			//获取工作流
			IPSWorkflow iPSWorkflow = iPSWFLink.getParentPSModelObject(IPSWorkflow.class);
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
			
			PSWFProcess psWFProcess = new PSWFProcess();
			
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcess.class, false).decompile(iPSModelTranspileContext, iPSWFLink.getFromPSWFProcessMust(), psWFProcess, bFullMode);
			
			PSWFDE psWFDE = null;
			if(StringUtils.hasLength(psWFProcess.getPSDEId())) {
				psWFDE = psWFDEMap.get(psWFProcess.getPSDEId());
			}
			
			if(psWFDE == null) {
				psWFDE = defaultPSWFDE;
			}
			
			if(psWFDE!=null) {
				psWFLink.setPSWFDEId(psWFDE.getId());
				psWFLink.setPSDEId(psWFDE.getPSDEId());
				if(StringUtils.hasLength(psWFLink.getFormCodeName())) {
					psWFLink.setPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFLink.getFormCodeName()));
					if(!StringUtils.hasLength(psWFLink.getPSDEFormName())) {
						psWFLink.setPSDEFormName(psWFLink.getFormCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFLink.getMobFormCodeName())) {
					psWFLink.setMobPSDEFormId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFLink.getMobFormCodeName()));
					if(!StringUtils.hasLength(psWFLink.getMobPSDEFormName())) {
						psWFLink.setMobPSDEFormName(psWFLink.getMobFormCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFLink.getViewCodeName())) {
					psWFLink.setPSDEViewBaseId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFLink.getViewCodeName()));
					if(!StringUtils.hasLength(psWFLink.getPSDEViewBaseName())) {
						psWFLink.setPSDEViewBaseName(psWFLink.getViewCodeName());
					}
				}
				
				if(StringUtils.hasLength(psWFLink.getMobViewCodeName())) {
					psWFLink.setMobPSDEViewId(String.format("%1$s.%2$s", psWFDE.getPSDEId(), psWFLink.getMobViewCodeName()));
					if(!StringUtils.hasLength(psWFLink.getMobPSDEViewName())) {
						psWFLink.setMobPSDEViewName(psWFLink.getMobViewCodeName());
					}
				}
				
			}
			
			
			if(iPSWFLink.getPSWFLinkGroupCond()!=null && iPSWFLink.getPSWFLinkGroupCond().getPSWFLinkConds()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLinkCond.class, false).decompile(iPSModelTranspileContext, iPSWFLink.getPSWFLinkGroupCond().getPSWFLinkConds(), psWFLink.getPSWFLinkCondsIf(), bFullMode);
				int nOrder = 100;
				for(PSWFLinkCond child : psWFLink.getPSWFLinkCondsIf()) {
					child.setPSWFLinkId(psWFLink.getId());
					child.setPSWFLinkName(psWFLink.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSWFLink psWFLink = (PSWFLink)domain;
		
		//合成表单标识
		if(StringUtils.hasLength(psWFLink.getPSDEFormId())) {
			objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETFORMCODENAME, getSimpleId(psWFLink.getPSDEFormId()));
			if(StringUtils.hasLength(psWFLink.getPSDEFormName())) {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETFORMNAME, psWFLink.getPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETFORMNAME, getSimpleId(psWFLink.getPSDEFormId()));
			}
		}
		
		if(StringUtils.hasLength(psWFLink.getMobPSDEFormId())) {
			objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBFORMCODENAME, getSimpleId(psWFLink.getMobPSDEFormId()));
			if(StringUtils.hasLength(psWFLink.getMobPSDEFormName())) {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBFORMNAME, psWFLink.getMobPSDEFormName());
			}
			else {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBFORMNAME, getSimpleId(psWFLink.getMobPSDEFormId()));
			}
		}
		
		
		//合成操作视图
		if(StringUtils.hasLength(psWFLink.getPSDEViewBaseId())) {
			objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETVIEWCODENAME, getSimpleId(psWFLink.getPSDEViewBaseId()));
			if(StringUtils.hasLength(psWFLink.getPSDEViewBaseName())) {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETVIEWNAME, psWFLink.getPSDEViewBaseName());
			}
			else {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETVIEWNAME, getSimpleId(psWFLink.getPSDEViewBaseId()));
			}
		}
		
		if(StringUtils.hasLength(psWFLink.getMobPSDEViewId())) {
			objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBVIEWCODENAME, getSimpleId(psWFLink.getMobPSDEViewId()));
			if(StringUtils.hasLength(psWFLink.getMobPSDEViewName())) {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBVIEWNAME, psWFLink.getMobPSDEViewName());
			}
			else {
				objectNode.put(PSWFInteractiveLinkImpl.ATTR_GETMOBVIEWNAME, getSimpleId(psWFLink.getMobPSDEViewId()));
			}
		}
		
		if(!ObjectUtils.isEmpty(psWFLink.getPSWFLinkConds())) {
			
			PSWFLinkCond groupPSWFLinkCond = new PSWFLinkCond();
			groupPSWFLinkCond.logictype(WFLinkCondType.GROUP);
			groupPSWFLinkCond.groupop(GroupCondOP.AND);
			groupPSWFLinkCond.getPSWFLinkCondsIf().addAll(psWFLink.getPSWFLinkConds());
			
			ObjectNode groupCondNode = objectNode.putObject(PSWFLinkImpl.ATTR_GETPSWFLINKGROUPCOND);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLinkCond.class, false).compile(iPSModelTranspileContext, groupPSWFLinkCond, groupCondNode);
		}
	}
}