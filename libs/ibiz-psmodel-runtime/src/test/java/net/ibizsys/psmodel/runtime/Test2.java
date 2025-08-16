package net.ibizsys.psmodel.runtime;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.util.IPSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceSession;
import net.ibizsys.psmodel.runtime.util.PSModelRTStorage;

public class Test2 {

	public static void main(String[] args) {
		
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath("E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg", false);
		
		PSModelRTServiceSession psModelServiceSession = new PSModelRTServiceSession();
		psModelServiceSession.setPSSystemService(psModelServiceImpl);
		
		IPSModelServiceSession lastPSModelServiceSession = null;
		Object ret = null;
		IPSDataEntity iPSDataEntity = null;
		try {
			
			lastPSModelServiceSession = PSModelServiceSession.getCurrent(true);
			PSModelRTStorage devOpsDynaModelAPIPSModelRTStorage = new PSModelRTStorage();
			
//			String strKey = "compliance.ComplianceIssueRectificationWF.ComplianceIssueRectificationWFv1";
//			String strKey2 = "compliance.ComplianceIssueRectificationWF";
			
			 
			
			String strKey = "lawcase.LawCaseAssist.FillLawCaseTrackData";
			String strKey2 = "lawcase.LawCaseAssist";
			
			psModelServiceSession.setPSModelStorage(devOpsDynaModelAPIPSModelRTStorage);
			
			PSModelServiceSession.setCurrent(psModelServiceSession);
			IPSModelRTService<?> iPSModelService = (IPSModelRTService)psModelServiceSession.getPSModelService("PSDELOGIC");
			ret =  iPSModelService.invoke(null, null, "GET", strKey, null);
			
			IPSDELogic iPSDELogic = iPSModelService.getPSModelObject(strKey, IPSDELogic.class, false);
			System.out.println(iPSDELogic.getObjectNode().toPrettyString());
			
			IPSModelRTService<?> iPSModelService2 = (IPSModelRTService)psModelServiceSession.getPSModelService("PSDATAENTITY");
			iPSDataEntity = iPSModelService2.getPSModelObject(strKey2, IPSDataEntity.class, false);
			
			//编译为运行模型
			ObjectNode node = psModelServiceSession.getPSModelTranspiler(IPSDELogic.class, false).compile(psModelServiceSession, (PSDELogic)ret, JsonUtils.createObjectNode());
			System.out.println(node.toPrettyString());
			
			//重新编译
			IPSDELogic newPSDELogic = psModelServiceImpl.createAndInitPSModelObject((IPSModelObjectRuntime) iPSDataEntity, IPSDELogic.class, node);
			PSModelMergeUtils.verify(newPSDELogic);
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
