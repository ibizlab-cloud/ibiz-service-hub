package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 字典
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/.ibizmodel.index
 */
public class CodeList extends EntityBase {

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
  public final static String FIELD_ITEMS = "items";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public CodeList resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「代码」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setCode(String val) {
        this.set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「代码」值
     *
    */
    @JsonIgnore
    public String getCode() {
        return (String) this.get(FIELD_CODE);
    }

    /**
     * 判断 「代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCode() {
        return this.contains(FIELD_CODE);
    }

    /**
     * 重置 「代码」
     *
    */
    @JsonIgnore
    public CodeList resetCode() {
        this.reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this.get(FIELD_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public CodeList resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「分组」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setGroup(String val) {
        this.set(FIELD_GROUP, val);
        return this;
    }

    /**
     * 获取「分组」值
     *
    */
    @JsonIgnore
    public String getGroup() {
        return (String) this.get(FIELD_GROUP);
    }

    /**
     * 判断 「分组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroup() {
        return this.contains(FIELD_GROUP);
    }

    /**
     * 重置 「分组」
     *
    */
    @JsonIgnore
    public CodeList resetGroup() {
        this.reset(FIELD_GROUP);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setMemo(String val) {
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
    public CodeList resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public CodeList resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public CodeList setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE),null);
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
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public CodeList resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「」
     *
     * @param val
    */
   // @JsonIgnore ，此处忽略，反序列化时以具体类型进入
    @JsonProperty(FIELD_ITEMS)
    public CodeList setItems(List<CodeItem> val) {
        this.set(FIELD_ITEMS, val);
        return this;
    }

    /**
     * 获取「」值
     *
    */
    @JsonIgnore
    public List<CodeItem> getItems() {
        return (List<CodeItem>) this.get(FIELD_ITEMS);
    }

    /**
     * 判断 「」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOptions() {
        return this.contains(FIELD_ITEMS);
    }

    /**
     * 重置 「」
     *
    */
    @JsonIgnore
    public CodeList resetOptions() {
        this.reset(FIELD_ITEMS);
        return this;
    }


}
