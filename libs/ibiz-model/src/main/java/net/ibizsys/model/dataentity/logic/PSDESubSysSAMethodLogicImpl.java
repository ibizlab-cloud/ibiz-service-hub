package net.ibizsys.model.dataentity.logic;



public class PSDESubSysSAMethodLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESubSysSAMethodLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETPSSUBSYSSERVICEAPI = "getPSSubSysServiceAPI";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDE = "getPSSubSysServiceAPIDE";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD = "getPSSubSysServiceAPIDEMethod";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
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

	private net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi;

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI(){
		if(this.pssubsysserviceapi != null) return this.pssubsysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssubsysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSUBSYSSERVICEAPI);
		return this.pssubsysserviceapi;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPI value = this.getPSSubSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口");}
		return value;
	}

	public void setPSSubSysServiceAPI(net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi){
		this.pssubsysserviceapi = pssubsysserviceapi;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDE pssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE(){
		if(this.pssubsysserviceapide != null) return this.pssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = this.getPSSubSysServiceAPIMust();
		this.pssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.pssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口实体");}
		return value;
	}

	public void setPSSubSysServiceAPIDE(net.ibizsys.model.service.IPSSubSysServiceAPIDE pssubsysserviceapide){
		this.pssubsysserviceapide = pssubsysserviceapide;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(){
		if(this.pssubsysserviceapidemethod != null) return this.pssubsysserviceapidemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPIDE ipssubsysserviceapide = this.getPSSubSysServiceAPIDEMust();
		this.pssubsysserviceapidemethod = ipssubsysserviceapide.getPSSubSysServiceAPIDEMethod(value, false);
		return this.pssubsysserviceapidemethod;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod value = this.getPSSubSysServiceAPIDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口方法");}
		return value;
	}

	public void setPSSubSysServiceAPIDEMethod(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod){
		this.pssubsysserviceapidemethod = pssubsysserviceapidemethod;
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