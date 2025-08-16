package net.ibizsys.model.bi;



public class PSSysBIDimensionImpl extends net.ibizsys.model.bi.PSSysBISchemeObjectImpl implements net.ibizsys.model.bi.IPSSysBIDimension{

	public final static String ATTR_GETALLPSSYSBIHIERARCHIES = "getAllPSSysBIHierarchies";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDIMENSIONTAG = "dimensionTag";
	public final static String ATTR_GETDIMENSIONTAG2 = "dimensionTag2";

	private java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> allpssysbihierarchies = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> getAllPSSysBIHierarchies(){
		if(this.allpssysbihierarchies == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIHIERARCHIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIHierarchy>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIHierarchy obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIHierarchy.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIHIERARCHIES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbihierarchies = list;
		}
		return (this.allpssysbihierarchies.size() == 0)? null : this.allpssysbihierarchies;
	}

	public net.ibizsys.model.bi.IPSSysBIHierarchy getPSSysBIHierarchy(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIHierarchy.class, this.getAllPSSysBIHierarchies(), objKey, bTryMode);
	}
	public void setPSSysBIHierarchies(java.util.List<net.ibizsys.model.bi.IPSSysBIHierarchy> list){
		this.allpssysbihierarchies = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDimensionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDimensionTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}