package net.ibizsys.model.dataentity.der;



public class PSDERIndexImpl extends net.ibizsys.model.dataentity.der.PSDERBaseImpl implements net.ibizsys.model.dataentity.der.IPSDERIndex{

	public final static String ATTR_GETPSDERINDEXDEFIELDMAPS = "getPSDERIndexDEFieldMaps";
	public final static String ATTR_GETTYPEVALUE = "typeValue";
	public final static String ATTR_ISINHERIT = "inherit";
	public final static String ATTR_ISVIRTUAL = "virtual";

	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> psderindexdefieldmaps = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> getPSDERIndexDEFieldMaps(){
		if(this.psderindexdefieldmaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDERINDEXDEFIELDMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDERINDEXDEFIELDMAPS);
				if(obj!=null)list.add(obj);
			}
			this.psderindexdefieldmaps = list;
		}
		return (this.psderindexdefieldmaps.size() == 0)? null : this.psderindexdefieldmaps;
	}

	public net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap getPSDERIndexDEFieldMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap.class, this.getPSDERIndexDEFieldMaps(), objKey, bTryMode);
	}
	public void setPSDERIndexDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> list){
		this.psderindexdefieldmaps = list;
	}

	public java.lang.String getTypeValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isInherit(){
		return false;
	}

	public boolean isVirtual(){
		return this.getMajorPSDataEntityMust().isVirtual();
	}
}