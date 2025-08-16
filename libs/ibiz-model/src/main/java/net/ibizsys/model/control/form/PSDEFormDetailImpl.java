package net.ibizsys.model.control.form;



public class PSDEFormDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.layout.IPSLayoutItem{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLUMNALIGN = "columnAlign";
	public final static String ATTR_GETCONTENTHEIGHT = "contentHeight";
	public final static String ATTR_GETCONTENTWIDTH = "contentWidth";
	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETCOUNTERMODE = "counterMode";
	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETDETAILSTYLE = "detailStyle";
	public final static String ATTR_GETDETAILTYPE = "detailType";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLABELCSSSTYLE = "labelCssStyle";
	public final static String ATTR_GETLABELDYNACLASS = "labelDynaClass";
	public final static String ATTR_GETLABELPSSYSCSS = "getLabelPSSysCss";
	public final static String ATTR_GETMODELSTATE = "modelState";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSCONTROLATTRIBUTES = "getPSControlAttributes";
	public final static String ATTR_GETPSCONTROLLOGICS = "getPSControlLogics";
	public final static String ATTR_GETPSCONTROLRENDERS = "getPSControlRenders";
	public final static String ATTR_GETPSDEFDGROUPLOGICS = "getPSDEFDGroupLogics";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETPSLAYOUTPOS = "getPSLayoutPos";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETSHOWMOREMGRPSDEFORMDETAIL = "getShowMoreMgrPSDEFormDetail";
	public final static String ATTR_GETSHOWMOREMODE = "showMoreMode";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISREPEATCONTENT = "repeatContent";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
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

	public java.lang.String getColumnAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getContentHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getContentWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public java.lang.String getCounterId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCounterMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public java.lang.String getLabelCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLabelDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysCss labelpssyscss;

	public net.ibizsys.model.res.IPSSysCss getLabelPSSysCss(){
		if(this.labelpssyscss != null) return this.labelpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLABELPSSYSCSS);
		if(value == null){
			return null;
		}
		this.labelpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLABELPSSYSCSS);
		return this.labelpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getLabelPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员标签样式表");}
		return value;
	}


	public int getModelState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELSTATE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.form.IPSDEForm ipsdeform = getParentPSModelObject(net.ibizsys.model.control.form.IPSDEForm.class);
		this.psappcounterref = ipsdeform.getPSAppCounterRef(value, false);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlAttribute> pscontrolattributes = null;
	public java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes(){
		if(this.pscontrolattributes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLATTRIBUTES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlAttribute> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlAttribute>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlAttribute obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLATTRIBUTES);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolattributes = list;
		}
		return (this.pscontrolattributes.size() == 0)? null : this.pscontrolattributes;
	}

	public net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, this.getPSControlAttributes(), objKey, bTryMode);
	}
	public void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list){
		this.pscontrolattributes = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlLogic> pscontrollogics = null;
	public java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics(){
		if(this.pscontrollogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlLogic> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlLogic obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrollogics = list;
		}
		return (this.pscontrollogics.size() == 0)? null : this.pscontrollogics;
	}

	public net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, this.getPSControlLogics(), objKey, bTryMode);
	}
	public void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list){
		this.pscontrollogics = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlRender> pscontrolrenders = null;
	public java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders(){
		if(this.pscontrolrenders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLRENDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlRender> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlRender>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlRender obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLRENDERS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolrenders = list;
		}
		return (this.pscontrolrenders.size() == 0)? null : this.pscontrolrenders;
	}

	public net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, this.getPSControlRenders(), objKey, bTryMode);
	}
	public void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list){
		this.pscontrolrenders = list;
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> psdefdgrouplogics = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> getPSDEFDGroupLogics(){
		if(this.psdefdgrouplogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFDGROUPLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFDCatGroupLogic obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFDCatGroupLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFDGROUPLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.psdefdgrouplogics = list;
		}
		return (this.psdefdgrouplogics.size() == 0)? null : this.psdefdgrouplogics;
	}

	public net.ibizsys.model.control.form.IPSDEFDCatGroupLogic getPSDEFDCatGroupLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFDCatGroupLogic.class, this.getPSDEFDGroupLogics(), objKey, bTryMode);
	}
	public void setPSDEFDCatGroupLogics(java.util.List<net.ibizsys.model.control.form.IPSDEFDCatGroupLogic> list){
		this.psdefdgrouplogics = list;
	}
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	@Deprecated
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSLayout]返回空值");}
		return value;
	}

	private net.ibizsys.model.control.layout.IPSLayoutPos pslayoutpos;

	public net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos(){
		if(this.pslayoutpos != null) return this.pslayoutpos;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPOS);
		if(value == null){
			return null;
		}
		this.pslayoutpos = getPSModelObject(net.ibizsys.model.control.layout.IPSLayoutPos.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPOS);
		return this.pslayoutpos;
	}

	public net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust(){
		net.ibizsys.model.control.layout.IPSLayoutPos value = this.getPSLayoutPos();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局位置");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员样式表");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员图标");}
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

	private net.ibizsys.model.control.form.IPSDEFormDetail showmoremgrpsdeformdetail;

	public net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetail(){
		if(this.showmoremgrpsdeformdetail != null) return this.showmoremgrpsdeformdetail;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHOWMOREMGRPSDEFORMDETAIL);
		if(value == null){
			return null;
		}
		this.showmoremgrpsdeformdetail = getPSModelObject(net.ibizsys.model.control.form.IPSDEFormDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSHOWMOREMGRPSDEFORMDETAIL);
		return this.showmoremgrpsdeformdetail;
	}

	public net.ibizsys.model.control.form.IPSDEFormDetail getShowMoreMgrPSDEFormDetailMust(){
		net.ibizsys.model.control.form.IPSDEFormDetail value = this.getShowMoreMgrPSDEFormDetail();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示更多管理者");}
		return value;
	}


	public int getShowMoreMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHOWMOREMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public double getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public boolean isRepeatContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPEATCONTENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}