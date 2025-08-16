package net.ibizsys.model.dataentity.der;



public class PSDER1NImpl extends net.ibizsys.model.dataentity.der.PSDERBaseImpl implements net.ibizsys.model.dataentity.der.IPSDER1N{

	public final static String ATTR_GETCLONEORDER = "cloneOrder";
	public final static String ATTR_GETCUSTOMEXPORTORDER = "customExportOrder";
	public final static String ATTR_GETCUSTOMEXPORTORDER2 = "customExportOrder2";
	public final static String ATTR_GETERMAJORPSDEF = "getERMajorPSDEF";
	public final static String ATTR_GETERMINORPSDEF = "getERMinorPSDEF";
	public final static String ATTR_GETEXPORTMAJORMODEL = "exportMajorModel";
	public final static String ATTR_GETFKEYNAME = "fKeyName";
	public final static String ATTR_GETMAJORPPSDER1N = "getMajorPPSDER1N";
	public final static String ATTR_GETMASTERORDER = "masterOrder";
	public final static String ATTR_GETMASTERRS = "masterRS";
	public final static String ATTR_GETMINORPPSDER1N = "getMinorPPSDER1N";
	public final static String ATTR_GETNESTEDPSDEDATASET = "getNestedPSDEDataSet";
	public final static String ATTR_GETPSDER1NDEFIELDMAPS = "getPSDER1NDEFieldMaps";
	public final static String ATTR_GETPSONE2MANYDATADEFIELD = "getPSOne2ManyDataDEField";
	public final static String ATTR_GETPSPICKUPDEFIELD = "getPSPickupDEField";
	public final static String ATTR_GETPSPICKUPTEXTDEFIELD = "getPSPickupTextDEField";
	public final static String ATTR_GETPICKUPDEFNAME = "pickupDEFName";
	public final static String ATTR_GETPICKUPPSDEFIELD = "getPickupPSDEField";
	public final static String ATTR_GETRRMLANRESTAG = "rRMLanResTag";
	public final static String ATTR_GETRRMPSLANGUAGERES = "getRRMPSLanguageRes";
	public final static String ATTR_GETREFPSDEDATASET = "getRefPSDEDataSet";
	public final static String ATTR_GETREMOVEACTIONTYPE = "removeActionType";
	public final static String ATTR_GETREMOVEORDER = "removeOrder";
	public final static String ATTR_GETREMOVEREJECTMSG = "removeRejectMsg";
	public final static String ATTR_GETSYNCDATAMODE = "syncDataMode";
	public final static String ATTR_GETTEMPDATAORDER = "tempDataOrder";
	public final static String ATTR_ISCLONERS = "cloneRS";
	public final static String ATTR_ISENABLEDEFIELDWRITEBACK = "enableDEFieldWriteBack";
	public final static String ATTR_ISENABLEEXTRESTRICT = "enableExtRestrict";
	public final static String ATTR_ISENABLEFKEY = "enableFKey";
	public final static String ATTR_ISENABLEPDEREQ = "enablePDEREQ";
	public final static String ATTR_ISENABLEPHYSICALDEFIELDUPDATE = "enablePhysicalDEFieldUpdate";
	public final static String ATTR_ISNESTEDRS = "nestedRS";
	public final static String ATTR_ISRECURSIVERS = "recursiveRS";

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
	private net.ibizsys.model.dataentity.defield.IPSDEField ermajorpsdef;

