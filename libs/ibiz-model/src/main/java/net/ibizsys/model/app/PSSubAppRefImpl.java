package net.ibizsys.model.app;



public class PSSubAppRefImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSSubAppRef{

	public final static String ATTR_GETALLPSAPPDEUIACTIONGROUPS = "getAllPSAppDEUIActionGroups";
	public final static String ATTR_GETALLPSAPPMENUMODELS = "getAllPSAppMenuModels";
	public final static String ATTR_GETALLPSAPPVIEWS = "getAllPSAppViews";
	public final static String ATTR_GETALLPSCONTROLS = "getAllPSControls";
	public final static String ATTR_GETALLPSDEDRCONTROLS = "getAllPSDEDRControls";
	public final static String ATTR_GETMODELSTAMP = "modelStamp";
	public final static String ATTR_GETPSAPPMENUMODEL = "getPSAppMenuModel";
	public final static String ATTR_GETALLPSAPPPFPLUGINREFS = "getAllPSAppPFPluginRefs";
	public final static String ATTR_GETREFPARAM = "refParam";
	public final static String ATTR_GETREFPARAM2 = "refParam2";
	public final static String ATTR_GETSERVICEID = "serviceId";
	public final static String ATTR_GETACCESSKEY = "accessKey";
	public final static String ATTR_GETAPPMODE = "appMode";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETSYSREFTYPE = "sysRefType";
	public final static String ATTR_GETPSDEVSLNSYSID = "getPSDevSlnSysId";

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> allpsappdeuiactiongroups = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> getAllPSAppDEUIActionGroups(){
		if(this.allpsappdeuiactiongroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEUIACTIONGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEUIACTIONGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeuiactiongroups = list;
		}
		return (this.allpsappdeuiactiongroups.size() == 0)? null : this.allpsappdeuiactiongroups;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup getPSAppDEUIActionGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class, this.getAllPSAppDEUIActionGroups(), objKey, bTryMode);
	}
	public void setPSAppDEUIActionGroups(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list){
		this.allpsappdeuiactiongroups = list;
	}

	private java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> allpsappmenumodels = null;
	public java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> getAllPSAppMenuModels(){
		if(this.allpsappmenumodels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPMENUMODELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list = new java.util.ArrayList<net.ibizsys.model.app.appmenu.IPSAppMenuModel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.appmenu.IPSAppMenuModel obj = this.getPSModelObject(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPMENUMODELS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappmenumodels = list;
		}
		return (this.allpsappmenumodels.size() == 0)? null : this.allpsappmenumodels;
	}

	public net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class, this.getAllPSAppMenuModels(), objKey, bTryMode);
	}
	public void setPSAppMenuModels(java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list){
		this.allpsappmenumodels = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppView> allpsappviews = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppView> getAllPSAppViews(){
		if(this.allpsappviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppView> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppView obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappviews = list;
		}
		return (this.allpsappviews.size() == 0)? null : this.allpsappviews;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, this.getAllPSAppViews(), objKey, bTryMode);
	}
	public void setPSAppViews(java.util.List<net.ibizsys.model.app.view.IPSAppView> list){
		this.allpsappviews = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControl> allpscontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getAllPSControls(){
		if(this.allpscontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.allpscontrols = list;
		}
		return (this.allpscontrols.size() == 0)? null : this.allpscontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getAllPSControls(), objKey, bTryMode);
	}
	public void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.allpscontrols = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControl> allpsdedrcontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getAllPSDEDRControls(){
		if(this.allpsdedrcontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDRCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDRCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedrcontrols = list;
		}
		return (this.allpsdedrcontrols.size() == 0)? null : this.allpsdedrcontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSDEDRControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getAllPSDEDRControls(), objKey, bTryMode);
	}
	public void setPSDEDRControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.allpsdedrcontrols = list;
	}

	public java.lang.String getModelStamp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELSTAMP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.appmenu.IPSAppMenuModel psappmenumodel;

	public net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel(){
		if(this.psappmenumodel != null) return this.psappmenumodel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMENUMODEL);
		if(value == null){
			return null;
		}
		this.psappmenumodel = getPSModelObject(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPMENUMODEL);
		return this.psappmenumodel;
	}

	public net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModelMust(){
		net.ibizsys.model.app.appmenu.IPSAppMenuModel value = this.getPSAppMenuModel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用菜单模型");}
		return value;
	}

	private java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> allpsapppfpluginrefs = null;
	public java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> getAllPSAppPFPluginRefs(){
		if(this.allpsapppfpluginrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPPFPLUGINREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list = new java.util.ArrayList<net.ibizsys.model.app.res.IPSAppPFPluginRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.res.IPSAppPFPluginRef obj = this.getPSModelObject(net.ibizsys.model.app.res.IPSAppPFPluginRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPPFPLUGINREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapppfpluginrefs = list;
		}
		return (this.allpsapppfpluginrefs.size() == 0)? null : this.allpsapppfpluginrefs;
	}

	public net.ibizsys.model.app.res.IPSAppPFPluginRef getPSAppPFPluginRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.res.IPSAppPFPluginRef.class, this.getAllPSAppPFPluginRefs(), objKey, bTryMode);
	}
	public void setPSAppPFPluginRefs(java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list){
		this.allpsapppfpluginrefs = list;
	}

	public java.lang.String getRefParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	
	public java.lang.String getAccessKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCESSKEY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	
	public java.lang.String getSysRefType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSREFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	
	public java.lang.String getPSDevSlnSysId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEVSLNSYSID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}