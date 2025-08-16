package net.ibizsys.model.util.transpiler.dataentity.datamap;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl.*;



public class PSDEMapDetailTranspiler extends net.ibizsys.model.util.transpiler.dataentity.datamap.PSDEMapObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl realPSModelObject = (net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstfieldname", realPSModelObject.getDstFieldName(), realPSModelObject, "getDstFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstfieldname", realPSModelObject.getDstPSDEField(), realPSModelObject, "getDstPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvalue", realPSModelObject.getExpression(), realPSModelObject, "getExpression");
		this.setDomainValue(iPSModelTranspileContext, domain, "srctype", realPSModelObject.getMapType(), realPSModelObject, "getMapType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystranslatorid", realPSModelObject.getPSSysTranslator(), realPSModelObject, "getPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvalue", realPSModelObject.getRawValue(), realPSModelObject, "getRawValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdefname", realPSModelObject.getSrcFieldName(), realPSModelObject, "getSrcFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdefname", realPSModelObject.getSrcPSDEField(), realPSModelObject, "getSrcPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTFIELDNAME, domain, "dstfieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEFIELD, domain, "dstfieldname", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXPRESSION, domain, "srcvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPTYPE, domain, "srctype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTRANSLATOR, domain, "pssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWVALUE, domain, "srcvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCFIELDNAME, domain, "srcpsdefname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEFIELD, domain, "srcpsdefname", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}