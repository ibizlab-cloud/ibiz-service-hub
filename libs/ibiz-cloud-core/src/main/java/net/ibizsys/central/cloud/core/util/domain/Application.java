package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 部署应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/.ibizmodel.index
 */
public class Application extends EntityBase {

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 应用类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppCategory} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/APPCATEGORY/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppCategory.ibizmodel.yaml
   */
  public final static String FIELD_APPCATEGORY = "appcategory";

  /**.
   * 应用代码名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODENAME = "codename";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 图标样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/ICONCSS/.ibizmodel.index
   */
  public final static String FIELD_ICONCSS = "iconcss";

  /**.
   * 首页名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/INDEXCODENAME/.ibizmodel.index
   */
  public final static String FIELD_INDEXCODENAME = "indexcodename";

  /**.
   * 是否定制
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/ISPERSONAL/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISPERSONAL = "ispersonal";

  /**.
   * 是否移动应用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/MOBILEAPP/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_MOBILEAPP = "mobileapp";

  /**.
   * 系统应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/APPLICATIONID/.ibizmodel.index
   */
  public final static String FIELD_APPLICATIONID = "applicationid";

  /**.
   * 系统应用名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/APPLICATIONNAME/.ibizmodel.index
   */
  public final static String FIELD_APPLICATIONNAME = "applicationname";

  /**.
   * 服务名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/SERVICEID/.ibizmodel.index
   */
  public final static String FIELD_SERVICEID = "serviceid";

  /**.
   * 应用设置
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/SETTING/.ibizmodel.index
   */
  public final static String FIELD_SETTING = "setting";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/minorpsders/DER1N_SYS_APPLICATION_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 提示
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/TIP/.ibizmodel.index
   */
  public final static String FIELD_TIP = "tip";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";

  /**.
   * 视图路径格式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPLICATION/psdefields/VIEWPATHFORMAT/.ibizmodel.index
   */
  public final static String FIELD_VIEWPATHFORMAT = "viewpathformat";

  /**.
   * 应用部署工作流
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdefields/APPWFS/.ibizmodel.index
   */
  public final static String FIELD_APPWFS = "appwfs";
  

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public Application setShowOrder(Integer val) {
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
    public Application resetShowOrder() {
        this.reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「应用类别」
     *
     * @param val
    */
    @JsonIgnore
    public Application setAppCategory(String val) {
        this.set(FIELD_APPCATEGORY, val);
        return this;
    }

    /**
     * 获取「应用类别」值
     *
    */
    @JsonIgnore
    public String getAppCategory() {
        return (String) this.get(FIELD_APPCATEGORY);
    }

    /**
     * 判断 「应用类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppCategory() {
        return this.contains(FIELD_APPCATEGORY);
    }

    /**
     * 重置 「应用类别」
     *
    */
    @JsonIgnore
    public Application resetAppCategory() {
        this.reset(FIELD_APPCATEGORY);
        return this;
    }

    /**
     * 设置「应用代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public Application setCodeName(String val) {
        this.set(FIELD_CODENAME, val);
        return this;
    }

    /**
     * 获取「应用代码名称」值
     *
    */
    @JsonIgnore
    public String getCodeName() {
        return (String) this.get(FIELD_CODENAME);
    }

    /**
     * 判断 「应用代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCodeName() {
        return this.contains(FIELD_CODENAME);
    }

    /**
     * 重置 「应用代码名称」
     *
    */
    @JsonIgnore
    public Application resetCodeName() {
        this.reset(FIELD_CODENAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public Application setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
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
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public Application resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public Application setCreateMan(String val) {
        this.set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this.get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public Application resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public Application setIcon(String val) {
        this.set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
    */
    @JsonIgnore
    public String getIcon() {
        return (String) this.get(FIELD_ICON);
    }

    /**
     * 判断 「图标」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIcon() {
        return this.contains(FIELD_ICON);
    }

    /**
     * 重置 「图标」
     *
    */
    @JsonIgnore
    public Application resetIcon() {
        this.reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「图标样式」
     *
     * @param val
    */
    @JsonIgnore
    public Application setIconCss(String val) {
        this.set(FIELD_ICONCSS, val);
        return this;
    }

    /**
     * 获取「图标样式」值
     *
    */
    @JsonIgnore
    public String getIconCss() {
        return (String) this.get(FIELD_ICONCSS);
    }

    /**
     * 判断 「图标样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIconCss() {
        return this.contains(FIELD_ICONCSS);
    }

    /**
     * 重置 「图标样式」
     *
    */
    @JsonIgnore
    public Application resetIconCss() {
        this.reset(FIELD_ICONCSS);
        return this;
    }

    /**
     * 设置「首页名称」
     *
     * @param val
    */
    @JsonIgnore
    public Application setIndexCodeName(String val) {
        this.set(FIELD_INDEXCODENAME, val);
        return this;
    }

    /**
     * 获取「首页名称」值
     *
    */
    @JsonIgnore
    public String getIndexCodeName() {
        return (String) this.get(FIELD_INDEXCODENAME);
    }

    /**
     * 判断 「首页名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIndexCodeName() {
        return this.contains(FIELD_INDEXCODENAME);
    }

    /**
     * 重置 「首页名称」
     *
    */
    @JsonIgnore
    public Application resetIndexCodeName() {
        this.reset(FIELD_INDEXCODENAME);
        return this;
    }

    /**
     * 设置「是否定制」
     *
     * @param val
    */
    @JsonIgnore
    public Application setIsPersonal(Integer val) {
        this.set(FIELD_ISPERSONAL, val);
        return this;
    }

    /**
     * 获取「是否定制」值
     *
    */
    @JsonIgnore
    public Integer getIsPersonal() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ISPERSONAL),null);
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
        return this.contains(FIELD_ISPERSONAL);
    }

    /**
     * 重置 「是否定制」
     *
    */
    @JsonIgnore
    public Application resetIsPersonal() {
        this.reset(FIELD_ISPERSONAL);
        return this;
    }

    /**
     * 设置「是否移动应用」
     *
     * @param val
    */
    @JsonIgnore
    public Application setMobileApp(Integer val) {
        this.set(FIELD_MOBILEAPP, val);
        return this;
    }

    /**
     * 获取「是否移动应用」值
     *
    */
    @JsonIgnore
    public Integer getMobileApp() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_MOBILEAPP),null);
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
        return this.contains(FIELD_MOBILEAPP);
    }

    /**
     * 重置 「是否移动应用」
     *
    */
    @JsonIgnore
    public Application resetMobileApp() {
        this.reset(FIELD_MOBILEAPP);
        return this;
    }

    /**
     * 设置「系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public Application setApplicationId(String val) {
        this.set(FIELD_APPLICATIONID, val);
        return this;
    }

    /**
     * 获取「系统应用标识」值
     *
    */
    @JsonIgnore
    public String getApplicationId() {
        return (String) this.get(FIELD_APPLICATIONID);
    }

    /**
     * 判断 「系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApplicationId() {
        return this.contains(FIELD_APPLICATIONID);
    }

    /**
     * 重置 「系统应用标识」
     *
    */
    @JsonIgnore
    public Application resetApplicationId() {
        this.reset(FIELD_APPLICATIONID);
        return this;
    }

    /**
     * 设置「系统应用名称」
     *
     * @param val
    */
    @JsonIgnore
    public Application setApplicationName(String val) {
        this.set(FIELD_APPLICATIONNAME, val);
        return this;
    }

    /**
     * 获取「系统应用名称」值
     *
    */
    @JsonIgnore
    public String getApplicationName() {
        return (String) this.get(FIELD_APPLICATIONNAME);
    }

    /**
     * 判断 「系统应用名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApplicationName() {
        return this.contains(FIELD_APPLICATIONNAME);
    }

    /**
     * 重置 「系统应用名称」
     *
    */
    @JsonIgnore
    public Application resetApplicationName() {
        this.reset(FIELD_APPLICATIONNAME);
        return this;
    }

    /**
     * 设置「服务名」
     *
     * @param val
    */
    @JsonIgnore
    public Application setServiceId(String val) {
        this.set(FIELD_SERVICEID, val);
        return this;
    }

    /**
     * 获取「服务名」值
     *
    */
    @JsonIgnore
    public String getServiceId() {
        return (String) this.get(FIELD_SERVICEID);
    }

    /**
     * 判断 「服务名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsServiceId() {
        return this.contains(FIELD_SERVICEID);
    }

    /**
     * 重置 「服务名」
     *
    */
    @JsonIgnore
    public Application resetServiceId() {
        this.reset(FIELD_SERVICEID);
        return this;
    }

    /**
     * 设置「应用设置」
     *
     * @param val
    */
    @JsonIgnore
    public Application setSetting(String val) {
        this.set(FIELD_SETTING, val);
        return this;
    }

    /**
     * 获取「应用设置」值
     *
    */
    @JsonIgnore
    public String getSetting() {
        return (String) this.get(FIELD_SETTING);
    }

    /**
     * 判断 「应用设置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSetting() {
        return this.contains(FIELD_SETTING);
    }

    /**
     * 重置 「应用设置」
     *
    */
    @JsonIgnore
    public Application resetSetting() {
        this.reset(FIELD_SETTING);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public Application setSystemId(String val) {
        this.set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this.get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this.contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public Application resetSystemId() {
        this.reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「提示」
     *
     * @param val
    */
    @JsonIgnore
    public Application setTip(String val) {
        this.set(FIELD_TIP, val);
        return this;
    }

    /**
     * 获取「提示」值
     *
    */
    @JsonIgnore
    public String getTip() {
        return (String) this.get(FIELD_TIP);
    }

    /**
     * 判断 「提示」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTip() {
        return this.contains(FIELD_TIP);
    }

    /**
     * 重置 「提示」
     *
    */
    @JsonIgnore
    public Application resetTip() {
        this.reset(FIELD_TIP);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public Application setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
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
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public Application resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public Application setUpdateMan(String val) {
        this.set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this.get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public Application resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public Application setUrl(String val) {
        this.set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this.get(FIELD_URL);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this.contains(FIELD_URL);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public Application resetUrl() {
        this.reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「视图路径格式」
     *
     * @param val
    */
    @JsonIgnore
    public Application setViewPathFormat(String val) {
        this.set(FIELD_VIEWPATHFORMAT, val);
        return this;
    }

    /**
     * 获取「视图路径格式」值
     *
    */
    @JsonIgnore
    public String getViewPathFormat() {
        return (String) this.get(FIELD_VIEWPATHFORMAT);
    }

    /**
     * 判断 「视图路径格式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsViewPathFormat() {
        return this.contains(FIELD_VIEWPATHFORMAT);
    }

    /**
     * 重置 「视图路径格式」
     *
    */
    @JsonIgnore
    public Application resetViewPathFormat() {
        this.reset(FIELD_VIEWPATHFORMAT);
        return this;
    }

    /**
     * 设置「应用部署工作流」
     *
     * @param val
    */
    @JsonIgnore
    public Application setAppWFs(String val) {
        this.set(FIELD_APPWFS, val);
        return this;
    }

    /**
     * 获取「应用部署工作流」值
     *
    */
    @JsonIgnore
    public String getAppWFs() {
        return (String) this.get(FIELD_APPWFS);
    }

    /**
     * 判断 「应用部署工作流」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppWFs() {
        return this.contains(FIELD_APPWFS);
    }

    /**
     * 重置 「应用部署工作流」
     *
    */
    @JsonIgnore
    public Application resetAppWFs() {
        this.reset(FIELD_APPWFS);
        return this;
    }
}
