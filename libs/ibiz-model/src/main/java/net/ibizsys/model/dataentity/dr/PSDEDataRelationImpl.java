package net.ibizsys.model.dataentity.dr;



public class PSDEDataRelationImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dr.IPSDEDataRelation
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETFORMCAPPSLANGUAGERES = "getFormCapPSLanguageRes";
	public final static String ATTR_GETFORMCAPTION = "formCaption";
	public final static String ATTR_GETFORMPSSYSIMAGE = "getFormPSSysImage";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEDRDETAILS = "getPSDEDRDetails";
	public final static String ATTR_GETPSSYSCOUNTER = "getPSSysCounter";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISHIDEEDITITEM = "hideEditItem";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes formcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getFormCapPSLanguageRes(){
		if(this.formcappslanguageres != null) return this.formcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.formcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFORMCAPPSLANGUAGERES);
		return this.formcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getFormCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getFormCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定编辑项标题语言资源");}
		return value;
	}

	public void setFormCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes formcappslanguageres){
		this.formcappslanguageres = formcappslanguageres;
	}


	public java.lang.String getFormCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysImage formpssysimage;

	public net.ibizsys.model.res.IPSSysImage getFormPSSysImage(){
		if(this.formpssysimage != null) return this.formpssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.formpssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFORMPSSYSIMAGE);
		return this.formpssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getFormPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getFormPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定编辑项图标资源");}
		return value;
	}

	public void setFormPSSysImage(net.ibizsys.model.res.IPSSysImage formpssysimage){
		this.formpssysimage = formpssysimage;
	}


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> psdedrdetails = null;
	public java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> getPSDEDRDetails(){
		if(this.psdedrdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dr.IPSDEDRDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dr.IPSDEDRDetail obj = this.getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDRDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdedrdetails = list;
		}
		return (this.psdedrdetails.size() == 0)? null : this.psdedrdetails;
	}

	public net.ibizsys.model.dataentity.dr.IPSDEDRDetail getPSDEDRDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRDetail.class, this.getPSDEDRDetails(), objKey, bTryMode);
	}
	public void setPSDEDRDetails(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRDetail> list){
		this.psdedrdetails = list;
	}
	private net.ibizsys.model.control.counter.IPSSysCounter pssyscounter;

	public net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounter(){
		if(this.pssyscounter != null) return this.pssyscounter;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCOUNTER);
		if(value == null){
			return null;
		}
		this.pssyscounter = getPSModelObject(net.ibizsys.model.control.counter.IPSSysCounter.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCOUNTER);
		return this.pssyscounter;
	}

	public net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounterMust(){
		net.ibizsys.model.control.counter.IPSSysCounter value = this.getPSSysCounter();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统计数器");}
		return value;
	}

	public void setPSSysCounter(net.ibizsys.model.control.counter.IPSSysCounter pssyscounter){
		this.pssyscounter = pssyscounter;
	}


	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHideEditItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDEEDITITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}