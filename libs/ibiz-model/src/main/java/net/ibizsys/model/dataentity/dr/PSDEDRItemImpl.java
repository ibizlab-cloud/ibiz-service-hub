package net.ibizsys.model.dataentity.dr;



public class PSDEDRItemImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dr.IPSDEDRItem
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETCOUNTERMODE = "counterMode";
	public final static String ATTR_GETENABLEMODE = "enableMode";
	public final static String ATTR_GETHEADERPSSYSPFPLUGIN = "getHeaderPSSysPFPlugin";
	public final static String ATTR_GETITEMTYPE = "itemType";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPARENTDATAJO = "parentDataJO";
	public final static String ATTR_GETTESTPSDELOGIC = "getTestPSDELogic";
	public final static String ATTR_GETTESTPSDEOPPRIV = "getTestPSDEOPPriv";
	public final static String ATTR_GETTESTPSSYSUNIRES = "getTestPSSysUniRes";
	public final static String ATTR_GETTESTSCRIPTCODE = "testScriptCode";
	public final static String ATTR_GETVIEWCODENAME = "viewCodeName";
	public final static String ATTR_GETVIEWPSDATAENTITY = "getViewPSDataEntity";
	public final static String ATTR_GETVIEWPARAMJO = "viewParamJO";
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCounterId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCounterMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getEnableMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysPFPlugin headerpssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPlugin(){
		if(this.headerpssyspfplugin != null) return this.headerpssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEADERPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.headerpssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETHEADERPSSYSPFPLUGIN);
		return this.headerpssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getHeaderPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定头部前端扩展插件");}
		return value;
	}

	public void setHeaderPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin headerpssyspfplugin){
		this.headerpssyspfplugin = headerpssyspfplugin;
	}


	public java.lang.String getItemType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTYPE);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图标资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTDATAJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogic testpsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogic(){
		if(this.testpsdelogic != null) return this.testpsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.testpsdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.testpsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getTestPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用判断处理逻辑");}
		return value;
	}

	public void setTestPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic testpsdelogic){
		this.testpsdelogic = testpsdelogic;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定判断输出实体操作标识");}
		return value;
	}

	public void setTestPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv testpsdeoppriv){
		this.testpsdeoppriv = testpsdeoppriv;
	}

	private net.ibizsys.model.security.IPSSysUniRes testpssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniRes(){
		if(this.testpssysunires != null) return this.testpssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.testpssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTESTPSSYSUNIRES);
		return this.testpssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getTestPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用统一资源");}
		return value;
	}

	public void setTestPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes testpssysunires){
		this.testpssysunires = testpssysunires;
	}


	public java.lang.String getTestScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity viewpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntity(){
		if(this.viewpsdataentity != null) return this.viewpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.viewpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETVIEWPSDATAENTITY);
		return this.viewpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getViewPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定视图相关实体");}
		return value;
	}

	public void setViewPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity viewpsdataentity){
		this.viewpsdataentity = viewpsdataentity;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getViewParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
}