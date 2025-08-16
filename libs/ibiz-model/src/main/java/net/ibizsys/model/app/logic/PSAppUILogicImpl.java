package net.ibizsys.model.app.logic;



public class PSAppUILogicImpl extends net.ibizsys.model.res.PSSysViewLogicImpl implements net.ibizsys.model.app.logic.IPSAppUILogic{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPDEUILOGIC = "getPSAppDEUILogic";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPUILOGICREFVIEWS = "getPSAppUILogicRefViews";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_ISBUILTINLOGIC = "builtinLogic";
	public final static String ATTR_ISDYNAINSTMODEL = "dynaInstModel";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体界面逻辑对象");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	private java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> psappuilogicrefviews = null;
	public java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getPSAppUILogicRefViews(){
		if(this.psappuilogicrefviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPUILOGICREFVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list = new java.util.ArrayList<net.ibizsys.model.app.logic.IPSAppUILogicRefView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.logic.IPSAppUILogicRefView obj = this.getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPUILOGICREFVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.psappuilogicrefviews = list;
		}
		return (this.psappuilogicrefviews.size() == 0)? null : this.psappuilogicrefviews;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getPSAppUILogicRefView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, this.getPSAppUILogicRefViews(), objKey, bTryMode);
	}
	public void setPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list){
		this.psappuilogicrefviews = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}


	public boolean isBuiltinLogic(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBUILTINLOGIC);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isDynaInstModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDYNAINSTMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}