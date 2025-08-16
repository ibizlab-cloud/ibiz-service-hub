package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeCodeListNodeImpl.*;



public class PSDETreeCodeListNodeTranspiler extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeNodeTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeCodeListNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeCodeListNodeImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeCodeListNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSAppCodeList(), realPSModelObject, "getPSAppCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "appendcapflag", realPSModelObject.isAppendCaption(), realPSModelObject, "isAppendCaption");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCODELIST, domain, "pscodelistid", net.ibizsys.model.app.codelist.IPSAppCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAPPENDCAPTION, domain, "appendcapflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}