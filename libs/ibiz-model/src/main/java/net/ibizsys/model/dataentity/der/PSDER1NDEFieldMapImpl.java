package net.ibizsys.model.dataentity.der;



public class PSDER1NDEFieldMapImpl extends net.ibizsys.model.dataentity.der.PSDERDEFieldMapImpl implements net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMAJORPSDEFIELD = "getMajorPSDEField";
	public final static String ATTR_GETMAPTYPE = "mapType";
	public final static String ATTR_GETMINORPSDEDATAQUERY = "getMinorPSDEDataQuery";
	public final static String ATTR_GETMINORPSDEFIELD = "getMinorPSDEField";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEField(){
		if(this.majorpsdefield != null) return this.majorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.der.IPSDER1N ipsder1n = getParentPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class);
		this.majorpsdefield = ipsder1n.getMajorPSDataEntityMust().getPSDEField(value, false);
		return this.majorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMajorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体属性");}
		return value;
	}

	public void setMajorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield){
		this.majorpsdefield = majorpsdefield;
	}


	public java.lang.String getMapType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery minorpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getMinorPSDEDataQuery(){
		if(this.minorpsdedataquery != null) return this.minorpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.der.IPSDER1N ipsder1n = getParentPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class);
		this.minorpsdedataquery = ipsder1n.getMinorPSDataEntityMust().getPSDEDataQuery(value, false);
		return this.minorpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getMinorPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getMinorPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从实体数据查询");}
		return value;
	}

	public void setMinorPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery minorpsdedataquery){
		this.minorpsdedataquery = minorpsdedataquery;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField minorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEField(){
		if(this.minorpsdefield != null) return this.minorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.der.IPSDER1N ipsder1n = getParentPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class);
		this.minorpsdefield = ipsder1n.getMinorPSDataEntityMust().getPSDEField(value, false);
		return this.minorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMinorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从实体属性");}
		return value;
	}

	public void setMinorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField minorpsdefield){
		this.minorpsdefield = minorpsdefield;
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

}