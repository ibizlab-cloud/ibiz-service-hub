package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程定义节点
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/.ibizmodel.index
 */
public class WFDefinitionNodeDTO extends EntityDTO {

  /**.
   * 节点标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODEID/.ibizmodel.index
   */
  public final static String FIELD_USERTASKID = "usertaskid";

  /**.
   * 节点名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/NODENAME/.ibizmodel.index
   */
  public final static String FIELD_USERTASKNAME = "usertaskname";

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONKEY = "processdefinitionkey";

  /**.
   * 流程定义名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdefields/DEFINITIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDEFINITIONNAME = "processdefinitionname";

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
     * 设置「节点标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setUserTaskId(String val) {
        this._set(FIELD_USERTASKID, val);
        return this;
    }

    /**
     * 获取「节点标识」值
     *
    */
    @JsonIgnore
    public String getUserTaskId() {
        return (String) this._get(FIELD_USERTASKID);
    }

    /**
     * 判断 「节点标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserTaskId() {
        return this._contains(FIELD_USERTASKID);
    }

    /**
     * 重置 「节点标识」
     *
    */
    @JsonIgnore
    public WFDefinitionNodeDTO resetUserTaskId() {
        this._reset(FIELD_USERTASKID);
        return this;
    }

    /**
     * 设置「节点名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setUserTaskName(String val) {
        this._set(FIELD_USERTASKNAME, val);
        return this;
    }

    /**
     * 获取「节点名称」值
     *
    */
    @JsonIgnore
    public String getUserTaskName() {
        return (String) this._get(FIELD_USERTASKNAME);
    }

    /**
     * 判断 「节点名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserTaskName() {
        return this._contains(FIELD_USERTASKNAME);
    }

    /**
     * 重置 「节点名称」
     *
    */
    @JsonIgnore
    public WFDefinitionNodeDTO resetUserTaskName() {
        this._reset(FIELD_USERTASKNAME);
        return this;
    }

    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setProcessDefinitionKey(String val) {
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
    public WFDefinitionNodeDTO resetProcessDefinitionKey() {
        this._reset(FIELD_PROCESSDEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程定义名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setProcessDefinitionName(String val) {
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
    public WFDefinitionNodeDTO resetProcessDefinitionName() {
        this._reset(FIELD_PROCESSDEFINITIONNAME);
        return this;
    }

    /**
     * 设置「版本」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setVersion(Integer val) {
        this._set(FIELD_VERSION, val);
        return this;
    }

    /**
     * 获取「版本」值
     *
    */
    @JsonIgnore
    public Integer getVersion() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_VERSION),null);
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
        return this._contains(FIELD_VERSION);
    }

    /**
     * 重置 「版本」
     *
    */
    @JsonIgnore
    public WFDefinitionNodeDTO resetVersion() {
        this._reset(FIELD_VERSION);
        return this;
    }

    /**
     * 设置「数量」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionNodeDTO setCnt(Integer val) {
        this._set(FIELD_CNT, val);
        return this;
    }

    /**
     * 获取「数量」值
     *
    */
    @JsonIgnore
    public Integer getCnt() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_CNT),null);
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
        return this._contains(FIELD_CNT);
    }

    /**
     * 重置 「数量」
     *
    */
    @JsonIgnore
    public WFDefinitionNodeDTO resetCnt() {
        this._reset(FIELD_CNT);
        return this;
    }


}
