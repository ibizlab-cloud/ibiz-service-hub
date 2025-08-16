package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSysDBSchemeSourceNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSourceNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSysDBSchemeSourceNode{

	public final static String ATTR_GETDSTPSDEDATAQUERY = "getDstPSDEDataQuery";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETPSSYSDBSCHEME = "getPSSysDBScheme";
	public final static String ATTR_GETPSSYSDBTABLE = "getPSSysDBTable";
	public final static String ATTR_GETSQL = "sql";
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

	private net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme;

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(){
		if(this.pssysdbscheme != null) return this.pssysdbscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBSCHEME);
		if(value == null){
			return null;
		}
		this.pssysdbscheme = getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDBSCHEME);
		return this.pssysdbscheme;
	}

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust(){
		net.ibizsys.model.database.IPSSysDBScheme value = this.getPSSysDBScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据库体系");}
		return value;
	}

	public void setPSSysDBScheme(net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme){
		this.pssysdbscheme = pssysdbscheme;
	}

	private net.ibizsys.model.database.IPSSysDBTable pssysdbtable;

	public net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable(){
		if(this.pssysdbtable != null) return this.pssysdbtable;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBTABLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.database.IPSSysDBScheme ipssysdbscheme = this.getPSSysDBSchemeMust();
		this.pssysdbtable = ipssysdbscheme.getPSSysDBTable(value, false);
		return this.pssysdbtable;
	}

	public net.ibizsys.model.database.IPSSysDBTable getPSSysDBTableMust(){
		net.ibizsys.model.database.IPSSysDBTable value = this.getPSSysDBTable();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据表");}
		return value;
	}

	public void setPSSysDBTable(net.ibizsys.model.database.IPSSysDBTable pssysdbtable){
		this.pssysdbtable = pssysdbtable;
	}


	public java.lang.String getSql(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSQL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTYPE);
		if(value == null){
			return "DBTABLE";
		}
		return value.asText();
	}
}