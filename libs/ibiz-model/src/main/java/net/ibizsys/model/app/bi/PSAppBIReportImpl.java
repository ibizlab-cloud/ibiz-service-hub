package net.ibizsys.model.app.bi;



public class PSAppBIReportImpl extends net.ibizsys.model.PSObjectImpl3 implements net.ibizsys.model.app.bi.IPSAppBIReport{

	public final static String ATTR_GETACCESSKEY = "accessKey";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPBICUBE = "getPSAppBICube";
	public final static String ATTR_GETPSAPPBIREPORTDIMENSIONS = "getPSAppBIReportDimensions";
	public final static String ATTR_GETPSAPPBIREPORTMEASURES = "getPSAppBIReportMeasures";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSLAYOUTPANEL = "getPSLayoutPanel";
	public final static String ATTR_GETREPORTTAG = "reportTag";
	public final static String ATTR_GETREPORTTAG2 = "reportTag2";
	public final static String ATTR_GETREPORTUIMODEL = "reportUIModel";

	public java.lang.String getAccessKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCESSKEY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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
	private net.ibizsys.model.app.bi.IPSAppBICube psappbicube;

	public net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube(){
		if(this.psappbicube != null) return this.psappbicube;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIScheme ipsappbischeme = getParentPSModelObject(net.ibizsys.model.app.bi.IPSAppBIScheme.class);
		this.psappbicube = ipsappbischeme.getPSAppBICube(value, false);
		return this.psappbicube;
	}

	public net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICubeMust(){
		net.ibizsys.model.app.bi.IPSAppBICube value = this.getPSAppBICube();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统智能立方体");}
		return value;
	}

	public void setPSAppBICube(net.ibizsys.model.app.bi.IPSAppBICube psappbicube){
		this.psappbicube = psappbicube;
	}


	private java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> psappbireportdimensions = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> getPSAppBIReportDimensions(){
		if(this.psappbireportdimensions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBIREPORTDIMENSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBIReportDimension>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBIReportDimension obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReportDimension.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBIREPORTDIMENSIONS);
				if(obj!=null)list.add(obj);
			}
			this.psappbireportdimensions = list;
		}
		return (this.psappbireportdimensions.size() == 0)? null : this.psappbireportdimensions;
	}

	public net.ibizsys.model.app.bi.IPSAppBIReportDimension getPSAppBIReportDimension(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReportDimension.class, this.getPSAppBIReportDimensions(), objKey, bTryMode);
	}
	public void setPSAppBIReportDimensions(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> list){
		this.psappbireportdimensions = list;
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> psappbireportmeasures = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> getPSAppBIReportMeasures(){
		if(this.psappbireportmeasures == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBIREPORTMEASURES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBIReportMeasure>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBIReportMeasure obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReportMeasure.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBIREPORTMEASURES);
				if(obj!=null)list.add(obj);
			}
			this.psappbireportmeasures = list;
		}
		return (this.psappbireportmeasures.size() == 0)? null : this.psappbireportmeasures;
	}

	public net.ibizsys.model.app.bi.IPSAppBIReportMeasure getPSAppBIReportMeasure(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReportMeasure.class, this.getPSAppBIReportMeasures(), objKey, bTryMode);
	}
	public void setPSAppBIReportMeasures(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> list){
		this.psappbireportmeasures = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel(){
		if(this.pslayoutpanel != null) return this.pslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.pslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPANEL);
		return this.pslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局面板");}
		return value;
	}

	public void setPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel){
		this.pslayoutpanel = pslayoutpanel;
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
}