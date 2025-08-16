package net.ibizsys.model.dataentity.service;



public class PSDEServiceAPIRSImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETMAJORPSDESERVICEAPI = "getMajorPSDEServiceAPI";
	public final static String ATTR_GETMINORPSDESERVICEAPI = "getMinorPSDEServiceAPI";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDER = "getPSDER";
	public final static String ATTR_GETPSDESERVICEAPIMETHODS = "getPSDEServiceAPIMethods";
	public final static String ATTR_GETPARENTFILTER = "parentFilter";
	public final static String ATTR_GETPARENTIDPSDEFIELD = "getParentIdPSDEField";
	public final static String ATTR_GETPARENTTYPEFILTER = "parentTypeFilter";
	public final static String ATTR_GETPARENTTYPEPSDEFIELD = "getParentTypePSDEField";
	public final static String ATTR_ISARRAY = "array";
	public final static String ATTR_ISENABLEDATAEXPORT = "enableDataExport";
	public final static String ATTR_ISENABLEDATAIMPORT = "enableDataImport";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.service.IPSDEServiceAPI majorpsdeserviceapi;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMajorPSDEServiceAPI(){
		if(this.majorpsdeserviceapi != null) return this.majorpsdeserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDESERVICEAPI);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSysServiceAPI ipssysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class);
		this.majorpsdeserviceapi = ipssysserviceapi.getPSDEServiceAPI(value, false);
		return this.majorpsdeserviceapi;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMajorPSDEServiceAPIMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI value = this.getMajorPSDEServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主接口对象");}
		return value;
	}

	public void setMajorPSDEServiceAPI(net.ibizsys.model.dataentity.service.IPSDEServiceAPI majorpsdeserviceapi){
		this.majorpsdeserviceapi = majorpsdeserviceapi;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPI minorpsdeserviceapi;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMinorPSDEServiceAPI(){
		if(this.minorpsdeserviceapi != null) return this.minorpsdeserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDESERVICEAPI);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSysServiceAPI ipssysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class);
		this.minorpsdeserviceapi = ipssysserviceapi.getPSDEServiceAPI(value, false);
		return this.minorpsdeserviceapi;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getMinorPSDEServiceAPIMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI value = this.getMinorPSDEServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从接口对象");}
		return value;
	}

	public void setMinorPSDEServiceAPI(net.ibizsys.model.dataentity.service.IPSDEServiceAPI minorpsdeserviceapi){
		this.minorpsdeserviceapi = minorpsdeserviceapi;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			return null;
		}
		this.psder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系对象");}
		return value;
	}

	public void setPSDER(net.ibizsys.model.dataentity.der.IPSDERBase psder){
		this.psder = psder;
	}


	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> psdeserviceapimethods = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> getPSDEServiceAPIMethods(){
		if(this.psdeserviceapimethods == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHODS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDESERVICEAPIMETHODS);
				if(obj!=null)list.add(obj);
			}
			this.psdeserviceapimethods = list;
		}
		return (this.psdeserviceapimethods.size() == 0)? null : this.psdeserviceapimethods;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class, this.getPSDEServiceAPIMethods(), objKey, bTryMode);
	}
	public void setPSDEServiceAPIMethods(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list){
		this.psdeserviceapimethods = list;
	}

	public java.lang.String getParentFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField parentidpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getParentIdPSDEField(){
		if(this.parentidpsdefield != null) return this.parentidpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTIDPSDEFIELD);
		if(value == null){
			return null;
		}
		this.parentidpsdefield = getMinorPSDEServiceAPIMust().getPSDataEntityMust().getPSDEField(value, false);
		return this.parentidpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getParentIdPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getParentIdPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父数据标识实体属性");}
		return value;
	}

	public void setParentIdPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField parentidpsdefield){
		this.parentidpsdefield = parentidpsdefield;
	}


	public java.lang.String getParentTypeFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTTYPEFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField parenttypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getParentTypePSDEField(){
		if(this.parenttypepsdefield != null) return this.parenttypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.parenttypepsdefield = getMinorPSDEServiceAPIMust().getPSDataEntityMust().getPSDEField(value, false);
		return this.parenttypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getParentTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getParentTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父数据类型实体属性");}
		return value;
	}

	public void setParentTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField parenttypepsdefield){
		this.parenttypepsdefield = parenttypepsdefield;
	}


	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnableDataExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDATAEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDataImport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDATAIMPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}