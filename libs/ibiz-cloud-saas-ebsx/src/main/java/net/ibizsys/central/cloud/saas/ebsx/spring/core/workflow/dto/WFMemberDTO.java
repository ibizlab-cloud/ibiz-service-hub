package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 成员
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/.ibizmodel.index
 */
public class WFMemberDTO extends EntityDTO {

  /**.
   * 组成员标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MEMBERID/.ibizmodel.index
   */
  public final static String FIELD_MEMBERID = "memberid";

  /**.
   * 组成员名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MEMBERNAME/.ibizmodel.index
   */
  public final static String FIELD_MEMBERNAME = "membername";

  /**.
   * 组标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/GROUPID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_WF_GROUP_GROUPID/.ibizmodel.index
   */
  public final static String FIELD_GROUPID = "groupid";

  /**.
   * 用户组
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/GROUPNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_WF_GROUP_GROUPID/.ibizmodel.index
   */
  public final static String FIELD_GROUPNAME = "groupname";

  /**.
   * 业务编码
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/BCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 删除标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/ENABLE/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ENABLE = "enable";

  /**.
   * 组标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/GROUPCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_WF_GROUP_GROUPID/.ibizmodel.index
   */
  public final static String FIELD_GROUPCODE = "groupcode";

  /**.
   * 部门
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MDEPTID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 部门
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MDEPTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 用户
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/PERSONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/SHOWORDER/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/USERID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";


    /**
     * 设置「组成员标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setMemberId(String val) {
        this._set(FIELD_MEMBERID, val);
        return this;
    }

    /**
     * 获取「组成员标识」值
     *
    */
    @JsonIgnore
    public String getMemberId() {
        return (String) this._get(FIELD_MEMBERID);
    }

    /**
     * 判断 「组成员标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberId() {
        return this._contains(FIELD_MEMBERID);
    }

    /**
     * 重置 「组成员标识」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetMemberId() {
        this._reset(FIELD_MEMBERID);
        return this;
    }

    /**
     * 设置「组成员名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setMemberName(String val) {
        this._set(FIELD_MEMBERNAME, val);
        return this;
    }

    /**
     * 获取「组成员名称」值
     *
    */
    @JsonIgnore
    public String getMemberName() {
        return (String) this._get(FIELD_MEMBERNAME);
    }

    /**
     * 判断 「组成员名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberName() {
        return this._contains(FIELD_MEMBERNAME);
    }

    /**
     * 重置 「组成员名称」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetMemberName() {
        this._reset(FIELD_MEMBERNAME);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setGroupId(String val) {
        this._set(FIELD_GROUPID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getGroupId() {
        return (String) this._get(FIELD_GROUPID);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupId() {
        return this._contains(FIELD_GROUPID);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetGroupId() {
        this._reset(FIELD_GROUPID);
        return this;
    }

    /**
     * 设置「用户组」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setGroupName(String val) {
        this._set(FIELD_GROUPNAME, val);
        return this;
    }

    /**
     * 获取「用户组」值
     *
    */
    @JsonIgnore
    public String getGroupName() {
        return (String) this._get(FIELD_GROUPNAME);
    }

    /**
     * 判断 「用户组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupName() {
        return this._contains(FIELD_GROUPNAME);
    }

    /**
     * 重置 「用户组」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetGroupName() {
        this._reset(FIELD_GROUPNAME);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setBCode(String val) {
        this._set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务编码」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this._get(FIELD_BCODE);
    }

    /**
     * 判断 「业务编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this._contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务编码」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetBCode() {
        this._reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「删除标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setEnable(Integer val) {
        this._set(FIELD_ENABLE, val);
        return this;
    }

    /**
     * 获取「删除标识」值
     *
    */
    @JsonIgnore
    public Integer getEnable() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ENABLE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「删除标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEnable() {
        return this._contains(FIELD_ENABLE);
    }

    /**
     * 重置 「删除标识」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetEnable() {
        this._reset(FIELD_ENABLE);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setGroupCode(String val) {
        this._set(FIELD_GROUPCODE, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getGroupCode() {
        return (String) this._get(FIELD_GROUPCODE);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupCode() {
        return this._contains(FIELD_GROUPCODE);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetGroupCode() {
        this._reset(FIELD_GROUPCODE);
        return this;
    }

    /**
     * 设置「部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setMDeptId(String val) {
        this._set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
    */
    @JsonIgnore
    public String getMDeptId() {
        return (String) this._get(FIELD_MDEPTID);
    }

    /**
     * 判断 「部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptId() {
        return this._contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「部门」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetMDeptId() {
        this._reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setMDeptName(String val) {
        this._set(FIELD_MDEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
    */
    @JsonIgnore
    public String getMDeptName() {
        return (String) this._get(FIELD_MDEPTNAME);
    }

    /**
     * 判断 「部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptName() {
        return this._contains(FIELD_MDEPTNAME);
    }

    /**
     * 重置 「部门」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetMDeptName() {
        this._reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「用户」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户」
     *
    */
    @JsonIgnore
    public WFMemberDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setShowOrder(Integer val) {
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
    public WFMemberDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMemberDTO setUserId(String val) {
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
    public WFMemberDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }


}
