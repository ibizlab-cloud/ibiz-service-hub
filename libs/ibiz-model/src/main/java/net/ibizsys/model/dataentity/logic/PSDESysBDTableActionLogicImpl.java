package net.ibizsys.model.dataentity.logic;



public class PSDESysBDTableActionLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysBDTableActionLogic{

	public final static String ATTR_GETBDTABLEACTION = "bDTableAction";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETPSSYSBDSCHEME = "getPSSysBDScheme";
	public final static String ATTR_GETPSSYSBDTABLE = "getPSSysBDTable";

	public java.lang.String getBDTableAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBDTABLEACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam(){
		if(this.dstpsdelogicparam != null) return this.dstpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.dstpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getDstPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}

	private net.ibizsys.model.ba.IPSSysBDScheme pssysbdscheme;

	public net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme(){
		if(this.pssysbdscheme != null) return this.pssysbdscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBDSCHEME);
		if(value == null){
			return null;
		}
		this.pssysbdscheme = getPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSBDSCHEME);
		return this.pssysbdscheme;
	}

	public net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust(){
		net.ibizsys.model.ba.IPSSysBDScheme value = this.getPSSysBDScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定大数据体系");}
		return value;
	}

	public void setPSSysBDScheme(net.ibizsys.model.ba.IPSSysBDScheme pssysbdscheme){
		this.pssysbdscheme = pssysbdscheme;
	}

	private net.ibizsys.model.ba.IPSSysBDTable pssysbdtable;

	public net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable(){
		if(this.pssysbdtable != null) return this.pssysbdtable;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBDTABLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.ba.IPSSysBDScheme ipssysbdscheme = this.getPSSysBDSchemeMust();
		this.pssysbdtable = ipssysbdscheme.getPSSysBDTable(value, false);
		return this.pssysbdtable;
	}

	public net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTableMust(){
		net.ibizsys.model.ba.IPSSysBDTable value = this.getPSSysBDTable();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据表");}
		return value;
	}

	public void setPSSysBDTable(net.ibizsys.model.ba.IPSSysBDTable pssysbdtable){
		this.pssysbdtable = pssysbdtable;
	}

}