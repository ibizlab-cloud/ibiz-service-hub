package net.ibizsys.model.control.map;



public class PSSysMapImpl extends net.ibizsys.model.control.map.PSMapImpl implements net.ibizsys.model.control.map.IPSSysMap{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETLEGENDPOS = "legendPos";
	public final static String ATTR_GETMAPSTYLE = "mapStyle";
	public final static String ATTR_GETPSSYSMAPITEMS = "getPSSysMapItems";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes(){
		if(this.emptytextpslanguageres != null) return this.emptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.emptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMPTYTEXTPSLANGUAGERES);
		return this.emptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定无值内容语言资源");}
		return value;
	}


	public java.lang.String getLegendPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEGENDPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMapStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> pssysmapitems = null;
	public java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> getPSSysMapItems(){
		if(this.pssysmapitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMAPITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> list = new java.util.ArrayList<net.ibizsys.model.control.map.IPSSysMapItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.map.IPSSysMapItem obj = this.getPSModelObject(net.ibizsys.model.control.map.IPSSysMapItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSMAPITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pssysmapitems = list;
		}
		return (this.pssysmapitems.size() == 0)? null : this.pssysmapitems;
	}

	public net.ibizsys.model.control.map.IPSSysMapItem getPSSysMapItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.map.IPSSysMapItem.class, this.getPSSysMapItems(), objKey, bTryMode);
	}
	public void setPSSysMapItems(java.util.List<net.ibizsys.model.control.map.IPSSysMapItem> list){
		this.pssysmapitems = list;
	}

	@Deprecated
	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}