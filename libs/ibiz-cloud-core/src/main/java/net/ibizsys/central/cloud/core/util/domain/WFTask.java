package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 工作流任务
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/.ibizmodel.index
 */
public class WFTask extends WFEntityBase {

  /**.
   * 任务标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODEID/.ibizmodel.index
   */
  public final static String FIELD_ID = "userTaskId";

  /**.
   * 任务名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODENAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "userTaskName";

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONKEY = "processDefinitionKey";

  /**.
   * 流程定义名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/DEFINITIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONNAME = "processDefinitionName";



  /**.
   * 数量
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/CNT/.ibizmodel.index
   */
  public final static String FIELD_CREATETIME = "createTime";
  
  
  /**.
   * 描述信息
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/CNT/.ibizmodel.index
   */
  public final static String FIELD_DESCRIPTION = "description";
  

	/**
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	

    /**
     * 设置「任务标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「任务标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「任务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「任务标识」
     *
    */
    @JsonIgnore
    public WFTask resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「任务名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「任务名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this.get(FIELD_NAME);
    }

    /**
     * 判断 「任务名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「任务名称」
     *
    */
    @JsonIgnore
    public WFTask resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setProcessDefinitionKey(String val) {
        this.set(FIELD_PROCESSDEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「DefinitionKey」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionKey() {
        return (String) this.get(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 判断 「DefinitionKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionKey() {
        return this.contains(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 重置 「DefinitionKey」
     *
    */
    @JsonIgnore
    public WFTask resetProcessDefinitionKey() {
        this.reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程定义名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setProcessDefinitionName(String val) {
        this.set(FIELD_PROCESSDEFINITIONNAME, val);
        return this;
    }

    /**
     * 获取「流程定义名称」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionName() {
        return (String) this.get(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 判断 「流程定义名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionName() {
        return this.contains(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 重置 「流程定义名称」
     *
    */
    @JsonIgnore
    public WFTask resetProcessDefinitionName() {
        this.reset(FIELD_PROCESSDEFINITIONNAME);
        return this;
    }

    
    /**
     * 设置「时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setCreateTime(Timestamp val) {
        this.set(FIELD_CREATETIME, val);
        return this;
    }

    /**
     * 获取「时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATETIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this.contains(FIELD_CREATETIME);
    }

    /**
     * 重置 「时间」
     *
    */
    @JsonIgnore
    public WFTask resetCreateTime() {
        this.reset(FIELD_CREATETIME);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public WFTask setMemo(String val) {
        this.set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this.get(FIELD_DESCRIPTION);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this.contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public WFTask resetMemo() {
        this.reset(FIELD_DESCRIPTION);
        return this;
    }

}
