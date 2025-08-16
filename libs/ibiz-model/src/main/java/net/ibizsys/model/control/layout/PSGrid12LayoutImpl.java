package net.ibizsys.model.control.layout;



public class PSGrid12LayoutImpl extends net.ibizsys.model.control.layout.PSLayoutImplBase implements net.ibizsys.model.control.layout.IPSGridLayout{

	public final static String ATTR_GETCHILDCOLLG = "childColLG";
	public final static String ATTR_GETCHILDCOLMD = "childColMD";
	public final static String ATTR_GETCHILDCOLSM = "childColSM";
	public final static String ATTR_GETCHILDCOLXS = "childColXS";
	public final static String ATTR_GETCOLUMNCOUNT = "columnCount";
	public final static String ATTR_GETLAYOUT = "layout";
	public final static String ATTR_ISENABLECOL12TOCOL24 = "enableCol12ToCol24";

	public int getChildColLG(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDCOLLG);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getChildColMD(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDCOLMD);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getChildColSM(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDCOLSM);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getChildColXS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDCOLXS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColumnCount(){
		return 12;
	}

	public java.lang.String getLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public boolean isEnableCol12ToCol24(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOL12TOCOL24);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}