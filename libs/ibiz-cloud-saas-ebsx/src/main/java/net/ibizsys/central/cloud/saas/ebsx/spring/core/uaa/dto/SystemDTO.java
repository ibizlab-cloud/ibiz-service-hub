package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 部署系统
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/.ibizmodel.index
 */
public class SystemDTO extends EntityDTO {

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 系统名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/PSSYSTEMNAME/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMNAME = "pssystemname";

  /**.
   * 结构
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/SYSSTRUCTURE/.ibizmodel.index
   */
  public final static String FIELD_SYSSTRUCTURE = "sysstructure";

  /**.
   * 应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/APPS/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/minorpsders/DER1N_SYS_APP_SYS_PSSYSTEM_PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_APPS = "apps";

  /**.
   * 校验
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/MD5CHECK/.ibizmodel.index
   */
  public final static String FIELD_MD5CHECK = "md5check";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * IP地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/IPADRESS/.ibizmodel.index
   */
  public final static String FIELD_IPADDRESS = "ipaddress";

  /**.
   * 任务端口
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/JOBPORT/.ibizmodel.index
   */
  public final static String FIELD_JOBPORT = "jobport";

  /**.
   * 回调系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REALPSDEVSLNSYSID/.ibizmodel.index
   */
  public final static String FIELD_REALPSDEVSLNSYSID = "realpsdevslnsysid";

  /**.
   * 系统模型（远程仓库）
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REMOTESYSMODEL/.ibizmodel.index
   */
  public final static String FIELD_REMOTESYSMODEL = "remotesysmodel";

  /**.
   * 仓库分支
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REMOTESYSMODELBRANCH/.ibizmodel.index
   */
  public final static String FIELD_REMOTESYSMODELBRANCH = "remotesysmodelbranch";

  /**.
   * 系统模型（远程路径）
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REMOTESYSMODELPATH/.ibizmodel.index
   */
  public final static String FIELD_REMOTESYSMODELPATH = "remotesysmodelpath";

  /**.
   * 远程密码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REMOTESYSMODELPWD/.ibizmodel.index
   */
  public final static String FIELD_REMOTESYSMODELPWD = "remotesysmodelpwd";

  /**.
   * 远程账户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/REMOTESYSMODELUSER/.ibizmodel.index
   */
  public final static String FIELD_REMOTESYSMODELUSER = "remotesysmodeluser";

