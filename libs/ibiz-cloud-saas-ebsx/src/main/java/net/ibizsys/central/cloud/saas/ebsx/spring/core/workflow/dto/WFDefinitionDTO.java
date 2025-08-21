package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程定义
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/.ibizmodel.index
 */
public class WFDefinitionDTO extends EntityDTO {

  /**.
   * 流程标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_DEFINITIONKEY = "definitionkey";

  /**.
   * 流程名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DEFINITIONNAME/.ibizmodel.index
   */
  public final static String FIELD_DEFINITIONNAME = "definitionname";

  /**.
   * 模型版本
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/MODELVERSION/.ibizmodel.index
   */
  public final static String FIELD_MODELVERSION = "modelversion";

  /**.
   * 模型是否启用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/MODELENABLE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_MODELENABLE = "modelenable";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 校验
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/MD5CHECK/.ibizmodel.index
   */
  public final static String FIELD_MD5CHECK = "md5check";

  /**.
   * BPMN
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/BPMNFILE/.ibizmodel.index
   */
  public final static String FIELD_BPMNFILE = "bpmnfile";

  /**.
   * 流程图
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/PROCESSDIAGRAM/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDIAGRAM = "processdiagram";

  /**.
   * DeployKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DEPLOYKEY/.ibizmodel.index
   */
  public final static String FIELD_DEPLOYKEY = "deploykey";

  /**.
   * WebServiceIds
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/WEBSERVICEIDS/.ibizmodel.index
   */
  public final static String FIELD_WEBSERVICEIDS = "webserviceids";

  /**.
   * MobileServiceIds
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/MOBILESERVICEIDS/.ibizmodel.index
   */
  public final static String FIELD_MOBILESERVICEIDS = "mobileserviceids";

  /**.
   * 动态模型标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DYNAMODELID/.ibizmodel.index
   */
  public final static String FIELD_DYNAMODELID = "dynamodelid";

  /**.
   * 参数
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/PARAM/.ibizmodel.index
   */
  public final static String FIELD_PARAM = "param";

