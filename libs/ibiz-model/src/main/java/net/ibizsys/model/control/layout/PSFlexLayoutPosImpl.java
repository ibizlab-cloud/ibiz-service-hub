package net.ibizsys.model.control.layout;



public class PSFlexLayoutPosImpl extends net.ibizsys.model.control.layout.PSLayoutPosImplBase implements net.ibizsys.model.control.layout.IPSFlexLayoutPos{

	public final static String ATTR_GETBASIS = "basis";
	public final static String ATTR_GETGROW = "grow";
	public final static String ATTR_GETSHRINK = "shrink";

	public int getBasis(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBASIS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getGrow(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROW);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getShrink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHRINK);
		if(value == null){
			return 1;
		}
		return value.asInt();
	}
}