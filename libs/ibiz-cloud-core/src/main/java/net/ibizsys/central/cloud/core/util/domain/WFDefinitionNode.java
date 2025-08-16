package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程定义节点
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/.ibizmodel.index
 */
public class WFDefinitionNode extends WFEntityBase {

  /**.
   * 节点标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODEID/.ibizmodel.index
   */
  public final static String FIELD_USERTASKID = "userTaskId";

  /**.
   * 节点名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODENAME/.ibizmodel.index
   */
  public final static String FIELD_USERTASKNAME = "userTaskName";

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
   * 版本
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/VERSION/.ibizmodel.index
   */
  public final static String FIELD_VERSION = "version";

  /**.
   * 数量
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/CNT/.ibizmodel.index
   */
  public final static String FIELD_CNT = "cnt";

	/**
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	

    /**
     * 设置「节点标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setUserTaskId(String val) {
        this.set(FIELD_USERTASKID, val);
        return this;
    }

    /**
     * 获取「节点标识」值
     *
    */
    @JsonIgnore
    public String getUserTaskId() {
        return (String) this.get(FIELD_USERTASKID);
    }

    /**
     * 判断 「节点标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserTaskId() {
        return this.contains(FIELD_USERTASKID);
    }

    /**
     * 重置 「节点标识」
     *
    */
    @JsonIgnore
    public WFDefinitionNode resetUserTaskId() {
        this.reset(FIELD_USERTASKID);
        return this;
    }

    /**
     * 设置「节点名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setUserTaskName(String val) {
        this.set(FIELD_USERTASKNAME, val);
        return this;
    }

    /**
     * 获取「节点名称」值
     *
    */
    @JsonIgnore
    public String getUserTaskName() {
        return (String) this.get(FIELD_USERTASKNAME);
    }

    /**
     * 判断 「节点名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserTaskName() {
        return this.contains(FIELD_USERTASKNAME);
    }

    /**
     * 重置 「节点名称」
     *
    */
    @JsonIgnore
    public WFDefinitionNode resetUserTaskName() {
        this.reset(FIELD_USERTASKNAME);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setProcessDefinitionKey(String val) {
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
    public WFDefinitionNode resetProcessDefinitionKey() {
        this.reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程定义名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setProcessDefinitionName(String val) {
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
    public WFDefinitionNode resetProcessDefinitionName() {
        this.reset(FIELD_PROCESSDEFINITIONNAME);
        return this;
    }

    /**
     * 设置「版本」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setVersion(Integer val) {
        this.set(FIELD_VERSION, val);
        return this;
    }

    /**
     * 获取「版本」值
     *
    */
    @JsonIgnore
    public Integer getVersion() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_VERSION),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「版本」是否有值
     *
    */
    @JsonIgnore
    public boolean containsVersion() {
        return this.contains(FIELD_VERSION);
    }

    /**
     * 重置 「版本」
     *
    */
    @JsonIgnore
    public WFDefinitionNode resetVersion() {
        this.reset(FIELD_VERSION);
        return this;
    }

    /**
     * 设置「数量」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNode setCnt(Integer val) {
        this.set(FIELD_CNT, val);
        return this;
    }

    /**
     * 获取「数量」值
     *
    */
    @JsonIgnore
    public Integer getCnt() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_CNT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「数量」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCnt() {
        return this.contains(FIELD_CNT);
    }

    /**
     * 重置 「数量」
     *
    */
    @JsonIgnore
    public WFDefinitionNode resetCnt() {
        this.reset(FIELD_CNT);
        return this;
    }


}
