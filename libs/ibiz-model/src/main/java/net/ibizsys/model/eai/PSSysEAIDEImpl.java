package net.ibizsys.model.eai;



public class PSSysEAIDEImpl extends net.ibizsys.model.eai.PSSysEAISchemeObjectImpl implements net.ibizsys.model.eai.IPSSysEAIDE{

	public final static String ATTR_GETALLPSSYSEAIDEFIELDS = "getAllPSSysEAIDEFields";
	public final static String ATTR_GETALLPSSYSEAIDERS = "getAllPSSysEAIDERs";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSEAIELEMENT = "getPSSysEAIElement";

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> allpssyseaidefields = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> getAllPSSysEAIDEFields(){
		if(this.allpssyseaidefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIDEField obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaidefields = list;
		}
		return (this.allpssyseaidefields.size() == 0)? null : this.allpssyseaidefields;
	}

	public net.ibizsys.model.eai.IPSSysEAIDEField getPSSysEAIDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDEField.class, this.getAllPSSysEAIDEFields(), objKey, bTryMode);
	}
	public void setPSSysEAIDEFields(java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> list){
		this.allpssyseaidefields = list;
	}

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> allpssyseaiders = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> getAllPSSysEAIDERs(){
		if(this.allpssyseaiders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIDER>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIDER obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDER.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIDERS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaiders = list;
		}
		return (this.allpssyseaiders.size() == 0)? null : this.allpssyseaiders;
	}

	public net.ibizsys.model.eai.IPSSysEAIDER getPSSysEAIDER(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDER.class, this.getAllPSSysEAIDERs(), objKey, bTryMode);
	}
	public void setPSSysEAIDERs(java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> list){
		this.allpssyseaiders = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG2);
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

	private net.ibizsys.model.eai.IPSSysEAIElement pssyseaielement;

	public net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElement(){
		if(this.pssyseaielement != null) return this.pssyseaielement;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSEAIELEMENT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.eai.IPSSysEAIScheme ipssyseaischeme = getParentPSModelObject(net.ibizsys.model.eai.IPSSysEAIScheme.class);
		this.pssyseaielement = ipssyseaischeme.getPSSysEAIElement(value, false);
		return this.pssyseaielement;
	}

	public net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElementMust(){
		net.ibizsys.model.eai.IPSSysEAIElement value = this.getPSSysEAIElement();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定映射集成元素");}
		return value;
	}

	public void setPSSysEAIElement(net.ibizsys.model.eai.IPSSysEAIElement pssyseaielement){
		this.pssyseaielement = pssyseaielement;
	}

}