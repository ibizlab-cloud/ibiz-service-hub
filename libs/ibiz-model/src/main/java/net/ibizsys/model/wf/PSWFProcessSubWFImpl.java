package net.ibizsys.model.wf;



public class PSWFProcessSubWFImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFProcessSubWF{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSWFVERSION = "getPSWFVersion";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套流程实体数据集");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套流程实体");}
		return value;
	}

	private net.ibizsys.model.wf.IPSWFVersion pswfversion;

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersion(){
		if(this.pswfversion != null) return this.pswfversion;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFVERSION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.wf.IPSWorkflow ipsworkflow = this.getPSWorkflowMust();
		this.pswfversion = ipsworkflow.getPSWFVersion(value, false);
		return this.pswfversion;
	}

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust(){
		net.ibizsys.model.wf.IPSWFVersion value = this.getPSWFVersion();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套流程版本");}
		return value;
	}

	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(){
		if(this.psworkflow != null) return this.psworkflow;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOW);
		if(value == null){
			return null;
		}
		this.psworkflow = getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWORKFLOW);
		return this.psworkflow;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getPSWorkflow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌套流程");}
		return value;
	}

}