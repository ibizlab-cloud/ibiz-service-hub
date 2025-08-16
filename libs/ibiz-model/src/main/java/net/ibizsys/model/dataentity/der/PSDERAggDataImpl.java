package net.ibizsys.model.dataentity.der;



public class PSDERAggDataImpl extends net.ibizsys.model.dataentity.der.PSDERBaseImpl implements net.ibizsys.model.dataentity.der.IPSDERAggData{

	public final static String ATTR_GETPSDERAGGDATADEFIELDMAPS = "getPSDERAggDataDEFieldMaps";
	public final static String ATTR_GETSOURCEPSDEDATASET = "getSourcePSDEDataSet";

	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> psderaggdatadefieldmaps = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> getPSDERAggDataDEFieldMaps(){
		if(this.psderaggdatadefieldmaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDERAGGDATADEFIELDMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDERAGGDATADEFIELDMAPS);
				if(obj!=null)list.add(obj);
			}
			this.psderaggdatadefieldmaps = list;
		}
		return (this.psderaggdatadefieldmaps.size() == 0)? null : this.psderaggdatadefieldmaps;
	}

	public net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap.class, this.getPSDERAggDataDEFieldMaps(), objKey, bTryMode);
	}
	public void setPSDERAggDataDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap> list){
		this.psderaggdatadefieldmaps = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet sourcepsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSet(){
		if(this.sourcepsdedataset != null) return this.sourcepsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCEPSDEDATASET);
		if(value == null){
			return null;
		}
		this.sourcepsdedataset = this.getMinorPSDataEntityMust().getPSDEDataSet(value, false);
		return this.sourcepsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getSourcePSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源数据集对象");}
		return value;
	}

	public void setSourcePSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet sourcepsdedataset){
		this.sourcepsdedataset = sourcepsdedataset;
	}

}