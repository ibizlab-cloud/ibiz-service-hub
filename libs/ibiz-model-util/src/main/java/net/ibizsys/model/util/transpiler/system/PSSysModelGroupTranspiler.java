package net.ibizsys.model.util.transpiler.system;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.system.PSSysModelGroupImpl.*;



public class PSSysModelGroupTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.system.PSSysModelGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.system.PSSysModelGroupImpl realPSModelObject = (net.ibizsys.model.system.PSSysModelGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag3", realPSModelObject.getGroupTag3(), realPSModelObject, "getGroupTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag4", realPSModelObject.getGroupTag4(), realPSModelObject, "getGroupTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgcodename", realPSModelObject.getPKGCodeName(), realPSModelObject, "getPKGCodeName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "grouptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "grouptag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG3, domain, "grouptag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG4, domain, "grouptag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPKGCODENAME, domain, "pkgcodename", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}