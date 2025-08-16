package net.ibizsys.model.app.logic;



public class BuiltinPSAppUINewDataLogicImpl extends net.ibizsys.model.app.logic.BuiltinPSAppUILogicImplBase implements net.ibizsys.model.app.logic.IPSAppUINewDataLogic{

	public final static String ATTR_GETACTIONAFTERWIZARD = "actionAfterWizard";
	public final static String ATTR_GETBATCHADDPSAPPDEACTION = "getBatchAddPSAppDEAction";
	public final static String ATTR_GETBATCHADDPSAPPVIEWS = "getBatchAddPSAppViews";
	public final static String ATTR_GETNEWDATAPSAPPVIEW = "getNewDataPSAppView";
	public final static String ATTR_GETNEWDATAPSAPPVIEWS = "getNewDataPSAppViews";
	public final static String ATTR_GETVIEWLOGICTYPE = "viewLogicType";
	public final static String ATTR_GETWIZARDPSAPPVIEW = "getWizardPSAppView";
	public final static String ATTR_ISBATCHADDONLY = "batchAddOnly";
	public final static String ATTR_ISENABLEBATCHADD = "enableBatchAdd";
	public final static String ATTR_ISENABLEWIZARDADD = "enableWizardAdd";

	public java.lang.String getActionAfterWizard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONAFTERWIZARD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction batchaddpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getBatchAddPSAppDEAction(){
		if(this.batchaddpsappdeaction != null) return this.batchaddpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBATCHADDPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.batchaddpsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.batchaddpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getBatchAddPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getBatchAddPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定批添加应用实体方法");}
		return value;
	}

	public void setBatchAddPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction batchaddpsappdeaction){
		this.batchaddpsappdeaction = batchaddpsappdeaction;
	}


	private java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> batchaddpsappviews = null;
	public java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getBatchAddPSAppViews(){
		if(this.batchaddpsappviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBATCHADDPSAPPVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list = new java.util.ArrayList<net.ibizsys.model.app.logic.IPSAppUILogicRefView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.logic.IPSAppUILogicRefView obj = this.getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETBATCHADDPSAPPVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.batchaddpsappviews = list;
		}
		return (this.batchaddpsappviews.size() == 0)? null : this.batchaddpsappviews;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getBatchAddPSAppUILogicRefView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, this.getBatchAddPSAppViews(), objKey, bTryMode);
	}
	
	public void setBatchAddPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list){
		this.batchaddpsappviews = list;
	}
	private net.ibizsys.model.app.logic.IPSAppUILogicRefView newdatapsappview;

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppView(){
		if(this.newdatapsappview != null) return this.newdatapsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEWDATAPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.newdatapsappview = getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNEWDATAPSAPPVIEW);
		return this.newdatapsappview;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppViewMust(){
		net.ibizsys.model.app.logic.IPSAppUILogicRefView value = this.getNewDataPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认新建数据视图");}
		return value;
	}

	public void setNewDataPSAppView(net.ibizsys.model.app.logic.IPSAppUILogicRefView newdatapsappview){
		this.newdatapsappview = newdatapsappview;
	}


	private java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> newdatapsappviews = null;
	public java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getNewDataPSAppViews(){
		if(this.newdatapsappviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEWDATAPSAPPVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list = new java.util.ArrayList<net.ibizsys.model.app.logic.IPSAppUILogicRefView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.logic.IPSAppUILogicRefView obj = this.getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETNEWDATAPSAPPVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.newdatapsappviews = list;
		}
		return (this.newdatapsappviews.size() == 0)? null : this.newdatapsappviews;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppUILogicRefView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, this.getNewDataPSAppViews(), objKey, bTryMode);
	}
	
	public void setNewDataPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list){
		this.newdatapsappviews = list;
	}

	public java.lang.String getViewLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.logic.IPSAppUILogicRefView wizardpsappview;

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getWizardPSAppView(){
		if(this.wizardpsappview != null) return this.wizardpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIZARDPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.wizardpsappview = getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETWIZARDPSAPPVIEW);
		return this.wizardpsappview;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getWizardPSAppViewMust(){
		net.ibizsys.model.app.logic.IPSAppUILogicRefView value = this.getWizardPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定新建数据向导视图");}
		return value;
	}

	public void setWizardPSAppView(net.ibizsys.model.app.logic.IPSAppUILogicRefView wizardpsappview){
		this.wizardpsappview = wizardpsappview;
	}


	public boolean isBatchAddOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBATCHADDONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableBatchAdd(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBATCHADD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableWizardAdd(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWIZARDADD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}