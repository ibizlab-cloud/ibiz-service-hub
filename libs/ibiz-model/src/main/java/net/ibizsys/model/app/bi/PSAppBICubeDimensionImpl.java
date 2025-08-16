package net.ibizsys.model.app.bi;



public class PSAppBICubeDimensionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.bi.IPSAppBICubeDimension{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDIMENSIONFORMULA = "dimensionFormula";
	public final static String ATTR_GETDIMENSIONTAG = "dimensionTag";
	public final static String ATTR_GETDIMENSIONTAG2 = "dimensionTag2";
	public final static String ATTR_GETDIMENSIONTYPE = "dimensionType";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPBICUBEHIERARCHIES = "getPSAppBICubeHierarchies";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPARAMPSAPPDEUIACTION = "getParamPSAppDEUIAction";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTEXTTEMPLATE = "textTemplate";
	public final static String ATTR_GETTIPTEMPLATE = "tipTemplate";

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

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> psappbicubehierarchies = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> getPSAppBICubeHierarchies(){
		if(this.psappbicubehierarchies == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBEHIERARCHIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBICubeHierarchy obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeHierarchy.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBICUBEHIERARCHIES);
				if(obj!=null)list.add(obj);
			}
			this.psappbicubehierarchies = list;
		}
		return (this.psappbicubehierarchies.size() == 0)? null : this.psappbicubehierarchies;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeHierarchy getPSAppBICubeHierarchy(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeHierarchy.class, this.getPSAppBICubeHierarchies(), objKey, bTryMode);
	}
	public void setPSAppBICubeHierarchies(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeHierarchy> list){
		this.psappbicubehierarchies = list;
	}
	private net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(){
		if(this.psappcodelist != null) return this.psappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.psappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCODELIST);
		return this.psappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getPSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用代码表对象");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBICube ipsappbicube = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class);
		this.psappdefield = ipsappbicube.getPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关应用属性");}
		return value;
	}

	public void setPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield){
		this.psappdefield = psappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEUIAction parampsappdeuiaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIAction(){
		if(this.parampsappdeuiaction != null) return this.parampsappdeuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPSAPPDEUIACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBICube ipsappbicube = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class);
		this.parampsappdeuiaction = ipsappbicube.getPSAppDataEntityMust().getPSAppDEUIAction(value, false);
		return this.parampsappdeuiaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getParamPSAppDEUIActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEUIAction value = this.getParamPSAppDEUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定参数配置界面行为对象");}
		return value;
	}

	public void setParamPSAppDEUIAction(net.ibizsys.model.app.dataentity.IPSAppDEUIAction parampsappdeuiaction){
		this.parampsappdeuiaction = parampsappdeuiaction;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBICube ipsappbicube = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class);
		this.textpsappdefield = ipsappbicube.getPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.textpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本应用属性");}
		return value;
	}

	public void setTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield){
		this.textpsappdefield = textpsappdefield;
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
}