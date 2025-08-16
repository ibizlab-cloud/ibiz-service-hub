package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBICubeMeasureImpl.*;



public class PSSysBICubeMeasureTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBICubeObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBICubeMeasureImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBICubeMeasureImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBICubeMeasureImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aggtype", realPSModelObject.getAggMode(), realPSModelObject, "getAggMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "drilldetailcustomcond", realPSModelObject.getDrillDetailCustomCond(), realPSModelObject, "getDrillDetailCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "jsonformat", realPSModelObject.getJsonFormat(), realPSModelObject, "getJsonFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "measureformula", realPSModelObject.getMeasureFormula(), realPSModelObject, "getMeasureFormula");
		this.setDomainValue(iPSModelTranspileContext, domain, "bimeasuregroup", realPSModelObject.getMeasureGroup(), realPSModelObject, "getMeasureGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "bicubemeasuretag", realPSModelObject.getMeasureTag(), realPSModelObject, "getMeasureTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "bicubemeasuretag2", realPSModelObject.getMeasureTag2(), realPSModelObject, "getMeasureTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "bimeasuretype", realPSModelObject.getMeasureType(), realPSModelObject, "getMeasureType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "texttemplate", realPSModelObject.getTextTemplate(), realPSModelObject, "getTextTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "tiptemplate", realPSModelObject.getTipTemplate(), realPSModelObject, "getTipTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "hiddendataitem", realPSModelObject.isDataItem(), realPSModelObject, "isDataItem");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGMODE, domain, "aggtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDRILLDETAILCUSTOMCOND, domain, "drilldetailcustomcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJSONFORMAT, domain, "jsonformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEASUREFORMULA, domain, "measureformula", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEASUREGROUP, domain, "bimeasuregroup", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEASURETAG, domain, "bicubemeasuretag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEASURETAG2, domain, "bicubemeasuretag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEASURETYPE, domain, "bimeasuretype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTTEMPLATE, domain, "texttemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPTEMPLATE, domain, "tiptemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDATAITEM, domain, "hiddendataitem", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}