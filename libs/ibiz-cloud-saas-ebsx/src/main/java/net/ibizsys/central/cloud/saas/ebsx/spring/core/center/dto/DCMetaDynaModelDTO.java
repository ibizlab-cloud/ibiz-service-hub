package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 模型版本
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/.ibizmodel.index
 */
public class DCMetaDynaModelDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/REALDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_REALDYNAINSTID = "realdynainstid";

  /**.
   * 实例版本激活标记
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/ACTIVETAG/.ibizmodel.index
   */
  public final static String FIELD_ACTIVETAG = "activetag";

  /**.
   * 配置标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CONFIGID/.ibizmodel.index
   */
  public final static String FIELD_CONFIGID = "configid";

  /**.
   * 配置名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CONFIGNAME/.ibizmodel.index
   */
  public final static String FIELD_CONFIGNAME = "configname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 动态实例标识（动态设计工具）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 动态实例标记（动态设计工具）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/DYNAINSTTAG/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTTAG = "dynainsttag";

  /**.
   * 动态实例标记2（动态设计工具）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/DYNAINSTTAG2/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTTAG2 = "dynainsttag2";

  /**.
   * 预置实例
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/INTERNALINST/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_INTERNALINST = "internalinst";

  /**.
   * 文件
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/MODELFILE/.ibizmodel.index
   */
  public final static String FIELD_MODELFILE = "modelfile";

  /**.
   * 配置标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/PDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_META_DYNAMICMODEL_PDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_PDYNAINSTID = "pdynainstid";

  /**.
   * 状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.DynamicModelStatus} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/STATUS/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/pscodelists/DynamicModelStatus.ibizmodel.yaml
   */
  public final static String FIELD_STATUS = "status";

  /**.
   * 动态实例标识（RT）
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/SYSDYNAINSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDYNAINSTID = "sysdynainstid";

  /**.
   * 动态实例名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/SYSDYNAINSTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDYNAINSTNAME = "sysdynainstname";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/minorpsders/DER1N_DC_META_DYNAMICMODEL_DC_DYNAINST_SYSDYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setRealDynaInstId(String val) {
        this._set(FIELD_REALDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getRealDynaInstId() {
        return (String) this._get(FIELD_REALDYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealDynaInstId() {
        return this._contains(FIELD_REALDYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetRealDynaInstId() {
        this._reset(FIELD_REALDYNAINSTID);
        return this;
    }

    /**
     * 设置「实例版本激活标记」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setActiveTag(String val) {
        this._set(FIELD_ACTIVETAG, val);
        return this;
    }

    /**
     * 获取「实例版本激活标记」值
     *
    */
    @JsonIgnore
    public String getActiveTag() {
        return (String) this._get(FIELD_ACTIVETAG);
    }

    /**
     * 判断 「实例版本激活标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActiveTag() {
        return this._contains(FIELD_ACTIVETAG);
    }

    /**
     * 重置 「实例版本激活标记」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetActiveTag() {
        this._reset(FIELD_ACTIVETAG);
        return this;
    }

    /**
     * 设置「配置标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setConfigId(String val) {
        this._set(FIELD_CONFIGID, val);
        return this;
    }

    /**
     * 获取「配置标识」值
     *
    */
    @JsonIgnore
    public String getConfigId() {
        return (String) this._get(FIELD_CONFIGID);
    }

    /**
     * 判断 「配置标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigId() {
        return this._contains(FIELD_CONFIGID);
    }

    /**
     * 重置 「配置标识」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetConfigId() {
        this._reset(FIELD_CONFIGID);
        return this;
    }

    /**
     * 设置「配置名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setConfigName(String val) {
        this._set(FIELD_CONFIGNAME, val);
        return this;
    }

    /**
     * 获取「配置名称」值
     *
    */
    @JsonIgnore
    public String getConfigName() {
        return (String) this._get(FIELD_CONFIGNAME);
    }

    /**
     * 判断 「配置名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigName() {
        return this._contains(FIELD_CONFIGNAME);
    }

    /**
     * 重置 「配置名称」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetConfigName() {
        this._reset(FIELD_CONFIGNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setCreateDate(Timestamp val) {
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
    public DCMetaDynaModelDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setCreateMan(String val) {
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
    public DCMetaDynaModelDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「动态实例标识（动态设计工具）」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setDynaInstId(String val) {
        this._set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识（动态设计工具）」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this._get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「动态实例标识（动态设计工具）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this._contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「动态实例标识（动态设计工具）」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「动态实例标记（动态设计工具）」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setDynaInstTag(String val) {
        this._set(FIELD_DYNAINSTTAG, val);
        return this;
    }

    /**
     * 获取「动态实例标记（动态设计工具）」值
     *
    */
    @JsonIgnore
    public String getDynaInstTag() {
        return (String) this._get(FIELD_DYNAINSTTAG);
    }

    /**
     * 判断 「动态实例标记（动态设计工具）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstTag() {
        return this._contains(FIELD_DYNAINSTTAG);
    }

    /**
     * 重置 「动态实例标记（动态设计工具）」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetDynaInstTag() {
        this._reset(FIELD_DYNAINSTTAG);
        return this;
    }

    /**
     * 设置「动态实例标记2（动态设计工具）」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setDynaInstTag2(String val) {
        this._set(FIELD_DYNAINSTTAG2, val);
        return this;
    }

    /**
     * 获取「动态实例标记2（动态设计工具）」值
     *
    */
    @JsonIgnore
    public String getDynaInstTag2() {
        return (String) this._get(FIELD_DYNAINSTTAG2);
    }

    /**
     * 判断 「动态实例标记2（动态设计工具）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstTag2() {
        return this._contains(FIELD_DYNAINSTTAG2);
    }

    /**
     * 重置 「动态实例标记2（动态设计工具）」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetDynaInstTag2() {
        this._reset(FIELD_DYNAINSTTAG2);
        return this;
    }

    /**
     * 设置「预置实例」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setInternalInst(Integer val) {
        this._set(FIELD_INTERNALINST, val);
        return this;
    }

    /**
     * 获取「预置实例」值
     *
    */
    @JsonIgnore
    public Integer getInternalInst() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_INTERNALINST),null);
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
        return this._contains(FIELD_INTERNALINST);
    }

    /**
     * 重置 「预置实例」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetInternalInst() {
        this._reset(FIELD_INTERNALINST);
        return this;
    }

    /**
     * 设置「文件」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setModelFile(String val) {
        this._set(FIELD_MODELFILE, val);
        return this;
    }

    /**
     * 获取「文件」值
     *
    */
    @JsonIgnore
    public String getModelFile() {
        return (String) this._get(FIELD_MODELFILE);
    }

    /**
     * 判断 「文件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModelFile() {
        return this._contains(FIELD_MODELFILE);
    }

    /**
     * 重置 「文件」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetModelFile() {
        this._reset(FIELD_MODELFILE);
        return this;
    }

    /**
     * 设置「配置标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setPDynaInstId(String val) {
        this._set(FIELD_PDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「配置标识」值
     *
    */
    @JsonIgnore
    public String getPDynaInstId() {
        return (String) this._get(FIELD_PDYNAINSTID);
    }

    /**
     * 判断 「配置标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPDynaInstId() {
        return this._contains(FIELD_PDYNAINSTID);
    }

    /**
     * 重置 「配置标识」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetPDynaInstId() {
        this._reset(FIELD_PDYNAINSTID);
        return this;
    }

    /**
     * 设置「状态」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setStatus(String val) {
        this._set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
    */
    @JsonIgnore
    public String getStatus() {
        return (String) this._get(FIELD_STATUS);
    }

    /**
     * 判断 「状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStatus() {
        return this._contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetStatus() {
        this._reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「动态实例标识（RT）」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setSysDynaInstId(String val) {
        this._set(FIELD_SYSDYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识（RT）」值
     *
    */
    @JsonIgnore
    public String getSysDynaInstId() {
        return (String) this._get(FIELD_SYSDYNAINSTID);
    }

    /**
     * 判断 「动态实例标识（RT）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDynaInstId() {
        return this._contains(FIELD_SYSDYNAINSTID);
    }

    /**
     * 重置 「动态实例标识（RT）」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetSysDynaInstId() {
        this._reset(FIELD_SYSDYNAINSTID);
        return this;
    }

    /**
     * 设置「动态实例名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setSysDynaInstName(String val) {
        this._set(FIELD_SYSDYNAINSTNAME, val);
        return this;
    }

    /**
     * 获取「动态实例名称」值
     *
    */
    @JsonIgnore
    public String getSysDynaInstName() {
        return (String) this._get(FIELD_SYSDYNAINSTNAME);
    }

    /**
     * 判断 「动态实例名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDynaInstName() {
        return this._contains(FIELD_SYSDYNAINSTNAME);
    }

    /**
     * 重置 「动态实例名称」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetSysDynaInstName() {
        this._reset(FIELD_SYSDYNAINSTNAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setUpdateDate(Timestamp val) {
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
    public DCMetaDynaModelDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelDTO setUpdateMan(String val) {
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
    public DCMetaDynaModelDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
