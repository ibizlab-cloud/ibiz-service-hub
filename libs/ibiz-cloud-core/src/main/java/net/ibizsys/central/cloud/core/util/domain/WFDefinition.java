package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;


import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 流程定义
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/.ibizmodel.index
 */
public class WFDefinition extends WFEntityBase {

  /**.
   * DefinitionKey
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DEFINITIONKEY/.ibizmodel.index
   */
  public final static String FIELD_DEFINITIONKEY = "definitionkey";

  /**.
   * 流程定义名称
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
   * {@link net.ibizsys.central.cloud.core.spring.core.runtime.dict.StaticDict.YesNo} 
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
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  
  /**.
   * 动态模型标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/DYNAMODELID/.ibizmodel.index
   */
  public final static String FIELD_DYNAMODELID = "dynamodelid";

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
  
  
  /**.
   * 租户标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";
  
  /**.
   * 流程图
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdefields/PROCESSDIAGRAM/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDIAGRAM = "processdiagram";

  /**
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	
    /**
     * 设置「DefinitionKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setDefinitionKey(String val) {
        this.set(FIELD_DEFINITIONKEY, val);
        return this;
    }

    /**
     * 获取「DefinitionKey」值
     *
    */
    @JsonIgnore
    public String getDefinitionKey() {
        return (String) this.get(FIELD_DEFINITIONKEY);
    }

    /**
     * 判断 「DefinitionKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDefinitionKey() {
        return this.contains(FIELD_DEFINITIONKEY);
    }

    /**
     * 重置 「DefinitionKey」
     *
    */
    @JsonIgnore
    public WFDefinition resetDefinitionKey() {
        this.reset(FIELD_DEFINITIONKEY);
        return this;
    }

    /**
     * 设置「流程定义名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setDefinitionName(String val) {
        this.set(FIELD_DEFINITIONNAME, val);
        return this;
    }

    /**
     * 获取「流程定义名称」值
     *
    */
    @JsonIgnore
    public String getDefinitionName() {
        return (String) this.get(FIELD_DEFINITIONNAME);
    }

    /**
     * 判断 「流程定义名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDefinitionName() {
        return this.contains(FIELD_DEFINITIONNAME);
    }

    /**
     * 重置 「流程定义名称」
     *
    */
    @JsonIgnore
    public WFDefinition resetDefinitionName() {
        this.reset(FIELD_DEFINITIONNAME);
        return this;
    }

