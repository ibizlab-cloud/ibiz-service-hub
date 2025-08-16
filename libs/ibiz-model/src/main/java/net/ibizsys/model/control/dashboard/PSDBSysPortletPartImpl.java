package net.ibizsys.model.control.dashboard;



public class PSDBSysPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBSysPortletPart{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	public final static String ATTR_GETTIMER = "timer";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0.0f;
		}
		return value.asDouble();
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
	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面样式");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统图片");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统统一资源");}
		return value;
	}


	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMER);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes titlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes(){
		if(this.titlepslanguageres != null) return this.titlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.titlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSLANGUAGERES);
		return this.titlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言资源对象");}
		return value;
	}

}