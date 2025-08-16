package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDETreeNodeColumnListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDETreeNodeCol createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDETreeNodeCol();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DEFGRIDCOLUMN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDETreeNodeFieldColumnImpl.class, false);
			case "UAGRIDCOLUMN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDETreeNodeFieldColumnImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.tree.IPSDETreeNodeColumn iPSDETreeNodeColumn = (net.ibizsys.model.control.tree.IPSDETreeNodeColumn)iPSModelObject;
		Object type = iPSDETreeNodeColumn.getColumnType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("columntype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}