package net.ibizsys.model.control;



public class PSControlImpl extends net.ibizsys.model.PSObjectImpl3 implements net.ibizsys.model.control.IPSControl{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTROLSTYLE = "controlStyle";
	public final static String ATTR_GETCONTROLTYPE = "controlType";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETHOOKEVENTNAMES = "hookEventNames";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSCONTROLATTRIBUTES = "getPSControlAttributes";
	public final static String ATTR_GETPSCONTROLHANDLER = "getPSControlHandler";
	public final static String ATTR_GETPSCONTROLLOGICS = "getPSControlLogics";
	public final static String ATTR_GETPSCONTROLPARAM = "getPSControlParam";
	public final static String ATTR_GETPSCONTROLRENDERS = "getPSControlRenders";
	public final static String ATTR_GETPSCTRLMSG = "getPSCtrlMsg";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPRIORITY = "priority";
	public final static String ATTR_GETUSER2PSCONTROLACTION = "getUser2PSControlAction";
	public final static String ATTR_GETUSERPSCONTROLACTION = "getUserPSControlAction";
	public final static String ATTR_GETUSERTAG = "userTag";
	public final static String ATTR_GETUSERTAG2 = "userTag2";
	public final static String ATTR_GETWIDTH = "width";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getControlStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTROLSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getControlType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTROLTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDynaSysMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNASYSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public double getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	private java.util.List<java.lang.String> hookeventnames = null;
	public java.util.List<java.lang.String> getHookEventNames(){
		if(this.hookeventnames == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHOOKEVENTNAMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.hookeventnames = list;
		}
		return (this.hookeventnames.size() == 0)? null : this.hookeventnames;
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlAttribute> pscontrolattributes = null;
	public java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes(){
		if(this.pscontrolattributes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLATTRIBUTES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlAttribute> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlAttribute>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlAttribute obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLATTRIBUTES);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolattributes = list;
		}
		return (this.pscontrolattributes.size() == 0)? null : this.pscontrolattributes;
	}

	public net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, this.getPSControlAttributes(), objKey, bTryMode);
	}
	public void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list){
		this.pscontrolattributes = list;
	}
	private net.ibizsys.model.control.IPSControlHandler pscontrolhandler;

	public net.ibizsys.model.control.IPSControlHandler getPSControlHandler(){
		if(this.pscontrolhandler != null) return this.pscontrolhandler;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLHANDLER);
		if(value == null){
			return null;
		}
		this.pscontrolhandler = getPSModelObject(net.ibizsys.model.control.IPSControlHandler.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCONTROLHANDLER);
		return this.pscontrolhandler;
	}

	public net.ibizsys.model.control.IPSControlHandler getPSControlHandlerMust(){
		net.ibizsys.model.control.IPSControlHandler value = this.getPSControlHandler();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定部件处理");}
		return value;
	}

	public void setPSControlHandler(net.ibizsys.model.control.IPSControlHandler pscontrolhandler){
		this.pscontrolhandler = pscontrolhandler;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlLogic> pscontrollogics = null;
	public java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics(){
		if(this.pscontrollogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlLogic> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlLogic obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrollogics = list;
		}
		return (this.pscontrollogics.size() == 0)? null : this.pscontrollogics;
	}

	public net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, this.getPSControlLogics(), objKey, bTryMode);
	}
	public void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list){
		this.pscontrollogics = list;
	}
	private net.ibizsys.model.control.IPSControlParam pscontrolparam;

	public net.ibizsys.model.control.IPSControlParam getPSControlParam(){
		if(this.pscontrolparam != null) return this.pscontrolparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLPARAM);
		if(value == null){
			return null;
		}
		this.pscontrolparam = getPSModelObject(net.ibizsys.model.control.IPSControlParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCONTROLPARAM);
		return this.pscontrolparam;
	}

	public net.ibizsys.model.control.IPSControlParam getPSControlParamMust(){
		net.ibizsys.model.control.IPSControlParam value = this.getPSControlParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定部件参数");}
		return value;
	}

	public void setPSControlParam(net.ibizsys.model.control.IPSControlParam pscontrolparam){
		this.pscontrolparam = pscontrolparam;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlRender> pscontrolrenders = null;
	public java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders(){
		if(this.pscontrolrenders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLRENDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlRender> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlRender>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlRender obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLRENDERS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolrenders = list;
		}
		return (this.pscontrolrenders.size() == 0)? null : this.pscontrolrenders;
	}

	public net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, this.getPSControlRenders(), objKey, bTryMode);
	}
	public void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list){
		this.pscontrolrenders = list;
	}
	private net.ibizsys.model.res.IPSCtrlMsg psctrlmsg;

	public net.ibizsys.model.res.IPSCtrlMsg getPSCtrlMsg(){
		if(this.psctrlmsg != null) return this.psctrlmsg;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCTRLMSG);
		if(value == null){
			return null;
		}
		this.psctrlmsg = getPSModelObject(net.ibizsys.model.res.IPSCtrlMsg.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCTRLMSG);
		return this.psctrlmsg;
	}

	public net.ibizsys.model.res.IPSCtrlMsg getPSCtrlMsgMust(){
		net.ibizsys.model.res.IPSCtrlMsg value = this.getPSCtrlMsg();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定部件消息");}
		return value;
	}

	public void setPSCtrlMsg(net.ibizsys.model.res.IPSCtrlMsg psctrlmsg){
		this.psctrlmsg = psctrlmsg;
	}

	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面样式");}
		return value;
	}

	public void setPSSysCss(net.ibizsys.model.res.IPSSysCss pssyscss){
		this.pssyscss = pssyscss;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public int getPriority(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRIORITY);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction user2pscontrolaction;

	@Deprecated
	public net.ibizsys.model.control.IPSControlAction getUser2PSControlAction(){
		if(this.user2pscontrolaction != null) return this.user2pscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER2PSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.user2pscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUSER2PSCONTROLACTION);
		return this.user2pscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUser2PSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUser2PSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getUser2PSControlAction]返回空值");}
		return value;
	}

	public void setUser2PSControlAction(net.ibizsys.model.control.IPSControlAction user2pscontrolaction){
		this.user2pscontrolaction = user2pscontrolaction;
	}

	private net.ibizsys.model.control.IPSControlAction userpscontrolaction;

	@Deprecated
	public net.ibizsys.model.control.IPSControlAction getUserPSControlAction(){
		if(this.userpscontrolaction != null) return this.userpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.userpscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUSERPSCONTROLACTION);
		return this.userpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUserPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUserPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getUserPSControlAction]返回空值");}
		return value;
	}

	public void setUserPSControlAction(net.ibizsys.model.control.IPSControlAction userpscontrolaction){
		this.userpscontrolaction = userpscontrolaction;
	}


	public java.lang.String getUserTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
}