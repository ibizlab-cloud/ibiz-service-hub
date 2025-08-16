package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFDGroupLogicImpl.*;



public class PSDEFDGroupLogicTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFDLogicTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFDGroupLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFDGroupLogicImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFDGroupLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupop", realPSModelObject.getGroupOP(), realPSModelObject, "getGroupOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupnotflag", realPSModelObject.isNotMode(), realPSModelObject, "isNotMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPOP, domain, "groupop", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOTMODE, domain, "groupnotflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}