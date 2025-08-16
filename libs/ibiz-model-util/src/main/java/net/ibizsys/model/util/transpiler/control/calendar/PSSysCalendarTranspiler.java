package net.ibizsys.model.util.transpiler.control.calendar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.calendar.PSSysCalendarImpl.*;



public class PSSysCalendarTranspiler extends net.ibizsys.model.util.transpiler.control.calendar.PSCalendarTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.calendar.PSSysCalendarImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.calendar.PSSysCalendarImpl realPSModelObject = (net.ibizsys.model.control.calendar.PSSysCalendarImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "calendarstyle", realPSModelObject.getCalendarStyle(), realPSModelObject, "getCalendarStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupheight", realPSModelObject.getGroupHeight(), realPSModelObject, "getGroupHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouplayout", realPSModelObject.getGroupLayout(), realPSModelObject, "getGroupLayout");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupmode", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdefid", realPSModelObject.getGroupPSAppDEField(), realPSModelObject, "getGroupPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getGroupPSCodeList(), realPSModelObject, "getGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppssyscssid", realPSModelObject.getGroupPSSysCss(), realPSModelObject, "getGroupPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupwidth", realPSModelObject.getGroupWidth(), realPSModelObject, "getGroupWidth");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCALENDARSTYLE, domain, "calendarstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPHEIGHT, domain, "groupheight", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPLAYOUT, domain, "grouplayout", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "groupmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSAPPDEFIELD, domain, "grouppsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSSYSCSS, domain, "grouppssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPWIDTH, domain, "groupwidth", int.class, new String[]{"0"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}