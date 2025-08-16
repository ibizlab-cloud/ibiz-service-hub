package net.ibizsys.model.dataentity.datamap;



public class PSDEMapActionImpl extends net.ibizsys.model.dataentity.datamap.PSDEMapObjectImpl implements net.ibizsys.model.dataentity.datamap.IPSDEMapAction
		,net.ibizsys.model.app.dataentity.IPSAppDEMapAction{

	public final static String ATTR_GETDSTPSAPPDEACTION = "getDstPSAppDEAction";
	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETMAPMODE = "mapMode";
	public final static String ATTR_GETMAPPARAMS = "mapParams";
	public final static String ATTR_GETSRCPSAPPDEACTION = "getSrcPSAppDEAction";
	public final static String ATTR_GETSRCPSDEACTION = "getSrcPSDEAction";
	private net.ibizsys.model.app.dataentity.IPSAppDEAction dstpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEAction(){
		if(this.dstpsappdeaction != null) return this.dstpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDEMap ipsappdemap = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMap.class);
		this.dstpsappdeaction = ipsappdemap.getDstPSAppDataEntityMust().getPSAppDEAction(value, false);
		return this.dstpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getDstPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用实体行为");}
		return value;
	}

	public void setDstPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction dstpsappdeaction){
		this.dstpsappdeaction = dstpsappdeaction;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.datamap.IPSDEMap ipsdemap = getParentPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class);
		this.dstpsdeaction = ipsdemap.getDstPSDEMust().getPSDEAction(value, false);
		return this.dstpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getDstPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体行为");}
		return value;
	}

	public void setDstPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction){
		this.dstpsdeaction = dstpsdeaction;
	}


	public java.lang.String getMapMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPMODE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getMapParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction srcpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getSrcPSAppDEAction(){
		if(this.srcpsappdeaction != null) return this.srcpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.srcpsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.srcpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getSrcPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getSrcPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源应用实体行为");}
		return value;
	}

	public void setSrcPSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction srcpsappdeaction){
		this.srcpsappdeaction = srcpsappdeaction;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction srcpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEAction(){
		if(this.srcpsdeaction != null) return this.srcpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.srcpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.srcpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getSrcPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源实体行为");}
		return value;
	}

	public void setSrcPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction srcpsdeaction){
		this.srcpsdeaction = srcpsdeaction;
	}

}