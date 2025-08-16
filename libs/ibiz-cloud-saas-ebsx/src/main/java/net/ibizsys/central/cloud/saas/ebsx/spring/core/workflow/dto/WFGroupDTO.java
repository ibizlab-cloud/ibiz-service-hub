package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 角色/用户组
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/.ibizmodel.index
 */
public class WFGroupDTO extends EntityDTO {

  /**.
   * 流程角色标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 流程角色名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 流程角色编码
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPCODE/.ibizmodel.index
   */
  public final static String FIELD_GROUPCODE = "groupcode";

  /**.
   * 范围
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPSCOPE/.ibizmodel.index
   */
  public final static String FIELD_GROUPSCOPE = "groupscope";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";


    /**
     * 设置「流程角色标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroupDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「流程角色标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「流程角色标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「流程角色标识」
     *
    */
    @JsonIgnore
    public WFGroupDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「流程角色名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroupDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「流程角色名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「流程角色名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「流程角色名称」
     *
    */
    @JsonIgnore
    public WFGroupDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「流程角色编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroupDTO setGroupCode(String val) {
        this._set(FIELD_GROUPCODE, val);
        return this;
    }

    /**
     * 获取「流程角色编码」值
     *
    */
    @JsonIgnore
    public String getGroupCode() {
        return (String) this._get(FIELD_GROUPCODE);
    }

    /**
     * 判断 「流程角色编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupCode() {
        return this._contains(FIELD_GROUPCODE);
    }

    /**
     * 重置 「流程角色编码」
     *
    */
    @JsonIgnore
    public WFGroupDTO resetGroupCode() {
        this._reset(FIELD_GROUPCODE);
        return this;
    }

    /**
     * 设置「范围」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroupDTO setGroupScope(String val) {
        this._set(FIELD_GROUPSCOPE, val);
        return this;
    }

    /**
     * 获取「范围」值
     *
    */
    @JsonIgnore
    public String getGroupScope() {
        return (String) this._get(FIELD_GROUPSCOPE);
    }

    /**
     * 判断 「范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupScope() {
        return this._contains(FIELD_GROUPSCOPE);
    }

    /**
     * 重置 「范围」
     *
    */
    @JsonIgnore
    public WFGroupDTO resetGroupScope() {
        this._reset(FIELD_GROUPSCOPE);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroupDTO setMemo(String val) {
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
    public WFGroupDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }


}
