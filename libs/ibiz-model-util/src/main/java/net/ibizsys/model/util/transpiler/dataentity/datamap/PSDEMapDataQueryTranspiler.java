package net.ibizsys.model.util.transpiler.dataentity.datamap;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.datamap.PSDEMapDataQueryImpl.*;



public class PSDEMapDataQueryTranspiler extends net.ibizsys.model.util.transpiler.dataentity.datamap.PSDEMapObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.datamap.PSDEMapDataQueryImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.datamap.PSDEMapDataQueryImpl realPSModelObject = (net.ibizsys.model.dataentity.datamap.PSDEMapDataQueryImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedataqueryid", realPSModelObject.getDstPSDEDataQuery(), realPSModelObject, "getDstPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "mapmode", realPSModelObject.getMapMode(), realPSModelObject, "getMapMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedataqueryid", realPSModelObject.getSrcPSDEDataQuery(), realPSModelObject, "getSrcPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledqcond", realPSModelObject.isEnableDQCond(), realPSModelObject, "isEnableDQCond");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATAQUERY, domain, "dstpsdedataqueryid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPMODE, domain, "mapmode", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEDATAQUERY, domain, "psdedataqueryid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEDQCOND, domain, "enabledqcond", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}