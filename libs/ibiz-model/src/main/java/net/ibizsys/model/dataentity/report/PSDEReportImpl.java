package net.ibizsys.model.dataentity.report;



public class PSDEReportImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.report.IPSDEReport
		,net.ibizsys.model.app.dataentity.IPSAppDEReport
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSAPPBICUBE = "getPSAppBICube";
	public final static String ATTR_GETPSAPPBIREPORT = "getPSAppBIReport";
	public final static String ATTR_GETPSAPPBISCHEME = "getPSAppBIScheme";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDEDATASET2 = "getPSAppDEDataSet2";
	public final static String ATTR_GETPSAPPDEDATASET3 = "getPSAppDEDataSet3";
	public final static String ATTR_GETPSAPPDEDATASET4 = "getPSAppDEDataSet4";
	public final static String ATTR_GETPSAPPDEREPORTITEMS = "getPSAppDEReportItems";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDEDATASET2 = "getPSDEDataSet2";
	public final static String ATTR_GETPSDEDATASET3 = "getPSDEDataSet3";
	public final static String ATTR_GETPSDEDATASET4 = "getPSDEDataSet4";
	public final static String ATTR_GETPSDEREPORTITEMS = "getPSDEReportItems";
	public final static String ATTR_GETPSLAYOUTPANEL = "getPSLayoutPanel";
	public final static String ATTR_GETPSSYSBICUBE = "getPSSysBICube";
	public final static String ATTR_GETPSSYSBIREPORT = "getPSSysBIReport";
	public final static String ATTR_GETPSSYSBISCHEME = "getPSSysBIScheme";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETREPORTFILE = "reportFile";
	public final static String ATTR_GETREPORTMODEL = "reportModel";
	public final static String ATTR_GETREPORTPARAMS = "reportParams";
	public final static String ATTR_GETREPORTTAG = "reportTag";
	public final static String ATTR_GETREPORTTAG2 = "reportTag2";
	public final static String ATTR_GETREPORTTYPE = "reportType";
	public final static String ATTR_GETREPORTUIMODEL = "reportUIModel";
	public final static String ATTR_GETSYSUNIRESCODE = "sysUniResCode";
	public final static String ATTR_ISENABLELOG = "enableLog";
	public final static String ATTR_ISMULTIPAGE = "multiPage";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getPOTime(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOTIME);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.bi.IPSAppBICube psappbicube;

	public net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube(){
		if(this.psappbicube != null) return this.psappbicube;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIScheme ipsappbischeme = this.getPSAppBISchemeMust();
		this.psappbicube = ipsappbischeme.getPSAppBICube(value, false);
		return this.psappbicube;
	}

	public net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICubeMust(){
		net.ibizsys.model.app.bi.IPSAppBICube value = this.getPSAppBICube();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用智能报表立方体");}
		return value;
	}

	public void setPSAppBICube(net.ibizsys.model.app.bi.IPSAppBICube psappbicube){
		this.psappbicube = psappbicube;
	}

	private net.ibizsys.model.app.bi.IPSAppBIReport psappbireport;

	public net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReport(){
		if(this.psappbireport != null) return this.psappbireport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBIREPORT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.bi.IPSAppBIScheme ipsappbischeme = this.getPSAppBISchemeMust();
		this.psappbireport = ipsappbischeme.getPSAppBIReport(value, false);
		return this.psappbireport;
	}

	public net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReportMust(){
		net.ibizsys.model.app.bi.IPSAppBIReport value = this.getPSAppBIReport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用智能报表");}
		return value;
	}

	public void setPSAppBIReport(net.ibizsys.model.app.bi.IPSAppBIReport psappbireport){
		this.psappbireport = psappbireport;
	}

	private net.ibizsys.model.app.bi.IPSAppBIScheme psappbischeme;

	public net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBIScheme(){
		if(this.psappbischeme != null) return this.psappbischeme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBISCHEME);
		if(value == null){
			return null;
		}
		this.psappbischeme = getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPBISCHEME);
		return this.psappbischeme;
	}

	public net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBISchemeMust(){
		net.ibizsys.model.app.bi.IPSAppBIScheme value = this.getPSAppBIScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用智能报表体系");}
		return value;
	}

	public void setPSAppBIScheme(net.ibizsys.model.app.bi.IPSAppBIScheme psappbischeme){
		this.psappbischeme = psappbischeme;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset2;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet2(){
		if(this.psappdedataset2 != null) return this.psappdedataset2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET2);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdedataset2 = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset2;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet2Must(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合2");}
		return value;
	}

	public void setPSAppDEDataSet2(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset2){
		this.psappdedataset2 = psappdedataset2;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset3;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet3(){
		if(this.psappdedataset3 != null) return this.psappdedataset3;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET3);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdedataset3 = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset3;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet3Must(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet3();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合3");}
		return value;
	}

	public void setPSAppDEDataSet3(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset3){
		this.psappdedataset3 = psappdedataset3;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset4;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet4(){
		if(this.psappdedataset4 != null) return this.psappdedataset4;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET4);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdedataset4 = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset4;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet4Must(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet4();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合4");}
		return value;
	}

	public void setPSAppDEDataSet4(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset4){
		this.psappdedataset4 = psappdedataset4;
	}


	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> psappdereportitems = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> getPSAppDEReportItems(){
		if(this.psappdereportitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEREPORTITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEReportItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEReportItem obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEReportItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEREPORTITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psappdereportitems = list;
		}
		return (this.psappdereportitems.size() == 0)? null : this.psappdereportitems;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEReportItem getPSAppDEReportItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEReportItem.class, this.getPSAppDEReportItems(), objKey, bTryMode);
	}
	public void setPSAppDEReportItems(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> list){
		this.psappdereportitems = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset2;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet2(){
		if(this.psdedataset2 != null) return this.psdedataset2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET2);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset2 = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset2;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet2Must(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象2");}
		return value;
	}

	public void setPSDEDataSet2(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset2){
		this.psdedataset2 = psdedataset2;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset3;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet3(){
		if(this.psdedataset3 != null) return this.psdedataset3;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET3);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset3 = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset3;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet3Must(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet3();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象3");}
		return value;
	}

	public void setPSDEDataSet3(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset3){
		this.psdedataset3 = psdedataset3;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset4;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet4(){
		if(this.psdedataset4 != null) return this.psdedataset4;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET4);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset4 = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset4;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet4Must(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet4();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象4");}
		return value;
	}

	public void setPSDEDataSet4(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset4){
		this.psdedataset4 = psdedataset4;
	}


	private java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> psdereportitems = null;
	public java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> getPSDEReportItems(){
		if(this.psdereportitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEREPORTITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> list = new java.util.ArrayList<net.ibizsys.model.dataentity.report.IPSDEReportItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.report.IPSDEReportItem obj = this.getPSModelObject(net.ibizsys.model.dataentity.report.IPSDEReportItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEREPORTITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdereportitems = list;
		}
		return (this.psdereportitems.size() == 0)? null : this.psdereportitems;
	}

	public net.ibizsys.model.dataentity.report.IPSDEReportItem getPSDEReportItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.report.IPSDEReportItem.class, this.getPSDEReportItems(), objKey, bTryMode);
	}
	public void setPSDEReportItems(java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> list){
		this.psdereportitems = list;
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

	private net.ibizsys.model.bi.IPSSysBICube pssysbicube;

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICube(){
		if(this.pssysbicube != null) return this.pssysbicube;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBICUBE);
		if(value == null){
			return null;
		}
		this.pssysbicube = getPSModelObject(net.ibizsys.model.bi.IPSSysBICube.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSBICUBE);
		return this.pssysbicube;
	}

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICubeMust(){
		net.ibizsys.model.bi.IPSSysBICube value = this.getPSSysBICube();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统智能报表立方体");}
		return value;
	}

	public void setPSSysBICube(net.ibizsys.model.bi.IPSSysBICube pssysbicube){
		this.pssysbicube = pssysbicube;
	}

	private net.ibizsys.model.bi.IPSSysBIReport pssysbireport;

	public net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReport(){
		if(this.pssysbireport != null) return this.pssysbireport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBIREPORT);
		if(value == null){
			return null;
		}
		this.pssysbireport = getPSModelObject(net.ibizsys.model.bi.IPSSysBIReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSBIREPORT);
		return this.pssysbireport;
	}

	public net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReportMust(){
		net.ibizsys.model.bi.IPSSysBIReport value = this.getPSSysBIReport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统智能报表");}
		return value;
	}

	public void setPSSysBIReport(net.ibizsys.model.bi.IPSSysBIReport pssysbireport){
		this.pssysbireport = pssysbireport;
	}

	private net.ibizsys.model.bi.IPSSysBIScheme pssysbischeme;

	public net.ibizsys.model.bi.IPSSysBIScheme getPSSysBIScheme(){
		if(this.pssysbischeme != null) return this.pssysbischeme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBISCHEME);
		if(value == null){
			return null;
		}
		this.pssysbischeme = getPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSBISCHEME);
		return this.pssysbischeme;
	}

	public net.ibizsys.model.bi.IPSSysBIScheme getPSSysBISchemeMust(){
		net.ibizsys.model.bi.IPSSysBIScheme value = this.getPSSysBIScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统智能报表体系");}
		return value;
	}

	public void setPSSysBIScheme(net.ibizsys.model.bi.IPSSysBIScheme pssysbischeme){
		this.pssysbischeme = pssysbischeme;
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

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
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

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
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

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
	}


	public java.lang.String getReportFile(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTFILE);
		if(value == null){
			return null;
		}
		return value.asText();
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

	public java.lang.String getReportType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTTYPE);
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

	public boolean isEnableLog(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELOG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMultiPage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMULTIPAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}