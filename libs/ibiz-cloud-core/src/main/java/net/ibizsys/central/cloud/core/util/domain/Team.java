package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 组
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/.ibizmodel.index
 */
public class Team extends EntityBase {

  /**.
   * 组标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdefields/TEAMID/.ibizmodel.index
   */
  public final static String FIELD_TEAMID = "teamid";

  /**.
   * 组名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdefields/TEAMNAME/.ibizmodel.index
   */
  public final static String FIELD_TEAMNAME = "teamname";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";


    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public Team setTeamId(String val) {
        this.set(FIELD_TEAMID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getTeamId() {
        return (String) this.get(FIELD_TEAMID);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamId() {
        return this.contains(FIELD_TEAMID);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public Team resetTeamId() {
        this.reset(FIELD_TEAMID);
        return this;
    }

    /**
     * 设置「组名称」
     *
     * @param val
    */
    @JsonIgnore
    public Team setTeamName(String val) {
        this.set(FIELD_TEAMNAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
    */
    @JsonIgnore
    public String getTeamName() {
        return (String) this.get(FIELD_TEAMNAME);
    }

    /**
     * 判断 「组名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamName() {
        return this.contains(FIELD_TEAMNAME);
    }

    /**
     * 重置 「组名称」
     *
    */
    @JsonIgnore
    public Team resetTeamName() {
        this.reset(FIELD_TEAMNAME);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public Team setMemo(String val) {
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
    public Team resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public Team setDomains(String val) {
        this.set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this.get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this.contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public Team resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }


}
