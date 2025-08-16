package net.ibizsys.model.control;



public class PSAjaxControlContainerImpl extends net.ibizsys.model.control.PSControlContainerImpl implements net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSAjaxControl{

	public final static String ATTR_GETUSER2PSCONTROLACTION = "getUser2PSControlAction";
	public final static String ATTR_GETUSERPSCONTROLACTION = "getUserPSControlAction";
	public final static String ATTR_ISAUTOLOAD = "autoLoad";
	public final static String ATTR_ISENABLEITEMPRIVILEGE = "enableItemPrivilege";
	public final static String ATTR_ISSHOWBUSYINDICATOR = "showBusyIndicator";
	private net.ibizsys.model.control.IPSControlAction user2pscontrolaction;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义行为2");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction userpscontrolaction;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义行为");}
		return value;
	}


	public boolean isAutoLoad(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOLOAD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnableItemPrivilege(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEITEMPRIVILEGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowBusyIndicator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWBUSYINDICATOR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}