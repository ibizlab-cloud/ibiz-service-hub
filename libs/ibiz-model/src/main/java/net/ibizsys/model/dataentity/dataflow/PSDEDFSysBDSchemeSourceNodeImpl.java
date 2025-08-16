package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSysBDSchemeSourceNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSourceNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSysBDSchemeSourceNode{

	public final static String ATTR_GETDSTPSDEDATAQUERY = "getDstPSDEDataQuery";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETPSSYSBDSCHEME = "getPSSysBDScheme";
	public final static String ATTR_GETPSSYSBDTABLE = "getPSSysBDTable";
	public final static String ATTR_GETSUBTYPE = "subType";
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery(){
		if(this.dstpsdedataquery != null) return this.dstpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		this.dstpsdedataquery = this.getDstPSDataEntityMust().getPSDEDataQuery(value, false);
		return this.dstpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getDstPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据查询对象");}
		return value;
	}

	public void setDstPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery){
		this.dstpsdedataquery = dstpsdedataquery;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsdedataset = this.getDstPSDataEntityMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集对象");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
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
}