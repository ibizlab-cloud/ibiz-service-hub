package net.ibizsys.model.app.util;



public class PSAppDynaUtilImplBase extends net.ibizsys.model.app.util.PSAppUtilImpl implements net.ibizsys.model.app.util.IPSAppDynaUtilBase{

	public final static String ATTR_GETAPPIDPSAPPDEFIELD = "getAppIdPSAppDEField";
	public final static String ATTR_GETCREATEPSAPPDEACTION = "getCreatePSAppDEAction";
	public final static String ATTR_GETGETPSAPPDEACTION = "getGetPSAppDEAction";
	public final static String ATTR_GETMODELIDPSAPPDEFIELD = "getModelIdPSAppDEField";
	public final static String ATTR_GETMODELPSAPPDEFIELD = "getModelPSAppDEField";
	public final static String ATTR_GETREMOVEPSAPPDEACTION = "getRemovePSAppDEAction";
	public final static String ATTR_GETSTOAGEPSAPPDATAENTITY = "getStoagePSAppDataEntity";
	public final static String ATTR_GETSTORAGEPSAPPDATAENTITY = "getStoragePSAppDataEntity";
	public final static String ATTR_GETUPDATEPSAPPDEACTION = "getUpdatePSAppDEAction";
	public final static String ATTR_GETUSERIDPSAPPDEFIELD = "getUserIdPSAppDEField";
	private net.ibizsys.model.app.dataentity.IPSAppDEField appidpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAppIdPSAppDEField(){
		if(this.appidpsappdefield != null) return this.appidpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPIDPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.appidpsappdefield = this.getStoragePSAppDataEntityMust().getPSAppDEField(value, false);
		return this.appidpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAppIdPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getAppIdPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用标识存储属性");}
		return value;
	}

	public void setAppIdPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField appidpsappdefield){
		this.appidpsappdefield = appidpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction(){
		if(this.createpsappdeaction != null) return this.createpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		this.createpsappdeaction = this.getStoragePSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.createpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getCreatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据行为");}
		return value;
	}

	public void setCreatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction){
		this.createpsappdeaction = createpsappdeaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction getpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEAction(){
		if(this.getpsappdeaction != null) return this.getpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSAPPDEACTION);
		if(value == null){
			return null;
		}
		this.getpsappdeaction = this.getStoragePSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.getpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getGetPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据行为");}
		return value;
	}

	public void setGetPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction getpsappdeaction){
		this.getpsappdeaction = getpsappdeaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField modelidpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getModelIdPSAppDEField(){
		if(this.modelidpsappdefield != null) return this.modelidpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELIDPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.modelidpsappdefield = this.getStoragePSAppDataEntityMust().getPSAppDEField(value, false);
		return this.modelidpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getModelIdPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getModelIdPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定模型标识存储属性");}
		return value;
	}

	public void setModelIdPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField modelidpsappdefield){
		this.modelidpsappdefield = modelidpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField modelpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getModelPSAppDEField(){
		if(this.modelpsappdefield != null) return this.modelpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.modelpsappdefield = this.getStoragePSAppDataEntityMust().getPSAppDEField(value, false);
		return this.modelpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getModelPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getModelPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定模型存储属性");}
		return value;
	}

	public void setModelPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField modelpsappdefield){
		this.modelpsappdefield = modelpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction removepsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEAction(){
		if(this.removepsappdeaction != null) return this.removepsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		this.removepsappdeaction = this.getStoragePSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.removepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getRemovePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除数据行为");}
		return value;
	}

	public void setRemovePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction removepsappdeaction){
		this.removepsappdeaction = removepsappdeaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity stoagepsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoagePSAppDataEntity(){
		if(this.stoagepsappdataentity != null) return this.stoagepsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTOAGEPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.stoagepsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSTOAGEPSAPPDATAENTITY);
		return this.stoagepsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoagePSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getStoagePSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能数据存储实体");}
		return value;
	}

	public void setStoagePSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity stoagepsappdataentity){
		this.stoagepsappdataentity = stoagepsappdataentity;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity storagepsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoragePSAppDataEntity(){
		if(this.storagepsappdataentity != null) return this.storagepsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTORAGEPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.storagepsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSTORAGEPSAPPDATAENTITY);
		return this.storagepsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoragePSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getStoragePSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能数据存储实体");}
		return value;
	}

	public void setStoragePSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity storagepsappdataentity){
		this.storagepsappdataentity = storagepsappdataentity;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction updatepsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction(){
		if(this.updatepsappdeaction != null) return this.updatepsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		this.updatepsappdeaction = this.getStoragePSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.updatepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getUpdatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据行为");}
		return value;
	}

	public void setUpdatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction updatepsappdeaction){
		this.updatepsappdeaction = updatepsappdeaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField useridpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUserIdPSAppDEField(){
		if(this.useridpsappdefield != null) return this.useridpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERIDPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.useridpsappdefield = this.getStoragePSAppDataEntityMust().getPSAppDEField(value, false);
		return this.useridpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUserIdPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getUserIdPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户标识存储属性");}
		return value;
	}

	public void setUserIdPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField useridpsappdefield){
		this.useridpsappdefield = useridpsappdefield;
	}

}