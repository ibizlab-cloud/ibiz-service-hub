package net.ibizsys.model.dataentity.priv;



public class PSDEOPPrivImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.priv.IPSDEOPPriv
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAPPSDENAME = "mapPSDEName";
	public final static String ATTR_GETMAPPSDEOPPRIVNAME = "mapPSDEOPPrivName";
	public final static String ATTR_GETMAPPSDER = "getMapPSDER";
	public final static String ATTR_GETMAPPSDATAENTITY = "getMapPSDataEntity";
	public final static String ATTR_GETMAPPSSYSUNIRES = "getMapPSSysUniRes";
	public final static String ATTR_GETMAPSYSUNIRESCODE = "mapSysUniResCode";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_ISMAPSYSUNIRES = "mapSysUniRes";
	public final static String ATTR_ISSYSTEMRESERVED = "systemReserved";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMapPSDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPSDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMapPSDEOPPrivName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPSDEOPPRIVNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase mappsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getMapPSDER(){
		if(this.mappsder != null) return this.mappsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPSDER);
		if(value == null){
			return null;
		}
		this.mappsder = this.getMapPSDataEntityMust().getMajorPSDERBase(value, false);
		return this.mappsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getMapPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getMapPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定映射关系对象");}
		return value;
	}

	public void setMapPSDER(net.ibizsys.model.dataentity.der.IPSDERBase mappsder){
		this.mappsder = mappsder;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity mappsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getMapPSDataEntity(){
		if(this.mappsdataentity != null) return this.mappsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.mappsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAPPSDATAENTITY);
		return this.mappsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getMapPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getMapPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定映射实体对象");}
		return value;
	}

	public void setMapPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity mappsdataentity){
		this.mappsdataentity = mappsdataentity;
	}

	private net.ibizsys.model.security.IPSSysUniRes mappssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getMapPSSysUniRes(){
		if(this.mappssysunires != null) return this.mappssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.mappssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAPPSSYSUNIRES);
		return this.mappssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getMapPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getMapPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统统一资源");}
		return value;
	}

	public void setMapPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes mappssysunires){
		this.mappssysunires = mappssysunires;
	}


	public java.lang.String getMapSysUniResCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAPSYSUNIRESCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isMapSysUniRes(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAPSYSUNIRES);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSystemReserved(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSYSTEMRESERVED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}