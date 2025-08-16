package net.ibizsys.model.dataentity;



public class PSDEGroupDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.IPSDEGroupDetail
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETDETAILPARAM = "detailParam";
	public final static String ATTR_GETDETAILPARAM2 = "detailParam2";
	public final static String ATTR_GETDETAILTAG = "detailTag";
	public final static String ATTR_GETDETAILTAG2 = "detailTag2";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";

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

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
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

}