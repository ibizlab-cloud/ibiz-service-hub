package net.ibizsys.model.res;



public class PSCtrlMsgItemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.res.IPSCtrlMsgItem{

	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETCONTENTPSLANGUAGERES = "getContentPSLanguageRes";
	public final static String ATTR_GETTIMEOUT = "timeout";

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes contentpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes(){
		if(this.contentpslanguageres != null) return this.contentpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.contentpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSLANGUAGERES);
		return this.contentpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getContentPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容语言资源");}
		return value;
	}


	public int getTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
}