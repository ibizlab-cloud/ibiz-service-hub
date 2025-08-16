package net.ibizsys.model.dataentity.datamap;



public class PSDEMapDataQueryImpl extends net.ibizsys.model.dataentity.datamap.PSDEMapObjectImpl implements net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery{

	public final static String ATTR_GETDSTPSDEDATAQUERY = "getDstPSDEDataQuery";
	public final static String ATTR_GETMAPMODE = "mapMode";
	public final static String ATTR_GETMAPPARAMS = "mapParams";
	public final static String ATTR_GETSRCPSDEDATAQUERY = "getSrcPSDEDataQuery";
	public final static String ATTR_ISENABLEDQCOND = "enableDQCond";
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery(){
		if(this.dstpsdedataquery != null) return this.dstpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.datamap.IPSDEMap ipsdemap = getParentPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class);
		this.dstpsdedataquery = ipsdemap.getDstPSDEMust().getPSDEDataQuery(value, false);
		return this.dstpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getDstPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体查询");}
		return value;
	}

	public void setDstPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery){
		this.dstpsdedataquery = dstpsdedataquery;
	}


	public java.lang.String getMapMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPMODE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getMapParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery srcpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getSrcPSDEDataQuery(){
		if(this.srcpsdedataquery != null) return this.srcpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.srcpsdedataquery = ipsdataentity.getPSDEDataQuery(value, false);
		return this.srcpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getSrcPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getSrcPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源实体查询");}
		return value;
	}

	public void setSrcPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery srcpsdedataquery){
		this.srcpsdedataquery = srcpsdedataquery;
	}


	public boolean isEnableDQCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDQCOND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}