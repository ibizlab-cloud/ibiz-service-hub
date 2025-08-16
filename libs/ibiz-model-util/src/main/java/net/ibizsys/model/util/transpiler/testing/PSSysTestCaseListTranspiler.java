package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysTestCaseListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSSysTestCase createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSSysTestCase();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPVIEW":
			case "CUSTOM":
			case "DESADETAIL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.testing.PSSysTestCase2Impl.class, false);
			case "DEACTION":
			case "DEFVR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.testing.PSSysTestCaseImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.testing.PSSysTestCaseImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.testing.IPSSysTestCase iPSSysTestCase = (net.ibizsys.model.testing.IPSSysTestCase)iPSModelObject;
		Object type = iPSSysTestCase.getTestCaseType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("testcasetype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}