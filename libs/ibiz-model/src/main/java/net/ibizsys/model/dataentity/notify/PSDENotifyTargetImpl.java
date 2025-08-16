package net.ibizsys.model.dataentity.notify;



public class PSDENotifyTargetImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.notify.IPSDENotifyTarget{

	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETFILTER = "filter";
	public final static String ATTR_GETPSSYSMSGTARGET = "getPSSysMsgTarget";
	public final static String ATTR_GETTARGETPSDEFIELD = "getTargetPSDEField";
	public final static String ATTR_GETTARGETTYPE = "targetType";
	public final static String ATTR_GETTARGETTYPEPSDEFIELD = "getTargetTypePSDEField";

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.msg.IPSSysMsgTarget pssysmsgtar;

	public net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTarget(){
		if(this.pssysmsgtar != null) return this.pssysmsgtar;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTARGET);
		if(value == null){
			return null;
		}
		this.pssysmsgtar = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTarget.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTARGET);
		return this.pssysmsgtar;
	}

	public net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTargetMust(){
		net.ibizsys.model.msg.IPSSysMsgTarget value = this.getPSSysMsgTarget();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统消息目标");}
		return value;
	}

	public void setPSSysMsgTarget(net.ibizsys.model.msg.IPSSysMsgTarget pssysmsgtar){
		this.pssysmsgtar = pssysmsgtar;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tarpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEField(){
		if(this.tarpsdefield != null) return this.tarpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.tarpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tarpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTargetPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标标识值存储属性");}
		return value;
	}

	public void setTargetPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tarpsdefield){
		this.tarpsdefield = tarpsdefield;
	}


	public java.lang.String getTargetType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField tartypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEField(){
		if(this.tartypepsdefield != null) return this.tartypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.tartypepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tartypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTargetTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标类型值存储属性");}
		return value;
	}

	public void setTargetTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tartypepsdefield){
		this.tartypepsdefield = tartypepsdefield;
	}

}