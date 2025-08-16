package net.ibizsys.model.dataentity.logic;



public class PSDEUIMsgBoxLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIMsgBoxLogic{

	public final static String ATTR_GETBUTTONSTYPE = "buttonsType";
	public final static String ATTR_GETDSTPSDEUILOGICPARAM = "getDstPSDEUILogicParam";
	public final static String ATTR_GETMESSAGE = "message";
	public final static String ATTR_GETMSGBOXPARAM = "getMsgBoxParam";
	public final static String ATTR_GETMSGBOXTYPE = "msgBoxType";
	public final static String ATTR_GETSHOWMODE = "showMode";
	public final static String ATTR_GETTITLE = "title";

	public java.lang.String getButtonsType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam;

	@Deprecated
	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam(){
		if(this.dstpsdeuilogicparam != null) return this.dstpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		this.dstpsdeuilogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDEUILOGICPARAM);
		return this.dstpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getDstPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getDstPSDEUILogicParam]返回空值");}
		return value;
	}

	public void setDstPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam){
		this.dstpsdeuilogicparam = dstpsdeuilogicparam;
	}


	public java.lang.String getMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam msgboxparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getMsgBoxParam(){
		if(this.msgboxparam != null) return this.msgboxparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGBOXPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.msgboxparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.msgboxparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getMsgBoxParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getMsgBoxParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息框参数对象");}
		return value;
	}

	public void setMsgBoxParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam msgboxparam){
		this.msgboxparam = msgboxparam;
	}


	public java.lang.String getMsgBoxType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGBOXTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHOWMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}