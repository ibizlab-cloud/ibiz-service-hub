package net.ibizsys.model.dataentity.logic;



public class PSDERawSqlAndLoopCallLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDERawSqlAndLoopCallLogic{

	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETPSSYSDBSCHEME = "getPSSysDBScheme";
	public final static String ATTR_GETSQL = "sql";
	public final static String ATTR_GETSRCPSDELOGICPARAM = "getSrcPSDELogicParam";
	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsdeaction = getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDEACTION);
		return this.dstpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getDstPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体行为对象");}
		return value;
	}

	public void setDstPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction){
		this.dstpsdeaction = dstpsdeaction;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity(){
		if(this.dstpsdataentity != null) return this.dstpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDATAENTITY);
		return this.dstpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体对象");}
		return value;
	}

	public void setDstPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity){
		this.dstpsdataentity = dstpsdataentity;
	}

	private net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme;

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(){
		if(this.pssysdbscheme != null) return this.pssysdbscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBSCHEME);
		if(value == null){
			return null;
		}
		this.pssysdbscheme = getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDBSCHEME);
		return this.pssysdbscheme;
	}

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust(){
		net.ibizsys.model.database.IPSSysDBScheme value = this.getPSSysDBScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据库体系");}
		return value;
	}

	public void setPSSysDBScheme(net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme){
		this.pssysdbscheme = pssysdbscheme;
	}


	public java.lang.String getSql(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSQL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam(){
		if(this.srcpsdelogicparam != null) return this.srcpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.srcpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.srcpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getSrcPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加源参数对象");}
		return value;
	}

	public void setSrcPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam){
		this.srcpsdelogicparam = srcpsdelogicparam;
	}

}