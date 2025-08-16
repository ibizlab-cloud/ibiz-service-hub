package net.ibizsys.model.app.view;



public class PSAppDERedirectViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDERedirectView{

	public final static String ATTR_GETGETDATAPSAPPDEACTION = "getGetDataPSAppDEAction";
	public final static String ATTR_GETREDIRECTPSAPPVIEWREFS = "getRedirectPSAppViewRefs";
	public final static String ATTR_GETTYPEPSAPPDEFIELD = "getTypePSAppDEField";
	public final static String ATTR_ISENABLECUSTOMGETDATAACTION = "enableCustomGetDataAction";
	public final static String ATTR_ISENABLEWORKFLOW = "enableWorkflow";
	public final static String ATTR_ISREDIRECTVIEW = "redirectView";
	private net.ibizsys.model.app.dataentity.IPSAppDEAction getdatapsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getGetDataPSAppDEAction(){
		if(this.getdatapsappdeaction != null) return this.getdatapsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDATAPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.getdatapsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.getdatapsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getGetDataPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getGetDataPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据应用实体行为");}
		return value;
	}

	public void setGetDataPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction getdatapsappdeaction){
		this.getdatapsappdeaction = getdatapsappdeaction;
	}


	private java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> redirectpsappviewrefs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getRedirectPSAppViewRefs(){
		if(this.redirectpsappviewrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREDIRECTPSAPPVIEWREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewRef obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETREDIRECTPSAPPVIEWREFS);
				if(obj!=null)list.add(obj);
			}
			this.redirectpsappviewrefs = list;
		}
		return (this.redirectpsappviewrefs.size() == 0)? null : this.redirectpsappviewrefs;
	}

	public net.ibizsys.model.app.view.IPSAppViewRef getRedirectPSAppViewRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, this.getRedirectPSAppViewRefs(), objKey, bTryMode);
	}
	
	public void setRedirectPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list){
		this.redirectpsappviewrefs = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField typepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTypePSAppDEField(){
		if(this.typepsappdefield != null) return this.typepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.typepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.typepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据类型识别属性");}
		return value;
	}

	public void setTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField typepsappdefield){
		this.typepsappdefield = typepsappdefield;
	}


	public boolean isEnableCustomGetDataAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMGETDATAACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableWorkflow(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWORKFLOW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRedirectView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREDIRECTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}