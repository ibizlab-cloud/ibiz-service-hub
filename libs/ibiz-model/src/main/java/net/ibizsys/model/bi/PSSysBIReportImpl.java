package net.ibizsys.model.bi;



public class PSSysBIReportImpl extends net.ibizsys.model.bi.PSSysBISchemeObjectImpl implements net.ibizsys.model.bi.IPSSysBIReport{

	public final static String ATTR_GETALLPSSYSBIREPORTDIMENSIONS = "getAllPSSysBIReportDimensions";
	public final static String ATTR_GETALLPSSYSBIREPORTMEASURES = "getAllPSSysBIReportMeasures";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSBICUBE = "getPSSysBICube";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETREPORTMODEL = "reportModel";
	public final static String ATTR_GETREPORTPARAMS = "reportParams";
	public final static String ATTR_GETREPORTTAG = "reportTag";
	public final static String ATTR_GETREPORTTAG2 = "reportTag2";
	public final static String ATTR_GETREPORTUIMODEL = "reportUIModel";
	public final static String ATTR_GETSYSUNIRESCODE = "sysUniResCode";

	private java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> allpssysbireportdimensions = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> getAllPSSysBIReportDimensions(){
		if(this.allpssysbireportdimensions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIREPORTDIMENSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIReportDimension>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIReportDimension obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIReportDimension.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIREPORTDIMENSIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbireportdimensions = list;
		}
		return (this.allpssysbireportdimensions.size() == 0)? null : this.allpssysbireportdimensions;
	}

	public net.ibizsys.model.bi.IPSSysBIReportDimension getPSSysBIReportDimension(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIReportDimension.class, this.getAllPSSysBIReportDimensions(), objKey, bTryMode);
	}
	public void setPSSysBIReportDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBIReportDimension> list){
		this.allpssysbireportdimensions = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> allpssysbireportmeasures = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> getAllPSSysBIReportMeasures(){
		if(this.allpssysbireportmeasures == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIREPORTMEASURES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIReportMeasure>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIReportMeasure obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIReportMeasure.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIREPORTMEASURES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbireportmeasures = list;
		}
		return (this.allpssysbireportmeasures.size() == 0)? null : this.allpssysbireportmeasures;
	}

	public net.ibizsys.model.bi.IPSSysBIReportMeasure getPSSysBIReportMeasure(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIReportMeasure.class, this.getAllPSSysBIReportMeasures(), objKey, bTryMode);
	}
	public void setPSSysBIReportMeasures(java.util.List<net.ibizsys.model.bi.IPSSysBIReportMeasure> list){
		this.allpssysbireportmeasures = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.bi.IPSSysBICube pssysbicube;

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICube(){
		if(this.pssysbicube != null) return this.pssysbicube;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.bi.IPSSysBIScheme ipssysbischeme = getParentPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class);
		this.pssysbicube = ipssysbischeme.getPSSysBICube(value, false);
		return this.pssysbicube;
	}

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICubeMust(){
		net.ibizsys.model.bi.IPSSysBICube value = this.getPSSysBICube();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定智能报表立方体");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定权限统一资源对象");}
		return value;
	}


	public java.lang.String getReportModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getReportParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getReportTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getReportTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getReportUIModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTUIMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysUniResCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSUNIRESCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}