package net.ibizsys.model;

/**
 * 动态实例模型默认实现对象
 * @author lionlau
 *
 */
public class PSDynaInstImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.IPSDynaInst{

	public final static String ATTR_GETINSTTAG = "instTag";
	public final static String ATTR_GETINSTTAG2 = "instTag2";
	public final static String ATTR_GETINSTTYPE = "instType";
	


	public java.lang.String getInstTag() {
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInstTag2() {
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINSTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInstType() {
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINSTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
