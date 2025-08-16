package net.ibizsys.model.util.transpiler.extend.wf;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.wf.IPSWFLink;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.PSWFVersionImpl;
import net.ibizsys.psmodel.core.domain.PSWFLink;
import net.ibizsys.psmodel.core.domain.PSWFProcess;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.util.IPSModel;

import java.util.Comparator;

public class PSWFVersionListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFVersionListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSWFVersion iPSWFVersion = (IPSWFVersion)iPSModelObject;
			PSWFVersion psWFVersion = (PSWFVersion)domain;
			
			if(iPSWFVersion.getPSWFProcesses()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcess.class, false).decompile(iPSModelTranspileContext, iPSWFVersion.getPSWFProcesses(), psWFVersion.getPSWFProcessesIf(), bFullMode);
				for(PSWFProcess child : psWFVersion.getPSWFProcessesIf()) {
					child.setPSWFVersionId(psWFVersion.getId());
					child.setPSWFVersionName(psWFVersion.getName());
				}
			}
			
			if(iPSWFVersion.getPSWFLinks()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLink.class, false).decompile(iPSModelTranspileContext, iPSWFVersion.getPSWFLinks(), psWFVersion.getPSWFLinksIf(), bFullMode);
				int nOrder = 100;
				for(PSWFLink child : psWFVersion.getPSWFLinksIf()) {
					child.setPSWFVersionId(psWFVersion.getId());
					child.setPSWFVersionName(psWFVersion.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSWFVersion psWFVersion = (PSWFVersion)domain;
		if(!ObjectUtils.isEmpty(psWFVersion.getPSWFProcesses())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFVersionImpl.ATTR_GETPSWFPROCESSES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFProcess.class, false).compile(iPSModelTranspileContext, psWFVersion.getPSWFProcesses(), arrayNode);
		}
		
		if(!ObjectUtils.isEmpty(psWFVersion.getPSWFLinks())) {
			ArrayNode arrayNode = objectNode.putArray(PSWFVersionImpl.ATTR_GETPSWFLINKS);
			psWFVersion.getPSWFLinks().sort(Comparator.comparing(PSWFLink::getOrderValue));
			iPSModelTranspileContext.getPSModelListTranspiler(IPSWFLink.class, false).compile(iPSModelTranspileContext, psWFVersion.getPSWFLinks(),arrayNode);
		}
	}
	
	@Override
	protected String[] getModelFolders() {
		return getWorkflowModelFolder("PSWFVERSIONS");
	}
}