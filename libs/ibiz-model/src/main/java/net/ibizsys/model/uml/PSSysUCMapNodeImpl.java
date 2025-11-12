package net.ibizsys.model.uml;



public class PSSysUCMapNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.uml.IPSSysUCMapNode{

	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETNODETYPE = "nodeType";
	public final static String ATTR_GETPSSYSACTOR = "getPSSysActor";
	public final static String ATTR_GETPSSYSUSECASE = "getPSSysUseCase";
	public final static String ATTR_GETTOPPOS = "topPos";

	public int getLeftPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFTPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getNodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.uml.IPSSysActor pssysactor;

	public net.ibizsys.model.uml.IPSSysActor getPSSysActor(){
		if(this.pssysactor != null) return this.pssysactor;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSACTOR);
		if(value == null){
			return null;
		}
		this.pssysactor = getPSModelObject(net.ibizsys.model.uml.IPSSysActor.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSACTOR);
		return this.pssysactor;
	}

	public net.ibizsys.model.uml.IPSSysActor getPSSysActorMust(){
		net.ibizsys.model.uml.IPSSysActor value = this.getPSSysActor();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统操作者");}
		return value;
	}

	public void setPSSysActor(net.ibizsys.model.uml.IPSSysActor pssysactor){
		this.pssysactor = pssysactor;
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


	public int getTopPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}