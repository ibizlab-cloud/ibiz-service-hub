package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 成员
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/.ibizmodel.index
 */
public class WFMember extends WFEntityBase {

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
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MDEPTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 部门
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/MDEPTID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/minorpsders/DER1N_WF_GROUP_MEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

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
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	

    /**
     * 设置「组成员标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setMemberId(String val) {
        this.set(FIELD_MEMBERID, val);
        return this;
    }

    /**
     * 获取「组成员标识」值
     *
    */
    @JsonIgnore
    public String getMemberId() {
        return (String) this.get(FIELD_MEMBERID);
    }

    /**
     * 判断 「组成员标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberId() {
        return this.contains(FIELD_MEMBERID);
    }

    /**
     * 重置 「组成员标识」
     *
    */
    @JsonIgnore
    public WFMember resetMemberId() {
        this.reset(FIELD_MEMBERID);
        return this;
    }

    /**
     * 设置「组成员名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setMemberName(String val) {
        this.set(FIELD_MEMBERNAME, val);
        return this;
    }

    /**
     * 获取「组成员名称」值
     *
    */
    @JsonIgnore
    public String getMemberName() {
        return (String) this.get(FIELD_MEMBERNAME);
    }

    /**
     * 判断 「组成员名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberName() {
        return this.contains(FIELD_MEMBERNAME);
    }

    /**
     * 重置 「组成员名称」
     *
    */
    @JsonIgnore
    public WFMember resetMemberName() {
        this.reset(FIELD_MEMBERNAME);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setGroupId(String val) {
        this.set(FIELD_GROUPID, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getGroupId() {
        return (String) this.get(FIELD_GROUPID);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupId() {
        return this.contains(FIELD_GROUPID);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public WFMember resetGroupId() {
        this.reset(FIELD_GROUPID);
        return this;
    }

    /**
     * 设置「用户组」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setGroupName(String val) {
        this.set(FIELD_GROUPNAME, val);
        return this;
    }

    /**
     * 获取「用户组」值
     *
    */
    @JsonIgnore
    public String getGroupName() {
        return (String) this.get(FIELD_GROUPNAME);
    }

    /**
     * 判断 「用户组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupName() {
        return this.contains(FIELD_GROUPNAME);
    }

    /**
     * 重置 「用户组」
     *
    */
    @JsonIgnore
    public WFMember resetGroupName() {
        this.reset(FIELD_GROUPNAME);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setBCode(String val) {
        this.set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务编码」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this.get(FIELD_BCODE);
    }

    /**
     * 判断 「业务编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this.contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务编码」
     *
    */
    @JsonIgnore
    public WFMember resetBCode() {
        this.reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「删除标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setEnable(Integer val) {
        this.set(FIELD_ENABLE, val);
        return this;
    }

    /**
     * 获取「删除标识」值
     *
    */
    @JsonIgnore
    public Integer getEnable() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ENABLE),null);
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
        return this.contains(FIELD_ENABLE);
    }

    /**
     * 重置 「删除标识」
     *
    */
    @JsonIgnore
    public WFMember resetEnable() {
        this.reset(FIELD_ENABLE);
        return this;
    }

    /**
     * 设置「组标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setGroupCode(String val) {
        this.set(FIELD_GROUPCODE, val);
        return this;
    }

    /**
     * 获取「组标识」值
     *
    */
    @JsonIgnore
    public String getGroupCode() {
        return (String) this.get(FIELD_GROUPCODE);
    }

    /**
     * 判断 「组标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroupCode() {
        return this.contains(FIELD_GROUPCODE);
    }

    /**
     * 重置 「组标识」
     *
    */
    @JsonIgnore
    public WFMember resetGroupCode() {
        this.reset(FIELD_GROUPCODE);
        return this;
    }

    /**
     * 设置「部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setMDeptName(String val) {
        this.set(FIELD_MDEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
    */
    @JsonIgnore
    public String getMDeptName() {
        return (String) this.get(FIELD_MDEPTNAME);
    }

    /**
     * 判断 「部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptName() {
        return this.contains(FIELD_MDEPTNAME);
    }

    /**
     * 重置 「部门」
     *
    */
    @JsonIgnore
    public WFMember resetMDeptName() {
        this.reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setMDeptId(String val) {
        this.set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
    */
    @JsonIgnore
    public String getMDeptId() {
        return (String) this.get(FIELD_MDEPTID);
    }

    /**
     * 判断 「部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptId() {
        return this.contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「部门」
     *
    */
    @JsonIgnore
    public WFMember resetMDeptId() {
        this.reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setOrgName(String val) {
        this.set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this.get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this.contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFMember resetOrgName() {
        this.reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setOrgId(String val) {
        this.set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this.get(FIELD_ORGID);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this.contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFMember resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「用户」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setPersonName(String val) {
        this.set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this.get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this.contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户」
     *
    */
    @JsonIgnore
    public WFMember resetPersonName() {
        this.reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setShowOrder(Integer val) {
        this.set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SHOWORDER),null);
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
        return this.contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public WFMember resetShowOrder() {
        this.reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFMember setUserId(String val) {
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
    public WFMember resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }


}
