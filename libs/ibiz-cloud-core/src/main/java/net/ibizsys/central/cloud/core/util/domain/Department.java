package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 部门
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/.ibizmodel.index
 */
public class Department extends EntityBase {

  /**.
   * 部门标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 部门代码
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTCODE/.ibizmodel.index
   */
  public final static String FIELD_DEPTCODE = "deptcode";

  /**.
   * 部门名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_DEPTNAME = "deptname";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/minorpsders/DER1N_SYS_DEPT_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 上级部门
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/PDEPTID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/minorpsders/DER1N_SYS_DEPT_SYS_DEPT_PDEPTID/.ibizmodel.index
   */
  public final static String FIELD_PARENTDEPTID = "parentdeptid";

  /**.
   * 部门简称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/SHORTNAME/.ibizmodel.index
   */
  public final static String FIELD_SHORTNAME = "shortname";

  /**.
   * 部门级别
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTLEVEL/.ibizmodel.index
   */
  public final static String FIELD_DEPTLEVEL = "deptlevel";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 业务编码
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/BCODE/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 分管领导标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/LEADERID/.ibizmodel.index
   */
  public final static String FIELD_LEADERID = "leaderid";

  /**.
   * 分管领导
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/LEADERNAME/.ibizmodel.index
   */
  public final static String FIELD_LEADERNAME = "leadername";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/minorpsders/DER1N_SYS_DEPT_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 上级部门
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/PDEPTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/minorpsders/DER1N_SYS_DEPT_SYS_DEPT_PDEPTID/.ibizmodel.index
   */
  public final static String FIELD_PARENTDEPTNAME = "parentdeptname";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 钉钉部门标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DDDEPTID/.ibizmodel.index
   */
  public final static String FIELD_DDDEPTID = "dddeptid";

  /**.
   * 部门全称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTFULLNAME/.ibizmodel.index
   */
  public final static String FIELD_DEPTFULLNAME = "deptfullname";

  /**.
   * 部门领导
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTLEADER/.ibizmodel.index
   */
  public final static String FIELD_DEPTLEADER = "deptleader";

  /**.
   * 部门领导标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/DEPTLEADERID/.ibizmodel.index
   */
  public final static String FIELD_DEPTLEADERID = "deptleaderid";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 组织代码
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/ORGCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/minorpsders/DER1N_SYS_DEPT_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 企业微信部门标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdefields/WXWORKDEPTID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKDEPTID = "wxworkdeptid";


