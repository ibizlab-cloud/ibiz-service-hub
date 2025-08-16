package net.ibizsys.model.app.bi;



public class PSAppBICubeImpl extends net.ibizsys.model.PSObjectImpl3 implements net.ibizsys.model.app.bi.IPSAppBICube{

	public final static String ATTR_GETACCESSKEY = "accessKey";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDRILLDETAILPSAPPVIEW = "getDrillDetailPSAppView";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPBICUBEDIMENSIONS = "getPSAppBICubeDimensions";
	public final static String ATTR_GETPSAPPBICUBEMEASURES = "getPSAppBICubeMeasures";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPORLETPSUIACTIONGROUP = "getPorletPSUIActionGroup";

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
	private net.ibizsys.model.app.view.IPSAppView drilldetailpsappview;

	public net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppView(){
		if(this.drilldetailpsappview != null) return this.drilldetailpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDRILLDETAILPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.drilldetailpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDRILLDETAILPSAPPVIEW);
		return this.drilldetailpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getDrillDetailPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认反查应用视图对象");}
		return value;
	}

	public void setDrillDetailPSAppView(net.ibizsys.model.app.view.IPSAppView drilldetailpsappview){
		this.drilldetailpsappview = drilldetailpsappview;
	}


	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> psappbicubedimensions = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> getPSAppBICubeDimensions(){
		if(this.psappbicubedimensions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBEDIMENSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBICubeDimension>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBICubeDimension obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeDimension.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBICUBEDIMENSIONS);
				if(obj!=null)list.add(obj);
			}
			this.psappbicubedimensions = list;
		}
		return (this.psappbicubedimensions.size() == 0)? null : this.psappbicubedimensions;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimension(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeDimension.class, this.getPSAppBICubeDimensions(), objKey, bTryMode);
	}
	public void setPSAppBICubeDimensions(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> list){
		this.psappbicubedimensions = list;
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> psappbicubemeasures = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> getPSAppBICubeMeasures(){
		if(this.psappbicubemeasures == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBEMEASURES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBICubeMeasure>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBICubeMeasure obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeMeasure.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBICUBEMEASURES);
				if(obj!=null)list.add(obj);
			}
			this.psappbicubemeasures = list;
		}
		return (this.psappbicubemeasures.size() == 0)? null : this.psappbicubemeasures;
	}

	public net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasure(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICubeMeasure.class, this.getPSAppBICubeMeasures(), objKey, bTryMode);
	}
	public void setPSAppBICubeMeasures(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> list){
		this.psappbicubemeasures = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统智能立方体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.view.IPSUIActionGroup porletpsuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPorletPSUIActionGroup(){
		if(this.porletpsuiactiongroup != null) return this.porletpsuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORLETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.porletpsuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPORLETPSUIACTIONGROUP);
		return this.porletpsuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPorletPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPorletPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定门户部件默认界面行为组对象");}
		return value;
	}

	public void setPorletPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup porletpsuiactiongroup){
		this.porletpsuiactiongroup = porletpsuiactiongroup;
	}

}