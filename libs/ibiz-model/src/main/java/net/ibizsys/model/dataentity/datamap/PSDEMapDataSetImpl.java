package net.ibizsys.model.dataentity.datamap;



public class PSDEMapDataSetImpl extends net.ibizsys.model.dataentity.datamap.PSDEMapObjectImpl implements net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet
		,net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet{

	public final static String ATTR_GETDSTPSAPPDEDATASET = "getDstPSAppDEDataSet";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETMAPMODE = "mapMode";
	public final static String ATTR_GETMAPPARAMS = "mapParams";
	public final static String ATTR_GETSRCPSAPPDEDATASET = "getSrcPSAppDEDataSet";
	public final static String ATTR_GETSRCPSDEDATASET = "getSrcPSDEDataSet";
	public final static String ATTR_ISENABLEDQCOND = "enableDQCond";
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet dstpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSet(){
		if(this.dstpsappdedataset != null) return this.dstpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDEMap ipsappdemap = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMap.class);
		this.dstpsappdedataset = ipsappdemap.getDstPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.dstpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getDstPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用实体数据集");}
		return value;
	}

	public void setDstPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet dstpsappdedataset){
		this.dstpsappdedataset = dstpsappdedataset;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.datamap.IPSDEMap ipsdemap = getParentPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class);
		this.dstpsdedataset = ipsdemap.getDstPSDEMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集合");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
	}


	public java.lang.String getMapMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPMODE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getMapParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet srcpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getSrcPSAppDEDataSet(){
		if(this.srcpsappdedataset != null) return this.srcpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.srcpsappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.srcpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getSrcPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getSrcPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源应用实体数据集");}
		return value;
	}

	public void setSrcPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet srcpsappdedataset){
		this.srcpsappdedataset = srcpsappdedataset;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet srcpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSrcPSDEDataSet(){
		if(this.srcpsdedataset != null) return this.srcpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.srcpsdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.srcpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSrcPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getSrcPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源实体数据集合");}
		return value;
	}

	public void setSrcPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet srcpsdedataset){
		this.srcpsdedataset = srcpsdedataset;
	}


	public boolean isEnableDQCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDQCOND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}