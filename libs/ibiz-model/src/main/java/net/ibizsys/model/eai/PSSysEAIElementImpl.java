package net.ibizsys.model.eai;



public class PSSysEAIElementImpl extends net.ibizsys.model.eai.PSSysEAISchemeObjectImpl implements net.ibizsys.model.eai.IPSSysEAIElement{

	public final static String ATTR_GETALLPSSYSEAIELEMENTATTRS = "getAllPSSysEAIElementAttrs";
	public final static String ATTR_GETALLPSSYSEAIELEMENTRES = "getAllPSSysEAIElementREs";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETELEMENTTAG = "elementTag";
	public final static String ATTR_GETELEMENTTAG2 = "elementTag2";
	public final static String ATTR_GETELEMENTTYPE = "elementType";
	public final static String ATTR_GETORDERMODE = "orderMode";

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> allpssyseaielementattrs = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> getAllPSSysEAIElementAttrs(){
		if(this.allpssyseaielementattrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIELEMENTATTRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIElementAttr>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIElementAttr obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElementAttr.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIELEMENTATTRS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaielementattrs = list;
		}
		return (this.allpssyseaielementattrs.size() == 0)? null : this.allpssyseaielementattrs;
	}

	public net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttr(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElementAttr.class, this.getAllPSSysEAIElementAttrs(), objKey, bTryMode);
	}
	public void setPSSysEAIElementAttrs(java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> list){
		this.allpssyseaielementattrs = list;
	}

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> allpssyseaielementres = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> getAllPSSysEAIElementREs(){
		if(this.allpssyseaielementres == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIELEMENTRES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIElementRE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIElementRE obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElementRE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIELEMENTRES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaielementres = list;
		}
		return (this.allpssyseaielementres.size() == 0)? null : this.allpssyseaielementres;
	}

	public net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementRE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIElementRE.class, this.getAllPSSysEAIElementREs(), objKey, bTryMode);
	}
	public void setPSSysEAIElementREs(java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> list){
		this.allpssyseaielementres = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getElementTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getElementTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getElementType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getOrderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}