package net.ibizsys.model.app.view;



public class PSAppErrorViewImpl extends net.ibizsys.model.app.view.PSAppUtilViewImpl implements net.ibizsys.model.app.view.IPSAppErrorView{

	public final static String ATTR_GETERRORCODE = "errorCode";

	public java.lang.String getErrorCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}