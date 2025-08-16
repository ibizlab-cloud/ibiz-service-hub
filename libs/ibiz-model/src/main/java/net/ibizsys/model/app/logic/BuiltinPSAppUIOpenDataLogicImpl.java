package net.ibizsys.model.app.logic;



public class BuiltinPSAppUIOpenDataLogicImpl extends net.ibizsys.model.app.logic.BuiltinPSAppUILogicImplBase implements net.ibizsys.model.app.logic.IPSAppUIOpenDataLogic{

	public final static String ATTR_GETOPENDATAPSAPPVIEW = "getOpenDataPSAppView";
	public final static String ATTR_GETOPENDATAPSAPPVIEWS = "getOpenDataPSAppViews";
	public final static String ATTR_GETVIEWLOGICTYPE = "viewLogicType";
	public final static String ATTR_ISEDITMODE = "editMode";
	private net.ibizsys.model.app.logic.IPSAppUILogicRefView opendatapsappview;

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppView(){
		if(this.opendatapsappview != null) return this.opendatapsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENDATAPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.opendatapsappview = getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETOPENDATAPSAPPVIEW);
		return this.opendatapsappview;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppViewMust(){
		net.ibizsys.model.app.logic.IPSAppUILogicRefView value = this.getOpenDataPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认打开数据视图");}
		return value;
	}

	public void setOpenDataPSAppView(net.ibizsys.model.app.logic.IPSAppUILogicRefView opendatapsappview){
		this.opendatapsappview = opendatapsappview;
	}


	private java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> opendatapsappviews = null;
	public java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getOpenDataPSAppViews(){
		if(this.opendatapsappviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENDATAPSAPPVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list = new java.util.ArrayList<net.ibizsys.model.app.logic.IPSAppUILogicRefView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.logic.IPSAppUILogicRefView obj = this.getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETOPENDATAPSAPPVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.opendatapsappviews = list;
		}
		return (this.opendatapsappviews.size() == 0)? null : this.opendatapsappviews;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppUILogicRefView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, this.getOpenDataPSAppViews(), objKey, bTryMode);
	}
	
	public void setOpenDataPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list){
		this.opendatapsappviews = list;
	}

	public java.lang.String getViewLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEditMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEDITMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}