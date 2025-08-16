package net.ibizsys.model.dataentity.defield;



public class PSLinkDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSLinkDEField{

	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETPSDER = "getPSDER";
	public final static String ATTR_GETREALPSDEFIELD = "getRealPSDEField";
	public final static String ATTR_GETREALPSDATAENTITY = "getRealPSDataEntity";
	public final static String ATTR_GETRELATEDPSDEFIELD = "getRelatedPSDEField";
	public final static String ATTR_GETRELATEDPSDATAENTITY = "getRelatedPSDataEntity";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_ISDYNASTORAGEDEFIELD = "dynaStorageDEField";
	public final static String ATTR_ISLINKDEFIELD = "linkDEField";
	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";
	public final static String ATTR_ISUIASSISTDEFIELD = "uIAssistDEField";

	public java.lang.String getJsonFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJSONFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			return null;
		}
		this.psder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体关系对象");}
		return value;
	}

	public void setPSDER(net.ibizsys.model.dataentity.der.IPSDERBase psder){
		this.psder = psder;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField realpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getRealPSDEField(){
		if(this.realpsdefield != null) return this.realpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALPSDEFIELD);
		if(value == null){
			return null;
		}
		this.realpsdefield = this.getRealPSDataEntityMust().getPSDEField(value, false);
		return this.realpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getRealPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getRealPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实际链接物理属性");}
		return value;
	}

	public void setRealPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField realpsdefield){
		this.realpsdefield = realpsdefield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity realpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getRealPSDataEntity(){
		if(this.realpsdataentity != null) return this.realpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.realpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREALPSDATAENTITY);
		return this.realpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getRealPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getRealPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实际属性所在实体");}
		return value;
	}

	public void setRealPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity realpsdataentity){
		this.realpsdataentity = realpsdataentity;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField relatedpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getRelatedPSDEField(){
		if(this.relatedpsdefield != null) return this.relatedpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDPSDEFIELD);
		if(value == null){
			return null;
		}
		this.relatedpsdefield = this.getRelatedPSDataEntityMust().getPSDEField(value, false);
		return this.relatedpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getRelatedPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getRelatedPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定链接属性");}
		return value;
	}

	public void setRelatedPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField relatedpsdefield){
		this.relatedpsdefield = relatedpsdefield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity relatedpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntity(){
		if(this.relatedpsdataentity != null) return this.relatedpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELATEDPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.relatedpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETRELATEDPSDATAENTITY);
		return this.relatedpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getRelatedPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定链接属性所在实体");}
		return value;
	}

	public void setRelatedPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity relatedpsdataentity){
		this.relatedpsdataentity = relatedpsdataentity;
	}


	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDynaStorageDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDYNASTORAGEDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLinkDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLINKDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isUIAssistDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUIASSISTDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}