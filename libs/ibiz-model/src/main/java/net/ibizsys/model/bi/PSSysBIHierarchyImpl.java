package net.ibizsys.model.bi;



public class PSSysBIHierarchyImpl extends net.ibizsys.model.bi.PSSysBIDimensionObjectImpl implements net.ibizsys.model.bi.IPSSysBIHierarchy{

	public final static String ATTR_GETALLCAPTION = "allCaption";
	public final static String ATTR_GETALLPSSYSBILEVELS = "getAllPSSysBILevels";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHIERARCHYTAG = "hierarchyTag";
	public final static String ATTR_GETHIERARCHYTAG2 = "hierarchyTag2";
	public final static String ATTR_GETHIERARCHYTYPE = "hierarchyType";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_HASALL = "hasAll";

	public java.lang.String getAllCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBILevel> allpssysbilevels = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBILevel> getAllPSSysBILevels(){
		if(this.allpssysbilevels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBILEVELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBILevel> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBILevel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBILevel obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBILevel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBILEVELS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbilevels = list;
		}
		return (this.allpssysbilevels.size() == 0)? null : this.allpssysbilevels;
	}

	public net.ibizsys.model.bi.IPSSysBILevel getPSSysBILevel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBILevel.class, this.getAllPSSysBILevels(), objKey, bTryMode);
	}
	public void setPSSysBILevels(java.util.List<net.ibizsys.model.bi.IPSSysBILevel> list){
		this.allpssysbilevels = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHierarchyTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHIERARCHYTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHierarchyTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHIERARCHYTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHierarchyType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHIERARCHYTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
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

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}


	public boolean hasAll(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASALL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}