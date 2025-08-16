package net.ibizsys.model.dataentity.action;



public class PSDESelectByKeyActionImpl extends net.ibizsys.model.dataentity.action.PSDEActionImplBase implements net.ibizsys.model.dataentity.action.IPSDESelectByKeyAction{

	public final static String ATTR_GETACTIONHOLDER = "actionHolder";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";

	public int getActionHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONHOLDER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(){
		if(this.psdedataquery != null) return this.psdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataquery = ipsdataentity.getPSDEDataQuery(value, false);
		return this.psdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据查询");}
		return value;
	}

	public void setPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery){
		this.psdedataquery = psdedataquery;
	}

}