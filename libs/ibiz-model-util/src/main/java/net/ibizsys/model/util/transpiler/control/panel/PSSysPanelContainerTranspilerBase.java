package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelContainerImplBase.*;



public class PSSysPanelContainerTranspilerBase extends net.ibizsys.model.util.transpiler.control.panel.PSSysPanelItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelContainerImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelContainerImplBase realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelContainerImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "datapanelmode", realPSModelObject.getDataRegionType(), realPSModelObject, "getDataRegionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "datasource", realPSModelObject.getDataSourceType(), realPSModelObject, "getDataSourceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppDELogic(), realPSModelObject, "getPSAppDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSAppDEMethod(), realPSModelObject, "getPSAppDEMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "getdatatimer", realPSModelObject.getReloadTimer(), realPSModelObject, "getReloadTimer");
		this.setDomainValue(iPSModelTranspileContext, domain, "busyindicator", realPSModelObject.isShowBusyIndicator(), realPSModelObject, "isShowBusyIndicator");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAREGIONTYPE, domain, "datapanelmode", java.lang.String.class, new String[]{"INHERIT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASOURCETYPE, domain, "datasource", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDELOGIC, domain, "psdelogicid", net.ibizsys.model.app.dataentity.IPSAppDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEMETHOD, domain, "psdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRELOADTIMER, domain, "getdatatimer", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWBUSYINDICATOR, domain, "busyindicator", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}