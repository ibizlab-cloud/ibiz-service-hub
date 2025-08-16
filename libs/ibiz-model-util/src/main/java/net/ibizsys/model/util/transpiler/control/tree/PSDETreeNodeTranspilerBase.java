package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeNodeImplBase.*;



public class PSDETreeNodeTranspilerBase extends net.ibizsys.model.util.transpiler.control.PSControlItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeNodeImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeNodeImplBase realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeNodeImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "modelobj", realPSModelObject.getModelObj(), realPSModelObject, "getModelObj");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepslanresid", realPSModelObject.getNamePSLanguageRes(), realPSModelObject, "getNamePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "navviewfilter", realPSModelObject.getNavFilter(), realPSModelObject, "getNavFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbaseid", realPSModelObject.getNavPSAppView(), realPSModelObject, "getNavPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "navviewparam", realPSModelObject.getNavViewParamJO(), realPSModelObject, "getNavViewParamJO");
		this.setDomainValue(iPSModelTranspileContext, domain, "nodetype", realPSModelObject.getNodeType(), realPSModelObject, "getNodeType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdetoolbarid", realPSModelObject.getPSDEContextMenu(), realPSModelObject, "getPSDEContextMenu");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapedynaclass", realPSModelObject.getShapeDynaClass(), realPSModelObject, "getShapeDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapepssyscssid", realPSModelObject.getShapePSSysCss(), realPSModelObject, "getShapePSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "treenodetype", realPSModelObject.getTreeNodeType(), realPSModelObject, "getTreeNodeType");
		this.setDomainValue(iPSModelTranspileContext, domain, "editmode", realPSModelObject.isAllowDrag(), realPSModelObject, "isAllowDrag");
		this.setDomainValue(iPSModelTranspileContext, domain, "editmode", realPSModelObject.isAllowDrop(), realPSModelObject, "isAllowDrop");
		this.setDomainValue(iPSModelTranspileContext, domain, "editmode", realPSModelObject.isAllowEditText(), realPSModelObject, "isAllowEditText");
		this.setDomainValue(iPSModelTranspileContext, domain, "editmode", realPSModelObject.isAllowOrder(), realPSModelObject, "isAllowOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "appendpnodeid", realPSModelObject.isAppendPNodeId(), realPSModelObject, "isAppendPNodeId");
		this.setDomainValue(iPSModelTranspileContext, domain, "disableselect", realPSModelObject.isDisableSelect(), realPSModelObject, "isDisableSelect");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecheck", realPSModelObject.isEnableCheck(), realPSModelObject, "isEnableCheck");
		this.setDomainValue(iPSModelTranspileContext, domain, "selected", realPSModelObject.isExpandFirstOnly(), realPSModelObject, "isExpandFirstOnly");
		this.setDomainValue(iPSModelTranspileContext, domain, "expand", realPSModelObject.isExpanded(), realPSModelObject, "isExpanded");
		this.setDomainValue(iPSModelTranspileContext, domain, "rootnode", realPSModelObject.isRootNode(), realPSModelObject, "isRootNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "selected", realPSModelObject.isSelectFirstOnly(), realPSModelObject, "isSelectFirstOnly");
		this.setDomainValue(iPSModelTranspileContext, domain, "selected", realPSModelObject.isSelected(), realPSModelObject, "isSelected");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELOBJ, domain, "modelobj", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSLANGUAGERES, domain, "namepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVFILTER, domain, "navviewfilter", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVPSAPPVIEW, domain, "psdeviewbaseid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVVIEWPARAMJO, domain, "navviewparam", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNODETYPE, domain, "nodetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDECONTEXTMENU, domain, "psdetoolbarid", net.ibizsys.model.control.toolbar.IPSDEContextMenu.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPEDYNACLASS, domain, "shapedynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPEPSSYSCSS, domain, "shapepssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTREENODETYPE, domain, "treenodetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWDRAG, domain, "editmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWDROP, domain, "editmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEDITTEXT, domain, "editmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWORDER, domain, "editmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAPPENDPNODEID, domain, "appendpnodeid", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDISABLESELECT, domain, "disableselect", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECHECK, domain, "enablecheck", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXPANDFIRSTONLY, domain, "selected", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXPANDED, domain, "expand", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISROOTNODE, domain, "rootnode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSELECTFIRSTONLY, domain, "selected", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSELECTED, domain, "selected", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}