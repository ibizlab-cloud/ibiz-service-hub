package net.ibizsys.model.bi;



public class PSSysBICubeDimensionImpl extends net.ibizsys.model.bi.PSSysBICubeObjectImpl implements net.ibizsys.model.bi.IPSSysBICubeDimension{

	public final static String ATTR_GETALLPSSYSBICUBELEVELS = "getAllPSSysBICubeLevels";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDIMENSIONFORMULA = "dimensionFormula";
	public final static String ATTR_GETDIMENSIONTAG = "dimensionTag";
	public final static String ATTR_GETDIMENSIONTAG2 = "dimensionTag2";
	public final static String ATTR_GETDIMENSIONTYPE = "dimensionType";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSSYSBIDIMENSION = "getPSSysBIDimension";
	public final static String ATTR_GETPARAMPSDEUIACTIONTAG = "paramPSDEUIActionTag";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTEXTPSDEFIELD = "getTextPSDEField";
	public final static String ATTR_GETTEXTTEMPLATE = "textTemplate";
	public final static String ATTR_GETTIPTEMPLATE = "tipTemplate";
	public final static String ATTR_ISALLHIERARCHY = "allHierarchy";
	public final static String ATTR_ISDEFAULT = "default";

	private java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> allpssysbicubelevels = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> getAllPSSysBICubeLevels(){
		if(this.allpssysbicubelevels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBICUBELEVELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBICubeLevel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBICubeLevel obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeLevel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBICUBELEVELS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbicubelevels = list;
		}
		return (this.allpssysbicubelevels.size() == 0)? null : this.allpssysbicubelevels;
	}

	public net.ibizsys.model.bi.IPSSysBICubeLevel getPSSysBICubeLevel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeLevel.class, this.getAllPSSysBICubeLevels(), objKey, bTryMode);
	}
	public void setPSSysBICubeLevels(java.util.List<net.ibizsys.model.bi.IPSSysBICubeLevel> list){
		this.allpssysbicubelevels = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDimensionFormula(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONFORMULA);
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

	public java.lang.String getDimensionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIMENSIONTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList pscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(){
		if(this.pscodelist != null) return this.pscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELIST);
		if(value == null){
			return null;
		}
		this.pscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCODELIST);
		return this.pscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表对象");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBICube ipssysbicube = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBICube.class);
		this.psdefield = ipssysbicube.getPSDataEntityMust().getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	private net.ibizsys.model.bi.IPSSysBIDimension pssysbidimension;

	public net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimension(){
		if(this.pssysbidimension != null) return this.pssysbidimension;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBIDIMENSION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIScheme ipssysbischeme = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class);
		this.pssysbidimension = ipssysbischeme.getPSSysBIDimension(value, false);
		return this.pssysbidimension;
	}

	public net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimensionMust(){
		net.ibizsys.model.bi.IPSSysBIDimension value = this.getPSSysBIDimension();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定智能报表维度");}
		return value;
	}


	public java.lang.String getParamPSDEUIActionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPSDEUIACTIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField(){
		if(this.textpsdefield != null) return this.textpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBICube ipssysbicube = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBICube.class);
		this.textpsdefield = ipssysbicube.getPSDataEntityMust().getPSDEField(value, false);
		return this.textpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本实体属性");}
		return value;
	}


	public java.lang.String getTextTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTTEMPLATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTipTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPTEMPLATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAllHierarchy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLHIERARCHY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}