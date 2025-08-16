package net.ibizsys.model.dataentity.logic;



public class PSDEUserLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUserLogic{

	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETDSTPSDEDATAQUERY = "getDstPSDEDataQuery";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDELOGIC = "getDstPSDELogic";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETPARAM1 = "param1";
	public final static String ATTR_GETPARAM10 = "param10";
	public final static String ATTR_GETPARAM11 = "param11";
	public final static String ATTR_GETPARAM12 = "param12";
	public final static String ATTR_GETPARAM13 = "param13";
	public final static String ATTR_GETPARAM14 = "param14";
	public final static String ATTR_GETPARAM2 = "param2";
	public final static String ATTR_GETPARAM3 = "param3";
	public final static String ATTR_GETPARAM4 = "param4";
	public final static String ATTR_GETPARAM5 = "param5";
	public final static String ATTR_GETPARAM6 = "param6";
	public final static String ATTR_GETPARAM7 = "param7";
	public final static String ATTR_GETPARAM8 = "param8";
	public final static String ATTR_GETPARAM9 = "param9";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsdeaction = this.getDstPSDataEntityMust().getPSDEAction(value, false);
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

	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery(){
		if(this.dstpsdedataquery != null) return this.dstpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		this.dstpsdedataquery = this.getDstPSDataEntityMust().getPSDEDataQuery(value, false);
		return this.dstpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getDstPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据查询");}
		return value;
	}

	public void setDstPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery dstpsdedataquery){
		this.dstpsdedataquery = dstpsdedataquery;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsdedataset = this.getDstPSDataEntityMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集对象");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic(){
		if(this.dstpsdelogic != null) return this.dstpsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGIC);
		if(value == null){
			return null;
		}
		this.dstpsdelogic = this.getDstPSDataEntityMust().getPSDELogic(value, false);
		return this.dstpsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getDstPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体逻辑对象");}
		return value;
	}

	public void setDstPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic){
		this.dstpsdelogic = dstpsdelogic;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam(){
		if(this.dstpsdelogicparam != null) return this.dstpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.dstpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getDstPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
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


	public java.lang.String getParam1(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM1);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getParam10(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM10);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getParam11(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM11);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam12(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM12);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam13(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM13);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam14(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM14);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam5(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM5);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParam6(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM6);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getParam7(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM7);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getParam8(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM8);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getParam9(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAM9);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam(){
		if(this.retpsdelogicparam != null) return this.retpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.retpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.retpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getRetPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回值绑定逻辑参数对象");}
		return value;
	}

	public void setRetPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam){
		this.retpsdelogicparam = retpsdelogicparam;
	}

}