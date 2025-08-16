package net.ibizsys.model.control;



public class PSControlContainerImpl extends net.ibizsys.model.control.PSControlImpl implements net.ibizsys.model.control.IPSControlContainer{

	public final static String ATTR_GETPSAPPCOUNTERREFS = "getPSAppCounterRefs";
	public final static String ATTR_GETPSAPPVIEWENGINES = "getPSAppViewEngines";
	public final static String ATTR_GETPSAPPVIEWLOGICS = "getPSAppViewLogics";
	public final static String ATTR_GETPSAPPVIEWREFS = "getPSAppViewRefs";
	public final static String ATTR_GETPSAPPVIEWUIACTIONS = "getPSAppViewUIActions";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";

	private java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> psappcounterrefs = null;
	public java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> getPSAppCounterRefs(){
		if(this.psappcounterrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> list = new java.util.ArrayList<net.ibizsys.model.app.control.IPSAppCounterRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.control.IPSAppCounterRef obj = this.getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPCOUNTERREFS);
				if(obj!=null)list.add(obj);
			}
			this.psappcounterrefs = list;
		}
		return (this.psappcounterrefs.size() == 0)? null : this.psappcounterrefs;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, this.getPSAppCounterRefs(), objKey, bTryMode);
	}
	public void setPSAppCounterRefs(java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> list){
		this.psappcounterrefs = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> psappviewengines = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> getPSAppViewEngines(){
		if(this.psappviewengines == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWENGINES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewEngine>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewEngine obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewEngine.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWENGINES);
				if(obj!=null)list.add(obj);
			}
			this.psappviewengines = list;
		}
		return (this.psappviewengines.size() == 0)? null : this.psappviewengines;
	}

	public net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewEngine.class, this.getPSAppViewEngines(), objKey, bTryMode);
	}
	public void setPSAppViewEngines(java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> list){
		this.psappviewengines = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> psappviewlogics = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> getPSAppViewLogics(){
		if(this.psappviewlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewLogic obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewlogics = list;
		}
		return (this.psappviewlogics.size() == 0)? null : this.psappviewlogics;
	}

	public net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewLogic.class, this.getPSAppViewLogics(), objKey, bTryMode);
	}
	public void setPSAppViewLogics(java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> list){
		this.psappviewlogics = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> psappviewrefs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getPSAppViewRefs(){
		if(this.psappviewrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewRef obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWREFS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewrefs = list;
		}
		return (this.psappviewrefs.size() == 0)? null : this.psappviewrefs;
	}

	public net.ibizsys.model.app.view.IPSAppViewRef getPSAppViewRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, this.getPSAppViewRefs(), objKey, bTryMode);
	}
	public void setPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list){
		this.psappviewrefs = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> psappviewuiactions = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> getPSAppViewUIActions(){
		if(this.psappviewuiactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWUIACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewUIAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewUIAction obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWUIACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewuiactions = list;
		}
		return (this.psappviewuiactions.size() == 0)? null : this.psappviewuiactions;
	}

	public net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, this.getPSAppViewUIActions(), objKey, bTryMode);
	}
	public void setPSAppViewUIActions(java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> list){
		this.psappviewuiactions = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControl> pscontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getPSControls(){
		if(this.pscontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrols = list;
		}
		return (this.pscontrols.size() == 0)? null : this.pscontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getPSControls(), objKey, bTryMode);
	}
	public void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.pscontrols = list;
	}
}