package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 报表
 * 
 * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/.ibizmodel.index
 */
public class Report extends EntityBase {

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 配置
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/CONF/.ibizmodel.index
   */
  public final static String FIELD_CONF = "conf";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/minorpsders/DER1N_REP_REPORT_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统名称
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/minorpsders/DER1N_REP_REPORT_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 数据源
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/DSLINK/.ibizmodel.index
   */
  public final static String FIELD_DSLINK = "dslink";

  /**.
   * 动态实例标识
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 报表编号
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/REPORTCODE/.ibizmodel.index
   */
  public final static String FIELD_REPORTCODE = "reportcode";

  /**.
   * 报表标识
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/REPORTID/.ibizmodel.index
   */
  public final static String FIELD_REPORTID = "reportid";

  /**.
   * 报表名称
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/REPORTNAME/.ibizmodel.index
   */
  public final static String FIELD_REPORTNAME = "reportname";

  /**.
   * 报表类型
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/REPORTTYPE/.ibizmodel.index
   */
  public final static String FIELD_REPORTTYPE = "reporttype";

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/RESOURCEID/.ibizmodel.index
   */
  public final static String FIELD_RESOURCEID = "resourceid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdefields/SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";


    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public Report setCreateDate(Timestamp val) {
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
    public Report resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public Report setUpdateDate(Timestamp val) {
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
    public Report resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public Report setCreateMan(String val) {
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
    public Report resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public Report setUpdateMan(String val) {
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
    public Report resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public Report setConf(String val) {
        this.set(FIELD_CONF, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getConf() {
        return (String) this.get(FIELD_CONF);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConf() {
        return this.contains(FIELD_CONF);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public Report resetConf() {
        this.reset(FIELD_CONF);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public Report setDCSystemId(String val) {
        this.set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this.get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this.contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public Report resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public Report setDCSystemName(String val) {
        this.set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this.get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this.contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public Report resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「数据源」
     *
     * @param val
    */
    @JsonIgnore
    public Report setDSLink(String val) {
        this.set(FIELD_DSLINK, val);
        return this;
    }

    /**
     * 获取「数据源」值
     *
    */
    @JsonIgnore
    public String getDSLink() {
        return (String) this.get(FIELD_DSLINK);
    }

    /**
     * 判断 「数据源」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSLink() {
        return this.contains(FIELD_DSLINK);
    }

    /**
     * 重置 「数据源」
     *
    */
    @JsonIgnore
    public Report resetDSLink() {
        this.reset(FIELD_DSLINK);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public Report setDynaInstId(String val) {
        this.set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this.get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this.contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public Report resetDynaInstId() {
        this.reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「报表编号」
     *
     * @param val
    */
    @JsonIgnore
    public Report setReportCode(String val) {
        this.set(FIELD_REPORTCODE, val);
        return this;
    }

    /**
     * 获取「报表编号」值
     *
    */
    @JsonIgnore
    public String getReportCode() {
        return (String) this.get(FIELD_REPORTCODE);
    }

    /**
     * 判断 「报表编号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportCode() {
        return this.contains(FIELD_REPORTCODE);
    }

    /**
     * 重置 「报表编号」
     *
    */
    @JsonIgnore
    public Report resetReportCode() {
        this.reset(FIELD_REPORTCODE);
        return this;
    }

    /**
     * 设置「报表标识」
     *
     * @param val
    */
    @JsonIgnore
    public Report setReportId(String val) {
        this.set(FIELD_REPORTID, val);
        return this;
    }

    /**
     * 获取「报表标识」值
     *
    */
    @JsonIgnore
    public String getReportId() {
        return (String) this.get(FIELD_REPORTID);
    }

    /**
     * 判断 「报表标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportId() {
        return this.contains(FIELD_REPORTID);
    }

    /**
     * 重置 「报表标识」
     *
    */
    @JsonIgnore
    public Report resetReportId() {
        this.reset(FIELD_REPORTID);
        return this;
    }

    /**
     * 设置「报表名称」
     *
     * @param val
    */
    @JsonIgnore
    public Report setReportName(String val) {
        this.set(FIELD_REPORTNAME, val);
        return this;
    }

    /**
     * 获取「报表名称」值
     *
    */
    @JsonIgnore
    public String getReportName() {
        return (String) this.get(FIELD_REPORTNAME);
    }

    /**
     * 判断 「报表名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportName() {
        return this.contains(FIELD_REPORTNAME);
    }

    /**
     * 重置 「报表名称」
     *
    */
    @JsonIgnore
    public Report resetReportName() {
        this.reset(FIELD_REPORTNAME);
        return this;
    }

    /**
     * 设置「报表类型」
     *
     * @param val
    */
    @JsonIgnore
    public Report setReportType(String val) {
        this.set(FIELD_REPORTTYPE, val);
        return this;
    }

    /**
     * 获取「报表类型」值
     *
    */
    @JsonIgnore
    public String getReportType() {
        return (String) this.get(FIELD_REPORTTYPE);
    }

    /**
     * 判断 「报表类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportType() {
        return this.contains(FIELD_REPORTTYPE);
    }

    /**
     * 重置 「报表类型」
     *
    */
    @JsonIgnore
    public Report resetReportType() {
        this.reset(FIELD_REPORTTYPE);
        return this;
    }

    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public Report setResourceId(String val) {
        this.set(FIELD_RESOURCEID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getResourceId() {
        return (String) this.get(FIELD_RESOURCEID);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsResourceId() {
        return this.contains(FIELD_RESOURCEID);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public Report resetResourceId() {
        this.reset(FIELD_RESOURCEID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public Report setSystemId(String val) {
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
    public Report resetSystemId() {
        this.reset(FIELD_SYSTEMID);
        return this;
    }


}
