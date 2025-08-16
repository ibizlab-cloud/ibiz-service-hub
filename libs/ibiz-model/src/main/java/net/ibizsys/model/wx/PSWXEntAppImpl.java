package net.ibizsys.model.wx;



public class PSWXEntAppImpl extends net.ibizsys.model.wx.PSWXAccountObjectImpl implements net.ibizsys.model.wx.IPSWXEntApp{

	public final static String ATTR_GETAPPSECRET = "appSecret";
	public final static String ATTR_GETAPPTYPE = "appType";
	public final static String ATTR_GETAPPURL = "appURL";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETENCODINGAESKEY = "encodingAESKey";
	public final static String ATTR_GETPSAPPLICATION = "getPSApplication";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSWXLOGICS = "getPSWXLogics";
	public final static String ATTR_GETPSWXMENUFUNCS = "getPSWXMenuFuncs";
	public final static String ATTR_GETPSWXMENUS = "getPSWXMenus";
	public final static String ATTR_ISREPORTENTER = "reportEnter";
	public final static String ATTR_ISREPORTLOCATION = "reportLocation";

	public java.lang.String getAppSecret(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPSECRET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppURL(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEncodingAESKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENCODINGAESKEY);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.IPSApplication psapplication;

	public net.ibizsys.model.app.IPSApplication getPSApplication(){
		if(this.psapplication != null) return this.psapplication;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPLICATION);
		if(value == null){
			return null;
		}
		this.psapplication = getPSModelObject(net.ibizsys.model.app.IPSApplication.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPLICATION);
		return this.psapplication;
	}

	public net.ibizsys.model.app.IPSApplication getPSApplicationMust(){
		net.ibizsys.model.app.IPSApplication value = this.getPSApplication();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端应用");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysResource pssysresource;

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(){
		if(this.pssysresource != null) return this.pssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.pssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSRESOURCE);
		return this.pssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统资源对象");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}


	private java.util.List<net.ibizsys.model.wx.IPSWXLogic> pswxlogics = null;
	public java.util.List<net.ibizsys.model.wx.IPSWXLogic> getPSWXLogics(){
		if(this.pswxlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWXLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wx.IPSWXLogic> list = new java.util.ArrayList<net.ibizsys.model.wx.IPSWXLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wx.IPSWXLogic obj = this.getPSModelObject(net.ibizsys.model.wx.IPSWXLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWXLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pswxlogics = list;
		}
		return (this.pswxlogics.size() == 0)? null : this.pswxlogics;
	}

	public net.ibizsys.model.wx.IPSWXLogic getPSWXLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wx.IPSWXLogic.class, this.getPSWXLogics(), objKey, bTryMode);
	}
	public void setPSWXLogics(java.util.List<net.ibizsys.model.wx.IPSWXLogic> list){
		this.pswxlogics = list;
	}

	private java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> pswxmenufuncs = null;
	public java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> getPSWXMenuFuncs(){
		if(this.pswxmenufuncs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWXMENUFUNCS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> list = new java.util.ArrayList<net.ibizsys.model.wx.IPSWXMenuFunc>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wx.IPSWXMenuFunc obj = this.getPSModelObject(net.ibizsys.model.wx.IPSWXMenuFunc.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWXMENUFUNCS);
				if(obj!=null)list.add(obj);
			}
			this.pswxmenufuncs = list;
		}
		return (this.pswxmenufuncs.size() == 0)? null : this.pswxmenufuncs;
	}

	public net.ibizsys.model.wx.IPSWXMenuFunc getPSWXMenuFunc(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wx.IPSWXMenuFunc.class, this.getPSWXMenuFuncs(), objKey, bTryMode);
	}
	public void setPSWXMenuFuncs(java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> list){
		this.pswxmenufuncs = list;
	}

	private java.util.List<net.ibizsys.model.wx.IPSWXMenu> pswxmenus = null;
	public java.util.List<net.ibizsys.model.wx.IPSWXMenu> getPSWXMenus(){
		if(this.pswxmenus == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWXMENUS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wx.IPSWXMenu> list = new java.util.ArrayList<net.ibizsys.model.wx.IPSWXMenu>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wx.IPSWXMenu obj = this.getPSModelObject(net.ibizsys.model.wx.IPSWXMenu.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWXMENUS);
				if(obj!=null)list.add(obj);
			}
			this.pswxmenus = list;
		}
		return (this.pswxmenus.size() == 0)? null : this.pswxmenus;
	}

	public net.ibizsys.model.wx.IPSWXMenu getPSWXMenu(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wx.IPSWXMenu.class, this.getPSWXMenus(), objKey, bTryMode);
	}
	public void setPSWXMenus(java.util.List<net.ibizsys.model.wx.IPSWXMenu> list){
		this.pswxmenus = list;
	}

	public boolean isReportEnter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPORTENTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReportLocation(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPORTLOCATION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}