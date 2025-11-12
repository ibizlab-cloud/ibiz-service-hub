package net.ibizsys.model.res;



public class PSSysSequenceImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysSequence{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEXTFORMATPARAMS = "extFormatParams";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSEQUENCEFORMAT = "sequenceFormat";
	public final static String ATTR_GETSEQUENCEPARAMS = "sequenceParams";
	public final static String ATTR_GETSEQUENCETAG = "sequenceTag";
	public final static String ATTR_GETSEQUENCETAG2 = "sequenceTag2";
	public final static String ATTR_GETSEQUENCETYPE = "sequenceType";
	public final static String ATTR_GETTIMEFORMAT = "timeFormat";
	public final static String ATTR_GETTIMEPSDEFIELD = "getTimePSDEField";
	public final static String ATTR_GETTYPEPSDEFIELD = "getTypePSDEField";
	public final static String ATTR_GETVALUEPSDEFIELD = "getValuePSDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] extformatparams = null;
	public java.lang.String[] getExtFormatParams(){
		if(this.extformatparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTFORMATPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.extformatparams = array;
		}
		return this.extformatparams;
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.keypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标识存储属性");}
		return value;
	}

	public void setKeyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield){
		this.keypsdefield = keypsdefield;
	}


	public java.math.BigInteger getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return java.math.BigInteger.valueOf(value.asLong());
	}

	public java.math.BigInteger getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return java.math.BigInteger.valueOf(value.asLong());
	}
	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端模板插件对象");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}


	public java.lang.String getSequenceFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getSequenceParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getSequenceTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSequenceTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSequenceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTimeFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField timepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEField(){
		if(this.timepsdefield != null) return this.timepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.timepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.timepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTimePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定时间存储属性");}
		return value;
	}

	public void setTimePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField timepsdefield){
		this.timepsdefield = timepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField typepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEField(){
		if(this.typepsdefield != null) return this.typepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.typepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.typepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定类型存储属性");}
		return value;
	}

	public void setTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField typepsdefield){
		this.typepsdefield = typepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField(){
		if(this.valuepsdefield != null) return this.valuepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.valuepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.valuepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值存储属性");}
		return value;
	}

	public void setValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield){
		this.valuepsdefield = valuepsdefield;
	}

}