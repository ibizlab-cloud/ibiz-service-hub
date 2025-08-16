package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl.*;



public class PSDETreeNodeColumnTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cellpssyscssid", realPSModelObject.getCellPSSysCss(), realPSModelObject, "getCellPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolstyle", realPSModelObject.getColumnStyle(), realPSModelObject, "getColumnStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "noprivdm", realPSModelObject.getNoPrivDisplayMode(), realPSModelObject, "getNoPrivDisplayMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdetreecolid", realPSModelObject.getPSDETreeColumn(), realPSModelObject, "getPSDETreeColumn");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCELLPSSYSCSS, domain, "cellpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNSTYLE, domain, "gridcolstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNOPRIVDISPLAYMODE, domain, "noprivdm", int.class, new String[]{"1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDETREECOLUMN, domain, "psdetreecolid", net.ibizsys.model.control.tree.IPSDETreeColumn.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}