package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程实例
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/.ibizmodel.index
 */
public class WFInstanceDTO extends EntityDTO {

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/INSTANCEID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 实例名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/INSTANCENAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONKEY = "processdefinitionkey";

  /**.
   * 流程定义名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/DEFINITIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONNAME = "processdefinitionname";

  /**.
   * 业务键值
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/BUSINESSKEY/.ibizmodel.index
   */
  public final static String FIELD_BUSINESSKEY = "businesskey";

  /**.
   * 启动时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/STARTTIME/.ibizmodel.index
   */
  public final static String FIELD_STARTTIME = "starttime";

  /**.
   * 结束时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/ENDTIME/.ibizmodel.index
   */
  public final static String FIELD_ENDTIME = "endtime";

  /**.
   * 发起人标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/STARTUSERID/.ibizmodel.index
   */
  public final static String FIELD_STARTUSERID = "startuserid";

  /**.
   * 流程实例标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/REALINSTID/.ibizmodel.index
   */
  public final static String FIELD_REALINSTID = "realinstid";

  /**.
   * 发起人
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/STARTUSERNAME/.ibizmodel.index
   */
  public final static String FIELD_STARTUSERNAME = "startusername";

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/APPID/.ibizmodel.index
   */
  public final static String FIELD_APPID = "appid";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 当前流程步骤
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/CURSTEPID/.ibizmodel.index
   */
  public final static String FIELD_CURSTEPID = "curstepid";

