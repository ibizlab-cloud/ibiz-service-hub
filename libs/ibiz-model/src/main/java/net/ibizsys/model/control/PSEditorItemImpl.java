package net.ibizsys.model.control;



public class PSEditorItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSEditorItem
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	public final static String ATTR_GETPSAPPDEACMODE = "getPSAppDEACMode";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	private net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode;

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode(){
		if(this.psappdeacmode != null) return this.psappdeacmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEACMODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdeacmode = ipsappdataentity.getPSAppDEACMode(value, false);
		return this.psappdeacmode;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEACMode value = this.getPSAppDEACMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体自填模式对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体结果集对象");}
		return value;
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


	private java.util.List<net.ibizsys.model.control.IPSNavigateContext> psnavigatecontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateContext> getPSNavigateContexts(){
		if(this.psnavigatecontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATECONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATECONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigatecontexts = list;
		}
		return (this.psnavigatecontexts.size() == 0)? null : this.psnavigatecontexts;
	}

	public net.ibizsys.model.control.IPSNavigateContext getPSNavigateContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, this.getPSNavigateContexts(), objKey, bTryMode);
	}
	public void setPSNavigateContexts(java.util.List<net.ibizsys.model.control.IPSNavigateContext> list){
		this.psnavigatecontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSNavigateParam> psnavigateparams = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateParam> getPSNavigateParams(){
		if(this.psnavigateparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigateparams = list;
		}
		return (this.psnavigateparams.size() == 0)? null : this.psnavigateparams;
	}

	public net.ibizsys.model.control.IPSNavigateParam getPSNavigateParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, this.getPSNavigateParams(), objKey, bTryMode);
	}
	public void setPSNavigateParams(java.util.List<net.ibizsys.model.control.IPSNavigateParam> list){
		this.psnavigateparams = list;
	}
}