    /**
     * 设置「模型版本」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setModelVersion(Integer val) {
        this.set(FIELD_MODELVERSION, val);
        return this;
    }

    /**
     * 获取「模型版本」值
     *
    */
    @JsonIgnore
    public Integer getModelVersion() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_MODELVERSION),null);
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
        return this.contains(FIELD_MODELVERSION);
    }

    /**
     * 重置 「模型版本」
     *
    */
    @JsonIgnore
    public WFDefinition resetModelVersion() {
        this.reset(FIELD_MODELVERSION);
        return this;
    }

    /**
     * 设置「模型是否启用」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setModelEnable(Integer val) {
        this.set(FIELD_MODELENABLE, val);
        return this;
    }

    /**
     * 获取「模型是否启用」值
     *
    */
    @JsonIgnore
    public Integer getModelEnable() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_MODELENABLE),null);
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
        return this.contains(FIELD_MODELENABLE);
    }

    /**
     * 重置 「模型是否启用」
     *
    */
    @JsonIgnore
    public WFDefinition resetModelEnable() {
        this.reset(FIELD_MODELENABLE);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setPSSystemId(String val) {
        this.set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this.get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this.contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public WFDefinition resetPSSystemId() {
        this.reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「校验」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setMD5Check(String val) {
        this.set(FIELD_MD5CHECK, val);
        return this;
    }

    /**
     * 获取「校验」值
     *
    */
    @JsonIgnore
    public String getMD5Check() {
        return (String) this.get(FIELD_MD5CHECK);
    }

    /**
     * 判断 「校验」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMD5Check() {
        return this.contains(FIELD_MD5CHECK);
    }

    /**
     * 重置 「校验」
     *
    */
    @JsonIgnore
    public WFDefinition resetMD5Check() {
        this.reset(FIELD_MD5CHECK);
        return this;
    }

    /**
     * 设置「BPMN」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setBPMNFile(String val) {
        this.set(FIELD_BPMNFILE, val);
        return this;
    }

    /**
     * 获取「BPMN」值
     *
    */
    @JsonIgnore
    public String getBPMNFile() {
        return (String) this.get(FIELD_BPMNFILE);
    }

    /**
     * 判断 「BPMN」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBPMNFile() {
        return this.contains(FIELD_BPMNFILE);
    }

    /**
     * 重置 「BPMN」
     *
    */
    @JsonIgnore
    public WFDefinition resetBPMNFile() {
        this.reset(FIELD_BPMNFILE);
        return this;
    }

    /**
     * 设置「DeployKey」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setDeployKey(String val) {
        this.set(FIELD_DEPLOYKEY, val);
        return this;
    }

    /**
     * 获取「DeployKey」值
     *
    */
    @JsonIgnore
    public String getDeployKey() {
        return (String) this.get(FIELD_DEPLOYKEY);
    }

    /**
     * 判断 「DeployKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeployKey() {
        return this.contains(FIELD_DEPLOYKEY);
    }

    /**
     * 重置 「DeployKey」
     *
    */
    @JsonIgnore
    public WFDefinition resetDeployKey() {
        this.reset(FIELD_DEPLOYKEY);
        return this;
    }

    /**
     * 设置「WebServiceIds」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setWebServiceIds(String val) {
        this.set(FIELD_WEBSERVICEIDS, val);
        return this;
    }

    /**
     * 获取「WebServiceIds」值
     *
    */
    @JsonIgnore
    public String getWebServiceIds() {
        return (String) this.get(FIELD_WEBSERVICEIDS);
    }

    /**
     * 判断 「WebServiceIds」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWebServiceIds() {
        return this.contains(FIELD_WEBSERVICEIDS);
    }

    /**
     * 重置 「WebServiceIds」
     *
    */
    @JsonIgnore
    public WFDefinition resetWebServiceIds() {
        this.reset(FIELD_WEBSERVICEIDS);
        return this;
    }

    /**
     * 设置「MobileServiceIds」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setMobileServiceIds(String val) {
        this.set(FIELD_MOBILESERVICEIDS, val);
        return this;
    }

    /**
     * 获取「MobileServiceIds」值
     *
    */
    @JsonIgnore
    public String getMobileServiceIds() {
        return (String) this.get(FIELD_MOBILESERVICEIDS);
    }

    /**
     * 判断 「MobileServiceIds」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobileServiceIds() {
        return this.contains(FIELD_MOBILESERVICEIDS);
    }

    /**
     * 重置 「MobileServiceIds」
     *
    */
    @JsonIgnore
    public WFDefinition resetMobileServiceIds() {
        this.reset(FIELD_MOBILESERVICEIDS);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setDCSystemId(String val) {
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
    public WFDefinition resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「动态模型标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setDynaModelId(String val) {
        this.set(FIELD_DYNAMODELID, val);
        return this;
    }

    /**
     * 获取「动态模型标识」值
     *
    */
    @JsonIgnore
    public String getDynaModelId() {
        return (String) this.get(FIELD_DYNAMODELID);
    }

    /**
     * 判断 「动态模型标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaModelId() {
        return this.contains(FIELD_DYNAMODELID);
    }

    /**
     * 重置 「动态模型标识」
     *
    */
    @JsonIgnore
    public WFDefinition resetDynaModelId() {
        this.reset(FIELD_DYNAMODELID);
        return this;
    }
    
    
    /**
     * 设置「租户标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setSrfdcid(String val) {
        this.set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户标识」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this.get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this.contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户标识」
     *
    */
    @JsonIgnore
    public WFDefinition resetSrfdcid() {
        this.reset(FIELD_SRFDCID);
        return this;
    }
    
    
    /**
     * 设置「流程图」
     *
     * @param val
    */
    @JsonIgnore
    public WFDefinition setProcessDiagram(String val) {
        this.set(FIELD_PROCESSDIAGRAM, val);
        return this;
    }

    /**
     * 获取「流程图」值
     *
    */
    @JsonIgnore
    public String getProcessDiagram() {
        return (String) this.get(FIELD_PROCESSDIAGRAM);
    }

    /**
     * 判断 「流程图」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDiagram() {
        return this.contains(FIELD_PROCESSDIAGRAM);
    }

    /**
     * 重置 「流程图」
     *
    */
    @JsonIgnore
    public WFDefinition resetProcessDiagram() {
        this.reset(FIELD_PROCESSDIAGRAM);
        return this;
    }
}
