package net.ibizsys.model.dataentity;



public class PSSysDEGroupImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.IPSSysDEGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETLOGICMODE = "logicMode";
	public final static String ATTR_GETLOGICPARAM = "logicParam";
	public final static String ATTR_GETLOGICPARAM2 = "logicParam2";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEGROUPDETAILS = "getPSDEGroupDetails";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";

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

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICPARAM2);
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

	private java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> psdegroupdetails = null;
	public java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> getPSDEGroupDetails(){
		if(this.psdegroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.dataentity.IPSDEGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.IPSDEGroupDetail obj = this.getPSModelObject(net.ibizsys.model.dataentity.IPSDEGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdegroupdetails = list;
		}
		return (this.psdegroupdetails.size() == 0)? null : this.psdegroupdetails;
	}

	public net.ibizsys.model.dataentity.IPSDEGroupDetail getPSDEGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.IPSDEGroupDetail.class, this.getPSDEGroupDetails(), objKey, bTryMode);
	}
	public void setPSDEGroupDetails(java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> list){
		this.psdegroupdetails = list;
	}
	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}

}