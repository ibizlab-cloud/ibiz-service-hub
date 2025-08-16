package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodReturnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSAPPDEMETHODDTO = "getPSAppDEMethodDTO";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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
	private net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO psappdemethoddto;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTO(){
		if(this.psappdemethoddto != null) return this.psappdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHODDTO);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdemethoddto = ipsappdataentity.getPSAppDEMethodDTO(value, false);
		return this.psappdemethoddto;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTOMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO value = this.getPSAppDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回DTO对象");}
		return value;
	}

	public void setPSAppDEMethodDTO(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO psappdemethoddto){
		this.psappdemethoddto = psappdemethoddto;
	}


	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}