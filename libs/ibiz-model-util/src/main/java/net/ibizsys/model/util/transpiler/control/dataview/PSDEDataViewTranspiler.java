package net.ibizsys.model.util.transpiler.control.dataview;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.dataview.PSDEDataViewImpl.*;



public class PSDEDataViewTranspiler extends net.ibizsys.model.util.transpiler.control.PSMDAjaxControlContainerTranspiler2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.dataview.PSDEDataViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.dataview.PSDEDataViewImpl realPSModelObject = (net.ibizsys.model.control.dataview.PSDEDataViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "card_col_lg", realPSModelObject.getCardColLG(), realPSModelObject, "getCardColLG");
		this.setDomainValue(iPSModelTranspileContext, domain, "card_col_md", realPSModelObject.getCardColMD(), realPSModelObject, "getCardColMD");
		this.setDomainValue(iPSModelTranspileContext, domain, "card_col_sm", realPSModelObject.getCardColSM(), realPSModelObject, "getCardColSM");
		this.setDomainValue(iPSModelTranspileContext, domain, "card_col_xs", realPSModelObject.getCardColXS(), realPSModelObject, "getCardColXS");
		this.setDomainValue(iPSModelTranspileContext, domain, "cardheight", realPSModelObject.getCardHeight(), realPSModelObject, "getCardHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "cardwidth", realPSModelObject.getCardWidth(), realPSModelObject, "getCardWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "group_col_lg", realPSModelObject.getGroupColLG(), realPSModelObject, "getGroupColLG");
		this.setDomainValue(iPSModelTranspileContext, domain, "group_col_md", realPSModelObject.getGroupColMD(), realPSModelObject, "getGroupColMD");
		this.setDomainValue(iPSModelTranspileContext, domain, "group_col_sm", realPSModelObject.getGroupColSM(), realPSModelObject, "getGroupColSM");
		this.setDomainValue(iPSModelTranspileContext, domain, "group_col_xs", realPSModelObject.getGroupColXS(), realPSModelObject, "getGroupColXS");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupheight", realPSModelObject.getGroupHeight(), realPSModelObject, "getGroupHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouplayout", realPSModelObject.getGroupLayout(), realPSModelObject, "getGroupLayout");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupmode", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdefid", realPSModelObject.getGroupPSAppDEField(), realPSModelObject, "getGroupPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getGroupPSCodeList(), realPSModelObject, "getGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppssyscssid", realPSModelObject.getGroupPSSysCss(), realPSModelObject, "getGroupPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdeuagroupid", realPSModelObject.getGroupPSUIActionGroup(), realPSModelObject, "getGroupPSUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupstyle", realPSModelObject.getGroupStyle(), realPSModelObject, "getGroupStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptextpsdefid", realPSModelObject.getGroupTextPSAppDEField(), realPSModelObject, "getGroupTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupwidth", realPSModelObject.getGroupWidth(), realPSModelObject, "getGroupWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysviewpanelid", realPSModelObject.getItemPSLayoutPanel(), realPSModelObject, "getItemPSLayoutPanel");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSAppDEField(), realPSModelObject, "getMinorSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervaluepsdefid", realPSModelObject.getOrderValuePSAppDEField(), realPSModelObject, "getOrderValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagingsize", realPSModelObject.getPagingSize(), realPSModelObject, "getPagingSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "swimlanepsdefid", realPSModelObject.getSwimlanePSAppDEField(), realPSModelObject, "getSwimlanePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "swimlanepscodelistid", realPSModelObject.getSwimlanePSCodeList(), realPSModelObject, "getSwimlanePSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "appenddeitems", realPSModelObject.isAppendDEItems(), realPSModelObject, "isAppendDEItems");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepagingbar", realPSModelObject.isEnablePagingBar(), realPSModelObject, "isEnablePagingBar");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isNoSort(), realPSModelObject, "isNoSort");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDCOLLG, domain, "card_col_lg", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDCOLMD, domain, "card_col_md", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDCOLSM, domain, "card_col_sm", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDCOLXS, domain, "card_col_xs", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDHEIGHT, domain, "cardheight", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCARDWIDTH, domain, "cardwidth", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPCOLLG, domain, "group_col_lg", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPCOLMD, domain, "group_col_md", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPCOLSM, domain, "group_col_sm", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPCOLXS, domain, "group_col_xs", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPHEIGHT, domain, "groupheight", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPLAYOUT, domain, "grouplayout", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "groupmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSAPPDEFIELD, domain, "grouppsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSSYSCSS, domain, "grouppssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSUIACTIONGROUP, domain, "grouppsdeuagroupid", net.ibizsys.model.view.IPSUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPSTYLE, domain, "groupstyle", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTEXTPSAPPDEFIELD, domain, "grouptextpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPWIDTH, domain, "groupwidth", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMPSLAYOUTPANEL, domain, "pssysviewpanelid", net.ibizsys.model.control.panel.IPSLayoutPanel.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSAPPDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUEPSAPPDEFIELD, domain, "ordervaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGINGSIZE, domain, "pagingsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSWIMLANEPSAPPDEFIELD, domain, "swimlanepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSWIMLANEPSCODELIST, domain, "swimlanepscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAPPENDDEITEMS, domain, "appenddeitems", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPAGINGBAR, domain, "enablepagingbar", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOSORT, domain, "nosort", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}