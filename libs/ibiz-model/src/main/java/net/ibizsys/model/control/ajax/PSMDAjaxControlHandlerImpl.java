package net.ibizsys.model.control.ajax;



public class PSMDAjaxControlHandlerImpl extends net.ibizsys.model.control.ajax.PSAjaxControlHandlerImpl implements net.ibizsys.model.control.ajax.IPSMDAjaxControlHandler{

	public final static String ATTR_GETCUSTOMDRMODE = "customDRMode";
	public final static String ATTR_GETCUSTOMDRMODE2 = "customDRMode2";
	public final static String ATTR_GETCUSTOMDRMODE2PARAM = "customDRMode2Param";
	public final static String ATTR_GETCUSTOMDRMODEPARAM = "customDRModeParam";
	public final static String ATTR_GETFETCHTIMEOUT = "fetchTimeout";
	public final static String ATTR_GETORGDR = "orgDR";
	public final static String ATTR_GETPSSYSUSERDR = "getPSSysUserDR";
	public final static String ATTR_GETPSSYSUSERDR2 = "getPSSysUserDR2";
	public final static String ATTR_GETSECBC = "secBC";
	public final static String ATTR_GETSECDR = "secDR";
	public final static String ATTR_GETUSERDRACTION = "userDRAction";
	public final static String ATTR_ISENABLEORGDR = "enableOrgDR";
	public final static String ATTR_ISENABLESECBC = "enableSecBC";
	public final static String ATTR_ISENABLESECDR = "enableSecDR";
	public final static String ATTR_ISENABLEUSERDR = "enableUserDR";

	@Deprecated
	public java.lang.String getCustomDRMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCustomDRMode2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRMode2Param(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2PARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRModeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getFetchTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFETCHTIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public long getOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORGDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}
	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR(){
		if(this.pssysuserdr != null) return this.pssysuserdr;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR);
		if(value == null){
			return null;
		}
		this.pssysuserdr = getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUSERDR);
		return this.pssysuserdr;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象");}
		return value;
	}

	public void setPSSysUserDR(net.ibizsys.model.security.IPSSysUserDR pssysuserdr){
		this.pssysuserdr = pssysuserdr;
	}

	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr2;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2(){
		if(this.pssysuserdr2 != null) return this.pssysuserdr2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR2);
		if(value == null){
			return null;
		}
		this.pssysuserdr2 = getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUSERDR2);
		return this.pssysuserdr2;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象2");}
		return value;
	}

	public void setPSSysUserDR2(net.ibizsys.model.security.IPSSysUserDR pssysuserdr2){
		this.pssysuserdr2 = pssysuserdr2;
	}


	public java.lang.String getSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECBC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}

	public java.lang.String getUserDRAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDRACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEORGDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECBC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUserDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUSERDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}