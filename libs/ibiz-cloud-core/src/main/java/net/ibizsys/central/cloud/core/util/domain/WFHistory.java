package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 历史
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/.ibizmodel.index
 */
public class WFHistory extends WFEntityBase {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/HISTID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 操作者标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/AUTHOR/.ibizmodel.index
   */
  public final static String FIELD_AUTHOR = "author";

  /**.
   * 操作者
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/AUTHORNAME/.ibizmodel.index
   */
  public final static String FIELD_AUTHORNAME = "authorName";

  /**.
   * 意见
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/MESSAGE/.ibizmodel.index
   */
  public final static String FIELD_FULLMESSAGE = "fullMessage";

  /**.
   * 时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/ACTIONTIME/.ibizmodel.index
   */
  public final static String FIELD_TIME = "time";

  /**.
   * 意见类型
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/ACTIONTYPE/.ibizmodel.index
   */
  public final static String FIELD_TYPE = "type";

  /**.
   * 任务标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/TASKID/.ibizmodel.index
   */
  public final static String FIELD_TASKID = "taskId";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/INSTANCEID/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEID = "processInstanceId";

  /**.
   * 业务键值
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/BUSINESSKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSINSTANCEBUSINESSKEY = "processInstanceBusinessKey";

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/APPID/.ibizmodel.index
   */
  public final static String FIELD_APPID = "appid";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 实体
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 流程定义标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/PROCESSDEFKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFKEY = "processdefkey";

  /**.
   * 流程实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/REALINSTID/.ibizmodel.index
   */
  public final static String FIELD_REALINSTID = "realinstid";

  /**.
   * 步骤标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdefields/TASKDEFKEY/.ibizmodel.index
   */
  public final static String FIELD_TASKDEFINITIONKEY = "taskdefinitionkey";

  /**
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}

    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public WFHistory resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「操作者标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setAuthor(String val) {
        this.set(FIELD_AUTHOR, val);
        return this;
    }

    /**
     * 获取「操作者标识」值
     *
    */
    @JsonIgnore
    public String getAuthor() {
        return (String) this.get(FIELD_AUTHOR);
    }

    /**
     * 判断 「操作者标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthor() {
        return this.contains(FIELD_AUTHOR);
    }

    /**
     * 重置 「操作者标识」
     *
    */
    @JsonIgnore
    public WFHistory resetAuthor() {
        this.reset(FIELD_AUTHOR);
        return this;
    }

    /**
     * 设置「操作者」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setAuthorName(String val) {
        this.set(FIELD_AUTHORNAME, val);
        return this;
    }

    /**
     * 获取「操作者」值
     *
    */
    @JsonIgnore
    public String getAuthorName() {
        return (String) this.get(FIELD_AUTHORNAME);
    }

    /**
     * 判断 「操作者」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthorName() {
        return this.contains(FIELD_AUTHORNAME);
    }

    /**
     * 重置 「操作者」
     *
    */
    @JsonIgnore
    public WFHistory resetAuthorName() {
        this.reset(FIELD_AUTHORNAME);
        return this;
    }

    /**
     * 设置「意见」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setFullMessage(String val) {
        this.set(FIELD_FULLMESSAGE, val);
        return this;
    }

    /**
     * 获取「意见」值
     *
    */
    @JsonIgnore
    public String getFullMessage() {
        return (String) this.get(FIELD_FULLMESSAGE);
    }

    /**
     * 判断 「意见」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFullMessage() {
        return this.contains(FIELD_FULLMESSAGE);
    }

    /**
     * 重置 「意见」
     *
    */
    @JsonIgnore
    public WFHistory resetFullMessage() {
        this.reset(FIELD_FULLMESSAGE);
        return this;
    }

    /**
     * 设置「时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setTime(Timestamp val) {
        this.set(FIELD_TIME, val);
        return this;
    }

    /**
     * 获取「时间」值
     *
    */
    @JsonIgnore
    public Timestamp getTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTime() {
        return this.contains(FIELD_TIME);
    }

    /**
     * 重置 「时间」
     *
    */
    @JsonIgnore
    public WFHistory resetTime() {
        this.reset(FIELD_TIME);
        return this;
    }

    /**
     * 设置「意见类型」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setType(String val) {
        this.set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「意见类型」值
     *
    */
    @JsonIgnore
    public String getType() {
        return (String) this.get(FIELD_TYPE);
    }

