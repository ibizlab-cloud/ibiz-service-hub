package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormButtonListImpl.*;



public class PSDEFormButtonListTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormButtonListImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormButtonListImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormButtonListImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "updatedvt", realPSModelObject.getActionGroupExtractMode(), realPSModelObject, "getActionGroupExtractMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getButtonListType(), realPSModelObject, "getButtonListType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSUIActionGroup(), realPSModelObject, "getPSUIActionGroup");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONGROUPEXTRACTMODE, domain, "updatedvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONLISTTYPE, domain, "contenttype", java.lang.String.class, new String[]{"UIACTIONGROUP"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}