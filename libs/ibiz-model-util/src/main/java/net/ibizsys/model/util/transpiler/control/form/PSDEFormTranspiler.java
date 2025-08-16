package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormImpl.*;



public class PSDEFormTranspiler extends net.ibizsys.model.util.transpiler.control.PSAjaxControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "funcmode", realPSModelObject.getFormFuncMode(), realPSModelObject, "getFormFuncMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "formstyle", realPSModelObject.getFormStyle(), realPSModelObject, "getFormStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "formwidth", realPSModelObject.getFormWidth(), realPSModelObject, "getFormWidth", new String[]{"0.0"});
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefinputtipsetid", realPSModelObject.getPSAppDEFInputTipSet(), realPSModelObject, "getPSAppDEFInputTipSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "tabheaderpos", realPSModelObject.getTabHeaderPos(), realPSModelObject, "getTabHeaderPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableitemfilter", realPSModelObject.isEnableItemFilter(), realPSModelObject, "isEnableItemFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobflag", realPSModelObject.isMobileControl(), realPSModelObject, "isMobileControl");
		this.setDomainValue(iPSModelTranspileContext, domain, "showtabheader", realPSModelObject.isNoTabHeader(), realPSModelObject, "isNoTabHeader");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTLABELWIDTH, domain, "labelwidth", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMFUNCMODE, domain, "funcmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMSTYLE, domain, "formstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMWIDTH, domain, "formwidth", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEFINPUTTIPSET, domain, "psdefinputtipsetid", net.ibizsys.model.app.res.IPSAppDEFInputTipSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTABHEADERPOS, domain, "tabheaderpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEITEMFILTER, domain, "enableitemfilter", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMOBILECONTROL, domain, "mobflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOTABHEADER, domain, "showtabheader", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}