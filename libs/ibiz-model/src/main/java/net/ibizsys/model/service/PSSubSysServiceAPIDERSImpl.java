package net.ibizsys.model.service;



public class PSSubSysServiceAPIDERSImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDERS{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETMAJORPSSUBSYSSERVICEAPIDE = "getMajorPSSubSysServiceAPIDE";
	public final static String ATTR_GETMASTERORDER = "masterOrder";
	public final static String ATTR_GETMINORPSSUBSYSSERVICEAPIDE = "getMinorPSSubSysServiceAPIDE";
	public final static String ATTR_GETPARENTFILTER = "parentFilter";
	public final static String ATTR_GETRSTAG = "rSTag";
	public final static String ATTR_GETRSTAG2 = "rSTag2";
	public final static String ATTR_ISARRAY = "array";

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
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE majorpssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getMajorPSSubSysServiceAPIDE(){
		if(this.majorpssubsysserviceapide != null) return this.majorpssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.majorpssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.majorpssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getMajorPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getMajorPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主接口实体");}
		return value;
	}

	public void setMajorPSSubSysServiceAPIDE(net.ibizsys.model.service.IPSSubSysServiceAPIDE majorpssubsysserviceapide){
		this.majorpssubsysserviceapide = majorpssubsysserviceapide;
	}


	public int getMasterOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASTERORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE minorpssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getMinorPSSubSysServiceAPIDE(){
		if(this.minorpssubsysserviceapide != null) return this.minorpssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.minorpssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.minorpssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getMinorPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getMinorPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从接口实体");}
		return value;
	}

	public void setMinorPSSubSysServiceAPIDE(net.ibizsys.model.service.IPSSubSysServiceAPIDE minorpssubsysserviceapide){
		this.minorpssubsysserviceapide = minorpssubsysserviceapide;
	}


	public java.lang.String getParentFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRSTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRSTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}