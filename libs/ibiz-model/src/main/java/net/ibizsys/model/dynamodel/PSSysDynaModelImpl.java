package net.ibizsys.model.dynamodel;



public class PSSysDynaModelImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dynamodel.IPSSysDynaModel{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETMODELTAG = "modelTag";
	public final static String ATTR_GETMODELTAG2 = "modelTag2";
	public final static String ATTR_GETMODELTAG3 = "modelTag3";
	public final static String ATTR_GETMODELTAG4 = "modelTag4";
	public final static String ATTR_GETPSDYNAMODEL = "getPSDynaModel";
	public final static String ATTR_GETPSDYNAMODELATTRS = "getPSDynaModelAttrs";
	public final static String ATTR_GETUSAGE = "usage";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dynamodel.IPSDynaModel psdynamodel;

	@Deprecated
	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModel(){
		if(this.psdynamodel != null) return this.psdynamodel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDYNAMODEL);
		if(value == null){
			return null;
		}
		this.psdynamodel = getPSModelObject(net.ibizsys.model.dynamodel.IPSDynaModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDYNAMODEL);
		return this.psdynamodel;
	}

	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModelMust(){
		net.ibizsys.model.dynamodel.IPSDynaModel value = this.getPSDynaModel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSDynaModel]返回空值");}
		return value;
	}

	public void setPSDynaModel(net.ibizsys.model.dynamodel.IPSDynaModel psdynamodel){
		this.psdynamodel = psdynamodel;
	}


	private java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> psdynamodelattrs = null;
	public java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> getPSDynaModelAttrs(){
		if(this.psdynamodelattrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDYNAMODELATTRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> list = new java.util.ArrayList<net.ibizsys.model.dynamodel.IPSDynaModelAttr>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dynamodel.IPSDynaModelAttr obj = this.getPSModelObject(net.ibizsys.model.dynamodel.IPSDynaModelAttr.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDYNAMODELATTRS);
				if(obj!=null)list.add(obj);
			}
			this.psdynamodelattrs = list;
		}
		return (this.psdynamodelattrs.size() == 0)? null : this.psdynamodelattrs;
	}

	public net.ibizsys.model.dynamodel.IPSDynaModelAttr getPSDynaModelAttr(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dynamodel.IPSDynaModelAttr.class, this.getPSDynaModelAttrs(), objKey, bTryMode);
	}
	public void setPSDynaModelAttrs(java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> list){
		this.psdynamodelattrs = list;
	}

	public java.lang.String getUsage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSAGE);
		if(value == null){
			return "DATA";
		}
		return value.asText();
	}
}