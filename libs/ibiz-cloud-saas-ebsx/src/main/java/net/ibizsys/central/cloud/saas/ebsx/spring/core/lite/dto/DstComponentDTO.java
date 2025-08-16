package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 组件
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/.ibizmodel.index
 */
public class DstComponentDTO extends EntityDTO {

  /**.
   * 部件标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/CID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/CNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODENAME = "codename";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/minorpsders/DER1N_DST_COMPONENT_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/APPID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/minorpsders/DER1N_DST_COMPONENT_DST_APP_APPID/.ibizmodel.index
   */
  public final static String FIELD_APPID = "appid";

  /**.
   * 类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.ComponentType} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/CTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/pscodelists/ComponentType.ibizmodel.yaml
   */
  public final static String FIELD_TYPE = "type";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/minorpsders/DER1N_DST_COMPONENT_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 主实体
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/minorpsders/DER1N_DST_COMPONENT_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 配置
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/CFG/.ibizmodel.index
   */
  public final static String FIELD_CONFIG = "config";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「部件标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「部件标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「部件标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「部件标识」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setName(String val) {
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
    public DstComponentDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setCodeName(String val) {
        this._set(FIELD_CODENAME, val);
        return this;
    }

    /**
     * 获取「代码名称」值
     *
    */
    @JsonIgnore
    public String getCodeName() {
        return (String) this._get(FIELD_CODENAME);
    }

    /**
     * 判断 「代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCodeName() {
        return this._contains(FIELD_CODENAME);
    }

    /**
     * 重置 「代码名称」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetCodeName() {
        this._reset(FIELD_CODENAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setSystemId(String val) {
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
    public DstComponentDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setAppId(String val) {
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
    public DstComponentDTO resetAppId() {
        this._reset(FIELD_APPID);
        return this;
    }

    /**
     * 设置「类型」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setType(String val) {
        this._set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     *
    */
    @JsonIgnore
    public String getType() {
        return (String) this._get(FIELD_TYPE);
    }

    /**
     * 判断 「类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsType() {
        return this._contains(FIELD_TYPE);
    }

    /**
     * 重置 「类型」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体标识」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「主实体」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「主实体」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「主实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「主实体」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setConfig(String val) {
        this._set(FIELD_CONFIG, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getConfig() {
        return (String) this._get(FIELD_CONFIG);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfig() {
        return this._contains(FIELD_CONFIG);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetConfig() {
        this._reset(FIELD_CONFIG);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DstComponentDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public DstComponentDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
