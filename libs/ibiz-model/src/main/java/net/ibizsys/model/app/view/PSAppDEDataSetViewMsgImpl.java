package net.ibizsys.model.app.view;



public class PSAppDEDataSetViewMsgImpl extends net.ibizsys.model.app.view.PSAppViewMsgImpl implements net.ibizsys.model.app.view.IPSAppDEDataSetViewMsg{

	public final static String ATTR_GETCACHESCOPE = "cacheScope";
	public final static String ATTR_GETCACHETAG2PSAPPDEFIELD = "getCacheTag2PSAppDEField";
	public final static String ATTR_GETCACHETAGPSAPPDEFIELD = "getCacheTagPSAppDEField";
	public final static String ATTR_GETCACHETIMEOUT = "cacheTimeout";
	public final static String ATTR_GETCONTENTPSAPPDEFIELD = "getContentPSAppDEField";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCONTENTTYPEPSAPPDEFIELD = "getContentTypePSAppDEField";
	public final static String ATTR_GETMSGPOSPSAPPDEFIELD = "getMsgPosPSAppDEField";
	public final static String ATTR_GETMSGTYPEPSAPPDEFIELD = "getMsgTypePSAppDEField";
	public final static String ATTR_GETORDERVALUEPSAPPDEFIELD = "getOrderValuePSAppDEField";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETREMOVEFLAGPSAPPDEFIELD = "getRemoveFlagPSAppDEField";
	public final static String ATTR_GETTITLELANRESTAGPSAPPDEFIELD = "getTitleLanResTagPSAppDEField";
	public final static String ATTR_GETTITLEPSAPPDEFIELD = "getTitlePSAppDEField";
	public final static String ATTR_ISENABLECACHE = "enableCache";

	public java.lang.String getCacheScope(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHESCOPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField cachetag2psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTag2PSAppDEField(){
		if(this.cachetag2psappdefield != null) return this.cachetag2psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETAG2PSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.cachetag2psappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.cachetag2psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTag2PSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getCacheTag2PSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定缓存标记2应用实体属性对象");}
		return value;
	}

	public void setCacheTag2PSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField cachetag2psappdefield){
		this.cachetag2psappdefield = cachetag2psappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField cachetagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTagPSAppDEField(){
		if(this.cachetagpsappdefield != null) return this.cachetagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.cachetagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.cachetagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getCacheTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定缓存标记应用实体属性对象");}
		return value;
	}

	public void setCacheTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField cachetagpsappdefield){
		this.cachetagpsappdefield = cachetagpsappdefield;
	}


	public int getCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETIMEOUT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField(){
		if(this.contentpsappdefield != null) return this.contentpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.contentpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.contentpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getContentPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息内容应用实体属性对象");}
		return value;
	}

	public void setContentPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield){
		this.contentpsappdefield = contentpsappdefield;
	}


	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField contenttypepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentTypePSAppDEField(){
		if(this.contenttypepsappdefield != null) return this.contenttypepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.contenttypepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.contenttypepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getContentTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容类型应用实体属性对象");}
		return value;
	}

	public void setContentTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField contenttypepsappdefield){
		this.contenttypepsappdefield = contenttypepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField msgpospsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMsgPosPSAppDEField(){
		if(this.msgpospsappdefield != null) return this.msgpospsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGPOSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.msgpospsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.msgpospsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMsgPosPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMsgPosPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示位置应用实体属性对象");}
		return value;
	}

	public void setMsgPosPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField msgpospsappdefield){
		this.msgpospsappdefield = msgpospsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField msgtypepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMsgTypePSAppDEField(){
		if(this.msgtypepsappdefield != null) return this.msgtypepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.msgtypepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.msgtypepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMsgTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMsgTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息类型标记应用实体属性对象");}
		return value;
	}

	public void setMsgTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField msgtypepsappdefield){
		this.msgtypepsappdefield = msgtypepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField ordervaluepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField(){
		if(this.ordervaluepsappdefield != null) return this.ordervaluepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.ordervaluepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.ordervaluepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getOrderValuePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示次序应用实体属性对象");}
		return value;
	}

	public void setOrderValuePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField ordervaluepsappdefield){
		this.ordervaluepsappdefield = ordervaluepsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合对象");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
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

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField removeflagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getRemoveFlagPSAppDEField(){
		if(this.removeflagpsappdefield != null) return this.removeflagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEFLAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.removeflagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.removeflagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getRemoveFlagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getRemoveFlagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移除标志应用实体属性对象");}
		return value;
	}

	public void setRemoveFlagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField removeflagpsappdefield){
		this.removeflagpsappdefield = removeflagpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField titlelanrestagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTitleLanResTagPSAppDEField(){
		if(this.titlelanrestagpsappdefield != null) return this.titlelanrestagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLELANRESTAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.titlelanrestagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.titlelanrestagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTitleLanResTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTitleLanResTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言标记应用实体属性对象");}
		return value;
	}

	public void setTitleLanResTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField titlelanrestagpsappdefield){
		this.titlelanrestagpsappdefield = titlelanrestagpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField titlepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTitlePSAppDEField(){
		if(this.titlepsappdefield != null) return this.titlepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.titlepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.titlepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTitlePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTitlePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头应用实体属性对象");}
		return value;
	}

	public void setTitlePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField titlepsappdefield){
		this.titlepsappdefield = titlepsappdefield;
	}


	public boolean isEnableCache(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECACHE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}