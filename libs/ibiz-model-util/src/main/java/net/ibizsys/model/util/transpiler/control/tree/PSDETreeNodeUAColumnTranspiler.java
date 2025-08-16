package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl.*;



public class PSDETreeNodeUAColumnTranspiler extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeNodeColumnTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSDEUIActionGroup(), realPSModelObject, "getPSDEUIActionGroup");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}