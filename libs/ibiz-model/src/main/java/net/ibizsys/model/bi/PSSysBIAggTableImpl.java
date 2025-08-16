package net.ibizsys.model.bi;



public class PSSysBIAggTableImpl extends net.ibizsys.model.bi.PSSysBISchemeObjectImpl implements net.ibizsys.model.bi.IPSSysBIAggTable{

	public final static String ATTR_GETALLPSSYSBIAGGCOLUMNS = "getAllPSSysBIAggColumns";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSBICUBE = "getPSSysBICube";
	public final static String ATTR_GETTABLETAG = "tableTag";
	public final static String ATTR_GETTABLETAG2 = "tableTag2";

	private java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> allpssysbiaggcolumns = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> getAllPSSysBIAggColumns(){
		if(this.allpssysbiaggcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIAGGCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIAggColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIAggColumn obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIAggColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIAGGCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbiaggcolumns = list;
		}
		return (this.allpssysbiaggcolumns.size() == 0)? null : this.allpssysbiaggcolumns;
	}

	public net.ibizsys.model.bi.IPSSysBIAggColumn getPSSysBIAggColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIAggColumn.class, this.getAllPSSysBIAggColumns(), objKey, bTryMode);
	}
	public void setPSSysBIAggColumns(java.util.List<net.ibizsys.model.bi.IPSSysBIAggColumn> list){
		this.allpssysbiaggcolumns = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(){
		if(this.psdedataquery != null) return this.psdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataquery = ipsdataentity.getPSDEDataQuery(value, false);
		return this.psdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据查询");}
		return value;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体");}
		return value;
	}

	private net.ibizsys.model.bi.IPSSysBICube pssysbicube;

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICube(){
		if(this.pssysbicube != null) return this.pssysbicube;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIScheme ipssysbischeme = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class);
		this.pssysbicube = ipssysbischeme.getPSSysBICube(value, false);
		return this.pssysbicube;
	}

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICubeMust(){
		net.ibizsys.model.bi.IPSSysBICube value = this.getPSSysBICube();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定智能报表立方体");}
		return value;
	}


	public java.lang.String getTableTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTableTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}