  /**.
   * 参数2
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/PARAM2/.ibizmodel.index
   */
  public final static String FIELD_PARAM2 = "param2";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「流程标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setDefinitionKey(String val) {
        this._set(FIELD_DEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「流程标识」值
     *
    */
    @JsonIgnore
    public String getDefinitionKey() {
        return (String) this._get(FIELD_DEFINITIONKEY);
    }

    /**
     * 判断 「流程标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDefinitionKey() {
        return this._contains(FIELD_DEFINITIONKEY);
    }

    /**
     * 重置 「流程标识」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetDefinitionKey() {
        this._reset(FIELD_DEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setDefinitionName(String val) {
        this._set(FIELD_DEFINITIONNAME, val);
        return this;
    }

    /**
     * 获取「流程名称」值
     *
    */
    @JsonIgnore
    public String getDefinitionName() {
        return (String) this._get(FIELD_DEFINITIONNAME);
    }

    /**
     * 判断 「流程名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDefinitionName() {
        return this._contains(FIELD_DEFINITIONNAME);
    }

    /**
     * 重置 「流程名称」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetDefinitionName() {
        this._reset(FIELD_DEFINITIONNAME);
        return this;
    }

    /**
     * 设置「模型版本」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setModelVersion(Integer val) {
        this._set(FIELD_MODELVERSION, val);
        return this;
    }

    /**
     * 获取「模型版本」值
     *
    */
    @JsonIgnore
    public Integer getModelVersion() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MODELVERSION),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「模型版本」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModelVersion() {
        return this._contains(FIELD_MODELVERSION);
    }

    /**
     * 重置 「模型版本」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetModelVersion() {
        this._reset(FIELD_MODELVERSION);
        return this;
    }

    /**
     * 设置「模型是否启用」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setModelEnable(Integer val) {
        this._set(FIELD_MODELENABLE, val);
        return this;
    }

    /**
     * 获取「模型是否启用」值
     *
    */
    @JsonIgnore
    public Integer getModelEnable() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MODELENABLE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「模型是否启用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModelEnable() {
        return this._contains(FIELD_MODELENABLE);
    }

    /**
     * 重置 「模型是否启用」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetModelEnable() {
        this._reset(FIELD_MODELENABLE);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setPSSystemId(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetPSSystemId() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「校验」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setMD5Check(String val) {
        this._set(FIELD_MD5CHECK, val);
        return this;
    }

    /**
     * 获取「校验」值
     *
    */
    @JsonIgnore
    public String getMD5Check() {
        return (String) this._get(FIELD_MD5CHECK);
    }

    /**
     * 判断 「校验」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMD5Check() {
        return this._contains(FIELD_MD5CHECK);
    }

    /**
     * 重置 「校验」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetMD5Check() {
        this._reset(FIELD_MD5CHECK);
        return this;
    }

    /**
     * 设置「BPMN」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setBPMNFile(String val) {
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
    public WFDefinitionDTO resetBPMNFile() {
        this._reset(FIELD_BPMNFILE);
        return this;
    }

    /**
     * 设置「流程图」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setProcessDiagram(String val) {
        this._set(FIELD_PROCESSDIAGRAM, val);
        return this;
    }

    /**
     * 获取「流程图」值
     *
    */
    @JsonIgnore
    public String getProcessDiagram() {
        return (String) this._get(FIELD_PROCESSDIAGRAM);
    }

    /**
     * 判断 「流程图」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDiagram() {
        return this._contains(FIELD_PROCESSDIAGRAM);
    }

    /**
     * 重置 「流程图」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetProcessDiagram() {
        this._reset(FIELD_PROCESSDIAGRAM);
        return this;
    }

    /**
     * 设置「DeployKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setDeployKey(String val) {
        this._set(FIELD_DEPLOYKEY, val);
        return this;
    }

    /**
     * 获取「DeployKey」值
     *
    */
    @JsonIgnore
    public String getDeployKey() {
        return (String) this._get(FIELD_DEPLOYKEY);
    }

    /**
     * 判断 「DeployKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeployKey() {
        return this._contains(FIELD_DEPLOYKEY);
    }

    /**
     * 重置 「DeployKey」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetDeployKey() {
        this._reset(FIELD_DEPLOYKEY);
        return this;
    }

    /**
     * 设置「WebServiceIds」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setWebServiceIds(String val) {
        this._set(FIELD_WEBSERVICEIDS, val);
        return this;
    }

    /**
     * 获取「WebServiceIds」值
     *
    */
    @JsonIgnore
    public String getWebServiceIds() {
        return (String) this._get(FIELD_WEBSERVICEIDS);
    }

    /**
     * 判断 「WebServiceIds」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWebServiceIds() {
        return this._contains(FIELD_WEBSERVICEIDS);
    }

    /**
     * 重置 「WebServiceIds」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetWebServiceIds() {
        this._reset(FIELD_WEBSERVICEIDS);
        return this;
    }

    /**
     * 设置「MobileServiceIds」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setMobileServiceIds(String val) {
        this._set(FIELD_MOBILESERVICEIDS, val);
        return this;
    }

    /**
     * 获取「MobileServiceIds」值
     *
    */
    @JsonIgnore
    public String getMobileServiceIds() {
        return (String) this._get(FIELD_MOBILESERVICEIDS);
    }

    /**
     * 判断 「MobileServiceIds」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobileServiceIds() {
        return this._contains(FIELD_MOBILESERVICEIDS);
    }

    /**
     * 重置 「MobileServiceIds」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetMobileServiceIds() {
        this._reset(FIELD_MOBILESERVICEIDS);
        return this;
    }

    /**
     * 设置「动态模型标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setDynaModelId(String val) {
        this._set(FIELD_DYNAMODELID, val);
        return this;
    }

    /**
     * 获取「动态模型标识」值
     *
    */
    @JsonIgnore
    public String getDynaModelId() {
        return (String) this._get(FIELD_DYNAMODELID);
    }

    /**
     * 判断 「动态模型标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaModelId() {
        return this._contains(FIELD_DYNAMODELID);
    }

    /**
     * 重置 「动态模型标识」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetDynaModelId() {
        this._reset(FIELD_DYNAMODELID);
        return this;
    }

    /**
     * 设置「参数」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setParam(String val) {
        this._set(FIELD_PARAM, val);
        return this;
    }

    /**
     * 获取「参数」值
     *
    */
    @JsonIgnore
    public String getParam() {
        return (String) this._get(FIELD_PARAM);
    }

    /**
     * 判断 「参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam() {
        return this._contains(FIELD_PARAM);
    }

    /**
     * 重置 「参数」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetParam() {
        this._reset(FIELD_PARAM);
        return this;
    }

    /**
     * 设置「参数2」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setParam2(String val) {
        this._set(FIELD_PARAM2, val);
        return this;
    }

    /**
     * 获取「参数2」值
     *
    */
    @JsonIgnore
    public String getParam2() {
        return (String) this._get(FIELD_PARAM2);
    }

    /**
     * 判断 「参数2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam2() {
        return this._contains(FIELD_PARAM2);
    }

    /**
     * 重置 「参数2」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetParam2() {
        this._reset(FIELD_PARAM2);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
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
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public WFDefinitionDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setDCSystemId(String val) {
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
    public WFDefinitionDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setUpdateDate(Timestamp val) {
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
    public WFDefinitionDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinitionDTO setUpdateMan(String val) {
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
    public WFDefinitionDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
