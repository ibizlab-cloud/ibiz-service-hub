package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeNodeRSImpl.*;



public class PSDETreeNodeRSTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeNodeRSImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeNodeRSImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeNodeRSImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cpsdetreenodeid", realPSModelObject.getChildPSDETreeNode(), realPSModelObject, "getChildPSDETreeNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "childfilter", realPSModelObject.getParentFilter(), realPSModelObject, "getParentFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "ppsdetreenodeid", realPSModelObject.getParentPSDETreeNode(), realPSModelObject, "getParentPSDETreeNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pvaluelevel", realPSModelObject.getParentValueLevel(), realPSModelObject, "getParentValueLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "searchmode", realPSModelObject.getSearchMode(), realPSModelObject, "getSearchMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCHILDPSDETREENODE, domain, "cpsdetreenodeid", net.ibizsys.model.control.tree.IPSDETreeNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTFILTER, domain, "childfilter", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTPSDETREENODE, domain, "ppsdetreenodeid", net.ibizsys.model.control.tree.IPSDETreeNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTVALUELEVEL, domain, "pvaluelevel", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEARCHMODE, domain, "searchmode", int.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}