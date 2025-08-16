package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 租户动态模型数据对象
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/.ibizmodel.index
 */
public class MetaDynaModel extends EntityBase {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/REALDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_SYS_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_REALDYNAINSTID = "realdynainstid";

  /**.
   * 实例版本激活标记
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/ACTIVETAG/.ibizmodel.index
   */
  public final static String FIELD_ACTIVETAG = "activetag";

  /**.
   * 配置标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/CONFIGID/.ibizmodel.index
   */
  public final static String FIELD_CONFIGID = "configid";

  /**.
   * 配置名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/CONFIGNAME/.ibizmodel.index
   */
  public final static String FIELD_CONFIGNAME = "configname";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 预置实例
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/INTERNALINST/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_SYS_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_INTERNALINST = "internalinst";

  /**.
   * 文件
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/MODELFILE/.ibizmodel.index
   */
  public final static String FIELD_MODELFILE = "modelfile";

  /**.
   * 父实例
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/PDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_META_DYNAMICMODEL_PDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_PDYNAINSTID = "pdynainstid";

  /**.
   * 状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.DynamicModelStatus} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/STATUS/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/pscodelists/DynamicModelStatus.ibizmodel.yaml
   */
  public final static String FIELD_STATUS = "status";

  /**.
   * 动态实例标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/SYSDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_SYS_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDYNAINSTID = "sysdynainstid";

  /**.
   * 动态实例名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/SYSDYNAINSTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_SYS_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDYNAINSTNAME = "sysdynainstname";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DYNAMICMODEL/minorpsders/DER1N_META_DYNAMICMODEL_SYS_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setMemo(String val) {
        this.set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this.get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this.contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setRealDynaInstId(String val) {
        this.set(FIELD_REALDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getRealDynaInstId() {
        return (String) this.get(FIELD_REALDYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealDynaInstId() {
        return this.contains(FIELD_REALDYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetRealDynaInstId() {
        this.reset(FIELD_REALDYNAINSTID);
        return this;
    }

    /**
     * 设置「实例版本激活标记」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setActiveTag(String val) {
        this.set(FIELD_ACTIVETAG, val);
        return this;
    }

    /**
     * 获取「实例版本激活标记」值
     *
    */
    @JsonIgnore
    public String getActiveTag() {
        return (String) this.get(FIELD_ACTIVETAG);
    }

    /**
     * 判断 「实例版本激活标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActiveTag() {
        return this.contains(FIELD_ACTIVETAG);
    }

    /**
     * 重置 「实例版本激活标记」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetActiveTag() {
        this.reset(FIELD_ACTIVETAG);
        return this;
    }

    /**
     * 设置「配置标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setConfigId(String val) {
        this.set(FIELD_CONFIGID, val);
        return this;
    }

    /**
     * 获取「配置标识」值
     *
    */
    @JsonIgnore
    public String getConfigId() {
        return (String) this.get(FIELD_CONFIGID);
    }

    /**
     * 判断 「配置标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigId() {
        return this.contains(FIELD_CONFIGID);
    }

    /**
     * 重置 「配置标识」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetConfigId() {
        this.reset(FIELD_CONFIGID);
        return this;
    }

    /**
     * 设置「配置名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setConfigName(String val) {
        this.set(FIELD_CONFIGNAME, val);
        return this;
    }

    /**
     * 获取「配置名称」值
     *
    */
    @JsonIgnore
    public String getConfigName() {
        return (String) this.get(FIELD_CONFIGNAME);
    }

    /**
     * 判断 「配置名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigName() {
        return this.contains(FIELD_CONFIGNAME);
    }

    /**
     * 重置 「配置名称」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetConfigName() {
        this.reset(FIELD_CONFIGNAME);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setDynaInstId(String val) {
        this.set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this.get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this.contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetDynaInstId() {
        this.reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「预置实例」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setInternalInst(Integer val) {
        this.set(FIELD_INTERNALINST, val);
        return this;
    }

    /**
     * 获取「预置实例」值
     *
    */
    @JsonIgnore
    public Integer getInternalInst() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_INTERNALINST),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「预置实例」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInternalInst() {
        return this.contains(FIELD_INTERNALINST);
    }

    /**
     * 重置 「预置实例」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetInternalInst() {
        this.reset(FIELD_INTERNALINST);
        return this;
    }

    /**
     * 设置「文件」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setModelFile(String val) {
        this.set(FIELD_MODELFILE, val);
        return this;
    }

    /**
     * 获取「文件」值
     *
    */
    @JsonIgnore
    public String getModelFile() {
        return (String) this.get(FIELD_MODELFILE);
    }

    /**
     * 判断 「文件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModelFile() {
        return this.contains(FIELD_MODELFILE);
    }

    /**
     * 重置 「文件」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetModelFile() {
        this.reset(FIELD_MODELFILE);
        return this;
    }

    /**
     * 设置「父实例」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setPDynaInstId(String val) {
        this.set(FIELD_PDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「父实例」值
     *
    */
    @JsonIgnore
    public String getPDynaInstId() {
        return (String) this.get(FIELD_PDYNAINSTID);
    }

    /**
     * 判断 「父实例」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPDynaInstId() {
        return this.contains(FIELD_PDYNAINSTID);
    }

    /**
     * 重置 「父实例」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetPDynaInstId() {
        this.reset(FIELD_PDYNAINSTID);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setStatus(String val) {
        this.set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
    */
    @JsonIgnore
    public String getStatus() {
        return (String) this.get(FIELD_STATUS);
    }

    /**
     * 判断 「状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStatus() {
        return this.contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetStatus() {
        this.reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setSysDynaInstId(String val) {
        this.set(FIELD_SYSDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getSysDynaInstId() {
        return (String) this.get(FIELD_SYSDYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDynaInstId() {
        return this.contains(FIELD_SYSDYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetSysDynaInstId() {
        this.reset(FIELD_SYSDYNAINSTID);
        return this;
    }

    /**
     * 设置「动态实例名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setSysSynaInstName(String val) {
        this.set(FIELD_SYSDYNAINSTNAME, val);
        return this;
    }

    /**
     * 获取「动态实例名称」值
     *
    */
    @JsonIgnore
    public String getSysSynaInstName() {
        return (String) this.get(FIELD_SYSDYNAINSTNAME);
    }

    /**
     * 判断 「动态实例名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysSynaInstName() {
        return this.contains(FIELD_SYSDYNAINSTNAME);
    }

    /**
     * 重置 「动态实例名称」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetSysSynaInstName() {
        this.reset(FIELD_SYSDYNAINSTNAME);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDynaModel setSystemId(String val) {
        this.set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this.get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this.contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public MetaDynaModel resetSystemId() {
        this.reset(FIELD_SYSTEMID);
        return this;
    }


}
