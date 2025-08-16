package net.ibizsys.model.control.dashboard;



public class PSDBAppMenuPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBAppMenuPortletPart{

	public final static String ATTR_GETAMLISTSTYLE = "aMListStyle";
	public final static String ATTR_GETAMPSSYSPFPLUGIN = "getAMPSSysPFPlugin";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	public final static String ATTR_GETTITLE = "title";

	public java.lang.String getAMListStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAMLISTSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysPFPlugin ampssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getAMPSSysPFPlugin(){
		if(this.ampssyspfplugin != null) return this.ampssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAMPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.ampssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETAMPSSYSPFPLUGIN);
		return this.ampssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getAMPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getAMPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用菜单绘制插件");}
		return value;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = this.getPSControl(value, false);
		return this.contentpscontrol;
	}

	public net.ibizsys.model.control.IPSControl getContentPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getContentPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容部件");}
		return value;
	}


	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}