package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormTabPanelImpl.*;



public class PSDEFormTabPanelTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormTabPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormTabPanelImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormTabPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "drtag", realPSModelObject.getDataRelationTag(), realPSModelObject, "getDataRelationTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "insertpos", realPSModelObject.getInsertPos(), realPSModelObject, "getInsertPos");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATARELATIONTAG, domain, "drtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINSERTPOS, domain, "insertpos", int.class, new String[]{"-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}