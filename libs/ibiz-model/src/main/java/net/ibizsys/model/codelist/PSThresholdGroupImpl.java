package net.ibizsys.model.codelist;



public class PSThresholdGroupImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.codelist.IPSThresholdGroup{

	public final static String ATTR_GETBEGINVALUEPSDEFIELD = "getBeginValuePSDEField";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATAPSDEFIELD = "getDataPSDEField";
	public final static String ATTR_GETENDVALUEPSDEFIELD = "getEndValuePSDEField";
	public final static String ATTR_GETICONCLSPSDEFIELD = "getIconClsPSDEField";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSTHRESHOLDS = "getPSThresholds";
	public final static String ATTR_GETTEXTPSDEFIELD = "getTextPSDEField";
	public final static String ATTR_GETTHRESHOLDGROUPTAG = "thresholdGroupTag";
	public final static String ATTR_GETTHRESHOLDGROUPTAG2 = "thresholdGroupTag2";
	public final static String ATTR_GETTHRESHOLDGROUPTYPE = "thresholdGroupType";
	private net.ibizsys.model.dataentity.defield.IPSDEField beginvaluepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEField(){
		if(this.beginvaluepsdefield != null) return this.beginvaluepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.beginvaluepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.beginvaluepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getBeginValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始值存储属性");}
		return value;
	}

	public void setBeginValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField beginvaluepsdefield){
		this.beginvaluepsdefield = beginvaluepsdefield;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField datapsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEField(){
		if(this.datapsdefield != null) return this.datapsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.datapsdefield = ipsdataentity.getPSDEField(value, false);
		return this.datapsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDataPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定阈值数据存储属性");}
		return value;
	}

	public void setDataPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField datapsdefield){
		this.datapsdefield = datapsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField endvaluepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEField(){
		if(this.endvaluepsdefield != null) return this.endvaluepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.endvaluepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.endvaluepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEndValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定结束值存储属性");}
		return value;
	}

	public void setEndValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField endvaluepsdefield){
		this.endvaluepsdefield = endvaluepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField iconclspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField(){
		if(this.iconclspsdefield != null) return this.iconclspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.iconclspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.iconclspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIconClsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标样式值存储属性");}
		return value;
	}

	public void setIconClsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField iconclspsdefield){
		this.iconclspsdefield = iconclspsdefield;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据集对象");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}


	private java.util.List<net.ibizsys.model.codelist.IPSThreshold> psthresholds = null;
	public java.util.List<net.ibizsys.model.codelist.IPSThreshold> getPSThresholds(){
		if(this.psthresholds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSTHRESHOLDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.codelist.IPSThreshold> list = new java.util.ArrayList<net.ibizsys.model.codelist.IPSThreshold>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.codelist.IPSThreshold obj = this.getPSModelObject(net.ibizsys.model.codelist.IPSThreshold.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSTHRESHOLDS);
				if(obj!=null)list.add(obj);
			}
			this.psthresholds = list;
		}
		return (this.psthresholds.size() == 0)? null : this.psthresholds;
	}

	public net.ibizsys.model.codelist.IPSThreshold getPSThreshold(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.codelist.IPSThreshold.class, this.getPSThresholds(), objKey, bTryMode);
	}
	public void setPSThresholds(java.util.List<net.ibizsys.model.codelist.IPSThreshold> list){
		this.psthresholds = list;
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField(){
		if(this.textpsdefield != null) return this.textpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.textpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.textpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本值存储属性");}
		return value;
	}

	public void setTextPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield){
		this.textpsdefield = textpsdefield;
	}


	public java.lang.String getThresholdGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHRESHOLDGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThresholdGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHRESHOLDGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThresholdGroupType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHRESHOLDGROUPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}