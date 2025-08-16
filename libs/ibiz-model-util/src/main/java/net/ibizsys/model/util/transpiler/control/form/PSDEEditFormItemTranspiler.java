package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEEditFormItemImpl.*;



public class PSDEEditFormItemTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEEditFormItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEEditFormItemImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEEditFormItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}