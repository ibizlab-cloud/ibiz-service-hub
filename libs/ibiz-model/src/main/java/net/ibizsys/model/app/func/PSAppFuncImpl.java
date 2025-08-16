package net.ibizsys.model.app.func;



public class PSAppFuncImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.func.IPSAppFunc{

	public final static String ATTR_GETAPPFUNCTYPE = "appFuncType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETFUNCSN = "funcSN";
	public final static String ATTR_GETHTMLPAGEURL = "htmlPageUrl";
	public final static String ATTR_GETJSCODE = "jSCode";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETOPENMODE = "openMode";
	public final static String ATTR_GETOPENVIEWPARAM = "openViewParam";
	public final static String ATTR_GETPSAPPDEACMODE = "getPSAppDEACMode";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPVIEW = "getPSAppView";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPSPDTAPPFUNCID = "getPSPDTAppFuncId";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETPREDEFINEDTYPEPARAM = "predefinedTypeParam";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_ISSYSTEMRESERVED = "systemReserved";

	public java.lang.String getAppFuncType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPFUNCTYPE);
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

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFuncSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFUNCSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHtmlPageUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLPAGEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getJSCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJSCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes namepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes(){
		if(this.namepslanguageres != null) return this.namepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.namepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAMEPSLANGUAGERES);
		return this.namepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNamePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称语言资源");}
		return value;
	}

	public void setNamePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes namepslanguageres){
		this.namepslanguageres = namepslanguageres;
	}


	public java.lang.String getOpenMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getOpenViewParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENVIEWPARAM);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体自填模式");}
		return value;
	}

	public void setPSAppDEACMode(net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode){
		this.psappdeacmode = psappdeacmode;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.view.IPSAppView psappview;

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(){
		if(this.psappview != null) return this.psappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.psappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEW);
		return this.psappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定打开视图");}
		return value;
	}

	public void setPSAppView(net.ibizsys.model.app.view.IPSAppView psappview){
		this.psappview = psappview;
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

	public java.lang.String getPSPDTAppFuncId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPDTAPPFUNCID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.view.IPSUIAction psuiaction;

	public net.ibizsys.model.view.IPSUIAction getPSUIAction(){
		if(this.psuiaction != null) return this.psuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTION);
		if(value == null){
			return null;
		}
		this.psuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTION);
		return this.psuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getPSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用界面行为");}
		return value;
	}

	public void setPSUIAction(net.ibizsys.model.view.IPSUIAction psuiaction){
		this.psuiaction = psuiaction;
	}


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPredefinedTypeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes(){
		if(this.tooltippslanguageres != null) return this.tooltippslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.tooltippslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOOLTIPPSLANGUAGERES);
		return this.tooltippslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTooltipPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定操作提示语言资源");}
		return value;
	}

	public void setTooltipPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres){
		this.tooltippslanguageres = tooltippslanguageres;
	}


	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isSystemReserved(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSYSTEMRESERVED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}