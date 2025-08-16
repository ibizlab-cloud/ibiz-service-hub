package net.ibizsys.model.dataentity.der;



public class PSDERBaseImpl extends net.ibizsys.model.PSSystemObjectImplBase implements net.ibizsys.model.dataentity.der.IPSDERBase{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDERTAG = "dERTag";
	public final static String ATTR_GETDERTAG2 = "dERTag2";
	public final static String ATTR_GETDERTYPE = "dERType";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAJORPSDATAENTITY = "getMajorPSDataEntity";
	public final static String ATTR_GETMINORCODENAME = "minorCodeName";
	public final static String ATTR_GETMINORLOGICNAME = "minorLogicName";
	public final static String ATTR_GETMINORPSDATAENTITY = "getMinorPSDataEntity";
	public final static String ATTR_GETMINORSERVICECODENAME = "minorServiceCodeName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDERTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDERTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDERType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDERTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity majorpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntity(){
		if(this.majorpsdataentity != null) return this.majorpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDATAENTITY);
		if(value == null){
			throw new net.ibizsys.model.PSModelException(this, "未指定[主实体]的值");
		}
		this.majorpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMAJORPSDATAENTITY);
		return this.majorpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getMajorPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体");}
		return value;
	}

	public void setMajorPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity majorpsdataentity){
		this.majorpsdataentity = majorpsdataentity;
	}


	public java.lang.String getMinorCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity minorpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getMinorPSDataEntity(){
		if(this.minorpsdataentity != null) return this.minorpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDATAENTITY);
		if(value == null){
			throw new net.ibizsys.model.PSModelException(this, "未指定[关系实体]的值");
		}
		this.minorpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORPSDATAENTITY);
		return this.minorpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getMinorPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getMinorPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系实体");}
		return value;
	}

	public void setMinorPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity minorpsdataentity){
		this.minorpsdataentity = minorpsdataentity;
	}


	public java.lang.String getMinorServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSERVICECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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


	public java.lang.String getServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}