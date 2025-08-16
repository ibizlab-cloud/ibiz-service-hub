package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERAggDataDEFieldMapImpl.*;



public class PSDERAggDataDEFieldMapTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERDEFieldMapTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERAggDataDEFieldMapImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERAggDataDEFieldMapImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERAggDataDEFieldMapImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "formulaformat", realPSModelObject.getFormulaFormat(), realPSModelObject, "getFormulaFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdefid", realPSModelObject.getMajorPSDEField(), realPSModelObject, "getMajorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maptype", realPSModelObject.getMapType(), realPSModelObject, "getMapType");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdefid", realPSModelObject.getMinorPSDEField(), realPSModelObject, "getMinorPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMULAFORMAT, domain, "formulaformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDEFIELD, domain, "majorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPTYPE, domain, "maptype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDEFIELD, domain, "minorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}