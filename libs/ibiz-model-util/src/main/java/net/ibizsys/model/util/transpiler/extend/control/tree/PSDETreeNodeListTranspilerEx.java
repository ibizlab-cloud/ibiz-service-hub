package net.ibizsys.model.util.transpiler.extend.control.tree;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.tree.IPSDETreeNode;
import net.ibizsys.model.control.tree.IPSDETreeNodeRV;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDETreeNode;
import net.ibizsys.psmodel.core.domain.PSDETreeNodeRV;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDETreeNodeListTranspilerEx extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeNodeListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			
			PSDETreeNode psDETreeNode = (PSDETreeNode)domain;
			IPSDETreeNode iPSDETreeNode = (IPSDETreeNode)iPSModelObject;
			if(iPSDETreeNode.getPSDETreeNodeRVs()!=null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDETreeNodeRV.class, false).decompile(iPSModelTranspileContext, iPSDETreeNode.getPSDETreeNodeRVs(), psDETreeNode.getPSDETreeNodeRVsIf(), bFullMode);
				for(PSDETreeNodeRV child : psDETreeNode.getPSDETreeNodeRVsIf()) {
					child.setPSDETreeNodeId(psDETreeNode.getId());
					child.setPSDETreeNodeName(psDETreeNode.getName());
					//child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			
//			if(iPSDETreeNode.getps()!=null) {
//				int nOrder = 100;
//				iPSModelTranspileContext.getPSModelListTranspiler(IPSDETreeNodeRV.class, false).decompile(iPSModelTranspileContext, iPSDETreeNode.getPSDETreeNodeRVs(), psDETreeNode.getPSDETreeNodeRVsIf(), bFullMode);
//				for(PSDETreeNodeRV child : psDETreeNode.getPSDETreeNodeRVsIf()) {
//					child.setPSDETreeNodeId(psDETreeNode.getId());
//					child.setPSDETreeNodeName(psDETreeNode.getName());
//					//child.setOrderValue(nOrder);
//					nOrder += 100;
//				}
//			}
		}
	}
}