package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodLogicImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethodLogic
		,net.ibizsys.model.app.dataentity.IPSAppDEActionLogic{

	public final static String ATTR_GETACTIONLOGICTYPE = "actionLogicType";
	public final static String ATTR_GETATTACHMODE = "attachMode";
	public final static String ATTR_GETDSTPSAPPDEACTION = "getDstPSAppDEAction";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETPSAPPDELOGIC = "getPSAppDELogic";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISCLONEPARAM = "cloneParam";
	public final static String ATTR_ISIGNOREEXCEPTION = "ignoreException";
	public final static String ATTR_ISINTERNALLOGIC = "internalLogic";

	public int getActionLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLOGICTYPE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getAttachMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTACHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction dstpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEAction(){
		if(this.dstpsappdeaction != null) return this.dstpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsappdeaction = this.getDstPSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.dstpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getDstPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发目标行为");}
		return value;
	}

	public void setDstPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction dstpsappdeaction){
		this.dstpsappdeaction = dstpsappdeaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity(){
		if(this.dstpsappdataentity != null) return this.dstpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSAPPDATAENTITY);
		return this.dstpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getDstPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标行为所属实体");}
		return value;
	}

	public void setDstPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity){
		this.dstpsappdataentity = dstpsappdataentity;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(){
		if(this.psappdelogic != null) return this.psappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdelogic = ipsappdataentity.getPSAppDELogic(value, false);
		return this.psappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体逻辑");}
		return value;
	}

	public void setPSAppDELogic(net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic){
		this.psappdelogic = psappdelogic;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCloneParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLONEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreException(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREEXCEPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInternalLogic(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINTERNALLOGIC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}