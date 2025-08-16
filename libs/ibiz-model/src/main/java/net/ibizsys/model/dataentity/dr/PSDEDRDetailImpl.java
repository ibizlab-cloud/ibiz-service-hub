package net.ibizsys.model.dataentity.dr;



public class PSDEDRDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dr.IPSDEDRDetail{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETCOUNTERMODE = "counterMode";
	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETDETAILTAG = "detailTag";
	public final static String ATTR_GETDETAILTAG2 = "detailTag2";
	public final static String ATTR_GETDETAILTYPE = "detailType";
	public final static String ATTR_GETENABLEMODE = "enableMode";
	public final static String ATTR_GETHEADERPSSYSPFPLUGIN = "getHeaderPSSysPFPlugin";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETORIGINCAPTION = "originCaption";
	public final static String ATTR_GETPSDEDRITEM = "getPSDEDRItem";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETTESTPSDELOGIC = "getTestPSDELogic";
	public final static String ATTR_GETTESTPSDEOPPRIV = "getTestPSDEOPPriv";
	public final static String ATTR_GETTESTPSSYSUNIRES = "getTestPSSysUniRes";
	public final static String ATTR_GETTESTSCRIPTCODE = "testScriptCode";
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


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
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

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
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


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	public java.lang.String getOriginCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORIGINCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.dr.IPSDEDRItem psdedritem;

	public net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItem(){
		if(this.psdedritem != null) return this.psdedritem;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRITEM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedritem = ipsdataentity.getPSDEDRItem(value, false);
		return this.psdedritem;
	}

	public net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItemMust(){
		net.ibizsys.model.dataentity.dr.IPSDEDRItem value = this.getPSDEDRItem();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系界面项");}
		return value;
	}

	public void setPSDEDRItem(net.ibizsys.model.dataentity.dr.IPSDEDRItem psdedritem){
		this.psdedritem = psdedritem;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员图标资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
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
}