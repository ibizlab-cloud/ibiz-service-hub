package net.ibizsys.model.app.dataentity;



public class PSAppDERSImpl2 extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDERS
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACTIONRSMODE = "actionRSMode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDATARSMODE = "dataRSMode";
	public final static String ATTR_GETMAJORDECODENAME = "majorDECodeName";
	public final static String ATTR_GETMAJORDECODENAME2 = "majorDECodeName2";
	public final static String ATTR_GETMAJORDENAME = "majorDEName";
	public final static String ATTR_GETMAJORPSAPPDATAENTITY = "getMajorPSAppDataEntity";
	public final static String ATTR_GETMINORDECODENAME = "minorDECodeName";
	public final static String ATTR_GETMINORDECODENAME2 = "minorDECodeName2";
	public final static String ATTR_GETMINORDENAME = "minorDEName";
	public final static String ATTR_GETMINORPSAPPDATAENTITY = "getMinorPSAppDataEntity";
	public final static String ATTR_GETNESTEDPSAPPDEDATASET = "getNestedPSAppDEDataSet";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPARENTFILTER = "parentFilter";
	public final static String ATTR_GETPARENTPSAPPDEFIELD = "getParentPSAppDEField";
	public final static String ATTR_GETPARENTTEXTPSAPPDEFIELD = "getParentTextPSAppDEField";
	public final static String ATTR_GETRRMLANRESTAG = "rRMLanResTag";
	public final static String ATTR_GETRSMODE = "rSMode";
	public final static String ATTR_GETRSTYPE = "rSType";
	public final static String ATTR_GETREMOVEACTIONTYPE = "removeActionType";
	public final static String ATTR_GETREMOVEORDER = "removeOrder";
	public final static String ATTR_GETREMOVEREJECTMSG = "removeRejectMsg";
	public final static String ATTR_GETTEMPDATAORDER = "tempDataOrder";
	public final static String ATTR_ISARRAY = "array";
	public final static String ATTR_ISENABLECREATEDATARS = "enableCreateDataRS";
	public final static String ATTR_ISENABLEGETDATARS = "enableGetDataRS";
	public final static String ATTR_ISENABLESELECTDATARS = "enableSelectDataRS";
	public final static String ATTR_ISENABLEUPDATEDATARS = "enableUpdateDataRS";
	public final static String ATTR_ISMAJORDEMAJOR = "majorDEMajor";

	public int getActionRSMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONRSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDataRSMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATARSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMajorDECodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORDECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMajorDECodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORDECODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMajorDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity majorpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getMajorPSAppDataEntity(){
		if(this.majorpsappdataentity != null) return this.majorpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.majorpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAJORPSAPPDATAENTITY);
		return this.majorpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getMajorPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getMajorPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主应用实体对象");}
		return value;
	}

	public void setMajorPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity majorpsappdataentity){
		this.majorpsappdataentity = majorpsappdataentity;
	}


	public java.lang.String getMinorDECodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORDECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorDECodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORDECODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity minorpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getMinorPSAppDataEntity(){
		if(this.minorpsappdataentity != null) return this.minorpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.minorpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORPSAPPDATAENTITY);
		return this.minorpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getMinorPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getMinorPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从应用实体对象");}
		return value;
	}

	public void setMinorPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity minorpsappdataentity){
		this.minorpsappdataentity = minorpsappdataentity;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet nestedpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getNestedPSAppDEDataSet(){
		if(this.nestedpsappdedataset != null) return this.nestedpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNESTEDPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.nestedpsappdedataset = this.getMinorPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.nestedpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getNestedPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getNestedPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套数据结果集");}
		return value;
	}

	public void setNestedPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet nestedpsappdedataset){
		this.nestedpsappdedataset = nestedpsappdedataset;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getParentFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField parentpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEField(){
		if(this.parentpsappdefield != null) return this.parentpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.parentpsappdefield = this.getMinorPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.parentpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getParentPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父关系连接属性");}
		return value;
	}

	public void setParentPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField parentpsappdefield){
		this.parentpsappdefield = parentpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField parenttextpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentTextPSAppDEField(){
		if(this.parenttextpsappdefield != null) return this.parenttextpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.parenttextpsappdefield = this.getMinorPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.parenttextpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getParentTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getParentTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父关系连接文本属性");}
		return value;
	}

	public void setParentTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField parenttextpsappdefield){
		this.parenttextpsappdefield = parenttextpsappdefield;
	}


	public java.lang.String getRRMLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRRMLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRSMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getRSType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRemoveActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEACTIONTYPE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getRemoveOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEORDER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getRemoveRejectMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEREJECTMSG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTempDataOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPDATAORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnableCreateDataRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECREATEDATARS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableGetDataRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGETDATARS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSelectDataRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESELECTDATARS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUpdateDataRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUPDATEDATARS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajorDEMajor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJORDEMAJOR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}