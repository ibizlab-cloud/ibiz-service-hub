package net.ibizsys.model.wf;



public class PSWFProcessImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFProcess{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSWFLINKS = "getPSWFLinks";
	public final static String ATTR_GETPSWFPROCESSPARAMS = "getPSWFProcessParams";
	public final static String ATTR_GETPSWFWORKTIME = "getPSWFWorkTime";
	public final static String ATTR_GETTIMEOUT = "timeout";
	public final static String ATTR_GETTIMEOUTFIELD = "timeoutField";
	public final static String ATTR_GETTIMEOUTTYPE = "timeoutType";
	public final static String ATTR_GETTOPPOS = "topPos";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETWFPROCESSTYPE = "wFProcessType";
	public final static String ATTR_GETWFSTEPVALUE = "wFStepValue";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISASYNCHRONOUSPROCESS = "asynchronousProcess";
	public final static String ATTR_ISENABLETIMEOUT = "enableTimeout";
	public final static String ATTR_ISSTARTPROCESS = "startProcess";
	public final static String ATTR_ISTERMINALPROCESS = "terminalProcess";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getLeftPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFTPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes namepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes(){
		if(this.namepslanguageres != null) return this.namepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.namepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAMEPSLANGUAGERES);
		return this.namepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNamePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称语言资源");}
		return value;
	}

	private net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(){
		if(this.pssysmsgtempl != null) return this.pssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.pssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTEMPL);
		return this.pssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定通知消息模板");}
		return value;
	}


	private java.util.List<net.ibizsys.model.wf.IPSWFLink> pswflinks = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFLink> getPSWFLinks(){
		if(this.pswflinks == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFLINKS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFLink> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFLink>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFLink obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFLink.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFLINKS);
				if(obj!=null)list.add(obj);
			}
			this.pswflinks = list;
		}
		return (this.pswflinks.size() == 0)? null : this.pswflinks;
	}

	public net.ibizsys.model.wf.IPSWFLink getPSWFLink(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFLink.class, this.getPSWFLinks(), objKey, bTryMode);
	}
	public void setPSWFLinks(java.util.List<net.ibizsys.model.wf.IPSWFLink> list){
		this.pswflinks = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> pswfprocessparams = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> getPSWFProcessParams(){
		if(this.pswfprocessparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFProcessParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFProcessParam obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFProcessParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFPROCESSPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.pswfprocessparams = list;
		}
		return (this.pswfprocessparams.size() == 0)? null : this.pswfprocessparams;
	}

	public net.ibizsys.model.wf.IPSWFProcessParam getPSWFProcessParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFProcessParam.class, this.getPSWFProcessParams(), objKey, bTryMode);
	}
	public void setPSWFProcessParams(java.util.List<net.ibizsys.model.wf.IPSWFProcessParam> list){
		this.pswfprocessparams = list;
	}
	private net.ibizsys.model.wf.IPSWFWorkTime pswfworktime;

	public net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTime(){
		if(this.pswfworktime != null) return this.pswfworktime;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFWORKTIME);
		if(value == null){
			return null;
		}
		this.pswfworktime = getPSModelObject(net.ibizsys.model.wf.IPSWFWorkTime.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWFWORKTIME);
		return this.pswfworktime;
	}

	public net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTimeMust(){
		net.ibizsys.model.wf.IPSWFWorkTime value = this.getPSWFWorkTime();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程工作时间");}
		return value;
	}


	public int getTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTimeoutField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUTFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTimeoutType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTopPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public java.lang.String getWFProcessType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFPROCESSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFStepValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isAsynchronousProcess(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISASYNCHRONOUSPROCESS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETIMEOUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isStartProcess(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSTARTPROCESS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isTerminalProcess(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTERMINALPROCESS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}