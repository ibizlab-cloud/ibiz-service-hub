package net.ibizsys.model.app.view;



public class PSAppViewMsgImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.view.IPSAppViewMsg{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTPSLANGUAGERES = "getContentPSLanguageRes";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETDYNAMICMODE = "dynamicMode";
	public final static String ATTR_GETENABLEMODE = "enableMode";
	public final static String ATTR_GETMESSAGE = "message";
	public final static String ATTR_GETMESSAGETYPE = "messageType";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPMSGTEMPL = "getPSAppMsgTempl";
	public final static String ATTR_GETPSLAYOUTPANEL = "getPSLayoutPanel";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPOSITION = "position";
	public final static String ATTR_GETREMOVEMODE = "removeMode";
	public final static String ATTR_GETTESTPSAPPDELOGIC = "getTestPSAppDELogic";
	public final static String ATTR_GETTESTPSDEOPPRIV = "getTestPSDEOPPriv";
	public final static String ATTR_GETTESTSCRIPTCODE = "testScriptCode";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLELANRESTAG = "titleLanResTag";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISENABLEREMOVE = "enableRemove";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes contentpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes(){
		if(this.contentpslanguageres != null) return this.contentpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.contentpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSLANGUAGERES);
		return this.contentpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getContentPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容多语言资源对象");}
		return value;
	}

	public void setContentPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes contentpslanguageres){
		this.contentpslanguageres = contentpslanguageres;
	}


	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
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

	public int getDynamicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMICMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getEnableMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEMODE);
		if(value == null){
			return "ALL";
		}
		return value.asText();
	}

	public java.lang.String getMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMessageType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMESSAGETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用判断实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.msg.IPSAppMsgTempl psappmsgtempl;

	public net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTempl(){
		if(this.psappmsgtempl != null) return this.psappmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMSGTEMPL);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappmsgtempl = ipsapplication.getPSAppMsgTempl(value, false);
		return this.psappmsgtempl;
	}

	public net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTemplMust(){
		net.ibizsys.model.app.msg.IPSAppMsgTempl value = this.getPSAppMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用消息模板");}
		return value;
	}

	public void setPSAppMsgTempl(net.ibizsys.model.app.msg.IPSAppMsgTempl psappmsgtempl){
		this.psappmsgtempl = psappmsgtempl;
	}

	private net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel(){
		if(this.pslayoutpanel != null) return this.pslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.pslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPANEL);
		return this.pslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局面板");}
		return value;
	}

	public void setPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel){
		this.pslayoutpanel = pslayoutpanel;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统界面样式表");}
		return value;
	}

	public void setPSSysCss(net.ibizsys.model.res.IPSSysCss pssyscss){
		this.pssyscss = pssyscss;
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

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public java.lang.String getPosition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOSITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRemoveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDELogic testpsappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogic(){
		if(this.testpsappdelogic != null) return this.testpsappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.testpsappdelogic = ipsappdataentity.getPSAppDELogic(value, false);
		return this.testpsappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getTestPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用判断实体逻辑");}
		return value;
	}

	public void setTestPSAppDELogic(net.ibizsys.model.app.dataentity.IPSAppDELogic testpsappdelogic){
		this.testpsappdelogic = testpsappdelogic;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv testpsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv(){
		if(this.testpsdeoppriv != null) return this.testpsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.testpsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTESTPSDEOPPRIV);
		return this.testpsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getTestPSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用判断操作标识");}
		return value;
	}

	public void setTestPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv testpsdeoppriv){
		this.testpsdeoppriv = testpsdeoppriv;
	}


	public java.lang.String getTestScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTSCRIPTCODE);
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

	public java.lang.String getTitleLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLELANRESTAG);
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

	public void setTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes titlepslanguageres){
		this.titlepslanguageres = titlepslanguageres;
	}


	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableRemove(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEREMOVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}