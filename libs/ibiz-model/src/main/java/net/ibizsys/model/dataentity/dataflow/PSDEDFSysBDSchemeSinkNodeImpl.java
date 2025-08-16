package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSysBDSchemeSinkNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSinkNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSysBDSchemeSinkNode{

	public final static String ATTR_GETDSTPSDEFGROUP = "getDstPSDEFGroup";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETPSSYSBDSCHEME = "getPSSysBDScheme";
	public final static String ATTR_GETPSSYSBDTABLE = "getPSSysBDTable";
	public final static String ATTR_GETSUBTYPE = "subType";
	public final static String ATTR_GETTABLEACTION = "tableAction";
	private net.ibizsys.model.dataentity.defield.IPSDEFGroup dstpsdefgroup;

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getDstPSDEFGroup(){
		if(this.dstpsdefgroup != null) return this.dstpsdefgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEFGROUP);
		if(value == null){
			return null;
		}
		this.dstpsdefgroup = this.getDstPSDataEntityMust().getPSDEFGroup(value, false);
		return this.dstpsdefgroup;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getDstPSDEFGroupMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFGroup value = this.getDstPSDEFGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体属性组对象");}
		return value;
	}

	public void setDstPSDEFGroup(net.ibizsys.model.dataentity.defield.IPSDEFGroup dstpsdefgroup){
		this.dstpsdefgroup = dstpsdefgroup;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity(){
		if(this.dstpsdataentity != null) return this.dstpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDATAENTITY);
		return this.dstpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体对象");}
		return value;
	}

	public void setDstPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity){
		this.dstpsdataentity = dstpsdataentity;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定大数据库体系");}
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


	public java.lang.String getSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTYPE);
		if(value == null){
			return "BDTABLE";
		}
		return value.asText();
	}

	public java.lang.String getTableAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLEACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}