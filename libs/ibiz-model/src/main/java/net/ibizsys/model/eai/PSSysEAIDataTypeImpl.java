package net.ibizsys.model.eai;



public class PSSysEAIDataTypeImpl extends net.ibizsys.model.eai.PSSysEAISchemeObjectImpl implements net.ibizsys.model.eai.IPSSysEAIDataType{

	public final static String ATTR_GETALLPSSYSEAIDATATYPEITEMS = "getAllPSSysEAIDataTypeItems";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATATYPETAG = "dataTypeTag";
	public final static String ATTR_GETDATATYPETAG2 = "dataTypeTag2";
	public final static String ATTR_GETMAXSTRINGLENGTH = "maxStringLength";
	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETPATTERN = "pattern";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETSCALE = "scale";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISENABLEENUM = "enableEnum";
	public final static String ATTR_ISINCLUDEMAXVALUE = "includeMaxValue";
	public final static String ATTR_ISINCLUDEMINVALUE = "includeMinValue";

	private java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> allpssyseaidatatypeitems = null;
	public java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> getAllPSSysEAIDataTypeItems(){
		if(this.allpssyseaidatatypeitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEAIDATATYPEITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> list = new java.util.ArrayList<net.ibizsys.model.eai.IPSSysEAIDataTypeItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.eai.IPSSysEAIDataTypeItem obj = this.getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDataTypeItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEAIDATATYPEITEMS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseaidatatypeitems = list;
		}
		return (this.allpssyseaidatatypeitems.size() == 0)? null : this.allpssyseaidatatypeitems;
	}

	public net.ibizsys.model.eai.IPSSysEAIDataTypeItem getPSSysEAIDataTypeItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.eai.IPSSysEAIDataTypeItem.class, this.getAllPSSysEAIDataTypeItems(), objKey, bTryMode);
	}
	public void setPSSysEAIDataTypeItems(java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> list){
		this.allpssyseaidatatypeitems = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataTypeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataTypeTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMaxStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMaxValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMinStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMinValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPattern(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPATTERN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getScale(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCALE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableEnum(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEENUM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMAXVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMINVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}