package net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 报表
 * 
 * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/.ibizmodel.index
 */
public class ReportDTO extends EntityDTO {

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
    public ReportDTO setCreateDate(Timestamp val) {
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
    public ReportDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setUpdateDate(Timestamp val) {
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
    public ReportDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setCreateMan(String val) {
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
    public ReportDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setUpdateMan(String val) {
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
    public ReportDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setConf(String val) {
        this._set(FIELD_CONF, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getConf() {
        return (String) this._get(FIELD_CONF);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConf() {
        return this._contains(FIELD_CONF);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public ReportDTO resetConf() {
        this._reset(FIELD_CONF);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public ReportDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public ReportDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「数据源」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setDSLink(String val) {
        this._set(FIELD_DSLINK, val);
        return this;
    }

    /**
     * 获取「数据源」值
     *
    */
    @JsonIgnore
    public String getDSLink() {
        return (String) this._get(FIELD_DSLINK);
    }

    /**
     * 判断 「数据源」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSLink() {
        return this._contains(FIELD_DSLINK);
    }

    /**
     * 重置 「数据源」
     *
    */
    @JsonIgnore
    public ReportDTO resetDSLink() {
        this._reset(FIELD_DSLINK);
        return this;
    }

    /**
     * 设置「动态实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setDynaInstId(String val) {
        this._set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「动态实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this._get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「动态实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this._contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「动态实例标识」
     *
    */
    @JsonIgnore
    public ReportDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「报表编号」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setReportCode(String val) {
        this._set(FIELD_REPORTCODE, val);
        return this;
    }

    /**
     * 获取「报表编号」值
     *
    */
    @JsonIgnore
    public String getReportCode() {
        return (String) this._get(FIELD_REPORTCODE);
    }

    /**
     * 判断 「报表编号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportCode() {
        return this._contains(FIELD_REPORTCODE);
    }

    /**
     * 重置 「报表编号」
     *
    */
    @JsonIgnore
    public ReportDTO resetReportCode() {
        this._reset(FIELD_REPORTCODE);
        return this;
    }

    /**
     * 设置「报表标识」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setReportId(String val) {
        this._set(FIELD_REPORTID, val);
        return this;
    }

    /**
     * 获取「报表标识」值
     *
    */
    @JsonIgnore
    public String getReportId() {
        return (String) this._get(FIELD_REPORTID);
    }

    /**
     * 判断 「报表标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportId() {
        return this._contains(FIELD_REPORTID);
    }

    /**
     * 重置 「报表标识」
     *
    */
    @JsonIgnore
    public ReportDTO resetReportId() {
        this._reset(FIELD_REPORTID);
        return this;
    }

    /**
     * 设置「报表名称」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setReportName(String val) {
        this._set(FIELD_REPORTNAME, val);
        return this;
    }

    /**
     * 获取「报表名称」值
     *
    */
    @JsonIgnore
    public String getReportName() {
        return (String) this._get(FIELD_REPORTNAME);
    }

    /**
     * 判断 「报表名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportName() {
        return this._contains(FIELD_REPORTNAME);
    }

    /**
     * 重置 「报表名称」
     *
    */
    @JsonIgnore
    public ReportDTO resetReportName() {
        this._reset(FIELD_REPORTNAME);
        return this;
    }

    /**
     * 设置「报表类型」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setReportType(String val) {
        this._set(FIELD_REPORTTYPE, val);
        return this;
    }

    /**
     * 获取「报表类型」值
     *
    */
    @JsonIgnore
    public String getReportType() {
        return (String) this._get(FIELD_REPORTTYPE);
    }

    /**
     * 判断 「报表类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReportType() {
        return this._contains(FIELD_REPORTTYPE);
    }

    /**
     * 重置 「报表类型」
     *
    */
    @JsonIgnore
    public ReportDTO resetReportType() {
        this._reset(FIELD_REPORTTYPE);
        return this;
    }

    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setResourceId(String val) {
        this._set(FIELD_RESOURCEID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getResourceId() {
        return (String) this._get(FIELD_RESOURCEID);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsResourceId() {
        return this._contains(FIELD_RESOURCEID);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public ReportDTO resetResourceId() {
        this._reset(FIELD_RESOURCEID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public ReportDTO setSystemId(String val) {
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
    public ReportDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }


}
