package net.ibizsys.model.util.transpiler.control.toolbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.toolbar.PSDEToolbarImpl.*;



public class PSDEToolbarTranspiler extends net.ibizsys.model.util.transpiler.control.PSControlTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.toolbar.PSDEToolbarImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.toolbar.PSDEToolbarImpl realPSModelObject = (net.ibizsys.model.control.toolbar.PSDEToolbarImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam3", realPSModelObject.getToolbarStyle(), realPSModelObject, "getToolbarStyle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOOLBARSTYLE, domain, "ctrlparam3", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}