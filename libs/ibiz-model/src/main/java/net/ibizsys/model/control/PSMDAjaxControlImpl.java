package net.ibizsys.model.control;



public class PSMDAjaxControlImpl extends net.ibizsys.model.control.PSAjaxControlImpl implements net.ibizsys.model.control.IPSMDAjaxControl{

	public final static String ATTR_GETACTIVEDATAFIELD = "activeDataField";
	public final static String ATTR_GETCREATEPSCONTROLACTION = "getCreatePSControlAction";
	public final static String ATTR_GETFETCHPSCONTROLACTION = "getFetchPSControlAction";
	public final static String ATTR_GETGETDRAFTFROMPSCONTROLACTION = "getGetDraftFromPSControlAction";
	public final static String ATTR_GETGETDRAFTPSCONTROLACTION = "getGetDraftPSControlAction";
	public final static String ATTR_GETGETPSCONTROLACTION = "getGetPSControlAction";
	public final static String ATTR_GETMOVEPSCONTROLACTION = "getMovePSControlAction";
	public final static String ATTR_GETPSCONTROLNAVCONTEXTS = "getPSControlNavContexts";
	public final static String ATTR_GETPSCONTROLNAVPARAMS = "getPSControlNavParams";
	public final static String ATTR_GETPSDEDATAEXPORT = "getPSDEDataExport";
	public final static String ATTR_GETPSDEDATAIMPORT = "getPSDEDataImport";
	public final static String ATTR_GETREMOVEPSCONTROLACTION = "getRemovePSControlAction";
	public final static String ATTR_GETUPDATEPSCONTROLACTION = "getUpdatePSControlAction";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISACTIVEDATAMODE = "activeDataMode";
	public final static String ATTR_ISREADONLY = "readOnly";

	public java.lang.String getActiveDataField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIVEDATAFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControlAction createpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlAction(){
		if(this.createpscontrolaction != null) return this.createpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.createpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.createpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getCreatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction fetchpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getFetchPSControlAction(){
		if(this.fetchpscontrolaction != null) return this.fetchpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFETCHPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.fetchpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.fetchpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getFetchPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getFetchPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定查询数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getdraftfrompscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction(){
		if(this.getdraftfrompscontrolaction != null) return this.getdraftfrompscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTFROMPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftfrompscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getdraftfrompscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftFromPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为（拷贝）");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getdraftpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction(){
		if(this.getdraftpscontrolaction != null) return this.getdraftpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getdraftpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetPSControlAction(){
		if(this.getpscontrolaction != null) return this.getpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction movepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getMovePSControlAction(){
		if(this.movepscontrolaction != null) return this.movepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.movepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.movepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getMovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getMovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动数据行为");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlNavContext> pscontrolnavcontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSControlNavContext> getPSControlNavContexts(){
		if(this.pscontrolnavcontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLNAVCONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlNavContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlNavContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlNavContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlNavContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLNAVCONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolnavcontexts = list;
		}
		return (this.pscontrolnavcontexts.size() == 0)? null : this.pscontrolnavcontexts;
	}

	public net.ibizsys.model.control.IPSControlNavContext getPSControlNavContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlNavContext.class, this.getPSControlNavContexts(), objKey, bTryMode);
	}
	public void setPSControlNavContexts(java.util.List<net.ibizsys.model.control.IPSControlNavContext> list){
		this.pscontrolnavcontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlNavParam> pscontrolnavparams = null;
	public java.util.List<net.ibizsys.model.control.IPSControlNavParam> getPSControlNavParams(){
		if(this.pscontrolnavparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLNAVPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlNavParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlNavParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlNavParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlNavParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLNAVPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolnavparams = list;
		}
		return (this.pscontrolnavparams.size() == 0)? null : this.pscontrolnavparams;
	}

	public net.ibizsys.model.control.IPSControlNavParam getPSControlNavParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlNavParam.class, this.getPSControlNavParams(), objKey, bTryMode);
	}
	public void setPSControlNavParams(java.util.List<net.ibizsys.model.control.IPSControlNavParam> list){
		this.pscontrolnavparams = list;
	}
	private net.ibizsys.model.dataentity.dataexport.IPSDEDataExport psdedataexport;

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExport getPSDEDataExport(){
		if(this.psdedataexport != null) return this.psdedataexport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAEXPORT);
		if(value == null){
			return null;
		}
		this.psdedataexport = this.getPSAppDataEntityMust().getPSAppDEDataExport(value, false);
		return this.psdedataexport;
	}

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExport getPSDEDataExportMust(){
		net.ibizsys.model.dataentity.dataexport.IPSDEDataExport value = this.getPSDEDataExport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据导出对象");}
		return value;
	}

	private net.ibizsys.model.dataentity.dataimport.IPSDEDataImport psdedataimport;

	public net.ibizsys.model.dataentity.dataimport.IPSDEDataImport getPSDEDataImport(){
		if(this.psdedataimport != null) return this.psdedataimport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAIMPORT);
		if(value == null){
			return null;
		}
		this.psdedataimport = this.getPSAppDataEntityMust().getPSAppDEDataImport(value, false);
		return this.psdedataimport;
	}

	public net.ibizsys.model.dataentity.dataimport.IPSDEDataImport getPSDEDataImportMust(){
		net.ibizsys.model.dataentity.dataimport.IPSDEDataImport value = this.getPSDEDataImport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据导入对象");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction removepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlAction(){
		if(this.removepscontrolaction != null) return this.removepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.removepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.removepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getRemovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction updatepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction(){
		if(this.updatepscontrolaction != null) return this.updatepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.updatepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.updatepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUpdatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据行为");}
		return value;
	}


	@Deprecated
	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isActiveDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIVEDATAMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}