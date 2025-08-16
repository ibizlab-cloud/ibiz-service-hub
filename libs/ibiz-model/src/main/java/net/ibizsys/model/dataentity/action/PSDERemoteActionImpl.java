package net.ibizsys.model.dataentity.action;



public class PSDERemoteActionImpl extends net.ibizsys.model.dataentity.action.PSDEActionImplBase implements net.ibizsys.model.dataentity.action.IPSDERemoteAction{

	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD = "getPSSubSysServiceAPIDEMethod";
	private net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(){
		if(this.pssubsysserviceapidemethod != null) return this.pssubsysserviceapidemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.pssubsysserviceapidemethod = ipsdataentity.getPSSubSysServiceAPIDEMust().getPSSubSysServiceAPIDEMethod(value, false);
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

}