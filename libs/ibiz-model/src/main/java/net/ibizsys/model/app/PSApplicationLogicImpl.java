package net.ibizsys.model.app;



public class PSApplicationLogicImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.IPSApplicationLogic{

	public final static String ATTR_GETEVENTARG = "eventArg";
	public final static String ATTR_GETEVENTARG2 = "eventArg2";
	public final static String ATTR_GETEVENTNAMES = "eventNames";
	public final static String ATTR_GETLOGICTAG = "logicTag";
	public final static String ATTR_GETLOGICTYPE = "logicType";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPUILOGIC = "getPSAppUILogic";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETTIMER = "timer";
	public final static String ATTR_GETTRIGGERTYPE = "triggerType";

	public java.lang.String getEventArg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTARG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEventArg2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTARG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEventNames(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTNAMES);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发逻辑所在应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.logic.IPSAppUILogic psappuilogic;

	public net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic(){
		if(this.psappuilogic != null) return this.psappuilogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPUILOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappuilogic = ipsapplication.getPSAppUILogic(value, false);
		return this.psappuilogic;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust(){
		net.ibizsys.model.app.logic.IPSAppUILogic value = this.getPSAppUILogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发应用预置界面逻辑");}
		return value;
	}

	public void setPSAppUILogic(net.ibizsys.model.app.logic.IPSAppUILogic psappuilogic){
		this.psappuilogic = psappuilogic;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTriggerType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRIGGERTYPE);
		if(value == null){
			return "APPEVENT";
		}
		return value.asText();
	}
}