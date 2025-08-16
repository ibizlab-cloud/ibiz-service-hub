package net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 字典项
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/.ibizmodel.index
 */
public class DictOptionDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VKEY/.ibizmodel.index
   */
  public final static String FIELD_VALUEKEY = "valuekey";

  /**.
   * 目录代码
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CID/.ibizmodel.index
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/minorpsders/DER1N_DICT_OPTION_DICT_CATALOG_CID/.ibizmodel.index
   */
  public final static String FIELD_CATALOGID = "catalogid";

  /**.
   * 目录
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/minorpsders/DER1N_DICT_OPTION_DICT_CATALOG_CID/.ibizmodel.index
   */
  public final static String FIELD_CATALOGNAME = "catalogname";

  /**.
   * 代码值
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VAL/.ibizmodel.index
   */
  public final static String FIELD_VALUE = "value";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/LABEL/.ibizmodel.index
   */
  public final static String FIELD_LABEL = "label";

  /**.
   * 父代码值
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/PVAL/.ibizmodel.index
   */
  public final static String FIELD_PARENT = "parent";

  /**.
   * 过滤项
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VFILTER/.ibizmodel.index
   */
  public final static String FIELD_FILTER = "filter";

  /**.
   * 栏目样式
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CLS/.ibizmodel.index
   */
  public final static String FIELD_CLS = "cls";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/ICONCLS/.ibizmodel.index
   */
  public final static String FIELD_ICONCLASS = "iconclass";

  /**.
   * 是否禁用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/DISABLED/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_DISABLED = "disabled";

  /**.
   * 过期/失效
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/EXPIRED/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_EXPIRED = "expired";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 扩展
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/EXTENSION/.ibizmodel.index
   */
  public final static String FIELD_EXTENSION = "extension";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setValueKey(String val) {
        this._set(FIELD_VALUEKEY, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getValueKey() {
        return (String) this._get(FIELD_VALUEKEY);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsValueKey() {
        return this._contains(FIELD_VALUEKEY);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetValueKey() {
        this._reset(FIELD_VALUEKEY);
        return this;
    }

    /**
     * 设置「目录代码」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setCatalogId(String val) {
        this._set(FIELD_CATALOGID, val);
        return this;
    }

    /**
     * 获取「目录代码」值
     *
    */
    @JsonIgnore
    public String getCatalogId() {
        return (String) this._get(FIELD_CATALOGID);
    }

    /**
     * 判断 「目录代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCatalogId() {
        return this._contains(FIELD_CATALOGID);
    }

    /**
     * 重置 「目录代码」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetCatalogId() {
        this._reset(FIELD_CATALOGID);
        return this;
    }

    /**
     * 设置「目录」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setCatalogName(String val) {
        this._set(FIELD_CATALOGNAME, val);
        return this;
    }

    /**
     * 获取「目录」值
     *
    */
    @JsonIgnore
    public String getCatalogName() {
        return (String) this._get(FIELD_CATALOGNAME);
    }

    /**
     * 判断 「目录」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCatalogName() {
        return this._contains(FIELD_CATALOGNAME);
    }

    /**
     * 重置 「目录」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetCatalogName() {
        this._reset(FIELD_CATALOGNAME);
        return this;
    }

    /**
     * 设置「代码值」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setValue(String val) {
        this._set(FIELD_VALUE, val);
        return this;
    }

    /**
     * 获取「代码值」值
     *
    */
    @JsonIgnore
    public String getValue() {
        return (String) this._get(FIELD_VALUE);
    }

    /**
     * 判断 「代码值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsValue() {
        return this._contains(FIELD_VALUE);
    }

    /**
     * 重置 「代码值」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetValue() {
        this._reset(FIELD_VALUE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setLabel(String val) {
        this._set(FIELD_LABEL, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getLabel() {
        return (String) this._get(FIELD_LABEL);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLabel() {
        return this._contains(FIELD_LABEL);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetLabel() {
        this._reset(FIELD_LABEL);
        return this;
    }

    /**
     * 设置「父代码值」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setParent(String val) {
        this._set(FIELD_PARENT, val);
        return this;
    }

    /**
     * 获取「父代码值」值
     *
    */
    @JsonIgnore
    public String getParent() {
        return (String) this._get(FIELD_PARENT);
    }

    /**
     * 判断 「父代码值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParent() {
        return this._contains(FIELD_PARENT);
    }

    /**
     * 重置 「父代码值」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetParent() {
        this._reset(FIELD_PARENT);
        return this;
    }

    /**
     * 设置「过滤项」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setFilter(String val) {
        this._set(FIELD_FILTER, val);
        return this;
    }

    /**
     * 获取「过滤项」值
     *
    */
    @JsonIgnore
    public String getFilter() {
        return (String) this._get(FIELD_FILTER);
    }

    /**
     * 判断 「过滤项」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFilter() {
        return this._contains(FIELD_FILTER);
    }

    /**
     * 重置 「过滤项」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetFilter() {
        this._reset(FIELD_FILTER);
        return this;
    }

    /**
     * 设置「栏目样式」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setCls(String val) {
        this._set(FIELD_CLS, val);
        return this;
    }

    /**
     * 获取「栏目样式」值
     *
    */
    @JsonIgnore
    public String getCls() {
        return (String) this._get(FIELD_CLS);
    }

    /**
     * 判断 「栏目样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCls() {
        return this._contains(FIELD_CLS);
    }

    /**
     * 重置 「栏目样式」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetCls() {
        this._reset(FIELD_CLS);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setIconClass(String val) {
        this._set(FIELD_ICONCLASS, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
    */
    @JsonIgnore
    public String getIconClass() {
        return (String) this._get(FIELD_ICONCLASS);
    }

    /**
     * 判断 「图标」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIconClass() {
        return this._contains(FIELD_ICONCLASS);
    }

    /**
     * 重置 「图标」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetIconClass() {
        this._reset(FIELD_ICONCLASS);
        return this;
    }

    /**
     * 设置「是否禁用」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setDisabled(Integer val) {
        this._set(FIELD_DISABLED, val);
        return this;
    }

    /**
     * 获取「是否禁用」值
     *
    */
    @JsonIgnore
    public Integer getDisabled() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_DISABLED),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否禁用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDisabled() {
        return this._contains(FIELD_DISABLED);
    }

    /**
     * 重置 「是否禁用」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetDisabled() {
        this._reset(FIELD_DISABLED);
        return this;
    }

    /**
     * 设置「过期/失效」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setExpired(Integer val) {
        this._set(FIELD_EXPIRED, val);
        return this;
    }

    /**
     * 获取「过期/失效」值
     *
    */
    @JsonIgnore
    public Integer getExpired() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_EXPIRED),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「过期/失效」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpired() {
        return this._contains(FIELD_EXPIRED);
    }

    /**
     * 重置 「过期/失效」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetExpired() {
        this._reset(FIELD_EXPIRED);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setShowOrder(Integer val) {
        this._set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOWORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShowOrder() {
        return this._contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「扩展」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setExtension(String val) {
        this._set(FIELD_EXTENSION, val);
        return this;
    }

    /**
     * 获取「扩展」值
     *
    */
    @JsonIgnore
    public String getExtension() {
        return (String) this._get(FIELD_EXTENSION);
    }

    /**
     * 判断 「扩展」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExtension() {
        return this._contains(FIELD_EXTENSION);
    }

    /**
     * 重置 「扩展」
     *
    */
    @JsonIgnore
    public DictOptionDTO resetExtension() {
        this._reset(FIELD_EXTENSION);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setUpdateDate(Timestamp val) {
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
    public DictOptionDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DictOptionDTO setCreateDate(Timestamp val) {
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
    public DictOptionDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }


}
