package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDESearchFormImpl.*;



public class PSDESearchFormTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDESearchFormImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDESearchFormImpl realPSModelObject = (net.ibizsys.model.control.form.PSDESearchFormImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "searchbtnpos", realPSModelObject.getSearchButtonPos(), realPSModelObject, "getSearchButtonPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "searchbtnstyle", realPSModelObject.getSearchButtonStyle(), realPSModelObject, "getSearchButtonStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableadvsearch", realPSModelObject.isEnableAdvanceSearch(), realPSModelObject, "isEnableAdvanceSearch");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isEnableAutoSearch(), realPSModelObject, "isEnableAutoSearch");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablefiltersave", realPSModelObject.isEnableFilterSave(), realPSModelObject, "isEnableFilterSave");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEARCHBUTTONPOS, domain, "searchbtnpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEARCHBUTTONSTYLE, domain, "searchbtnstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEADVANCESEARCH, domain, "enableadvsearch", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAUTOSEARCH, domain, "ctrlparam6", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFILTERSAVE, domain, "enablefiltersave", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}