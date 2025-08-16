package net.ibizsys.model.dataentity.logic;



public class PSDEMergeParamLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEMergeParamLogic{

	public final static String ATTR_GETCOPYFIELDS = "copyFields";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPARAMMERGEFIELD = "dstParamMergeField";
	public final static String ATTR_GETMERGEMODE = "mergeMode";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
	public final static String ATTR_GETSRCPSDELOGICPARAM = "getSrcPSDELogicParam";
	public final static String ATTR_GETSRCPARAMMERGEFIELD = "srcParamMergeField";
	public final static String ATTR_ISCOPYIFNOTEXISTS = "copyIfNotExists";
	public final static String ATTR_ISMERGEINTOFIELD = "mergeIntoField";

	private java.util.List<java.lang.String> copyfields = null;
	public java.util.List<java.lang.String> getCopyFields(){
		if(this.copyfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOPYFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.copyfields = list;
		}
		return (this.copyfields.size() == 0)? null : this.copyfields;
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam(){
		if(this.dstpsdelogicparam != null) return this.dstpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.dstpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getDstPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}


	public java.lang.String getDstParamMergeField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPARAMMERGEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMergeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMERGEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam(){
		if(this.retpsdelogicparam != null) return this.retpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.retpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.retpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getRetPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回值绑定逻辑参数对象");}
		return value;
	}

	public void setRetPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam){
		this.retpsdelogicparam = retpsdelogicparam;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam(){
		if(this.srcpsdelogicparam != null) return this.srcpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.srcpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.srcpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getSrcPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数对象");}
		return value;
	}

	public void setSrcPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam){
		this.srcpsdelogicparam = srcpsdelogicparam;
	}


	public java.lang.String getSrcParamMergeField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPARAMMERGEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCopyIfNotExists(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCOPYIFNOTEXISTS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMergeIntoField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMERGEINTOFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}