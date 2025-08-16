package net.ibizsys.model.util.transpiler.control.list;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.list.PSDEListImpl.*;



public class PSDEListTranspiler extends net.ibizsys.model.util.transpiler.control.list.PSListTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.list.PSDEListImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.list.PSDEListImpl realPSModelObject = (net.ibizsys.model.control.list.PSDEListImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupmode", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdefid", realPSModelObject.getGroupPSAppDEField(), realPSModelObject, "getGroupPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getGroupPSCodeList(), realPSModelObject, "getGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppssyscssid", realPSModelObject.getGroupPSSysCss(), realPSModelObject, "getGroupPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdeuagroupid", realPSModelObject.getGroupPSUIActionGroup(), realPSModelObject, "getGroupPSUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupstyle", realPSModelObject.getGroupStyle(), realPSModelObject, "getGroupStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewpanelid", realPSModelObject.getItemPSLayoutPanel(), realPSModelObject, "getItemPSLayoutPanel");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSAppDEField(), realPSModelObject, "getMinorSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobliststyle", realPSModelObject.getMobListStyle(), realPSModelObject, "getMobListStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagesize", realPSModelObject.getPagingSize(), realPSModelObject, "getPagingSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepagingbar", realPSModelObject.isEnablePagingBar(), realPSModelObject, "isEnablePagingBar");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isNoSort(), realPSModelObject, "isNoSort");
		this.setDomainValue(iPSModelTranspileContext, domain, "showheader", realPSModelObject.isShowHeader(), realPSModelObject, "isShowHeader");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "groupmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSAPPDEFIELD, domain, "grouppsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSSYSCSS, domain, "grouppssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSUIACTIONGROUP, domain, "grouppsdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPSTYLE, domain, "groupstyle", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMPSLAYOUTPANEL, domain, "pssysviewpanelid", net.ibizsys.model.control.panel.IPSLayoutPanel.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSAPPDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBLISTSTYLE, domain, "mobliststyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGINGSIZE, domain, "pagesize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPAGINGBAR, domain, "enablepagingbar", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOSORT, domain, "nosort", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWHEADER, domain, "showheader", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}