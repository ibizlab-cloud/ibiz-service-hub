package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.PSDEFGridColumnImpl.*;



public class PSDEFGridColumnTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFUIItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.PSDEFGridColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.PSDEFGridColumnImpl realPSModelObject = (net.ibizsys.model.control.grid.PSDEFGridColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolclmode", realPSModelObject.getCLConvertMode(), realPSModelObject, "getCLConvertMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolalign", realPSModelObject.getColumnAlign(), realPSModelObject, "getColumnAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolwidth", realPSModelObject.getColumnWidth(), realPSModelObject, "getColumnWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isEnableSort(), realPSModelObject, "isEnableSort");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLCONVERTMODE, domain, "gridcolclmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNALIGN, domain, "gridcolalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNWIDTH, domain, "gridcolwidth", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESORT, domain, "nosort", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}