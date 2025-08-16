package net.ibizsys.psmodel.runtime;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.util.IPSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceSession;
import net.ibizsys.psmodel.runtime.util.PSModelRTStorage;

public class Test {

	public static void main(String[] args) {
		
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath("E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg", false);
		
		PSModelRTServiceSession psModelServiceSession = new PSModelRTServiceSession();
		psModelServiceSession.setPSSystemService(psModelServiceImpl);
		
		IPSModelServiceSession lastPSModelServiceSession = null;
		Object ret = null;
		IPSWorkflow iPSWorkflow = null;
		try {
			
			lastPSModelServiceSession = PSModelServiceSession.getCurrent(true);
			PSModelRTStorage devOpsDynaModelAPIPSModelRTStorage = new PSModelRTStorage();
			
//			String strKey = "compliance.ComplianceIssueRectificationWF.ComplianceIssueRectificationWFv1";
//			String strKey2 = "compliance.ComplianceIssueRectificationWF";
			
			 
			
			String strKey = "lawsupport.LawSupportWF.LawSupportWFv1";
			String strKey2 = "lawsupport.LawSupportWF";
			
			psModelServiceSession.setPSModelStorage(devOpsDynaModelAPIPSModelRTStorage);
			
			PSModelServiceSession.setCurrent(psModelServiceSession);
			IPSModelRTService<?> iPSModelService = (IPSModelRTService)psModelServiceSession.getPSModelService("PSWFVERSION");
			ret =  iPSModelService.invoke(null, null, "GET", strKey, null);
			
			IPSWFVersion iPSWFVersion = iPSModelService.getPSModelObject(strKey, IPSWFVersion.class, false);
			System.out.println(iPSWFVersion.getObjectNode().toPrettyString());
			
			IPSModelRTService<?> iPSModelService2 = (IPSModelRTService)psModelServiceSession.getPSModelService("PSWORKFLOW");
			iPSWorkflow = iPSModelService2.getPSModelObject(strKey2, IPSWorkflow.class, false);
			
			//编译为运行模型
			ObjectNode node = psModelServiceSession.getPSModelTranspiler(IPSWFVersion.class, false).compile(psModelServiceSession, (PSWFVersion)ret, JsonUtils.createObjectNode());
			System.out.println(node.toPrettyString());
			
			//重新编译
			IPSWFVersion newPSWFVersion = psModelServiceImpl.createAndInitPSModelObject((IPSModelObjectRuntime) iPSWorkflow, IPSWFVersion.class, node);
			PSModelMergeUtils.verify(newPSWFVersion);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			PSModelServiceSession.setCurrent(lastPSModelServiceSession);
		}
		
		System.out.print(ret);
		
		
		
	}

}
