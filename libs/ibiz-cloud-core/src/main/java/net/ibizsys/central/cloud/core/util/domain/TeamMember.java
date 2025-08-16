package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 组成员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/.ibizmodel.index
 */
public class TeamMember extends EntityBase {

  /**.
   * 组成员标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/TEAMMEMBERID/.ibizmodel.index
   */
  public final static String FIELD_TEAMMEMBERID = "teammemberid";

  /**.
   * 组标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/TEAMID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_TEAM_TEAMID/.ibizmodel.index
   */
  public final static String FIELD_TEAMID = "teamid";

  /**.
   * 组名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/TEAMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_TEAM_TEAMID/.ibizmodel.index
   */
  public final static String FIELD_TEAMNAME = "teamname";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/USERID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 姓名
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/PERSONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 岗位标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/POSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_POST_POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTID = "postid";

  /**.
   * 岗位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/POSTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_POST_POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTNAME = "postname";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 登录名
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdefields/USERNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/minorpsders/DER1N_SYS_TEAMMEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";


    /**
     * 设置「组成员标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setTeamMemberId(String val) {
        this.set(FIELD_TEAMMEMBERID, val);
        return this;
    }

    /**
     * 获取「组成员标识」值
     *
    */
    @JsonIgnore
    public String getTeamMemberId() {
        return (String) this.get(FIELD_TEAMMEMBERID);
    }

    /**
     * 判断 「组成员标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamMemberId() {
        return this.contains(FIELD_TEAMMEMBERID);
    }

    /**
     * 重置 「组成员标识」
     *
    */
    @JsonIgnore
    public TeamMember resetTeamMemberId() {
        this.reset(FIELD_TEAMMEMBERID);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setTeamId(String val) {
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
    public TeamMember resetTeamId() {
        this.reset(FIELD_TEAMID);
        return this;
    }

    /**
     * 设置「组名称」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setTeamName(String val) {
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
    public TeamMember resetTeamName() {
        this.reset(FIELD_TEAMNAME);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setUserId(String val) {
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
    public TeamMember resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setPersonName(String val) {
        this.set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this.get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this.contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「姓名」
     *
    */
    @JsonIgnore
    public TeamMember resetPersonName() {
        this.reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setPostId(String val) {
        this.set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this.get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this.contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public TeamMember resetPostId() {
        this.reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setPostName(String val) {
        this.set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this.get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this.contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位」
     *
    */
    @JsonIgnore
    public TeamMember resetPostName() {
        this.reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setDomains(String val) {
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
    public TeamMember resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「登录名」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMember setUserName(String val) {
        this.set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「登录名」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this.get(FIELD_USERNAME);
    }

    /**
     * 判断 「登录名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this.contains(FIELD_USERNAME);
    }

    /**
     * 重置 「登录名」
     *
    */
    @JsonIgnore
    public TeamMember resetUserName() {
        this.reset(FIELD_USERNAME);
        return this;
    }


}
