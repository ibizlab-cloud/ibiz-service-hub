package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSSysDEFTypeImpl.*;



public class PSSysDEFTypeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSSysDEFTypeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSSysDEFTypeImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSSysDEFTypeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "editorheight", realPSModelObject.getEditorHeight(), realPSModelObject, "getEditorHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "editortype", realPSModelObject.getEditorType(), realPSModelObject, "getEditorType");
		this.setDomainValue(iPSModelTranspileContext, domain, "editorwidth", realPSModelObject.getEditorWidth(), realPSModelObject, "getEditorWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridcolalign", realPSModelObject.getGridColumnAlign(), realPSModelObject, "getGridColumnAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValueString(), realPSModelObject, "getMaxValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "minstrlength", realPSModelObject.getMinStringLength(), realPSModelObject, "getMinStringLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValueString(), realPSModelObject, "getMinValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "strlength", realPSModelObject.getStringLength(), realPSModelObject, "getStringLength");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORHEIGHT, domain, "editorheight", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORTYPE, domain, "editortype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORWIDTH, domain, "editorwidth", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGRIDCOLUMNALIGN, domain, "gridcolalign", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUESTRING, domain, "maxvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINSTRINGLENGTH, domain, "minstrlength", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUESTRING, domain, "minvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTRINGLENGTH, domain, "strlength", int.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}