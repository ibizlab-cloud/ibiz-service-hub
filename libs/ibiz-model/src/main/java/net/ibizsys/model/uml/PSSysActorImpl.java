package net.ibizsys.model.uml;



public class PSSysActorImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.uml.IPSSysActor{

	public final static String ATTR_GETACTORSN = "actorSN";
	public final static String ATTR_GETACTORTAG = "actorTag";
	public final static String ATTR_GETACTORTAG2 = "actorTag2";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETFROMPSSYSUSECASERSS = "getFromPSSysUseCaseRSs";
	public final static String ATTR_GETTOPSSYSUSECASERSS = "getToPSSysUseCaseRSs";

	public java.lang.String getActorSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTORSN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActorTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTORTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActorTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTORTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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

	private java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> frompssysusecaserss = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getFromPSSysUseCaseRSs(){
		if(this.frompssysusecaserss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROMPSSYSUSECASERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUseCaseRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUseCaseRS obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETFROMPSSYSUSECASERSS);
				if(obj!=null)list.add(obj);
			}
			this.frompssysusecaserss = list;
		}
		return (this.frompssysusecaserss.size() == 0)? null : this.frompssysusecaserss;
	}

	public net.ibizsys.model.uml.IPSSysUseCaseRS getFromPSSysUseCaseRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, this.getFromPSSysUseCaseRSs(), objKey, bTryMode);
	}
	
	public void setFromPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list){
		this.frompssysusecaserss = list;
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> topssysusecaserss = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getToPSSysUseCaseRSs(){
		if(this.topssysusecaserss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPSSYSUSECASERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUseCaseRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUseCaseRS obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETTOPSSYSUSECASERSS);
				if(obj!=null)list.add(obj);
			}
			this.topssysusecaserss = list;
		}
		return (this.topssysusecaserss.size() == 0)? null : this.topssysusecaserss;
	}

	public net.ibizsys.model.uml.IPSSysUseCaseRS getToPSSysUseCaseRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUseCaseRS.class, this.getToPSSysUseCaseRSs(), objKey, bTryMode);
	}
	
	public void setToPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list){
		this.topssysusecaserss = list;
	}
}