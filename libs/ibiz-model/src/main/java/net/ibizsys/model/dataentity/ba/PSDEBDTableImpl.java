package net.ibizsys.model.dataentity.ba;



public class PSDEBDTableImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.ba.IPSDEBDTable{

	public final static String ATTR_GETBDTABLEDETYPE = "bDTableDEType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSBDSCHEME = "getPSSysBDScheme";
	public final static String ATTR_GETPSSYSBDTABLE = "getPSSysBDTable";

	public int getBDTableDEType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBDTABLEDETYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定大数据表");}
		return value;
	}

	public void setPSSysBDTable(net.ibizsys.model.ba.IPSSysBDTable pssysbdtable){
		this.pssysbdtable = pssysbdtable;
	}

}