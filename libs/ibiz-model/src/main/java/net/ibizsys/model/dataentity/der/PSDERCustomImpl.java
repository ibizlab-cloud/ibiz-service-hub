package net.ibizsys.model.dataentity.der;



public class PSDERCustomImpl extends net.ibizsys.model.dataentity.der.PSDERBaseImpl implements net.ibizsys.model.dataentity.der.IPSDERCustom{

	public final static String ATTR_GETCLONEORDER = "cloneOrder";
	public final static String ATTR_GETCUSTOMEXPORTORDER = "customExportOrder";
	public final static String ATTR_GETCUSTOMEXPORTORDER2 = "customExportOrder2";
	public final static String ATTR_GETDERSUBTYPE = "dERSubType";
	public final static String ATTR_GETMASTERORDER = "masterOrder";
	public final static String ATTR_GETMASTERRS = "masterRS";
	public final static String ATTR_GETNESTEDPSDEDATASET = "getNestedPSDEDataSet";
	public final static String ATTR_GETONE2XDATAPSDEFIELD = "getOne2XDataPSDEField";
	public final static String ATTR_GETPARENTSUBTYPE = "parentSubType";
	public final static String ATTR_GETPARENTTYPE = "parentType";
	public final static String ATTR_GETPICKUPDEFNAME = "pickupDEFName";
	public final static String ATTR_GETPICKUPPSDEFIELD = "getPickupPSDEField";
	public final static String ATTR_GETPICKUPTEXTPSDEFIELD = "getPickupTextPSDEField";
	public final static String ATTR_GETRRMLANRESTAG = "rRMLanResTag";
	public final static String ATTR_GETRRMPSLANGUAGERES = "getRRMPSLanguageRes";
	public final static String ATTR_GETREFPSDEDATASET = "getRefPSDEDataSet";
	public final static String ATTR_GETREFPSDEFGROUP = "getRefPSDEFGroup";
	public final static String ATTR_GETREMOVEACTIONTYPE = "removeActionType";
	public final static String ATTR_GETREMOVEORDER = "removeOrder";
	public final static String ATTR_GETREMOVEREJECTMSG = "removeRejectMsg";
	public final static String ATTR_GETTYPEVALUE = "typeValue";
	public final static String ATTR_ISENABLEPHYSICALDEFIELDUPDATE = "enablePhysicalDEFieldUpdate";

	public int getCloneOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLONEORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCustomExportOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMEXPORTORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCustomExportOrder2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMEXPORTORDER2);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getDERSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERSUBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMasterOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASTERORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getMasterRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASTERRS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet nestedpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSet(){
		if(this.nestedpsdedataset != null) return this.nestedpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNESTEDPSDEDATASET);
		if(value == null){
			return null;
		}
		this.nestedpsdedataset = this.getMinorPSDataEntityMust().getPSDEDataSet(value, false);
		return this.nestedpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getNestedPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getNestedPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套成员数据集对象");}
		return value;
	}

	public void setNestedPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet nestedpsdedataset){
		this.nestedpsdedataset = nestedpsdedataset;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField one2xdatapsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getOne2XDataPSDEField(){
		if(this.one2xdatapsdefield != null) return this.one2xdatapsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETONE2XDATAPSDEFIELD);
		if(value == null){
			return null;
		}
		this.one2xdatapsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETONE2XDATAPSDEFIELD);
		return this.one2xdatapsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getOne2XDataPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getOne2XDataPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定一对多关系数据属性");}
		return value;
	}

	public void setOne2XDataPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField one2xdatapsdefield){
		this.one2xdatapsdefield = one2xdatapsdefield;
	}


	public java.lang.String getParentSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTSUBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPickupDEFName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPICKUPDEFNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField pickuppsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEField(){
		if(this.pickuppsdefield != null) return this.pickuppsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPICKUPPSDEFIELD);
		if(value == null){
			return null;
		}
		this.pickuppsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPICKUPPSDEFIELD);
		return this.pickuppsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPickupPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系属性");}
		return value;
	}

	public void setPickupPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField pickuppsdefield){
		this.pickuppsdefield = pickuppsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField pickuptextpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPickupTextPSDEField(){
		if(this.pickuptextpsdefield != null) return this.pickuptextpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPICKUPTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.pickuptextpsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPICKUPTEXTPSDEFIELD);
		return this.pickuptextpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPickupTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPickupTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系主信息属性");}
		return value;
	}

	public void setPickupTextPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField pickuptextpsdefield){
		this.pickuptextpsdefield = pickuptextpsdefield;
	}


	public java.lang.String getRRMLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRRMLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes rrmpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getRRMPSLanguageRes(){
		if(this.rrmpslanguageres != null) return this.rrmpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRRMPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.rrmpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETRRMPSLANGUAGERES);
		return this.rrmpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getRRMPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getRRMPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除拒绝消息语言资源");}
		return value;
	}

	public void setRRMPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes rrmpslanguageres){
		this.rrmpslanguageres = rrmpslanguageres;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet(){
		if(this.refpsdedataset != null) return this.refpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEDATASET);
		if(value == null){
			return null;
		}
		this.refpsdedataset = this.getMajorPSDataEntityMust().getPSDEDataSet(value, false);
		return this.refpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getRefPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体数据集");}
		return value;
	}

	public void setRefPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet refpsdedataset){
		this.refpsdedataset = refpsdedataset;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEFGroup refpsdefgroup;

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getRefPSDEFGroup(){
		if(this.refpsdefgroup != null) return this.refpsdefgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSDEFGROUP);
		if(value == null){
			return null;
		}
		this.refpsdefgroup = this.getMajorPSDataEntityMust().getPSDEFGroup(value, false);
		return this.refpsdefgroup;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getRefPSDEFGroupMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFGroup value = this.getRefPSDEFGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用实体属性组");}
		return value;
	}

	public void setRefPSDEFGroup(net.ibizsys.model.dataentity.defield.IPSDEFGroup refpsdefgroup){
		this.refpsdefgroup = refpsdefgroup;
	}


	public int getRemoveActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEACTIONTYPE);
		if(value == null){
			return 0;
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

	public java.lang.String getTypeValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnablePhysicalDEFieldUpdate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPHYSICALDEFIELDUPDATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}