package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeImpl.*;



public class PSDETreeTranspiler extends net.ibizsys.model.util.transpiler.control.PSMDAjaxControlContainerTranspiler2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "frozencol", realPSModelObject.getFrozenFirstColumn(), realPSModelObject, "getFrozenFirstColumn");
		this.setDomainValue(iPSModelTranspileContext, domain, "frozenlastcol", realPSModelObject.getFrozenLastColumn(), realPSModelObject, "getFrozenLastColumn");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSAppCounterRef(), realPSModelObject, "getPSAppCounterRef");
		this.setDomainValue(iPSModelTranspileContext, domain, "treegridflag", realPSModelObject.getTreeGridMode(), realPSModelObject, "getTreeGridMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "treestyle", realPSModelObject.getTreeStyle(), realPSModelObject, "getTreeStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isEnableEdit(), realPSModelObject, "isEnableEdit");
		this.setDomainValue(iPSModelTranspileContext, domain, "rootselect", realPSModelObject.isEnableRootSelect(), realPSModelObject, "isEnableRootSelect");
		this.setDomainValue(iPSModelTranspileContext, domain, "noicondefault", realPSModelObject.isOutputIconDefault(), realPSModelObject, "isOutputIconDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "showroot", realPSModelObject.isRootVisible(), realPSModelObject, "isRootVisible");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROZENFIRSTCOLUMN, domain, "frozencol", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROZENLASTCOLUMN, domain, "frozenlastcol", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCOUNTERREF, domain, "pssyscounterid", net.ibizsys.model.app.control.IPSAppCounterRef.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTREEGRIDMODE, domain, "treegridflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTREESTYLE, domain, "treestyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEEDIT, domain, "ctrlparam6", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEROOTSELECT, domain, "rootselect", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISOUTPUTICONDEFAULT, domain, "noicondefault", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISROOTVISIBLE, domain, "showroot", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}