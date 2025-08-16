package net.ibizsys.model.control.form;



public class PSDEFormImpl extends net.ibizsys.model.control.PSAjaxControlContainerImpl implements net.ibizsys.model.control.form.IPSDEForm{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTLABELWIDTH = "defaultLabelWidth";
	public final static String ATTR_GETFORMFUNCMODE = "formFuncMode";
	public final static String ATTR_GETFORMSTYLE = "formStyle";
	public final static String ATTR_GETFORMWIDTH = "formWidth";
	public final static String ATTR_GETPSAPPDEFINPUTTIPSET = "getPSAppDEFInputTipSet";
	public final static String ATTR_GETPSDEFORMITEMUPDATES = "getPSDEFormItemUpdates";
	public final static String ATTR_GETPSDEFORMITEMVRS = "getPSDEFormItemVRs";
	public final static String ATTR_GETPSDEFORMITEMS = "getPSDEFormItems";
	public final static String ATTR_GETPSDEFORMPAGES = "getPSDEFormPages";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETTABHEADERPOS = "tabHeaderPos";
	public final static String ATTR_ISENABLEITEMFILTER = "enableItemFilter";
	public final static String ATTR_ISMOBILECONTROL = "mobileControl";
	public final static String ATTR_ISNOTABHEADER = "noTabHeader";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDefaultLabelWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTLABELWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFormFuncMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMFUNCMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getFormWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.app.res.IPSAppDEFInputTipSet psappdefinputtipset;

	public net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSet(){
		if(this.psappdefinputtipset != null) return this.psappdefinputtipset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFINPUTTIPSET);
		if(value == null){
			return null;
		}
		this.psappdefinputtipset = getPSModelObject(net.ibizsys.model.app.res.IPSAppDEFInputTipSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEFINPUTTIPSET);
		return this.psappdefinputtipset;
	}

	public net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSetMust(){
		net.ibizsys.model.app.res.IPSAppDEFInputTipSet value = this.getPSAppDEFInputTipSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体属性输入提示集合");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> psdeformitemupdates = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> getPSDEFormItemUpdates(){
		if(this.psdeformitemupdates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMUPDATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormItemUpdate>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormItemUpdate obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMITEMUPDATES);
				if(obj!=null)list.add(obj);
			}
			this.psdeformitemupdates = list;
		}
		return (this.psdeformitemupdates.size() == 0)? null : this.psdeformitemupdates;
	}

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItemUpdate.class, this.getPSDEFormItemUpdates(), objKey, bTryMode);
	}
	public void setPSDEFormItemUpdates(java.util.List<net.ibizsys.model.control.form.IPSDEFormItemUpdate> list){
		this.psdeformitemupdates = list;
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> psdeformitemvrs = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> getPSDEFormItemVRs(){
		if(this.psdeformitemvrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMVRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormItemVR>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormItemVR obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItemVR.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMITEMVRS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformitemvrs = list;
		}
		return (this.psdeformitemvrs.size() == 0)? null : this.psdeformitemvrs;
	}

	public net.ibizsys.model.control.form.IPSDEFormItemVR getPSDEFormItemVR(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItemVR.class, this.getPSDEFormItemVRs(), objKey, bTryMode);
	}
	public void setPSDEFormItemVRs(java.util.List<net.ibizsys.model.control.form.IPSDEFormItemVR> list){
		this.psdeformitemvrs = list;
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> psdeformitems = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> getPSDEFormItems(){
		if(this.psdeformitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormItem obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformitems = list;
		}
		return (this.psdeformitems.size() == 0)? null : this.psdeformitems;
	}

	public net.ibizsys.model.control.form.IPSDEFormItem getPSDEFormItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormItem.class, this.getPSDEFormItems(), objKey, bTryMode);
	}
	public void setPSDEFormItems(java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list){
		this.psdeformitems = list;
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> psdeformpages = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> getPSDEFormPages(){
		if(this.psdeformpages == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMPAGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormPage>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormPage obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormPage.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMPAGES);
				if(obj!=null)list.add(obj);
			}
			this.psdeformpages = list;
		}
		return (this.psdeformpages.size() == 0)? null : this.psdeformpages;
	}

	public net.ibizsys.model.control.form.IPSDEFormPage getPSDEFormPage(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormPage.class, this.getPSDEFormPages(), objKey, bTryMode);
	}
	public void setPSDEFormPages(java.util.List<net.ibizsys.model.control.form.IPSDEFormPage> list){
		this.psdeformpages = list;
	}
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	public net.ibizsys.model.control.layout.IPSLayout getPSLayout(){
		if(this.pslayout != null) return this.pslayout;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUT);
		if(value == null){
			return null;
		}
		this.pslayout = getPSModelObject(net.ibizsys.model.control.layout.IPSLayout.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUT);
		return this.pslayout;
	}

	public net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust(){
		net.ibizsys.model.control.layout.IPSLayout value = this.getPSLayout();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表单布局对象");}
		return value;
	}


	public java.lang.String getTabHeaderPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABHEADERPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableItemFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEITEMFILTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMobileControl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILECONTROL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNoTabHeader(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTABHEADER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}