  /**.
   * 当前流程步骤
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/CURSTEPNAME/.ibizmodel.index
   */
  public final static String FIELD_CURSTEPNAME = "curstepname";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 实体
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 流程状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.WFStates} 
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdefields/WFSTATE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/WFStates.ibizmodel.yaml
   */
  public final static String FIELD_WFSTATE = "wfstate";


    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「实例名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「实例名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「实例名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「实例名称」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setProcessDefinitionKey(String val) {
        this._set(FIELD_PROCESSDEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「DefinitionKey」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionKey() {
        return (String) this._get(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 判断 「DefinitionKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionKey() {
        return this._contains(FIELD_PROCESSDEFINITIONKEY);
    }

    /**
     * 重置 「DefinitionKey」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetProcessDefinitionKey() {
        this._reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程定义名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setProcessDefinitionName(String val) {
        this._set(FIELD_PROCESSDEFINITIONNAME, val);
        return this;
    }

    /**
     * 获取「流程定义名称」值
     *
    */
    @JsonIgnore
    public String getProcessDefinitionName() {
        return (String) this._get(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 判断 「流程定义名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDefinitionName() {
        return this._contains(FIELD_PROCESSDEFINITIONNAME);
    }

    /**
     * 重置 「流程定义名称」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetProcessDefinitionName() {
        this._reset(FIELD_PROCESSDEFINITIONNAME);
        return this;
    }

    /**
     * 设置「业务键值」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setBusinessKey(String val) {
        this._set(FIELD_BUSINESSKEY, val);
        return this;
    }

    /**
     * 获取「业务键值」值
     *
    */
    @JsonIgnore
    public String getBusinessKey() {
        return (String) this._get(FIELD_BUSINESSKEY);
    }

    /**
     * 判断 「业务键值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBusinessKey() {
        return this._contains(FIELD_BUSINESSKEY);
    }

    /**
     * 重置 「业务键值」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetBusinessKey() {
        this._reset(FIELD_BUSINESSKEY);
        return this;
    }

    /**
     * 设置「启动时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setStartTime(Timestamp val) {
        this._set(FIELD_STARTTIME, val);
        return this;
    }

    /**
     * 获取「启动时间」值
     *
    */
    @JsonIgnore
    public Timestamp getStartTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_STARTTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启动时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStartTime() {
        return this._contains(FIELD_STARTTIME);
    }

    /**
     * 重置 「启动时间」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetStartTime() {
        this._reset(FIELD_STARTTIME);
        return this;
    }

    /**
     * 设置「结束时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setEndTime(Timestamp val) {
        this._set(FIELD_ENDTIME, val);
        return this;
    }

    /**
     * 获取「结束时间」值
     *
    */
    @JsonIgnore
    public Timestamp getEndTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_ENDTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「结束时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEndTime() {
        return this._contains(FIELD_ENDTIME);
    }

    /**
     * 重置 「结束时间」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetEndTime() {
        this._reset(FIELD_ENDTIME);
        return this;
    }

    /**
     * 设置「发起人标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setStartUserId(String val) {
        this._set(FIELD_STARTUSERID, val);
        return this;
    }

    /**
     * 获取「发起人标识」值
     *
    */
    @JsonIgnore
    public String getStartUserId() {
        return (String) this._get(FIELD_STARTUSERID);
    }

    /**
     * 判断 「发起人标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStartUserId() {
        return this._contains(FIELD_STARTUSERID);
    }

    /**
     * 重置 「发起人标识」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetStartUserId() {
        this._reset(FIELD_STARTUSERID);
        return this;
    }

    /**
     * 设置「流程实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setRealInstId(String val) {
        this._set(FIELD_REALINSTID, val);
        return this;
    }

    /**
     * 获取「流程实例标识」值
     *
    */
    @JsonIgnore
    public String getRealInstId() {
        return (String) this._get(FIELD_REALINSTID);
    }

    /**
     * 判断 「流程实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealInstId() {
        return this._contains(FIELD_REALINSTID);
    }

    /**
     * 重置 「流程实例标识」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetRealInstId() {
        this._reset(FIELD_REALINSTID);
        return this;
    }

    /**
     * 设置「发起人」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setStartUserName(String val) {
        this._set(FIELD_STARTUSERNAME, val);
        return this;
    }

    /**
     * 获取「发起人」值
     *
    */
    @JsonIgnore
    public String getStartUserName() {
        return (String) this._get(FIELD_STARTUSERNAME);
    }

    /**
     * 判断 「发起人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStartUserName() {
        return this._contains(FIELD_STARTUSERNAME);
    }

    /**
     * 重置 「发起人」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetStartUserName() {
        this._reset(FIELD_STARTUSERNAME);
        return this;
    }

    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setAppId(String val) {
        this._set(FIELD_APPID, val);
        return this;
    }

    /**
     * 获取「应用标识」值
     *
    */
    @JsonIgnore
    public String getAppId() {
        return (String) this._get(FIELD_APPID);
    }

    /**
     * 判断 「应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppId() {
        return this._contains(FIELD_APPID);
    }

    /**
     * 重置 「应用标识」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetAppId() {
        this._reset(FIELD_APPID);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「创建人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「创建人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「创建人」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「当前流程步骤」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setCurStepId(String val) {
        this._set(FIELD_CURSTEPID, val);
        return this;
    }

    /**
     * 获取「当前流程步骤」值
     *
    */
    @JsonIgnore
    public String getCurStepId() {
        return (String) this._get(FIELD_CURSTEPID);
    }

    /**
     * 判断 「当前流程步骤」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCurStepId() {
        return this._contains(FIELD_CURSTEPID);
    }

    /**
     * 重置 「当前流程步骤」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetCurStepId() {
        this._reset(FIELD_CURSTEPID);
        return this;
    }

    /**
     * 设置「当前流程步骤」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setCurStepName(String val) {
        this._set(FIELD_CURSTEPNAME, val);
        return this;
    }

    /**
     * 获取「当前流程步骤」值
     *
    */
    @JsonIgnore
    public String getCurStepName() {
        return (String) this._get(FIELD_CURSTEPNAME);
    }

    /**
     * 判断 「当前流程步骤」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCurStepName() {
        return this._contains(FIELD_CURSTEPNAME);
    }

    /**
     * 重置 「当前流程步骤」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetCurStepName() {
        this._reset(FIELD_CURSTEPNAME);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「实体」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「流程状态」
     *
     * @param val
    */
    @JsonIgnore
    public WFInstanceDTO setWfstate(String val) {
        this._set(FIELD_WFSTATE, val);
        return this;
    }

    /**
     * 获取「流程状态」值
     *
    */
    @JsonIgnore
    public String getWfstate() {
        return (String) this._get(FIELD_WFSTATE);
    }

    /**
     * 判断 「流程状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWfstate() {
        return this._contains(FIELD_WFSTATE);
    }

    /**
     * 重置 「流程状态」
     *
    */
    @JsonIgnore
    public WFInstanceDTO resetWfstate() {
        this._reset(FIELD_WFSTATE);
        return this;
    }


}
