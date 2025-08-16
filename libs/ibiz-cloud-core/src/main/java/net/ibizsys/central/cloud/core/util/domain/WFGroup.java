package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 角色/用户组
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/.ibizmodel.index
 */
public class WFGroup extends WFEntityBase {

  /**.
   * 组标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 组名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP/psdefields/GROUPNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 组编码
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


  @Override
	protected boolean isLowerCaseName() {
		return false;
	}
  
    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroup setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public WFGroup resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「组名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroup setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this.get(FIELD_NAME);
    }

    /**
     * 判断 「组名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「组名称」
     *
    */
    @JsonIgnore
    public WFGroup resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「组编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroup setGroupCode(String val) {
        this.set(FIELD_GROUPCODE, val);
        return this;
    }

    /**
     * 获取「组编码」值
     *
    */
    @JsonIgnore
    public String getGroupCode() {
        return (String) this.get(FIELD_GROUPCODE);
    }

    /**
     * 判断 「组编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupCode() {
        return this.contains(FIELD_GROUPCODE);
    }

    /**
     * 重置 「组编码」
     *
    */
    @JsonIgnore
    public WFGroup resetGroupCode() {
        this.reset(FIELD_GROUPCODE);
        return this;
    }

    /**
     * 设置「范围」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroup setGroupScope(String val) {
        this.set(FIELD_GROUPSCOPE, val);
        return this;
    }

    /**
     * 获取「范围」值
     *
    */
    @JsonIgnore
    public String getGroupScope() {
        return (String) this.get(FIELD_GROUPSCOPE);
    }

    /**
     * 判断 「范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupScope() {
        return this.contains(FIELD_GROUPSCOPE);
    }

    /**
     * 重置 「范围」
     *
    */
    @JsonIgnore
    public WFGroup resetGroupScope() {
        this.reset(FIELD_GROUPSCOPE);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public WFGroup setMemo(String val) {
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
    public WFGroup resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }


}
