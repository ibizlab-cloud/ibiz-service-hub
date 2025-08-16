package net.ibizsys.model.control.rawitem;



public class PSRawItemImplBase extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSRawItemBase{

	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETPSCONTROLATTRIBUTES = "getPSControlAttributes";
	public final static String ATTR_GETPSCONTROLLOGICS = "getPSControlLogics";
	public final static String ATTR_GETPSCONTROLRENDERS = "getPSControlRenders";
	public final static String ATTR_GETPSRAWITEMPARAMS = "getPSRawItemParams";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETRAWITEMHEIGHT = "rawItemHeight";
	public final static String ATTR_GETRAWITEMWIDTH = "rawItemWidth";
	public final static String ATTR_ISTEMPLATEMODE = "templateMode";

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
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

	private java.util.List<net.ibizsys.model.control.IPSRawItemParam> psrawitemparams = null;
	public java.util.List<net.ibizsys.model.control.IPSRawItemParam> getPSRawItemParams(){
		if(this.psrawitemparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSRAWITEMPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSRawItemParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSRawItemParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSRawItemParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSRawItemParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSRAWITEMPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psrawitemparams = list;
		}
		return (this.psrawitemparams.size() == 0)? null : this.psrawitemparams;
	}

	public net.ibizsys.model.control.IPSRawItemParam getPSRawItemParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSRawItemParam.class, this.getPSRawItemParams(), objKey, bTryMode);
	}
	public void setPSRawItemParams(java.util.List<net.ibizsys.model.control.IPSRawItemParam> list){
		this.psrawitemparams = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统样式表");}
		return value;
	}


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getRawItemHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWITEMHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getRawItemWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWITEMWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public boolean isTemplateMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTEMPLATEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}