  /**.
   * 系统模型
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdefields/SYSMODEL/.ibizmodel.index
   */
  public final static String FIELD_SYSMODEL = "sysmodel";


    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setPSSystemId(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public SystemDTO resetPSSystemId() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setPSSystemName(String val) {
        this._set(FIELD_PSSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getPSSystemName() {
        return (String) this._get(FIELD_PSSYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemName() {
        return this._contains(FIELD_PSSYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public SystemDTO resetPSSystemName() {
        this._reset(FIELD_PSSYSTEMNAME);
        return this;
    }

    /**
     * 设置「结构」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setSysStructure(String val) {
        this._set(FIELD_SYSSTRUCTURE, val);
        return this;
    }

    /**
     * 获取「结构」值
     *
    */
    @JsonIgnore
    public String getSysStructure() {
        return (String) this._get(FIELD_SYSSTRUCTURE);
    }

    /**
     * 判断 「结构」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysStructure() {
        return this._contains(FIELD_SYSSTRUCTURE);
    }

    /**
     * 重置 「结构」
     *
    */
    @JsonIgnore
    public SystemDTO resetSysStructure() {
        this._reset(FIELD_SYSSTRUCTURE);
        return this;
    }

    /**
     * 设置「应用」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setApps(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OldAppDTO> val) {
        this._set(FIELD_APPS, val);
        return this;
    }

    /**
     * 获取「应用」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OldAppDTO> getApps() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OldAppDTO>) this._get(FIELD_APPS);
    }

    /**
     * 判断 「应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApps() {
        return this._contains(FIELD_APPS);
    }

    /**
     * 重置 「应用」
     *
    */
    @JsonIgnore
    public SystemDTO resetApps() {
        this._reset(FIELD_APPS);
        return this;
    }

    /**
     * 设置「校验」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setMD5Check(String val) {
        this._set(FIELD_MD5CHECK, val);
        return this;
    }

    /**
     * 获取「校验」值
     *
    */
    @JsonIgnore
    public String getMD5Check() {
        return (String) this._get(FIELD_MD5CHECK);
    }

    /**
     * 判断 「校验」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMD5Check() {
        return this._contains(FIELD_MD5CHECK);
    }

    /**
     * 重置 「校验」
     *
    */
    @JsonIgnore
    public SystemDTO resetMD5Check() {
        this._reset(FIELD_MD5CHECK);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setShowOrder(Integer val) {
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
    public SystemDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「IP地址」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setIPAddress(String val) {
        this._set(FIELD_IPADDRESS, val);
        return this;
    }

    /**
     * 获取「IP地址」值
     *
    */
    @JsonIgnore
    public String getIPAddress() {
        return (String) this._get(FIELD_IPADDRESS);
    }

    /**
     * 判断 「IP地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIPAddress() {
        return this._contains(FIELD_IPADDRESS);
    }

    /**
     * 重置 「IP地址」
     *
    */
    @JsonIgnore
    public SystemDTO resetIPAddress() {
        this._reset(FIELD_IPADDRESS);
        return this;
    }

    /**
     * 设置「任务端口」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setJobPort(String val) {
        this._set(FIELD_JOBPORT, val);
        return this;
    }

    /**
     * 获取「任务端口」值
     *
    */
    @JsonIgnore
    public String getJobPort() {
        return (String) this._get(FIELD_JOBPORT);
    }

    /**
     * 判断 「任务端口」是否有值
     *
    */
    @JsonIgnore
    public boolean containsJobPort() {
        return this._contains(FIELD_JOBPORT);
    }

    /**
     * 重置 「任务端口」
     *
    */
    @JsonIgnore
    public SystemDTO resetJobPort() {
        this._reset(FIELD_JOBPORT);
        return this;
    }

    /**
     * 设置「回调系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRealPSDevSlnSysId(String val) {
        this._set(FIELD_REALPSDEVSLNSYSID, val);
        return this;
    }

    /**
     * 获取「回调系统标识」值
     *
    */
    @JsonIgnore
    public String getRealPSDevSlnSysId() {
        return (String) this._get(FIELD_REALPSDEVSLNSYSID);
    }

    /**
     * 判断 「回调系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealPSDevSlnSysId() {
        return this._contains(FIELD_REALPSDEVSLNSYSID);
    }

    /**
     * 重置 「回调系统标识」
     *
    */
    @JsonIgnore
    public SystemDTO resetRealPSDevSlnSysId() {
        this._reset(FIELD_REALPSDEVSLNSYSID);
        return this;
    }

    /**
     * 设置「系统模型（远程仓库）」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRemoteSysModel(String val) {
        this._set(FIELD_REMOTESYSMODEL, val);
        return this;
    }

    /**
     * 获取「系统模型（远程仓库）」值
     *
    */
    @JsonIgnore
    public String getRemoteSysModel() {
        return (String) this._get(FIELD_REMOTESYSMODEL);
    }

    /**
     * 判断 「系统模型（远程仓库）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemoteSysModel() {
        return this._contains(FIELD_REMOTESYSMODEL);
    }

    /**
     * 重置 「系统模型（远程仓库）」
     *
    */
    @JsonIgnore
    public SystemDTO resetRemoteSysModel() {
        this._reset(FIELD_REMOTESYSMODEL);
        return this;
    }

    /**
     * 设置「仓库分支」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRemoteSysModelBranch(String val) {
        this._set(FIELD_REMOTESYSMODELBRANCH, val);
        return this;
    }

    /**
     * 获取「仓库分支」值
     *
    */
    @JsonIgnore
    public String getRemoteSysModelBranch() {
        return (String) this._get(FIELD_REMOTESYSMODELBRANCH);
    }

    /**
     * 判断 「仓库分支」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemoteSysModelBranch() {
        return this._contains(FIELD_REMOTESYSMODELBRANCH);
    }

    /**
     * 重置 「仓库分支」
     *
    */
    @JsonIgnore
    public SystemDTO resetRemoteSysModelBranch() {
        this._reset(FIELD_REMOTESYSMODELBRANCH);
        return this;
    }

    /**
     * 设置「系统模型（远程路径）」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRemoteSysModelPath(String val) {
        this._set(FIELD_REMOTESYSMODELPATH, val);
        return this;
    }

    /**
     * 获取「系统模型（远程路径）」值
     *
    */
    @JsonIgnore
    public String getRemoteSysModelPath() {
        return (String) this._get(FIELD_REMOTESYSMODELPATH);
    }

    /**
     * 判断 「系统模型（远程路径）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemoteSysModelPath() {
        return this._contains(FIELD_REMOTESYSMODELPATH);
    }

    /**
     * 重置 「系统模型（远程路径）」
     *
    */
    @JsonIgnore
    public SystemDTO resetRemoteSysModelPath() {
        this._reset(FIELD_REMOTESYSMODELPATH);
        return this;
    }

    /**
     * 设置「远程密码」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRemoteSysModelPwd(String val) {
        this._set(FIELD_REMOTESYSMODELPWD, val);
        return this;
    }

    /**
     * 获取「远程密码」值
     *
    */
    @JsonIgnore
    public String getRemoteSysModelPwd() {
        return (String) this._get(FIELD_REMOTESYSMODELPWD);
    }

    /**
     * 判断 「远程密码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemoteSysModelPwd() {
        return this._contains(FIELD_REMOTESYSMODELPWD);
    }

    /**
     * 重置 「远程密码」
     *
    */
    @JsonIgnore
    public SystemDTO resetRemoteSysModelPwd() {
        this._reset(FIELD_REMOTESYSMODELPWD);
        return this;
    }

    /**
     * 设置「远程账户」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setRemoteSysModelUser(String val) {
        this._set(FIELD_REMOTESYSMODELUSER, val);
        return this;
    }

    /**
     * 获取「远程账户」值
     *
    */
    @JsonIgnore
    public String getRemoteSysModelUser() {
        return (String) this._get(FIELD_REMOTESYSMODELUSER);
    }

    /**
     * 判断 「远程账户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRemoteSysModelUser() {
        return this._contains(FIELD_REMOTESYSMODELUSER);
    }

    /**
     * 重置 「远程账户」
     *
    */
    @JsonIgnore
    public SystemDTO resetRemoteSysModelUser() {
        this._reset(FIELD_REMOTESYSMODELUSER);
        return this;
    }

    /**
     * 设置「系统模型」
     *
     * @param val
    */
    @JsonIgnore
    public SystemDTO setSysModel(String val) {
        this._set(FIELD_SYSMODEL, val);
        return this;
    }

    /**
     * 获取「系统模型」值
     *
    */
    @JsonIgnore
    public String getSysModel() {
        return (String) this._get(FIELD_SYSMODEL);
    }

    /**
     * 判断 「系统模型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysModel() {
        return this._contains(FIELD_SYSMODEL);
    }

    /**
     * 重置 「系统模型」
     *
    */
    @JsonIgnore
    public SystemDTO resetSysModel() {
        this._reset(FIELD_SYSMODEL);
        return this;
    }


}
