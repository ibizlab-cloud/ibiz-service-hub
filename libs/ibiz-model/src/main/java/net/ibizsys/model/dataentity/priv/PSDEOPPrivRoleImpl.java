package net.ibizsys.model.dataentity.priv;



public class PSDEOPPrivRoleImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.priv.IPSDEOPPrivRole
		,net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv{

	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSDEDATAQUERY = "getPSDEDataQuery";
	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";

	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(){
		if(this.psdedataquery != null) return this.psdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataquery = ipsdataentity.getPSDEDataQuery(value, false);
		return this.psdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据查询");}
		return value;
	}

	public void setPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery psdedataquery){
		this.psdedataquery = psdedataquery;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(){
		if(this.psdeoppriv != null) return this.psdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEOPPRIV);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdeoppriv = ipsdataentity.getPSDEOPPriv(value, false);
		return this.psdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getPSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体操作标识");}
		return value;
	}

	public void setPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv){
		this.psdeoppriv = psdeoppriv;
	}

}