package net.ibizsys.model.uml;



public class PSSysUseCaseRSImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.uml.IPSSysUseCaseRS{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETFROMPSSYSACTOR = "getFromPSSysActor";
	public final static String ATTR_GETFROMPSSYSUSECASE = "getFromPSSysUseCase";
	public final static String ATTR_GETRSMODE = "rSMode";
	public final static String ATTR_GETRSTYPE = "rSType";
	public final static String ATTR_GETTOPSSYSACTOR = "getToPSSysActor";
	public final static String ATTR_GETTOPSSYSUSECASE = "getToPSSysUseCase";

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
	private net.ibizsys.model.uml.IPSSysActor frompssysactor;

	public net.ibizsys.model.uml.IPSSysActor getFromPSSysActor(){
		if(this.frompssysactor != null) return this.frompssysactor;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROMPSSYSACTOR);
		if(value == null){
			return null;
		}
		this.frompssysactor = getPSModelObject(net.ibizsys.model.uml.IPSSysActor.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFROMPSSYSACTOR);
		return this.frompssysactor;
	}

	public net.ibizsys.model.uml.IPSSysActor getFromPSSysActorMust(){
		net.ibizsys.model.uml.IPSSysActor value = this.getFromPSSysActor();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源操作者");}
		return value;
	}

	public void setFromPSSysActor(net.ibizsys.model.uml.IPSSysActor frompssysactor){
		this.frompssysactor = frompssysactor;
	}

	private net.ibizsys.model.uml.IPSSysUseCase frompssysusecase;

	public net.ibizsys.model.uml.IPSSysUseCase getFromPSSysUseCase(){
		if(this.frompssysusecase != null) return this.frompssysusecase;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROMPSSYSUSECASE);
		if(value == null){
			return null;
		}
		this.frompssysusecase = getPSModelObject(net.ibizsys.model.uml.IPSSysUseCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFROMPSSYSUSECASE);
		return this.frompssysusecase;
	}

	public net.ibizsys.model.uml.IPSSysUseCase getFromPSSysUseCaseMust(){
		net.ibizsys.model.uml.IPSSysUseCase value = this.getFromPSSysUseCase();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源用例");}
		return value;
	}

	public void setFromPSSysUseCase(net.ibizsys.model.uml.IPSSysUseCase frompssysusecase){
		this.frompssysusecase = frompssysusecase;
	}


	public java.lang.String getRSMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRSType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.uml.IPSSysActor topssysactor;

	public net.ibizsys.model.uml.IPSSysActor getToPSSysActor(){
		if(this.topssysactor != null) return this.topssysactor;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPSSYSACTOR);
		if(value == null){
			return null;
		}
		this.topssysactor = getPSModelObject(net.ibizsys.model.uml.IPSSysActor.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOPSSYSACTOR);
		return this.topssysactor;
	}

	public net.ibizsys.model.uml.IPSSysActor getToPSSysActorMust(){
		net.ibizsys.model.uml.IPSSysActor value = this.getToPSSysActor();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标操作者");}
		return value;
	}

	public void setToPSSysActor(net.ibizsys.model.uml.IPSSysActor topssysactor){
		this.topssysactor = topssysactor;
	}

	private net.ibizsys.model.uml.IPSSysUseCase topssysusecase;

	public net.ibizsys.model.uml.IPSSysUseCase getToPSSysUseCase(){
		if(this.topssysusecase != null) return this.topssysusecase;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPSSYSUSECASE);
		if(value == null){
			return null;
		}
		this.topssysusecase = getPSModelObject(net.ibizsys.model.uml.IPSSysUseCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOPSSYSUSECASE);
		return this.topssysusecase;
	}

	public net.ibizsys.model.uml.IPSSysUseCase getToPSSysUseCaseMust(){
		net.ibizsys.model.uml.IPSSysUseCase value = this.getToPSSysUseCase();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标用例");}
		return value;
	}

	public void setToPSSysUseCase(net.ibizsys.model.uml.IPSSysUseCase topssysusecase){
		this.topssysusecase = topssysusecase;
	}

}