package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodInputImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethodInput{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETKEYPSAPPDEFIELD = "getKeyPSAppDEField";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSAPPDEMETHODDTO = "getPSAppDEMethodDTO";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISOUTPUT = "output";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField keypsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEField(){
		if(this.keypsappdefield != null) return this.keypsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.keypsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.keypsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getKeyPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入主键属性");}
		return value;
	}

	public void setKeyPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField keypsappdefield){
		this.keypsappdefield = keypsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入DTO对象");}
		return value;
	}

	public void setPSAppDEMethodDTO(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO psappdemethoddto){
		this.psappdemethoddto = psappdemethoddto;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isOutput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTPUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}