    /**
     * 设置「部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptId(String val) {
        this.set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this.get(FIELD_DEPTID);
    }

    /**
     * 判断 「部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this.contains(FIELD_DEPTID);
    }

    /**
     * 重置 「部门标识」
     *
    */
    @JsonIgnore
    public Department resetDeptId() {
        this.reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptCode(String val) {
        this.set(FIELD_DEPTCODE, val);
        return this;
    }

    /**
     * 获取「部门代码」值
     *
    */
    @JsonIgnore
    public String getDeptCode() {
        return (String) this.get(FIELD_DEPTCODE);
    }

    /**
     * 判断 「部门代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptCode() {
        return this.contains(FIELD_DEPTCODE);
    }

    /**
     * 重置 「部门代码」
     *
    */
    @JsonIgnore
    public Department resetDeptCode() {
        this.reset(FIELD_DEPTCODE);
        return this;
    }

    /**
     * 设置「部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptName(String val) {
        this.set(FIELD_DEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门名称」值
     *
    */
    @JsonIgnore
    public String getDeptName() {
        return (String) this.get(FIELD_DEPTNAME);
    }

    /**
     * 判断 「部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptName() {
        return this.contains(FIELD_DEPTNAME);
    }

    /**
     * 重置 「部门名称」
     *
    */
    @JsonIgnore
    public Department resetDeptName() {
        this.reset(FIELD_DEPTNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public Department setOrgId(String val) {
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
    public Department resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「上级部门」
     *
     * @param val
    */
    @JsonIgnore
    public Department setParentDeptId(String val) {
        this.set(FIELD_PARENTDEPTID, val);
        return this;
    }

    /**
     * 获取「上级部门」值
     *
    */
    @JsonIgnore
    public String getParentDeptId() {
        return (String) this.get(FIELD_PARENTDEPTID);
    }

    /**
     * 判断 「上级部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentDeptId() {
        return this.contains(FIELD_PARENTDEPTID);
    }

    /**
     * 重置 「上级部门」
     *
    */
    @JsonIgnore
    public Department resetParentDeptId() {
        this.reset(FIELD_PARENTDEPTID);
        return this;
    }

    /**
     * 设置「部门简称」
     *
     * @param val
    */
    @JsonIgnore
    public Department setShortName(String val) {
        this.set(FIELD_SHORTNAME, val);
        return this;
    }

    /**
     * 获取「部门简称」值
     *
    */
    @JsonIgnore
    public String getShortName() {
        return (String) this.get(FIELD_SHORTNAME);
    }

    /**
     * 判断 「部门简称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShortName() {
        return this.contains(FIELD_SHORTNAME);
    }

    /**
     * 重置 「部门简称」
     *
    */
    @JsonIgnore
    public Department resetShortName() {
        this.reset(FIELD_SHORTNAME);
        return this;
    }

    /**
     * 设置「部门级别」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptLevel(Integer val) {
        this.set(FIELD_DEPTLEVEL, val);
        return this;
    }

    /**
     * 获取「部门级别」值
     *
    */
    @JsonIgnore
    public Integer getDeptLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_DEPTLEVEL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「部门级别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptLevel() {
        return this.contains(FIELD_DEPTLEVEL);
    }

    /**
     * 重置 「部门级别」
     *
    */
    @JsonIgnore
    public Department resetDeptLevel() {
        this.reset(FIELD_DEPTLEVEL);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDomains(String val) {
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
    public Department resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public Department setShowOrder(Integer val) {
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
    public Department resetShowOrder() {
        this.reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public Department setBCode(String val) {
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
    public Department resetBCode() {
        this.reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「分管领导标识」
     *
     * @param val
    */
    @JsonIgnore
    public Department setLeaderId(String val) {
        this.set(FIELD_LEADERID, val);
        return this;
    }

    /**
     * 获取「分管领导标识」值
     *
    */
    @JsonIgnore
    public String getLeaderId() {
        return (String) this.get(FIELD_LEADERID);
    }

    /**
     * 判断 「分管领导标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLeaderId() {
        return this.contains(FIELD_LEADERID);
    }

    /**
     * 重置 「分管领导标识」
     *
    */
    @JsonIgnore
    public Department resetLeaderId() {
        this.reset(FIELD_LEADERID);
        return this;
    }

    /**
     * 设置「分管领导」
     *
     * @param val
    */
    @JsonIgnore
    public Department setLeaderName(String val) {
        this.set(FIELD_LEADERNAME, val);
        return this;
    }

    /**
     * 获取「分管领导」值
     *
    */
    @JsonIgnore
    public String getLeaderName() {
        return (String) this.get(FIELD_LEADERNAME);
    }

    /**
     * 判断 「分管领导」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLeaderName() {
        return this.contains(FIELD_LEADERNAME);
    }

    /**
     * 重置 「分管领导」
     *
    */
    @JsonIgnore
    public Department resetLeaderName() {
        this.reset(FIELD_LEADERNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public Department setOrgName(String val) {
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
    public Department resetOrgName() {
        this.reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「上级部门」
     *
     * @param val
    */
    @JsonIgnore
    public Department setParentDeptName(String val) {
        this.set(FIELD_PARENTDEPTNAME, val);
        return this;
    }

    /**
     * 获取「上级部门」值
     *
    */
    @JsonIgnore
    public String getParentDeptName() {
        return (String) this.get(FIELD_PARENTDEPTNAME);
    }

    /**
     * 判断 「上级部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentDeptName() {
        return this.contains(FIELD_PARENTDEPTNAME);
    }

    /**
     * 重置 「上级部门」
     *
    */
    @JsonIgnore
    public Department resetParentDeptName() {
        this.reset(FIELD_PARENTDEPTNAME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public Department setCreateDate(Timestamp val) {
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
    public Department resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public Department setUpdateDate(Timestamp val) {
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
    public Department resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「钉钉部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDDDeptId(String val) {
        this.set(FIELD_DDDEPTID, val);
        return this;
    }

    /**
     * 获取「钉钉部门标识」值
     *
    */
    @JsonIgnore
    public String getDDDeptId() {
        return (String) this.get(FIELD_DDDEPTID);
    }

    /**
     * 判断 「钉钉部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDDeptId() {
        return this.contains(FIELD_DDDEPTID);
    }

    /**
     * 重置 「钉钉部门标识」
     *
    */
    @JsonIgnore
    public Department resetDDDeptId() {
        this.reset(FIELD_DDDEPTID);
        return this;
    }

    /**
     * 设置「部门全称」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptFullName(String val) {
        this.set(FIELD_DEPTFULLNAME, val);
        return this;
    }

    /**
     * 获取「部门全称」值
     *
    */
    @JsonIgnore
    public String getDeptFullName() {
        return (String) this.get(FIELD_DEPTFULLNAME);
    }

    /**
     * 判断 「部门全称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptFullName() {
        return this.contains(FIELD_DEPTFULLNAME);
    }

    /**
     * 重置 「部门全称」
     *
    */
    @JsonIgnore
    public Department resetDeptFullName() {
        this.reset(FIELD_DEPTFULLNAME);
        return this;
    }

    /**
     * 设置「部门领导」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptLeader(String val) {
        this.set(FIELD_DEPTLEADER, val);
        return this;
    }

    /**
     * 获取「部门领导」值
     *
    */
    @JsonIgnore
    public String getDeptLeader() {
        return (String) this.get(FIELD_DEPTLEADER);
    }

    /**
     * 判断 「部门领导」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptLeader() {
        return this.contains(FIELD_DEPTLEADER);
    }

    /**
     * 重置 「部门领导」
     *
    */
    @JsonIgnore
    public Department resetDeptLeader() {
        this.reset(FIELD_DEPTLEADER);
        return this;
    }

    /**
     * 设置「部门领导标识」
     *
     * @param val
    */
    @JsonIgnore
    public Department setDeptLeaderId(String val) {
        this.set(FIELD_DEPTLEADERID, val);
        return this;
    }

    /**
     * 获取「部门领导标识」值
     *
    */
    @JsonIgnore
    public String getDeptLeaderId() {
        return (String) this.get(FIELD_DEPTLEADERID);
    }

    /**
     * 判断 「部门领导标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptLeaderId() {
        return this.contains(FIELD_DEPTLEADERID);
    }

    /**
     * 重置 「部门领导标识」
     *
    */
    @JsonIgnore
    public Department resetDeptLeaderId() {
        this.reset(FIELD_DEPTLEADERID);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public Department setIsValid(Integer val) {
        this.set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标志」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ISVALID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用标志」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsValid() {
        return this.contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标志」
     *
    */
    @JsonIgnore
    public Department resetIsValid() {
        this.reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「组织代码」
     *
     * @param val
    */
    @JsonIgnore
    public Department setOrgCode(String val) {
        this.set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「组织代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this.get(FIELD_ORGCODE);
    }

    /**
     * 判断 「组织代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this.contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「组织代码」
     *
    */
    @JsonIgnore
    public Department resetOrgCode() {
        this.reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「企业微信部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public Department setWXWorkDeptId(String val) {
        this.set(FIELD_WXWORKDEPTID, val);
        return this;
    }

    /**
     * 获取「企业微信部门标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkDeptId() {
        return (String) this.get(FIELD_WXWORKDEPTID);
    }

    /**
     * 判断 「企业微信部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkDeptId() {
        return this.contains(FIELD_WXWORKDEPTID);
    }

    /**
     * 重置 「企业微信部门标识」
     *
    */
    @JsonIgnore
    public Department resetWXWorkDeptId() {
        this.reset(FIELD_WXWORKDEPTID);
        return this;
    }


}
