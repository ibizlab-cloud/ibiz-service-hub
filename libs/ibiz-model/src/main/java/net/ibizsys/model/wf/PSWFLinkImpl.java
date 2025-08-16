package net.ibizsys.model.wf;



public class PSWFLinkImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFLink{

	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETFROMPSWFPROCESS = "getFromPSWFProcess";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETNEXTCONDITION = "nextCondition";
	public final static String ATTR_GETPSWFLINKGROUPCOND = "getPSWFLinkGroupCond";
	public final static String ATTR_GETTOPSWFPROCESS = "getToPSWFProcess";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETWFLINKTYPE = "wFLinkType";
	public final static String ATTR_ISENABLECUSTOMCOND = "enableCustomCond";

	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWFProcess frompswfprocess;

	public net.ibizsys.model.wf.IPSWFProcess getFromPSWFProcess(){
		if(this.frompswfprocess != null) return this.frompswfprocess;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROMPSWFPROCESS);
		if(value == null){
			return null;
		}
		net.ibizsys.model.wf.IPSWFVersion ipswfversion = getParentPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class);
		this.frompswfprocess = ipswfversion.getPSWFProcess(value, false);
		return this.frompswfprocess;
	}

	public net.ibizsys.model.wf.IPSWFProcess getFromPSWFProcessMust(){
		net.ibizsys.model.wf.IPSWFProcess value = this.getFromPSWFProcess();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源流程处理");}
		return value;
	}

	private net.ibizsys.model.res.IPSLanguageRes lnpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes(){
		if(this.lnpslanguageres != null) return this.lnpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLNPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.lnpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLNPSLANGUAGERES);
		return this.lnpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getLNPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定逻辑名称语言资源");}
		return value;
	}


	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNextCondition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCONDITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWFLinkGroupCond pswflinkgroupcond;

	public net.ibizsys.model.wf.IPSWFLinkGroupCond getPSWFLinkGroupCond(){
		if(this.pswflinkgroupcond != null) return this.pswflinkgroupcond;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFLINKGROUPCOND);
		if(value == null){
			return null;
		}
		this.pswflinkgroupcond = getPSModelObject(net.ibizsys.model.wf.IPSWFLinkGroupCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWFLINKGROUPCOND);
		return this.pswflinkgroupcond;
	}

	public net.ibizsys.model.wf.IPSWFLinkGroupCond getPSWFLinkGroupCondMust(){
		net.ibizsys.model.wf.IPSWFLinkGroupCond value = this.getPSWFLinkGroupCond();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接条件");}
		return value;
	}

	private net.ibizsys.model.wf.IPSWFProcess topswfprocess;

	public net.ibizsys.model.wf.IPSWFProcess getToPSWFProcess(){
		if(this.topswfprocess != null) return this.topswfprocess;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPSWFPROCESS);
		if(value == null){
			return null;
		}
		net.ibizsys.model.wf.IPSWFVersion ipswfversion = getParentPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class);
		this.topswfprocess = ipswfversion.getPSWFProcess(value, false);
		return this.topswfprocess;
	}

	public net.ibizsys.model.wf.IPSWFProcess getToPSWFProcessMust(){
		net.ibizsys.model.wf.IPSWFProcess value = this.getToPSWFProcess();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标流程处理");}
		return value;
	}


	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFLinkType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFLINKTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMCOND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}