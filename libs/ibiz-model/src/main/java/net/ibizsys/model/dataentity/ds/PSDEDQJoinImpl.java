package net.ibizsys.model.dataentity.ds;



public class PSDEDQJoinImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQJoin{

	public final static String ATTR_GETALIAS = "alias";
	public final static String ATTR_GETCHILDPSDEDQJOINS = "getChildPSDEDQJoins";
	public final static String ATTR_GETDERPSDATAENTITY = "getDERPSDataEntity";
	public final static String ATTR_GETJOINPSDER = "getJoinPSDER";
	public final static String ATTR_GETJOINPSDATAENTITY = "getJoinPSDataEntity";
	public final static String ATTR_GETJOINTAG = "joinTag";
	public final static String ATTR_GETJOINTAG2 = "joinTag2";
	public final static String ATTR_GETJOINTYPE = "joinType";
	public final static String ATTR_GETPSDEDQGROUPCONDITION = "getPSDEDQGroupCondition";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";
	public final static String ATTR_GETSELECTEDPSDEDQCOLUMNS = "getSelectedPSDEDQColumns";

	public java.lang.String getAlias(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIAS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> childpsdedqjoins = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> getChildPSDEDQJoins(){
		if(this.childpsdedqjoins == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDPSDEDQJOINS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQJoin>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQJoin obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQJoin.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETCHILDPSDEDQJOINS);
				if(obj!=null)list.add(obj);
			}
			this.childpsdedqjoins = list;
		}
		return (this.childpsdedqjoins.size() == 0)? null : this.childpsdedqjoins;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQJoin getChildPSDEDQJoin(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQJoin.class, this.getChildPSDEDQJoins(), objKey, bTryMode);
	}
	
	public void setChildPSDEDQJoins(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQJoin> list){
		this.childpsdedqjoins = list;
	}
	private net.ibizsys.model.dataentity.IPSDataEntity derpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDERPSDataEntity(){
		if(this.derpsdataentity != null) return this.derpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.derpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDERPSDATAENTITY);
		return this.derpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDERPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDERPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接关系所在实体");}
		return value;
	}

	public void setDERPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity derpsdataentity){
		this.derpsdataentity = derpsdataentity;
	}

	private net.ibizsys.model.dataentity.der.IPSDERBase joinpsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getJoinPSDER(){
		if(this.joinpsder != null) return this.joinpsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINPSDER);
		if(value == null){
			return null;
		}
		this.joinpsder = this.getDERPSDataEntityMust().getMinorPSDERBase(value, false);
		return this.joinpsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getJoinPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getJoinPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接实体关系");}
		return value;
	}

	public void setJoinPSDER(net.ibizsys.model.dataentity.der.IPSDERBase joinpsder){
		this.joinpsder = joinpsder;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity joinpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getJoinPSDataEntity(){
		if(this.joinpsdataentity != null) return this.joinpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.joinpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETJOINPSDATAENTITY);
		return this.joinpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getJoinPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getJoinPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接实体对象");}
		return value;
	}

	public void setJoinPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity joinpsdataentity){
		this.joinpsdataentity = joinpsdataentity;
	}


	public java.lang.String getJoinTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getJoinTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getJoinType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition psdedqgroupcondition;

	public net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupCondition(){
		if(this.psdedqgroupcondition != null) return this.psdedqgroupcondition;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDQGROUPCONDITION);
		if(value == null){
			return null;
		}
		this.psdedqgroupcondition = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDQGROUPCONDITION);
		return this.psdedqgroupcondition;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupConditionMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition value = this.getPSDEDQGroupCondition();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定查询条件对象");}
		return value;
	}

	public void setPSDEDQGroupCondition(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition psdedqgroupcondition){
		this.psdedqgroupcondition = psdedqgroupcondition;
	}


	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(){
		return getParentPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class);
		
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定所属实体数据查询对象");}
		return value;
	}


	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> selectedpsdedqcolumns = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> getSelectedPSDEDQColumns(){
		if(this.selectedpsdedqcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSELECTEDPSDEDQCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQColumn obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETSELECTEDPSDEDQCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.selectedpsdedqcolumns = list;
		}
		return (this.selectedpsdedqcolumns.size() == 0)? null : this.selectedpsdedqcolumns;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQColumn getSelectedPSDEDQColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQColumn.class, this.getSelectedPSDEDQColumns(), objKey, bTryMode);
	}
	
	public void setSelectedPSDEDQColumns(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQColumn> list){
		this.selectedpsdedqcolumns = list;
	}
}