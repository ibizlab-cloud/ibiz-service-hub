package net.ibizsys.model.dataentity.logic;



public class PSDESysSearchDocActionLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysSearchDocActionLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETPSSYSSEARCHDOC = "getPSSysSearchDoc";
	public final static String ATTR_GETPSSYSSEARCHSCHEME = "getPSSysSearchScheme";
	public final static String ATTR_GETSEARCHDOCACTION = "searchDocAction";
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

	private net.ibizsys.model.search.IPSSysSearchDoc pssyssearchdoc;

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc(){
		if(this.pssyssearchdoc != null) return this.pssyssearchdoc;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHDOC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchScheme ipssyssearchscheme = this.getPSSysSearchSchemeMust();
		this.pssyssearchdoc = ipssyssearchscheme.getPSSysSearchDoc(value, false);
		return this.pssyssearchdoc;
	}

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDocMust(){
		net.ibizsys.model.search.IPSSysSearchDoc value = this.getPSSysSearchDoc();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定检索文档");}
		return value;
	}

	public void setPSSysSearchDoc(net.ibizsys.model.search.IPSSysSearchDoc pssyssearchdoc){
		this.pssyssearchdoc = pssyssearchdoc;
	}

	private net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme;

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme(){
		if(this.pssyssearchscheme != null) return this.pssyssearchscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHSCHEME);
		if(value == null){
			return null;
		}
		this.pssyssearchscheme = getPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEARCHSCHEME);
		return this.pssyssearchscheme;
	}

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust(){
		net.ibizsys.model.search.IPSSysSearchScheme value = this.getPSSysSearchScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索体系");}
		return value;
	}

	public void setPSSysSearchScheme(net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme){
		this.pssyssearchscheme = pssyssearchscheme;
	}


	public java.lang.String getSearchDocAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHDOCACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}