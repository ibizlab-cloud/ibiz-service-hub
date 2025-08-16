package net.ibizsys.model.dataentity.mainstate;



public class PSDEMainStateRSImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.mainstate.IPSDEMainStateRS
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETNEXTPSDEMAINSTATE = "getNextPSDEMainState";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPREVPSDEMAINSTATE = "getPrevPSDEMainState";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState nextpsdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getNextPSDEMainState(){
		if(this.nextpsdemainstate != null) return this.nextpsdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.nextpsdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.nextpsdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getNextPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getNextPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定进入主状态");}
		return value;
	}

	public void setNextPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState nextpsdemainstate){
		this.nextpsdemainstate = nextpsdemainstate;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState prevpsdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainState(){
		if(this.prevpsdemainstate != null) return this.prevpsdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.prevpsdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.prevpsdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getPrevPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前序主状态");}
		return value;
	}

	public void setPrevPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState prevpsdemainstate){
		this.prevpsdemainstate = prevpsdemainstate;
	}

}