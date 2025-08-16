package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 部署应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/.ibizmodel.index
 */
public class ApplicationDTO extends EntityDTO {

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 应用类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppCategory} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/APPCATEGORY/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppCategory.ibizmodel.yaml
   */
  public final static String FIELD_APPCATEGORY = "appcategory";

  /**.
   * 应用部署工作流
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/APPWFS/.ibizmodel.index
   */
  public final static String FIELD_APPWFS = "appwfs";

  /**.
   * 应用代码名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODENAME = "codename";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 图标样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/ICONCSS/.ibizmodel.index
   */
  public final static String FIELD_ICONCSS = "iconcss";

  /**.
   * 首页名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/INDEXCODENAME/.ibizmodel.index
   */
  public final static String FIELD_INDEXCODENAME = "indexcodename";

  /**.
   * 是否定制
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/ISPERSONAL/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISPERSONAL = "ispersonal";

  /**.
   * 是否移动应用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/MOBILEAPP/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_MOBILEAPP = "mobileapp";

  /**.
   * 系统应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/PSSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMAPPID = "pssystemappid";

  /**.
   * 系统应用名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/PSSYSTEMAPPNAME/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMAPPNAME = "pssystemappname";

  /**.
   * 服务名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/SERVICEID/.ibizmodel.index
   */
  public final static String FIELD_SERVICEID = "serviceid";

  /**.
   * 应用设置
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/SETTING/.ibizmodel.index
   */
  public final static String FIELD_SETTING = "setting";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/minorpsders/DER1N_SYS_PSSYSTEMAPP_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 提示
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/TIP/.ibizmodel.index
   */
  public final static String FIELD_TIP = "tip";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";

  /**.
   * 视图路径格式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/VIEWPATHFORMAT/.ibizmodel.index
   */
  public final static String FIELD_VIEWPATHFORMAT = "viewpathformat";


    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setShowOrder(Integer val) {
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
    public ApplicationDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「应用类别」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setAppCategory(String val) {
        this._set(FIELD_APPCATEGORY, val);
        return this;
    }

    /**
     * 获取「应用类别」值
     *
    */
    @JsonIgnore
    public String getAppCategory() {
        return (String) this._get(FIELD_APPCATEGORY);
    }

    /**
     * 判断 「应用类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppCategory() {
        return this._contains(FIELD_APPCATEGORY);
    }

    /**
     * 重置 「应用类别」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetAppCategory() {
        this._reset(FIELD_APPCATEGORY);
        return this;
    }

    /**
     * 设置「应用部署工作流」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setAppWFs(String val) {
        this._set(FIELD_APPWFS, val);
        return this;
    }

    /**
     * 获取「应用部署工作流」值
     *
    */
    @JsonIgnore
    public String getAppWFs() {
        return (String) this._get(FIELD_APPWFS);
    }

    /**
     * 判断 「应用部署工作流」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppWFs() {
        return this._contains(FIELD_APPWFS);
    }

    /**
     * 重置 「应用部署工作流」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetAppWFs() {
        this._reset(FIELD_APPWFS);
        return this;
    }

    /**
     * 设置「应用代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setCodeName(String val) {
        this._set(FIELD_CODENAME, val);
        return this;
    }

    /**
     * 获取「应用代码名称」值
     *
    */
    @JsonIgnore
    public String getCodeName() {
        return (String) this._get(FIELD_CODENAME);
    }

    /**
     * 判断 「应用代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCodeName() {
        return this._contains(FIELD_CODENAME);
    }

    /**
     * 重置 「应用代码名称」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetCodeName() {
        this._reset(FIELD_CODENAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setIcon(String val) {
        this._set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
    */
    @JsonIgnore
    public String getIcon() {
        return (String) this._get(FIELD_ICON);
    }

    /**
     * 判断 「图标」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIcon() {
        return this._contains(FIELD_ICON);
    }

    /**
     * 重置 「图标」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「图标样式」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setIconCss(String val) {
        this._set(FIELD_ICONCSS, val);
        return this;
    }

    /**
     * 获取「图标样式」值
     *
    */
    @JsonIgnore
    public String getIconCss() {
        return (String) this._get(FIELD_ICONCSS);
    }

    /**
     * 判断 「图标样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIconCss() {
        return this._contains(FIELD_ICONCSS);
    }

    /**
     * 重置 「图标样式」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetIconCss() {
        this._reset(FIELD_ICONCSS);
        return this;
    }

    /**
     * 设置「首页名称」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setIndexCodeName(String val) {
        this._set(FIELD_INDEXCODENAME, val);
        return this;
    }

    /**
     * 获取「首页名称」值
     *
    */
    @JsonIgnore
    public String getIndexCodeName() {
        return (String) this._get(FIELD_INDEXCODENAME);
    }

    /**
     * 判断 「首页名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIndexCodeName() {
        return this._contains(FIELD_INDEXCODENAME);
    }

    /**
     * 重置 「首页名称」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetIndexCodeName() {
        this._reset(FIELD_INDEXCODENAME);
        return this;
    }

    /**
     * 设置「是否定制」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setIsPersonal(Integer val) {
        this._set(FIELD_ISPERSONAL, val);
        return this;
    }

    /**
     * 获取「是否定制」值
     *
    */
    @JsonIgnore
    public Integer getIsPersonal() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISPERSONAL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否定制」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsPersonal() {
        return this._contains(FIELD_ISPERSONAL);
    }

    /**
     * 重置 「是否定制」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetIsPersonal() {
        this._reset(FIELD_ISPERSONAL);
        return this;
    }

    /**
     * 设置「是否移动应用」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setMobileApp(Integer val) {
        this._set(FIELD_MOBILEAPP, val);
        return this;
    }

    /**
     * 获取「是否移动应用」值
     *
    */
    @JsonIgnore
    public Integer getMobileApp() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MOBILEAPP),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否移动应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobileApp() {
        return this._contains(FIELD_MOBILEAPP);
    }

    /**
     * 重置 「是否移动应用」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetMobileApp() {
        this._reset(FIELD_MOBILEAPP);
        return this;
    }

    /**
     * 设置「系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setPSSystemAppId(String val) {
        this._set(FIELD_PSSYSTEMAPPID, val);
        return this;
    }

    /**
     * 获取「系统应用标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemAppId() {
        return (String) this._get(FIELD_PSSYSTEMAPPID);
    }

    /**
     * 判断 「系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemAppId() {
        return this._contains(FIELD_PSSYSTEMAPPID);
    }

    /**
     * 重置 「系统应用标识」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetPSSystemAppId() {
        this._reset(FIELD_PSSYSTEMAPPID);
        return this;
    }

    /**
     * 设置「系统应用名称」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setPSSystemAppName(String val) {
        this._set(FIELD_PSSYSTEMAPPNAME, val);
        return this;
    }

    /**
     * 获取「系统应用名称」值
     *
    */
    @JsonIgnore
    public String getPSSystemAppName() {
        return (String) this._get(FIELD_PSSYSTEMAPPNAME);
    }

    /**
     * 判断 「系统应用名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemAppName() {
        return this._contains(FIELD_PSSYSTEMAPPNAME);
    }

    /**
     * 重置 「系统应用名称」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetPSSystemAppName() {
        this._reset(FIELD_PSSYSTEMAPPNAME);
        return this;
    }

    /**
     * 设置「服务名」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setServiceId(String val) {
        this._set(FIELD_SERVICEID, val);
        return this;
    }

    /**
     * 获取「服务名」值
     *
    */
    @JsonIgnore
    public String getServiceId() {
        return (String) this._get(FIELD_SERVICEID);
    }

    /**
     * 判断 「服务名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsServiceId() {
        return this._contains(FIELD_SERVICEID);
    }

    /**
     * 重置 「服务名」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetServiceId() {
        this._reset(FIELD_SERVICEID);
        return this;
    }

    /**
     * 设置「应用设置」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setSetting(String val) {
        this._set(FIELD_SETTING, val);
        return this;
    }

    /**
     * 获取「应用设置」值
     *
    */
    @JsonIgnore
    public String getSetting() {
        return (String) this._get(FIELD_SETTING);
    }

    /**
     * 判断 「应用设置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSetting() {
        return this._contains(FIELD_SETTING);
    }

    /**
     * 重置 「应用设置」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetSetting() {
        this._reset(FIELD_SETTING);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「提示」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setTip(String val) {
        this._set(FIELD_TIP, val);
        return this;
    }

    /**
     * 获取「提示」值
     *
    */
    @JsonIgnore
    public String getTip() {
        return (String) this._get(FIELD_TIP);
    }

    /**
     * 判断 「提示」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTip() {
        return this._contains(FIELD_TIP);
    }

    /**
     * 重置 「提示」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetTip() {
        this._reset(FIELD_TIP);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this._get(FIELD_URL);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「视图路径格式」
     *
     * @param val
    */
    @JsonIgnore
    public ApplicationDTO setViewPathFormat(String val) {
        this._set(FIELD_VIEWPATHFORMAT, val);
        return this;
    }

    /**
     * 获取「视图路径格式」值
     *
    */
    @JsonIgnore
    public String getViewPathFormat() {
        return (String) this._get(FIELD_VIEWPATHFORMAT);
    }

    /**
     * 判断 「视图路径格式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsViewPathFormat() {
        return this._contains(FIELD_VIEWPATHFORMAT);
    }

    /**
     * 重置 「视图路径格式」
     *
    */
    @JsonIgnore
    public ApplicationDTO resetViewPathFormat() {
        this._reset(FIELD_VIEWPATHFORMAT);
        return this;
    }


}
