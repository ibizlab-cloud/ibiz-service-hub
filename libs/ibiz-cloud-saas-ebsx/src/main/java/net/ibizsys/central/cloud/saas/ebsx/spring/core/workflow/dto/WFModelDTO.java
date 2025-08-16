package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程模型
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/.ibizmodel.index
 */
public class WFModelDTO extends EntityDTO {

  /**.
   * ID
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/MODELID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/MODELNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * BPMN
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/BPMNFILE/.ibizmodel.index
   */
  public final static String FIELD_BPMNFILE = "bpmnfile";

  /**.
   * 启用标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/ISVALID/.ibizmodel.index
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 移动应用
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/MOBAPPS/.ibizmodel.index
   */
  public final static String FIELD_MOBAPPS = "mobapps";

  /**.
   * 工作流实体
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/REFDATAENTITY/.ibizmodel.index
   */
  public final static String FIELD_REFDATAENTITY = "refdataentity";

  /**.
   * 工作流用户组
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/REFGROUP/.ibizmodel.index
   */
  public final static String FIELD_REFGROUP = "refgroup";

  /**.
   * PC应用
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdefields/WEBAPPS/.ibizmodel.index
   */
  public final static String FIELD_WEBAPPS = "webapps";


    /**
     * 设置「ID」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「ID」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「ID」
     *
    */
    @JsonIgnore
    public WFModelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public WFModelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「BPMN」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setBPMNFile(String val) {
        this._set(FIELD_BPMNFILE, val);
        return this;
    }

    /**
     * 获取「BPMN」值
     *
    */
    @JsonIgnore
    public String getBPMNFile() {
        return (String) this._get(FIELD_BPMNFILE);
    }

    /**
     * 判断 「BPMN」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBPMNFile() {
        return this._contains(FIELD_BPMNFILE);
    }

    /**
     * 重置 「BPMN」
     *
    */
    @JsonIgnore
    public WFModelDTO resetBPMNFile() {
        this._reset(FIELD_BPMNFILE);
        return this;
    }

    /**
     * 设置「启用标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setIsValid(Integer val) {
        this._set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标识」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISVALID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsValid() {
        return this._contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标识」
     *
    */
    @JsonIgnore
    public WFModelDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「移动应用」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setMobApps(String val) {
        this._set(FIELD_MOBAPPS, val);
        return this;
    }

    /**
     * 获取「移动应用」值
     *
    */
    @JsonIgnore
    public String getMobApps() {
        return (String) this._get(FIELD_MOBAPPS);
    }

    /**
     * 判断 「移动应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobApps() {
        return this._contains(FIELD_MOBAPPS);
    }

    /**
     * 重置 「移动应用」
     *
    */
    @JsonIgnore
    public WFModelDTO resetMobApps() {
        this._reset(FIELD_MOBAPPS);
        return this;
    }

    /**
     * 设置「工作流实体」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setRefDataEntity(String val) {
        this._set(FIELD_REFDATAENTITY, val);
        return this;
    }

    /**
     * 获取「工作流实体」值
     *
    */
    @JsonIgnore
    public String getRefDataEntity() {
        return (String) this._get(FIELD_REFDATAENTITY);
    }

    /**
     * 判断 「工作流实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefDataEntity() {
        return this._contains(FIELD_REFDATAENTITY);
    }

    /**
     * 重置 「工作流实体」
     *
    */
    @JsonIgnore
    public WFModelDTO resetRefDataEntity() {
        this._reset(FIELD_REFDATAENTITY);
        return this;
    }

    /**
     * 设置「工作流用户组」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setRefGroup(String val) {
        this._set(FIELD_REFGROUP, val);
        return this;
    }

    /**
     * 获取「工作流用户组」值
     *
    */
    @JsonIgnore
    public String getRefGroup() {
        return (String) this._get(FIELD_REFGROUP);
    }

    /**
     * 判断 「工作流用户组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefGroup() {
        return this._contains(FIELD_REFGROUP);
    }

    /**
     * 重置 「工作流用户组」
     *
    */
    @JsonIgnore
    public WFModelDTO resetRefGroup() {
        this._reset(FIELD_REFGROUP);
        return this;
    }

    /**
     * 设置「PC应用」
     *
     * @param val
    */
    @JsonIgnore
    public WFModelDTO setWebApps(String val) {
        this._set(FIELD_WEBAPPS, val);
        return this;
    }

    /**
     * 获取「PC应用」值
     *
    */
    @JsonIgnore
    public String getWebApps() {
        return (String) this._get(FIELD_WEBAPPS);
    }

    /**
     * 判断 「PC应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWebApps() {
        return this._contains(FIELD_WEBAPPS);
    }

    /**
     * 重置 「PC应用」
     *
    */
    @JsonIgnore
    public WFModelDTO resetWebApps() {
        this._reset(FIELD_WEBAPPS);
        return this;
    }


}
