package net.ibizsys.model.control.layout;



public class PSGridLayoutPosImpl extends net.ibizsys.model.control.layout.PSLayoutPosImplBase implements net.ibizsys.model.control.layout.IPSGridLayoutPos{

	public final static String ATTR_GETCOLLG = "colLG";
	public final static String ATTR_GETCOLLGOFFSET = "colLGOffset";
	public final static String ATTR_GETCOLMD = "colMD";
	public final static String ATTR_GETCOLMDOFFSET = "colMDOffset";
	public final static String ATTR_GETCOLSM = "colSM";
	public final static String ATTR_GETCOLSMOFFSET = "colSMOffset";
	public final static String ATTR_GETCOLWIDTH = "colWidth";
	public final static String ATTR_GETCOLXS = "colXS";
	public final static String ATTR_GETCOLXSOFFSET = "colXSOffset";

	public int getColLG(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLLG);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColLGOffset(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLLGOFFSET);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColMD(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLMD);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColMDOffset(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLMDOFFSET);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColSM(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLSM);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColSMOffset(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLSMOFFSET);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLWIDTH);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColXS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLXS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getColXSOffset(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLXSOFFSET);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
}