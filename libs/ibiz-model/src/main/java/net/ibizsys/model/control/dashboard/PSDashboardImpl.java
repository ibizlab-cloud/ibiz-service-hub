package net.ibizsys.model.control.dashboard;



public class PSDashboardImpl extends net.ibizsys.model.control.PSAjaxControlContainerImpl implements net.ibizsys.model.control.dashboard.IPSDashboard{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMIZEMODE = "customizeMode";
	public final static String ATTR_GETDASHBOARDSTYLE = "dashboardStyle";
	public final static String ATTR_GETNAVBARPSSYSCSS = "getNavBarPSSysCss";
	public final static String ATTR_GETNAVBARPOS = "navBarPos";
	public final static String ATTR_GETNAVBARSTYLE = "navBarStyle";
	public final static String ATTR_GETNAVBARWIDTH = "navBarWidth";
	public final static String ATTR_GETNAVBARHEIGHT = "navbarHeight";
	public final static String ATTR_GETPSAPPDYNADASHBOARDUTIL = "getPSAppDynaDashboardUtil";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETPSPORTLETS = "getPSControls";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISSHOWDASHBOARDNAVBAR = "showDashboardNavBar";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCustomizeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMIZEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDashboardStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDASHBOARDSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysCss navbarpssyscss;

	public net.ibizsys.model.res.IPSSysCss getNavBarPSSysCss(){
		if(this.navbarpssyscss != null) return this.navbarpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARPSSYSCSS);
		if(value == null){
			return null;
		}
		this.navbarpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVBARPSSYSCSS);
		return this.navbarpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getNavBarPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getNavBarPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航栏样式表");}
		return value;
	}

	public void setNavBarPSSysCss(net.ibizsys.model.res.IPSSysCss navbarpssyscss){
		this.navbarpssyscss = navbarpssyscss;
	}


	public java.lang.String getNavBarPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNavBarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getNavBarWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavbarHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.app.util.IPSAppDynaDashboardUtil psappdynadashboardutil;

	public net.ibizsys.model.app.util.IPSAppDynaDashboardUtil getPSAppDynaDashboardUtil(){
		if(this.psappdynadashboardutil != null) return this.psappdynadashboardutil;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDYNADASHBOARDUTIL);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappdynadashboardutil = (net.ibizsys.model.app.util.IPSAppDynaDashboardUtil)ipsapplication.getPSAppUtil(value, false);
		return this.psappdynadashboardutil;
	}

	public net.ibizsys.model.app.util.IPSAppDynaDashboardUtil getPSAppDynaDashboardUtilMust(){
		net.ibizsys.model.app.util.IPSAppDynaDashboardUtil value = this.getPSAppDynaDashboardUtil();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用动态看板功能");}
		return value;
	}

	public void setPSAppDynaDashboardUtil(net.ibizsys.model.app.util.IPSAppDynaDashboardUtil psappdynadashboardutil){
		this.psappdynadashboardutil = psappdynadashboardutil;
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
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	public net.ibizsys.model.control.layout.IPSLayout getPSLayout(){
		if(this.pslayout != null) return this.pslayout;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUT);
		if(value == null){
			return null;
		}
		this.pslayout = getPSModelObject(net.ibizsys.model.control.layout.IPSLayout.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUT);
		return this.pslayout;
	}

	public net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust(){
		net.ibizsys.model.control.layout.IPSLayout value = this.getPSLayout();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定看板布局");}
		return value;
	}

	public void setPSLayout(net.ibizsys.model.control.layout.IPSLayout pslayout){
		this.pslayout = pslayout;
	}


	private java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> psportlets = null;
	public java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> getPSPortlets(){
		if(this.psportlets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPORTLETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> list = new java.util.ArrayList<net.ibizsys.model.control.dashboard.IPSDBPortletPart>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.dashboard.IPSDBPortletPart obj = this.getPSModelObject(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSPORTLETS);
				if(obj!=null)list.add(obj);
			}
			this.psportlets = list;
		}
		return (this.psportlets.size() == 0)? null : this.psportlets;
	}

	public net.ibizsys.model.control.dashboard.IPSDBPortletPart getPSDBPortletPart(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class, this.getPSPortlets(), objKey, bTryMode);
	}
	public void setPSDBPortletParts(java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> list){
		this.psportlets = list;
	}

	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowDashboardNavBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWDASHBOARDNAVBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}