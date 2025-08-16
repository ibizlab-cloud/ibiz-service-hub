package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeNodeRVImpl.*;



public class PSDETreeNodeRVTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeNodeRVImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeNodeRVImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeNodeRVImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbaseid", realPSModelObject.getRefPSAppView(), realPSModelObject, "getRefPSAppView");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSAPPVIEW, domain, "psdeviewbaseid", net.ibizsys.model.app.view.IPSAppView.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}