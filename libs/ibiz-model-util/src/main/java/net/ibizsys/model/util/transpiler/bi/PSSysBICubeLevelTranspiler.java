package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBICubeLevelImpl.*;



public class PSSysBICubeLevelTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBICubeDimensionObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBICubeLevelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBICubeLevelImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBICubeLevelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "alllevelflag", realPSModelObject.isAllLevel(), realPSModelObject, "isAllLevel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLLEVEL, domain, "alllevelflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}