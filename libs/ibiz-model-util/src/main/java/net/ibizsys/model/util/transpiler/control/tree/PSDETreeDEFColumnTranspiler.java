package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeDEFColumnImpl.*;



public class PSDETreeDEFColumnTranspiler extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeColumnTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeDEFColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeDEFColumnImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeDEFColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}