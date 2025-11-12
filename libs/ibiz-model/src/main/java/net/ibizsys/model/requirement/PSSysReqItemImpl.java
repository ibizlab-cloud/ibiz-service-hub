package net.ibizsys.model.requirement;



public class PSSysReqItemImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.requirement.IPSSysReqItem{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETITEMSN = "itemSN";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETPSSYSREQMODULE = "getPSSysReqModule";
	public final static String ATTR_GETPSSYSUSECASE = "getPSSysUseCase";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.requirement.IPSSysReqModule pssysreqmodule;

	public net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModule(){
		if(this.pssysreqmodule != null) return this.pssysreqmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSREQMODULE);
		if(value == null){
			return null;
		}
		this.pssysreqmodule = getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSREQMODULE);
		return this.pssysreqmodule;
	}

	public net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModuleMust(){
		net.ibizsys.model.requirement.IPSSysReqModule value = this.getPSSysReqModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定需求模块");}
		return value;
	}

	public void setPSSysReqModule(net.ibizsys.model.requirement.IPSSysReqModule pssysreqmodule){
		this.pssysreqmodule = pssysreqmodule;
	}

	private net.ibizsys.model.uml.IPSSysUseCase pssysusecase;

	public net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCase(){
		if(this.pssysusecase != null) return this.pssysusecase;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSECASE);
		if(value == null){
			return null;
		}
		this.pssysusecase = getPSModelObject(net.ibizsys.model.uml.IPSSysUseCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUSECASE);
		return this.pssysusecase;
	}

	public net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCaseMust(){
		net.ibizsys.model.uml.IPSSysUseCase value = this.getPSSysUseCase();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统用例");}
		return value;
	}

	public void setPSSysUseCase(net.ibizsys.model.uml.IPSSysUseCase pssysusecase){
		this.pssysusecase = pssysusecase;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}

}