    /**
     * 判断 「意见类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsType() {
        return this.contains(FIELD_TYPE);
    }

    /**
     * 重置 「意见类型」
     *
    */
    @JsonIgnore
    public WFHistory resetType() {
        this.reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「任务标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setTaskId(String val) {
        this.set(FIELD_TASKID, val);
        return this;
    }

    /**
     * 获取「任务标识」值
     *
    */
    @JsonIgnore
    public String getTaskId() {
        return (String) this.get(FIELD_TASKID);
    }

    /**
     * 判断 「任务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskId() {
        return this.contains(FIELD_TASKID);
    }

    /**
     * 重置 「任务标识」
     *
    */
    @JsonIgnore
    public WFHistory resetTaskId() {
        this.reset(FIELD_TASKID);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setProcessInstanceId(String val) {
        this.set(FIELD_PROCESSINSTANCEID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getProcessInstanceId() {
        return (String) this.get(FIELD_PROCESSINSTANCEID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessInstanceId() {
        return this.contains(FIELD_PROCESSINSTANCEID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public WFHistory resetProcessInstanceId() {
        this.reset(FIELD_PROCESSINSTANCEID);
        return this;
    }

    /**
     * 设置「业务键值」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setProcessInstanceBusinessKey(String val) {
        this.set(FIELD_PROCESSINSTANCEBUSINESSKEY, val);
        return this;
    }

    /**
     * 获取「业务键值」值
     *
    */
    @JsonIgnore
    public String getProcessInstanceBusinessKey() {
        return (String) this.get(FIELD_PROCESSINSTANCEBUSINESSKEY);
    }

    /**
     * 判断 「业务键值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessInstanceBusinessKey() {
        return this.contains(FIELD_PROCESSINSTANCEBUSINESSKEY);
    }

    /**
     * 重置 「业务键值」
     *
    */
    @JsonIgnore
    public WFHistory resetProcessInstanceBusinessKey() {
        this.reset(FIELD_PROCESSINSTANCEBUSINESSKEY);
        return this;
    }

    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setAppId(String val) {
        this.set(FIELD_APPID, val);
        return this;
    }

    /**
     * 获取「应用标识」值
     *
    */
    @JsonIgnore
    public String getAppId() {
        return (String) this.get(FIELD_APPID);
    }

    /**
     * 判断 「应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppId() {
        return this.contains(FIELD_APPID);
    }

    /**
     * 重置 「应用标识」
     *
    */
    @JsonIgnore
    public WFHistory resetAppId() {
        this.reset(FIELD_APPID);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setDCSystemId(String val) {
        this.set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this.get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this.contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public WFHistory resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「实体」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setEntityId(String val) {
        this.set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this.get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this.contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体」
     *
    */
    @JsonIgnore
    public WFHistory resetEntityId() {
        this.reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「流程定义标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setProcessDefKey(String val) {
        this.set(FIELD_PROCESSDEFKEY, val);
        return this;
    }

    /**
     * 获取「流程定义标识」值
     *
    */
    @JsonIgnore
    public String getProcessDefKey() {
        return (String) this.get(FIELD_PROCESSDEFKEY);
    }

    /**
     * 判断 「流程定义标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefKey() {
        return this.contains(FIELD_PROCESSDEFKEY);
    }

    /**
     * 重置 「流程定义标识」
     *
    */
    @JsonIgnore
    public WFHistory resetProcessDefKey() {
        this.reset(FIELD_PROCESSDEFKEY);
        return this;
    }

    /**
     * 设置「流程实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setRealInstId(String val) {
        this.set(FIELD_REALINSTID, val);
        return this;
    }

    /**
     * 获取「流程实例标识」值
     *
    */
    @JsonIgnore
    public String getRealInstId() {
        return (String) this.get(FIELD_REALINSTID);
    }

    /**
     * 判断 「流程实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealInstId() {
        return this.contains(FIELD_REALINSTID);
    }

    /**
     * 重置 「流程实例标识」
     *
    */
    @JsonIgnore
    public WFHistory resetRealInstId() {
        this.reset(FIELD_REALINSTID);
        return this;
    }

    /**
     * 设置「步骤标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFHistory setTaskDefinitionKey(String val) {
        this.set(FIELD_TASKDEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「步骤标识」值
     *
    */
    @JsonIgnore
    public String getTaskDefinitionKey() {
        return (String) this.get(FIELD_TASKDEFINITIONKEY);
    }

    /**
     * 判断 「步骤标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTaskDefinitionKey() {
        return this.contains(FIELD_TASKDEFINITIONKEY);
    }

    /**
     * 重置 「步骤标识」
     *
    */
    @JsonIgnore
    public WFHistory resetTaskDefinitionKey() {
        this.reset(FIELD_TASKDEFINITIONKEY);
        return this;
    }


}
