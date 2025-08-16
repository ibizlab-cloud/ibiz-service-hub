package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 组成员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/.ibizmodel.index
 */
public class TeamMemberDTO extends EntityDTO {

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
    public TeamMemberDTO setTeamMemberId(String val) {
        this._set(FIELD_TEAMMEMBERID, val);
        return this;
    }

    /**
     * 获取「组成员标识」值
     *
    */
    @JsonIgnore
    public String getTeamMemberId() {
        return (String) this._get(FIELD_TEAMMEMBERID);
    }

    /**
     * 判断 「组成员标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamMemberId() {
        return this._contains(FIELD_TEAMMEMBERID);
    }

    /**
     * 重置 「组成员标识」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetTeamMemberId() {
        this._reset(FIELD_TEAMMEMBERID);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setTeamId(String val) {
        this._set(FIELD_TEAMID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getTeamId() {
        return (String) this._get(FIELD_TEAMID);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamId() {
        return this._contains(FIELD_TEAMID);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetTeamId() {
        this._reset(FIELD_TEAMID);
        return this;
    }

    /**
     * 设置「组名称」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setTeamName(String val) {
        this._set(FIELD_TEAMNAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
    */
    @JsonIgnore
    public String getTeamName() {
        return (String) this._get(FIELD_TEAMNAME);
    }

    /**
     * 判断 「组名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTeamName() {
        return this._contains(FIELD_TEAMNAME);
    }

    /**
     * 重置 「组名称」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetTeamName() {
        this._reset(FIELD_TEAMNAME);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this._get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「姓名」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setPostId(String val) {
        this._set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this._get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this._contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetPostId() {
        this._reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setPostName(String val) {
        this._set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this._get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this._contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetPostName() {
        this._reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setDomains(String val) {
        this._set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this._get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this._contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「登录名」
     *
     * @param val
    */
    @JsonIgnore
    public TeamMemberDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「登录名」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this._get(FIELD_USERNAME);
    }

    /**
     * 判断 「登录名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「登录名」
     *
    */
    @JsonIgnore
    public TeamMemberDTO resetUserName() {
        this._reset(FIELD_USERNAME);
        return this;
    }


}
