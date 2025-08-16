package net.ibizsys.model.wf;



public class PSWFVersionImpl extends net.ibizsys.model.PSObjectImpl3 implements net.ibizsys.model.wf.IPSWFVersion{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSWFLINKS = "getPSWFLinks";
	public final static String ATTR_GETPSWFPROCESSES = "getPSWFProcesses";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	public final static String ATTR_GETSTARTPSWFPROCESS = "getStartPSWFProcess";
	public final static String ATTR_GETWFCODENAME = "wFCodeName";
	public final static String ATTR_GETWFMODE = "wFMode";
	public final static String ATTR_GETWFVERSION = "wFVersion";
	public final static String ATTR_HASMOBSTARTVIEW = "hasMobStartView";
	public final static String ATTR_HASSTARTVIEW = "hasStartView";
	public final static String ATTR_ISVALID = "valid";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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

	private java.util.List<net.ibizsys.model.wf.IPSWFProcess> pswfprocesses = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFProcess> getPSWFProcesses(){
		if(this.pswfprocesses == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFProcess> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFProcess>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFProcess obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFProcess.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFPROCESSES);
				if(obj!=null)list.add(obj);
			}
			this.pswfprocesses = list;
		}
		return (this.pswfprocesses.size() == 0)? null : this.pswfprocesses;
	}

	public net.ibizsys.model.wf.IPSWFProcess getPSWFProcess(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFProcess.class, this.getPSWFProcesses(), objKey, bTryMode);
	}
	public void setPSWFProcesses(java.util.List<net.ibizsys.model.wf.IPSWFProcess> list){
		this.pswfprocesses = list;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(){
		return getParentPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class);
		
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getPSWorkflow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流");}
		return value;
	}

	private net.ibizsys.model.wf.IPSWFProcess startpswfprocess;

	public net.ibizsys.model.wf.IPSWFProcess getStartPSWFProcess(){
		if(this.startpswfprocess != null) return this.startpswfprocess;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTPSWFPROCESS);
		if(value == null){
			return null;
		}
		this.startpswfprocess = this.getPSWFProcess(value, false);
		return this.startpswfprocess;
	}

	public net.ibizsys.model.wf.IPSWFProcess getStartPSWFProcessMust(){
		net.ibizsys.model.wf.IPSWFProcess value = this.getStartPSWFProcess();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始处理");}
		return value;
	}


	public java.lang.String getWFCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWFVersion(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFVERSION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean hasMobStartView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASMOBSTARTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean hasStartView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASSTARTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}