	public net.ibizsys.model.dataentity.defield.IPSDEField getERMajorPSDEF(){
		if(this.ermajorpsdef != null) return this.ermajorpsdef;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERMAJORPSDEF);
		if(value == null){
			return null;
		}
		this.ermajorpsdef = this.getMajorPSDataEntityMust().getPSDEField(value, false);
		return this.ermajorpsdef;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getERMajorPSDEFMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getERMajorPSDEF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加约束主属性");}
		return value;
	}

	public void setERMajorPSDEF(net.ibizsys.model.dataentity.defield.IPSDEField ermajorpsdef){
		this.ermajorpsdef = ermajorpsdef;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField erminorpsdef;

	public net.ibizsys.model.dataentity.defield.IPSDEField getERMinorPSDEF(){
		if(this.erminorpsdef != null) return this.erminorpsdef;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERMINORPSDEF);
		if(value == null){
			return null;
		}
		this.erminorpsdef = this.getMinorPSDataEntityMust().getPSDEField(value, false);
		return this.erminorpsdef;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getERMinorPSDEFMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getERMinorPSDEF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加约束从属性");}
		return value;
	}

	public void setERMinorPSDEF(net.ibizsys.model.dataentity.defield.IPSDEField erminorpsdef){
		this.erminorpsdef = erminorpsdef;
	}


	public int getExportMajorModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPORTMAJORMODEL);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getFKeyName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFKEYNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDER1N majorppsder1n;

	public net.ibizsys.model.dataentity.der.IPSDER1N getMajorPPSDER1N(){
		if(this.majorppsder1n != null) return this.majorppsder1n;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPPSDER1N);
		if(value == null){
			return null;
		}
		this.majorppsder1n = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAJORPPSDER1N);
		return this.majorppsder1n;
	}

	public net.ibizsys.model.dataentity.der.IPSDER1N getMajorPPSDER1NMust(){
		net.ibizsys.model.dataentity.der.IPSDER1N value = this.getMajorPPSDER1N();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体父关系");}
		return value;
	}

	public void setMajorPPSDER1N(net.ibizsys.model.dataentity.der.IPSDER1N majorppsder1n){
		this.majorppsder1n = majorppsder1n;
	}


	public int getMasterOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASTERORDER);
		if(value == null){
			return 0;
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
	private net.ibizsys.model.dataentity.der.IPSDER1N minorppsder1n;

	public net.ibizsys.model.dataentity.der.IPSDER1N getMinorPPSDER1N(){
		if(this.minorppsder1n != null) return this.minorppsder1n;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPPSDER1N);
		if(value == null){
			return null;
		}
		this.minorppsder1n = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORPPSDER1N);
		return this.minorppsder1n;
	}

	public net.ibizsys.model.dataentity.der.IPSDER1N getMinorPPSDER1NMust(){
		net.ibizsys.model.dataentity.der.IPSDER1N value = this.getMinorPPSDER1N();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从实体父关系");}
		return value;
	}

	public void setMinorPPSDER1N(net.ibizsys.model.dataentity.der.IPSDER1N minorppsder1n){
		this.minorppsder1n = minorppsder1n;
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


	private java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> psder1ndefieldmaps = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> getPSDER1NDEFieldMaps(){
		if(this.psder1ndefieldmaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER1NDEFIELDMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDER1NDEFIELDMAPS);
				if(obj!=null)list.add(obj);
			}
			this.psder1ndefieldmaps = list;
		}
		return (this.psder1ndefieldmaps.size() == 0)? null : this.psder1ndefieldmaps;
	}

	public net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap getPSDER1NDEFieldMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap.class, this.getPSDER1NDEFieldMaps(), objKey, bTryMode);
	}
	public void setPSDER1NDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap> list){
		this.psder1ndefieldmaps = list;
	}
	private net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField psone2manydatadefield;

	public net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField getPSOne2ManyDataDEField(){
		if(this.psone2manydatadefield != null) return this.psone2manydatadefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSONE2MANYDATADEFIELD);
		if(value == null){
			return null;
		}
		this.psone2manydatadefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSONE2MANYDATADEFIELD);
		return this.psone2manydatadefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField getPSOne2ManyDataDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField value = this.getPSOne2ManyDataDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定一对多关系数据属性");}
		return value;
	}

	public void setPSOne2ManyDataDEField(net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField psone2manydatadefield){
		this.psone2manydatadefield = psone2manydatadefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSPickupDEField pspickupdefield;

	public net.ibizsys.model.dataentity.defield.IPSPickupDEField getPSPickupDEField(){
		if(this.pspickupdefield != null) return this.pspickupdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPICKUPDEFIELD);
		if(value == null){
			return null;
		}
		this.pspickupdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSPickupDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSPICKUPDEFIELD);
		return this.pspickupdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSPickupDEField getPSPickupDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSPickupDEField value = this.getPSPickupDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外键属性");}
		return value;
	}

	public void setPSPickupDEField(net.ibizsys.model.dataentity.defield.IPSPickupDEField pspickupdefield){
		this.pspickupdefield = pspickupdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSLinkDEField pspickuptextdefield;

	public net.ibizsys.model.dataentity.defield.IPSLinkDEField getPSPickupTextDEField(){
		if(this.pspickuptextdefield != null) return this.pspickuptextdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPICKUPTEXTDEFIELD);
		if(value == null){
			return null;
		}
		this.pspickuptextdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSLinkDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSPICKUPTEXTDEFIELD);
		return this.pspickuptextdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSLinkDEField getPSPickupTextDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSLinkDEField value = this.getPSPickupTextDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外键文本属性");}
		return value;
	}

	public void setPSPickupTextDEField(net.ibizsys.model.dataentity.defield.IPSLinkDEField pspickuptextdefield){
		this.pspickuptextdefield = pspickuptextdefield;
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
		return this.getPSPickupDEField();
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPickupPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPickupPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外键属性");}
		return value;
	}

	public void setPickupPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField pickuppsdefield){
		this.pickuppsdefield = pickuppsdefield;
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

	public int getSyncDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYNCDATAMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getTempDataOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPDATAORDER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public boolean isCloneRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLONERS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDEFieldWriteBack(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDEFIELDWRITEBACK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableExtRestrict(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEXTRESTRICT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePDEREQ(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPDEREQ);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePhysicalDEFieldUpdate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPHYSICALDEFIELDUPDATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNestedRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNESTEDRS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRecursiveRS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRECURSIVERS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}