package net.ibizsys.model.dataentity.mainstate;



public class PSDEMainStateImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.mainstate.IPSDEMainState
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACTIONDENYMSG = "actionDenyMsg";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETENTERPSDEACTION = "getEnterPSDEAction";
	public final static String ATTR_GETENTERSTATEMODE = "enterStateMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMSTAG = "mSTag";
	public final static String ATTR_GETMSTYPE = "mSType";
	public final static String ATTR_GETOPPRIVDENYMSG = "oPPrivDenyMsg";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEMAINSTATEACTIONS = "getPSDEMainStateActions";
	public final static String ATTR_GETPSDEMAINSTATEFIELDS = "getPSDEMainStateFields";
	public final static String ATTR_GETPSDEMAINSTATEOPPRIVS = "getPSDEMainStateOPPrivs";
	public final static String ATTR_GETPREVPSDEMAINSTATES = "getPrevPSDEMainStates";
	public final static String ATTR_GETSTATE2VALUE = "state2Value";
	public final static String ATTR_GETSTATE3VALUE = "state3Value";
	public final static String ATTR_GETSTATEVALUE = "stateValue";
	public final static String ATTR_GETVIEWACTIONS = "viewActions";
	public final static String ATTR_GETWFSTATEMODE = "wFStateMode";
	public final static String ATTR_ISACTIONALLOWMODE = "actionAllowMode";
	public final static String ATTR_ISALLOWMODE = "allowMode";
	public final static String ATTR_ISDEFAULT = "default";
	public final static String ATTR_ISENABLEVIEWACTIONS = "enableViewActions";
	public final static String ATTR_ISFIELDALLOWMODE = "fieldAllowMode";
	public final static String ATTR_ISOPPRIVALLOWMODE = "oPPrivAllowMode";

	public java.lang.String getActionDenyMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONDENYMSG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction enterpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getEnterPSDEAction(){
		if(this.enterpsdeaction != null) return this.enterpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTERPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.enterpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.enterpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getEnterPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getEnterPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定进入实体行为");}
		return value;
	}

	public void setEnterPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction enterpsdeaction){
		this.enterpsdeaction = enterpsdeaction;
	}


	public java.lang.String getEnterStateMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTERSTATEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMSTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMSType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getOPPrivDenyMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPPRIVDENYMSG);
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

	private java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> psdemainstateactions = null;
	public java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> getPSDEMainStateActions(){
		if(this.psdemainstateactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAINSTATEACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> list = new java.util.ArrayList<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction obj = this.getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAINSTATEACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.psdemainstateactions = list;
		}
		return (this.psdemainstateactions.size() == 0)? null : this.psdemainstateactions;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction getPSDEMainStateAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction.class, this.getPSDEMainStateActions(), objKey, bTryMode);
	}
	public void setPSDEMainStateActions(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> list){
		this.psdemainstateactions = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> psdemainstatefields = null;
	public java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> getPSDEMainStateFields(){
		if(this.psdemainstatefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAINSTATEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField obj = this.getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAINSTATEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdemainstatefields = list;
		}
		return (this.psdemainstatefields.size() == 0)? null : this.psdemainstatefields;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField getPSDEMainStateField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField.class, this.getPSDEMainStateFields(), objKey, bTryMode);
	}
	public void setPSDEMainStateFields(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> list){
		this.psdemainstatefields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> psdemainstateopprivs = null;
	public java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> getPSDEMainStateOPPrivs(){
		if(this.psdemainstateopprivs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAINSTATEOPPRIVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> list = new java.util.ArrayList<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv obj = this.getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMAINSTATEOPPRIVS);
				if(obj!=null)list.add(obj);
			}
			this.psdemainstateopprivs = list;
		}
		return (this.psdemainstateopprivs.size() == 0)? null : this.psdemainstateopprivs;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv getPSDEMainStateOPPriv(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv.class, this.getPSDEMainStateOPPrivs(), objKey, bTryMode);
	}
	public void setPSDEMainStateOPPrivs(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> list){
		this.psdemainstateopprivs = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> prevpsdemainstates = null;
	public java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> getPrevPSDEMainStates(){
		if(this.prevpsdemainstates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVPSDEMAINSTATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list = new java.util.ArrayList<net.ibizsys.model.dataentity.mainstate.IPSDEMainState>();
			net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipsdataentity.getPSDEMainState((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.prevpsdemainstates = list;
		}
		return (this.prevpsdemainstates.size() == 0)? null : this.prevpsdemainstates;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainState(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, this.getPrevPSDEMainStates(), objKey, bTryMode);
	}
	
	public void setPrevPSDEMainStates(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list){
		this.prevpsdemainstates = list;
	}

	public java.lang.String getState2Value(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE2VALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getState3Value(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE3VALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStateValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getViewActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWACTIONS);
		if(value == null){
			return 0l;
		}
		return value.asLong();
	}

	public int getWFStateMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTATEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isActionAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIONALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableViewActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEVIEWACTIONS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFieldAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFIELDALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOPPrivAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOPPRIVALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}