package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 模块
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/.ibizmodel.index
 */
public class MetaModuleDTO extends EntityDTO {

  /**.
   * 模块标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdefields/MODULEID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 模块名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdefields/MODULENAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODE_NAME = "code_name";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/minorpsders/DER1N_META_MODULE_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEM_ID = "system_id";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOW_ORDER = "show_order";


    /**
     * 设置「模块标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModuleDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「模块标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「模块标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「模块标识」
     *
    */
    @JsonIgnore
    public MetaModuleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「模块名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModuleDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「模块名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「模块名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「模块名称」
     *
    */
    @JsonIgnore
    public MetaModuleDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModuleDTO setCode_name(String val) {
        this._set(FIELD_CODE_NAME, val);
        return this;
    }

    /**
     * 获取「代码名称」值
     *
    */
    @JsonIgnore
    public String getCode_name() {
        return (String) this._get(FIELD_CODE_NAME);
    }

    /**
     * 判断 「代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCode_name() {
        return this._contains(FIELD_CODE_NAME);
    }

    /**
     * 重置 「代码名称」
     *
    */
    @JsonIgnore
    public MetaModuleDTO resetCode_name() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModuleDTO setSystem_id(String val) {
        this._set(FIELD_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystem_id() {
        return (String) this._get(FIELD_SYSTEM_ID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystem_id() {
        return this._contains(FIELD_SYSTEM_ID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public MetaModuleDTO resetSystem_id() {
        this._reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModuleDTO setShow_order(Integer val) {
        this._set(FIELD_SHOW_ORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShow_order() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOW_ORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShow_order() {
        return this._contains(FIELD_SHOW_ORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public MetaModuleDTO resetShow_order() {
        this._reset(FIELD_SHOW_ORDER);
        return this;
    }


}
