package net.ibizsys.model.control;



public class PSControlLogicProxy extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSControlLogic{

	public final static String ATTR_GETATTRNAME = "attrName";
	public final static String ATTR_GETEVENTARG = "eventArg";
	public final static String ATTR_GETEVENTARG2 = "eventArg2";
	public final static String ATTR_GETEVENTNAMES = "eventNames";
	public final static String ATTR_GETITEMNAME = "itemName";
	public final static String ATTR_GETLOGICTAG = "logicTag";
	public final static String ATTR_GETLOGICTYPE = "logicType";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPSAPPDEUIACTION = "getPSAppDEUIAction";
	public final static String ATTR_GETPSAPPDEUILOGIC = "getPSAppDEUILogic";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPUILOGIC = "getPSAppUILogic";
	public final static String ATTR_GETPSAPPVIEWENGINE = "getPSAppViewEngine";
	public final static String ATTR_GETPSAPPVIEWLOGIC = "getPSAppViewLogic";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETTIMER = "timer";
	public final static String ATTR_GETTRIGGERTYPE = "triggerType";

	public java.lang.String getAttrName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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

	public java.lang.String getItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMNAME);
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
	private net.ibizsys.model.app.dataentity.IPSAppDEUIAction psappdeuiaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction(){
		if(this.psappdeuiaction != null) return this.psappdeuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEUIACTION);
		if(value == null){
			return null;
		}
		this.psappdeuiaction = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEUIACTION);
		return this.psappdeuiaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEUIAction value = this.getPSAppDEUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发应用实体界面行为");}
		return value;
	}

	public void setPSAppDEUIAction(net.ibizsys.model.app.dataentity.IPSAppDEUIAction psappdeuiaction){
		this.psappdeuiaction = psappdeuiaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEUILogic psappdeuilogic;

	public net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic(){
		if(this.psappdeuilogic != null) return this.psappdeuilogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEUILOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdeuilogic = ipsappdataentity.getPSAppDEUILogic(value, false);
		return this.psappdeuilogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEUILogic value = this.getPSAppDEUILogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发应用实体界面逻辑");}
		return value;
	}

	public void setPSAppDEUILogic(net.ibizsys.model.app.dataentity.IPSAppDEUILogic psappdeuilogic){
		this.psappdeuilogic = psappdeuilogic;
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

	private net.ibizsys.model.app.view.IPSAppViewEngine psappviewengine;

	public net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine(){
		if(this.psappviewengine != null) return this.psappviewengine;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWENGINE);
		if(value == null){
			return null;
		}
		this.psappviewengine = getPSModelObject(net.ibizsys.model.app.view.IPSAppViewEngine.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEWENGINE);
		return this.psappviewengine;
	}

	public net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngineMust(){
		net.ibizsys.model.app.view.IPSAppViewEngine value = this.getPSAppViewEngine();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发视图引擎");}
		return value;
	}

	public void setPSAppViewEngine(net.ibizsys.model.app.view.IPSAppViewEngine psappviewengine){
		this.psappviewengine = psappviewengine;
	}

	private net.ibizsys.model.app.view.IPSAppViewLogic psappviewlogic;

	public net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic(){
		if(this.psappviewlogic != null) return this.psappviewlogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWLOGIC);
		if(value == null){
			return null;
		}
		this.psappviewlogic = getPSModelObject(net.ibizsys.model.app.view.IPSAppViewLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEWLOGIC);
		return this.psappviewlogic;
	}

	public net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogicMust(){
		net.ibizsys.model.app.view.IPSAppViewLogic value = this.getPSAppViewLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发视图逻辑");}
		return value;
	}

	public void setPSAppViewLogic(net.ibizsys.model.app.view.IPSAppViewLogic psappviewlogic){
		this.psappviewlogic = psappviewlogic;
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
			return "CTRLEVENT";
		}
		return value.asText();
	}
}