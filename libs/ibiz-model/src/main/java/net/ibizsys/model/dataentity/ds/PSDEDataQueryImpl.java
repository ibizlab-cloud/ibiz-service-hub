package net.ibizsys.model.dataentity.ds;



public class PSDEDataQueryImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataQuery
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETALLPSDEDATAQUERYCODES = "getAllPSDEDataQueryCodes";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFGROUPTYPE = "dEFGroupType";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEDQMAIN = "getPSDEDQMain";
	public final static String ATTR_GETPSDEDATAQUERYINPUT = "getPSDEDataQueryInput";
	public final static String ATTR_GETPSDEDATAQUERYRETURN = "getPSDEDataQueryReturn";
	public final static String ATTR_GETPSDEFGROUP = "getPSDEFGroup";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETVIEWLEVEL = "viewLevel";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEPQL = "enablePQL";
	public final static String ATTR_ISPRIVQUERY = "privQuery";
	public final static String ATTR_ISPUBSERVICEDEFAULT = "pubServiceDefault";
	public final static String ATTR_ISQUERYFROMVIEW = "queryFromView";

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> allpsdedataquerycodes = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> getAllPSDEDataQueryCodes(){
		if(this.allpsdedataquerycodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATAQUERYCODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATAQUERYCODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedataquerycodes = list;
		}
		return (this.allpsdedataquerycodes.size() == 0)? null : this.allpsdedataquerycodes;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode getPSDEDataQueryCode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode.class, this.getAllPSDEDataQueryCodes(), objKey, bTryMode);
	}
	public void setPSDEDataQueryCodes(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode> list){
		this.allpsdedataquerycodes = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEFGroupType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFGROUPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDQMain psdedqmain;

	public net.ibizsys.model.dataentity.ds.IPSDEDQMain getPSDEDQMain(){
		if(this.psdedqmain != null) return this.psdedqmain;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDQMAIN);
		if(value == null){
			return null;
		}
		this.psdedqmain = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQMain.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDQMAIN);
		return this.psdedqmain;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQMain getPSDEDQMainMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDQMain value = this.getPSDEDQMain();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定查询主表对象");}
		return value;
	}

	public void setPSDEDQMain(net.ibizsys.model.dataentity.ds.IPSDEDQMain psdedqmain){
		this.psdedqmain = psdedqmain;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput psdedataqueryinput;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput getPSDEDataQueryInput(){
		if(this.psdedataqueryinput != null) return this.psdedataqueryinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERYINPUT);
		if(value == null){
			return null;
		}
		this.psdedataqueryinput = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDATAQUERYINPUT);
		return this.psdedataqueryinput;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput getPSDEDataQueryInputMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput value = this.getPSDEDataQueryInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用输入对象");}
		return value;
	}

	public void setPSDEDataQueryInput(net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput psdedataqueryinput){
		this.psdedataqueryinput = psdedataqueryinput;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn psdedataqueryreturn;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn getPSDEDataQueryReturn(){
		if(this.psdedataqueryreturn != null) return this.psdedataqueryreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERYRETURN);
		if(value == null){
			return null;
		}
		this.psdedataqueryreturn = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDATAQUERYRETURN);
		return this.psdedataqueryreturn;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn getPSDEDataQueryReturnMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn value = this.getPSDEDataQueryReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用返回对象");}
		return value;
	}

	public void setPSDEDataQueryReturn(net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn psdedataqueryreturn){
		this.psdedataqueryreturn = psdedataqueryreturn;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup;

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup(){
		if(this.psdefgroup != null) return this.psdefgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefgroup = ipsdataentity.getPSDEFGroup(value, false);
		return this.psdefgroup;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFGroup value = this.getPSDEFGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性组");}
		return value;
	}

	public void setPSDEFGroup(net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup){
		this.psdefgroup = psdefgroup;
	}


	@Deprecated
	public java.lang.String getRequestMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTMETHOD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getRequestPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getViewLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLEVEL);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePQL(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPQL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPrivQuery(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPRIVQUERY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubServiceDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBSERVICEDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isQueryFromView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISQUERYFROMVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}