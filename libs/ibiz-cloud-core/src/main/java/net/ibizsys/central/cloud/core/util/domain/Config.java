package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 配置
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/.ibizmodel.index
 */
public class Config extends EntityBase {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/CFGID/.ibizmodel.index
   */
  public final static String FIELD_CFGID = "cfgid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/minorpsders/DER1N_DST_CONFIG_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 配置类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/CFGTYPE/.ibizmodel.index
   */
  public final static String FIELD_CFGTYPE = "cfgtype";

  /**.
   * 引用类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/TARGETTYPE/.ibizmodel.index
   */
  public final static String FIELD_TARGETTYPE = "targettype";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 配置内容
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/CFG/.ibizmodel.index
   */
  public final static String FIELD_CFG = "cfg";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public Config setCfgId(String val) {
        this.set(FIELD_CFGID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getCfgId() {
        return (String) this.get(FIELD_CFGID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCfgId() {
        return this.contains(FIELD_CFGID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public Config resetCfgId() {
        this.reset(FIELD_CFGID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public Config setSystemId(String val) {
        this.set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this.get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this.contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public Config resetSystemId() {
        this.reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「配置类型」
     *
     * @param val
    */
    @JsonIgnore
    public Config setCfgType(String val) {
        this.set(FIELD_CFGTYPE, val);
        return this;
    }

    /**
     * 获取「配置类型」值
     *
    */
    @JsonIgnore
    public String getCfgType() {
        return (String) this.get(FIELD_CFGTYPE);
    }

    /**
     * 判断 「配置类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCfgType() {
        return this.contains(FIELD_CFGTYPE);
    }

    /**
     * 重置 「配置类型」
     *
    */
    @JsonIgnore
    public Config resetCfgType() {
        this.reset(FIELD_CFGTYPE);
        return this;
    }

    /**
     * 设置「引用类型」
     *
     * @param val
    */
    @JsonIgnore
    public Config setTargetType(String val) {
        this.set(FIELD_TARGETTYPE, val);
        return this;
    }

    /**
     * 获取「引用类型」值
     *
    */
    @JsonIgnore
    public String getTargetType() {
        return (String) this.get(FIELD_TARGETTYPE);
    }

    /**
     * 判断 「引用类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTargetType() {
        return this.contains(FIELD_TARGETTYPE);
    }

    /**
     * 重置 「引用类型」
     *
    */
    @JsonIgnore
    public Config resetTargetType() {
        this.reset(FIELD_TARGETTYPE);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public Config setUserId(String val) {
        this.set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this.get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this.contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public Config resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「配置内容」
     *
     * @param val
    */
    @JsonIgnore
    public Config setCfg(String val) {
        this.set(FIELD_CFG, val);
        return this;
    }

    /**
     * 获取「配置内容」值
     *
    */
    @JsonIgnore
    public String getCfg() {
        return (String) this.get(FIELD_CFG);
    }

    /**
     * 判断 「配置内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCfg() {
        return this.contains(FIELD_CFG);
    }

    /**
     * 重置 「配置内容」
     *
    */
    @JsonIgnore
    public Config resetCfg() {
        this.reset(FIELD_CFG);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public Config setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE),null);
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
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public Config resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }


}
