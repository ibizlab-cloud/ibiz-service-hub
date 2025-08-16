package net.ibizsys.model.res;



public class PSSysI18NImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysI18N{

	public final static String ATTR_GETALLPSLANGUAGERESES = "getAllPSLanguageReses";
	public final static String ATTR_GETALLPSSYSLANS = "getAllPSSysLans";

	private java.util.List<net.ibizsys.model.res.IPSLanguageRes> allpslanguagereses = null;
	public java.util.List<net.ibizsys.model.res.IPSLanguageRes> getAllPSLanguageReses(){
		if(this.allpslanguagereses == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSLANGUAGERESES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSLanguageRes> list = new java.util.ArrayList<net.ibizsys.model.res.IPSLanguageRes>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSLanguageRes obj = this.getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSLANGUAGERESES);
				if(obj!=null)list.add(obj);
			}
			this.allpslanguagereses = list;
		}
		return (this.allpslanguagereses.size() == 0)? null : this.allpslanguagereses;
	}

	public net.ibizsys.model.res.IPSLanguageRes getPSLanguageRes(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, this.getAllPSLanguageReses(), objKey, bTryMode);
	}
	public void setPSLanguageRes(java.util.List<net.ibizsys.model.res.IPSLanguageRes> list){
		this.allpslanguagereses = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysLan> allpssyslans = null;
	public java.util.List<net.ibizsys.model.res.IPSSysLan> getAllPSSysLans(){
		if(this.allpssyslans == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSLANS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysLan> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysLan>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysLan obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysLan.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSLANS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyslans = list;
		}
		return (this.allpssyslans.size() == 0)? null : this.allpssyslans;
	}

	public net.ibizsys.model.res.IPSSysLan getPSSysLan(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysLan.class, this.getAllPSSysLans(), objKey, bTryMode);
	}
	public void setPSSysLans(java.util.List<net.ibizsys.model.res.IPSSysLan> list){
		this.allpssyslans = list;
	}
}