package net.ibizsys.model.app.mob;



public class PSMobAppStartPageImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.mob.IPSMobAppStartPage{

	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETWIDTH = "width";

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}