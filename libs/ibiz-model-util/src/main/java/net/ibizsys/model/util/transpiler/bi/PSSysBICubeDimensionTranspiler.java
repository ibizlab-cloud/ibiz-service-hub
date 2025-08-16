package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBICubeDimensionImpl.*;



public class PSSysBICubeDimensionTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBICubeObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBICubeDimensionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBICubeDimensionImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBICubeDimensionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dimensionformula", realPSModelObject.getDimensionFormula(), realPSModelObject, "getDimensionFormula");
		this.setDomainValue(iPSModelTranspileContext, domain, "bicubedimensiontag", realPSModelObject.getDimensionTag(), realPSModelObject, "getDimensionTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "bicubedimensiontag2", realPSModelObject.getDimensionTag2(), realPSModelObject, "getDimensionTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "bidimensiontype", realPSModelObject.getDimensionType(), realPSModelObject, "getDimensionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbidimensionid", realPSModelObject.getPSSysBIDimension(), realPSModelObject, "getPSSysBIDimension");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSDEField(), realPSModelObject, "getTextPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "texttemplate", realPSModelObject.getTextTemplate(), realPSModelObject, "getTextTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "tiptemplate", realPSModelObject.getTipTemplate(), realPSModelObject, "getTipTemplate");
		this.setDomainValue(iPSModelTranspileContext, domain, "allhierarchyflag", realPSModelObject.isAllHierarchy(), realPSModelObject, "isAllHierarchy");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONFORMULA, domain, "dimensionformula", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONTAG, domain, "bicubedimensiontag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONTAG2, domain, "bicubedimensiontag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDIMENSIONTYPE, domain, "bidimensiontype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBIDIMENSION, domain, "pssysbidimensionid", net.ibizsys.model.bi.IPSSysBIDimension.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSDEFIELD, domain, "textpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTTEMPLATE, domain, "texttemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPTEMPLATE, domain, "tiptemplate", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLHIERARCHY, domain, "allhierarchyflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}