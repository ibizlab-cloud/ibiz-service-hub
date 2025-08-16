package net.ibizsys.model.app.bi;



public class PSAppBICubeHierarchyImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.bi.IPSAppBICubeHierarchy{

	public final static String ATTR_GETALLCAPTION = "allCaption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETHIERARCHYTAG = "hierarchyTag";
	public final static String ATTR_GETHIERARCHYTAG2 = "hierarchyTag2";
	public final static String ATTR_GETPSAPPBICUBELEVELS = "getPSAppBICubeLevels";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_HASALL = "hasAll";

	public java.lang.String getAllCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
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

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> psappbicubelevels = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> getPSAppBICubeLevels(){
		if(this.psappbicubelevels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBELEVELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBICubeLevel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBICubeLevel obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeLevel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBICUBELEVELS);
				if(obj!=null)list.add(obj);
			}
			this.psappbicubelevels = list;
		}
		return (this.psappbicubelevels.size() == 0)? null : this.psappbicubelevels;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeLevel getPSAppBICubeLevel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeLevel.class, this.getPSAppBICubeLevels(), objKey, bTryMode);
	}
	public void setPSAppBICubeLevels(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> list){
		this.psappbicubelevels = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关应用实体对象");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	public boolean hasAll(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASALL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}