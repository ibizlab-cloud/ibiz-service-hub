package net.ibizsys.model.dataentity.action;



public class PSDEActionGroupDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDETAILTYPE = "detailType";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";

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

	public java.lang.String getDetailType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.psdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体行为");}
		return value;
	}

	public void setPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction psdeaction){
		this.psdeaction = psdeaction;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

}