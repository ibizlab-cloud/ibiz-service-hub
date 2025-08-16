package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicParam
		,net.ibizsys.model.app.dataentity.IPSAppDEUILogicParam{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPARAMFIELDNAME = "paramFieldName";
	public final static String ATTR_GETPARAMTAG = "paramTag";
	public final static String ATTR_GETPARAMTAG2 = "paramTag2";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISACTIVECONTAINERPARAM = "activeContainerParam";
	public final static String ATTR_ISACTIVECTRLPARAM = "activeCtrlParam";
	public final static String ATTR_ISACTIVEVIEWPARAM = "activeViewParam";
	public final static String ATTR_ISAPPGLOBALPARAM = "appGlobalParam";
	public final static String ATTR_ISAPPLICATIONPARAM = "applicationParam";
	public final static String ATTR_ISCTRLPARAM = "ctrlParam";
	public final static String ATTR_ISDEFAULT = "default";
	public final static String ATTR_ISENTITYLISTPARAM = "entityListParam";
	public final static String ATTR_ISENTITYMAPPARAM = "entityMapParam";
	public final static String ATTR_ISENTITYPAGEPARAM = "entityPageParam";
	public final static String ATTR_ISENTITYPARAM = "entityParam";
	public final static String ATTR_ISENVPARAM = "envParam";
	public final static String ATTR_ISFILTERPARAM = "filterParam";
	public final static String ATTR_ISLASTRETURNPARAM = "lastReturnParam";
	public final static String ATTR_ISNAVCONTEXTPARAM = "navContextParam";
	public final static String ATTR_ISNAVVIEWPARAMPARAM = "navViewParamParam";
	public final static String ATTR_ISROUTEVIEWSESSIONPARAM = "routeViewSessionParam";
	public final static String ATTR_ISSESSIONPARAM = "sessionParam";
	public final static String ATTR_ISSIMPLELISTPARAM = "simpleListParam";
	public final static String ATTR_ISSIMPLEPARAM = "simpleParam";
	public final static String ATTR_ISVIEWNAVDATAPARAM = "viewNavDataParam";
	public final static String ATTR_ISVIEWSESSIONPARAM = "viewSessionParam";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isActiveContainerParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIVECONTAINERPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isActiveCtrlParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIVECTRLPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isActiveViewParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIVEVIEWPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAppGlobalParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPGLOBALPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isApplicationParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPLICATIONPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCtrlParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCTRLPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityListParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYLISTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityMapParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYMAPPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityPageParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYPAGEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnvParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENVPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFilterParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFILTERPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLastReturnParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLASTRETURNPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNavContextParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNAVCONTEXTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNavViewParamParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNAVVIEWPARAMPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRouteViewSessionParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISROUTEVIEWSESSIONPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSessionParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSESSIONPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSimpleListParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSIMPLELISTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSimpleParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSIMPLEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isViewNavDataParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVIEWNAVDATAPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isViewSessionParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVIEWSESSIONPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}