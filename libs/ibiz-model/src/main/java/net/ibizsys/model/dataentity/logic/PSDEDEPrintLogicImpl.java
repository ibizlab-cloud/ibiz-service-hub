package net.ibizsys.model.dataentity.logic;



public class PSDEDEPrintLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEDEPrintLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDEPRINT = "getDstPSDEPrint";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETOSPSDELOGICPARAM = "getOSPSDELogicParam";
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

	private net.ibizsys.model.dataentity.print.IPSDEPrint dstpsdeprint;

	public net.ibizsys.model.dataentity.print.IPSDEPrint getDstPSDEPrint(){
		if(this.dstpsdeprint != null) return this.dstpsdeprint;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEPRINT);
		if(value == null){
			return null;
		}
		this.dstpsdeprint = this.getDstPSDataEntityMust().getPSDEPrint(value, false);
		return this.dstpsdeprint;
	}

	public net.ibizsys.model.dataentity.print.IPSDEPrint getDstPSDEPrintMust(){
		net.ibizsys.model.dataentity.print.IPSDEPrint value = this.getDstPSDEPrint();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体打印对象");}
		return value;
	}

	public void setDstPSDEPrint(net.ibizsys.model.dataentity.print.IPSDEPrint dstpsdeprint){
		this.dstpsdeprint = dstpsdeprint;
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

	private net.ibizsys.model.dataentity.logic.IPSDELogicParam ospsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getOSPSDELogicParam(){
		if(this.ospsdelogicparam != null) return this.ospsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOSPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.ospsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.ospsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getOSPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getOSPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出流逻辑参数对象");}
		return value;
	}

	public void setOSPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam ospsdelogicparam){
		this.ospsdelogicparam = ospsdelogicparam;
	}

}