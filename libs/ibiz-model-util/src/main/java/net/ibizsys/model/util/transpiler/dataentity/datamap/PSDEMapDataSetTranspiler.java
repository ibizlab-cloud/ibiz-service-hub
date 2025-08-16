package net.ibizsys.model.util.transpiler.dataentity.datamap;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl.*;



public class PSDEMapDataSetTranspiler extends net.ibizsys.model.util.transpiler.dataentity.datamap.PSDEMapObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl realPSModelObject = (net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedatasetid", realPSModelObject.getDstPSDEDataSet(), realPSModelObject, "getDstPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "mapmode", realPSModelObject.getMapMode(), realPSModelObject, "getMapMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getSrcPSDEDataSet(), realPSModelObject, "getSrcPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledqcond", realPSModelObject.isEnableDQCond(), realPSModelObject, "isEnableDQCond");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATASET, domain, "dstpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPMODE, domain, "mapmode", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEDQCOND, domain, "enabledqcond", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}