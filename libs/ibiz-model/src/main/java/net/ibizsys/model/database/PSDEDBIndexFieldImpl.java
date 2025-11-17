package net.ibizsys.model.database;



public class PSDEDBIndexFieldImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.database.IPSDEDBIndexField{

	public final static String ATTR_GETLENGTH = "length";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETSORTDIR = "sortDir";
	public final static String ATTR_ISINCLUDEMODE = "includeMode";

	public int getLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLENGTH);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定索引属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}


	public java.lang.String getSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isIncludeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}