package net.ibizsys.model.dataentity.ds;



public class PSDEFilterDTOFieldImpl extends net.ibizsys.model.dataentity.service.PSDEMethodDTOFieldImpl implements net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField
		,net.ibizsys.model.dataentity.ds.IPSDEDataSetInputDTOField{

	public final static String ATTR_GETPSDEFSEARCHMODE = "getPSDEFSearchMode";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(){
		if(this.psdefsearchmode != null) return this.psdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.defield.IPSDEField ipsdefield = this.getPSDEFieldMust();
		this.psdefsearchmode = ipsdefield.getPSDEFSearchMode(value, false);
		return this.psdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性搜索模式");}
		return value;
	}

	public void setPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode){
		this.psdefsearchmode = psdefsearchmode;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}

}