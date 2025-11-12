package net.ibizsys.model.control;



public class PSMDAjaxControlContainerImpl2 extends net.ibizsys.model.control.PSMDAjaxControlContainerImpl implements net.ibizsys.model.control.IPSControlNavigatable{

	public final static String ATTR_GETNAVFILTER = "navFilter";
	public final static String ATTR_GETNAVPSAPPVIEW = "getNavPSAppView";
	public final static String ATTR_GETNAVPSDER = "getNavPSDER";
	public final static String ATTR_GETNAVVIEWHEIGHT = "navViewHeight";
	public final static String ATTR_GETNAVVIEWMAXHEIGHT = "navViewMaxHeight";
	public final static String ATTR_GETNAVVIEWMAXWIDTH = "navViewMaxWidth";
	public final static String ATTR_GETNAVVIEWMINHEIGHT = "navViewMinHeight";
	public final static String ATTR_GETNAVVIEWMINWIDTH = "navViewMinWidth";
	public final static String ATTR_GETNAVVIEWPARAMJO = "navViewParamJO";
	public final static String ATTR_GETNAVVIEWPOS = "navViewPos";
	public final static String ATTR_GETNAVVIEWSHOWMODE = "navViewShowMode";
	public final static String ATTR_GETNAVVIEWWIDTH = "navViewWidth";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";

	public java.lang.String getNavFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView navpsappview;

	public net.ibizsys.model.app.view.IPSAppView getNavPSAppView(){
		if(this.navpsappview != null) return this.navpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.navpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVPSAPPVIEW);
		return this.navpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getNavPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getNavPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航视图对象");}
		return value;
	}

	public void setNavPSAppView(net.ibizsys.model.app.view.IPSAppView navpsappview){
		this.navpsappview = navpsappview;
	}

	private net.ibizsys.model.dataentity.der.IPSDERBase navpsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER(){
		if(this.navpsder != null) return this.navpsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSDER);
		if(value == null){
			return null;
		}
		this.navpsder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVPSDER);
		return this.navpsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getNavPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航关系");}
		return value;
	}

	public void setNavPSDER(net.ibizsys.model.dataentity.der.IPSDERBase navpsder){
		this.navpsder = navpsder;
	}


	public double getNavViewHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavViewMaxHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWMAXHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavViewMaxWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWMAXWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavViewMinHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWMINHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavViewMinWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWMINWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getNavViewParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getNavViewPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWPOS);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	public int getNavViewShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWSHOWMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public double getNavViewWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVVIEWWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
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