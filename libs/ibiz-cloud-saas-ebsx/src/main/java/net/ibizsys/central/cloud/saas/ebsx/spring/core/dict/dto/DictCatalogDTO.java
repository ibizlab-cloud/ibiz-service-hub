package net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 字典
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/.ibizmodel.index
 */
public class DictCatalogDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/CID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 代码
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/CCODE/.ibizmodel.index
   */
  public final static String FIELD_CODE = "code";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/CNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 分组
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/CGROUP/.ibizmodel.index
   */
  public final static String FIELD_GROUP = "group";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 
   *
   */
  public final static String FIELD_OPTIONS = "options";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DictCatalogDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「代码」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「代码」值
     *
    */
    @JsonIgnore
    public String getCode() {
        return (String) this._get(FIELD_CODE);
    }

    /**
     * 判断 「代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「代码」
     *
    */
    @JsonIgnore
    public DictCatalogDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setName(String val) {
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
    public DictCatalogDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「分组」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setGroup(String val) {
        this._set(FIELD_GROUP, val);
        return this;
    }

    /**
     * 获取「分组」值
     *
    */
    @JsonIgnore
    public String getGroup() {
        return (String) this._get(FIELD_GROUP);
    }

    /**
     * 判断 「分组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroup() {
        return this._contains(FIELD_GROUP);
    }

    /**
     * 重置 「分组」
     *
    */
    @JsonIgnore
    public DictCatalogDTO resetGroup() {
        this._reset(FIELD_GROUP);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setMemo(String val) {
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
    public DictCatalogDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setUpdateDate(Timestamp val) {
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
    public DictCatalogDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setCreateDate(Timestamp val) {
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
    public DictCatalogDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「」
     *
     * @param val
    */
    @JsonIgnore
    public DictCatalogDTO setOptions(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictOptionDTO> val) {
        this._set(FIELD_OPTIONS, val);
        return this;
    }

    /**
     * 获取「」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictOptionDTO> getOptions() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictOptionDTO>) this._get(FIELD_OPTIONS);
    }

    /**
     * 判断 「」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOptions() {
        return this._contains(FIELD_OPTIONS);
    }

    /**
     * 重置 「」
     *
    */
    @JsonIgnore
    public DictCatalogDTO resetOptions() {
        this._reset(FIELD_OPTIONS);
        return this;
    }


}
