package net.ibizsys.model.bi;



public class PSSysBICubeImpl extends net.ibizsys.model.bi.PSSysBISchemeObjectImpl implements net.ibizsys.model.bi.IPSSysBICube{

	public final static String ATTR_GETALLPSSYSBICUBEDIMENSIONS = "getAllPSSysBICubeDimensions";
	public final static String ATTR_GETALLPSSYSBICUBEMEASURES = "getAllPSSysBICubeMeasures";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUBEOPTION = "cubeOption";
	public final static String ATTR_GETCUBETAG = "cubeTag";
	public final static String ATTR_GETCUBETAG2 = "cubeTag2";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETTYPEPSDEFIELD = "getTypePSDEField";

	private java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> allpssysbicubedimensions = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> getAllPSSysBICubeDimensions(){
		if(this.allpssysbicubedimensions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBICUBEDIMENSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBICubeDimension>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBICubeDimension obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeDimension.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBICUBEDIMENSIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbicubedimensions = list;
		}
		return (this.allpssysbicubedimensions.size() == 0)? null : this.allpssysbicubedimensions;
	}

	public net.ibizsys.model.bi.IPSSysBICubeDimension getPSSysBICubeDimension(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeDimension.class, this.getAllPSSysBICubeDimensions(), objKey, bTryMode);
	}
	public void setPSSysBICubeDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBICubeDimension> list){
		this.allpssysbicubedimensions = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> allpssysbicubemeasures = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> getAllPSSysBICubeMeasures(){
		if(this.allpssysbicubemeasures == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBICUBEMEASURES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBICubeMeasure>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBICubeMeasure obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeMeasure.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBICUBEMEASURES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbicubemeasures = list;
		}
		return (this.allpssysbicubemeasures.size() == 0)? null : this.allpssysbicubemeasures;
	}

	public net.ibizsys.model.bi.IPSSysBICubeMeasure getPSSysBICubeMeasure(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBICubeMeasure.class, this.getAllPSSysBICubeMeasures(), objKey, bTryMode);
	}
	public void setPSSysBICubeMeasures(java.util.List<net.ibizsys.model.bi.IPSSysBICubeMeasure> list){
		this.allpssysbicubemeasures = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCubeOption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUBEOPTION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCubeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUBETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCubeTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUBETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.keypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定键值存储属性");}
		return value;
	}

	public void setKeyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield){
		this.keypsdefield = keypsdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据集");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定权限统一资源对象");}
		return value;
	}

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField typepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEField(){
		if(this.typepsdefield != null) return this.typepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.typepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.typepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定类型存储属性");}
		return value;
	}

	public void setTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField typepsdefield){
		this.typepsdefield = typepsdefield;
	}

}