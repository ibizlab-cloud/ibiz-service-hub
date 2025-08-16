package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl.*;



public class PSDERIndexDEFieldMapTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERDEFieldMapTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdefid", realPSModelObject.getMajorPSDEField(), realPSModelObject, "getMajorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdefid", realPSModelObject.getMinorPSDEField(), realPSModelObject, "getMinorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvalue", realPSModelObject.getSrcValue(), realPSModelObject, "getSrcValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvaluestddatatype", realPSModelObject.getSrcValueStdDataType(), realPSModelObject, "getSrcValueStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvaluetype", realPSModelObject.getSrcValueType(), realPSModelObject, "getSrcValueType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDEFIELD, domain, "majorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDEFIELD, domain, "minorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUE, domain, "srcvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUESTDDATATYPE, domain, "srcvaluestddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUETYPE, domain, "srcvaluetype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}