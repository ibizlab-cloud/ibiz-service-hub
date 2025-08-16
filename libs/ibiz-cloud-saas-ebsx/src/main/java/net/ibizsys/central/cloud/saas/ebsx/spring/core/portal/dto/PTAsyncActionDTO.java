package net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 门户异步操作
 * 
 * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/.ibizmodel.index
 */
public class PTAsyncActionDTO extends EntityDTO {

  /**.
   * 操作参数
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONPARAM/.ibizmodel.index
   */
  public final static String FIELD_ACTIONPARAM = "actionparam";

  /**.
   * 操作参数2
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONPARAM2/.ibizmodel.index
   */
  public final static String FIELD_ACTIONPARAM2 = "actionparam2";

  /**.
   * 操作参数4
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONPARAM4/.ibizmodel.index
   */
  public final static String FIELD_ACTIONPARAM3 = "actionparam3";

  /**.
   * 操作参数3
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONPARAM3/.ibizmodel.index
   */
  public final static String FIELD_ACTIONPARAM4 = "actionparam4";

  /**.
   * 操作结果信息
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONRESULT/.ibizmodel.index
   */
  public final static String FIELD_ACTIONRESULT = "actionresult";

  /**.
   * 行为状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.BackendActionState} 
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONSTATE/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/pscodelists/BackendActionState.ibizmodel.yaml
   */
  public final static String FIELD_ACTIONSTATE = "actionstate";

  /**.
   * 操作类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.ActionType} 
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ACTIONTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/pscodelists/ActionType.ibizmodel.yaml
   */
  public final static String FIELD_ACTIONTYPE = "actiontype";

  /**.
   * 异步操作标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ASYNCACITONID/.ibizmodel.index
   */
  public final static String FIELD_ASYNCACITONID = "asyncacitonid";

  /**.
   * 异步操作名称
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ASYNCACITONNAME/.ibizmodel.index
   */
  public final static String FIELD_ASYNCACITONNAME = "asyncacitonname";

  /**.
   * 异步结果下载路径
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ASYNCRESULTDOWNLOADURL/.ibizmodel.index
   */
  public final static String FIELD_ASYNCRESULTDOWNLOADURL = "asyncresultdownloadurl";

  /**.
   * 开始时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/BEGINTIME/.ibizmodel.index
   */
  public final static String FIELD_BEGINTIME = "begintime";

  /**.
   * 完成率
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/COMPLETIONRATE/.ibizmodel.index
   */
  public final static String FIELD_COMPLETIONRATE = "completionrate";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 结束时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ENDTIME/.ibizmodel.index
   */
  public final static String FIELD_ENDTIME = "endtime";

  /**.
   * 完整结果
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/FULLRESULT/.ibizmodel.index
   */
  public final static String FIELD_FULLRESULT = "fullresult";

  /**.
   * 完整步骤信息
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/FULLSTEPINFO/.ibizmodel.index
   */
  public final static String FIELD_FULLSTEPINFO = "fullstepinfo";

  /**.
   * 完整主题标记
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/FULLTOPICTAG/.ibizmodel.index
   */
  public final static String FIELD_FULLTOPICTAG = "fulltopictag";

  /**.
   * 父异步操作标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/PASYNCACITONID/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/minorpsders/DER1N_PT_ASYNCACTION_PT_ASYNCACTION_PASYNCACITONID/.ibizmodel.index
   */
  public final static String FIELD_PASYNCACITONID = "pasyncacitonid";

  /**.
   * 消息推送类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.PushType} 
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/PUSHTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/pscodelists/PushType.ibizmodel.yaml
   */
  public final static String FIELD_PUSHTYPE = "pushtype";

  /**.
   * 消息质量
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.QoSType} 
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/QOS/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/pscodelists/QoSType.ibizmodel.yaml
   */
  public final static String FIELD_QOS = "qos";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 操作步骤信息
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/STEPINFO/.ibizmodel.index
   */
  public final static String FIELD_STEPINFO = "stepinfo";

  /**.
   * 主题标记
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/TOPICTAG/.ibizmodel.index
   */
  public final static String FIELD_TOPICTAG = "topictag";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「操作参数」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionParam(String val) {
        this._set(FIELD_ACTIONPARAM, val);
        return this;
    }

    /**
     * 获取「操作参数」值
     *
    */
    @JsonIgnore
    public String getActionParam() {
        return (String) this._get(FIELD_ACTIONPARAM);
    }

    /**
     * 判断 「操作参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionParam() {
        return this._contains(FIELD_ACTIONPARAM);
    }

    /**
     * 重置 「操作参数」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionParam() {
        this._reset(FIELD_ACTIONPARAM);
        return this;
    }

    /**
     * 设置「操作参数2」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionParam2(String val) {
        this._set(FIELD_ACTIONPARAM2, val);
        return this;
    }

    /**
     * 获取「操作参数2」值
     *
    */
    @JsonIgnore
    public String getActionParam2() {
        return (String) this._get(FIELD_ACTIONPARAM2);
    }

    /**
     * 判断 「操作参数2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionParam2() {
        return this._contains(FIELD_ACTIONPARAM2);
    }

    /**
     * 重置 「操作参数2」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionParam2() {
        this._reset(FIELD_ACTIONPARAM2);
        return this;
    }

    /**
     * 设置「操作参数4」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionParam3(String val) {
        this._set(FIELD_ACTIONPARAM3, val);
        return this;
    }

    /**
     * 获取「操作参数4」值
     *
    */
    @JsonIgnore
    public String getActionParam3() {
        return (String) this._get(FIELD_ACTIONPARAM3);
    }

    /**
     * 判断 「操作参数4」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionParam3() {
        return this._contains(FIELD_ACTIONPARAM3);
    }

    /**
     * 重置 「操作参数4」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionParam3() {
        this._reset(FIELD_ACTIONPARAM3);
        return this;
    }

    /**
     * 设置「操作参数3」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionParam4(String val) {
        this._set(FIELD_ACTIONPARAM4, val);
        return this;
    }

    /**
     * 获取「操作参数3」值
     *
    */
    @JsonIgnore
    public String getActionParam4() {
        return (String) this._get(FIELD_ACTIONPARAM4);
    }

    /**
     * 判断 「操作参数3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionParam4() {
        return this._contains(FIELD_ACTIONPARAM4);
    }

    /**
     * 重置 「操作参数3」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionParam4() {
        this._reset(FIELD_ACTIONPARAM4);
        return this;
    }

    /**
     * 设置「操作结果信息」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionResult(String val) {
        this._set(FIELD_ACTIONRESULT, val);
        return this;
    }

    /**
     * 获取「操作结果信息」值
     *
    */
    @JsonIgnore
    public String getActionResult() {
        return (String) this._get(FIELD_ACTIONRESULT);
    }

    /**
     * 判断 「操作结果信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionResult() {
        return this._contains(FIELD_ACTIONRESULT);
    }

    /**
     * 重置 「操作结果信息」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionResult() {
        this._reset(FIELD_ACTIONRESULT);
        return this;
    }

    /**
     * 设置「行为状态」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionState(Integer val) {
        this._set(FIELD_ACTIONSTATE, val);
        return this;
    }

    /**
     * 获取「行为状态」值
     *
    */
    @JsonIgnore
    public Integer getActionState() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ACTIONSTATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「行为状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionState() {
        return this._contains(FIELD_ACTIONSTATE);
    }

    /**
     * 重置 「行为状态」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionState() {
        this._reset(FIELD_ACTIONSTATE);
        return this;
    }

    /**
     * 设置「操作类型」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setActionType(String val) {
        this._set(FIELD_ACTIONTYPE, val);
        return this;
    }

    /**
     * 获取「操作类型」值
     *
    */
    @JsonIgnore
    public String getActionType() {
        return (String) this._get(FIELD_ACTIONTYPE);
    }

    /**
     * 判断 「操作类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsActionType() {
        return this._contains(FIELD_ACTIONTYPE);
    }

    /**
     * 重置 「操作类型」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetActionType() {
        this._reset(FIELD_ACTIONTYPE);
        return this;
    }

    /**
     * 设置「异步操作标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setAsyncAcitonId(String val) {
        this._set(FIELD_ASYNCACITONID, val);
        return this;
    }

    /**
     * 获取「异步操作标识」值
     *
    */
    @JsonIgnore
    public String getAsyncAcitonId() {
        return (String) this._get(FIELD_ASYNCACITONID);
    }

    /**
     * 判断 「异步操作标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAsyncAcitonId() {
        return this._contains(FIELD_ASYNCACITONID);
    }

    /**
     * 重置 「异步操作标识」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetAsyncAcitonId() {
        this._reset(FIELD_ASYNCACITONID);
        return this;
    }

    /**
     * 设置「异步操作名称」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setAsyncAcitonName(String val) {
        this._set(FIELD_ASYNCACITONNAME, val);
        return this;
    }

    /**
     * 获取「异步操作名称」值
     *
    */
    @JsonIgnore
    public String getAsyncAcitonName() {
        return (String) this._get(FIELD_ASYNCACITONNAME);
    }

    /**
     * 判断 「异步操作名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAsyncAcitonName() {
        return this._contains(FIELD_ASYNCACITONNAME);
    }

    /**
     * 重置 「异步操作名称」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetAsyncAcitonName() {
        this._reset(FIELD_ASYNCACITONNAME);
        return this;
    }

    /**
     * 设置「异步结果下载路径」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setAsyncResultDownloadUrl(String val) {
        this._set(FIELD_ASYNCRESULTDOWNLOADURL, val);
        return this;
    }

    /**
     * 获取「异步结果下载路径」值
     *
    */
    @JsonIgnore
    public String getAsyncResultDownloadUrl() {
        return (String) this._get(FIELD_ASYNCRESULTDOWNLOADURL);
    }

    /**
     * 判断 「异步结果下载路径」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAsyncResultDownloadUrl() {
        return this._contains(FIELD_ASYNCRESULTDOWNLOADURL);
    }

    /**
     * 重置 「异步结果下载路径」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetAsyncResultDownloadUrl() {
        this._reset(FIELD_ASYNCRESULTDOWNLOADURL);
        return this;
    }

    /**
     * 设置「开始时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setBeginTime(Timestamp val) {
        this._set(FIELD_BEGINTIME, val);
        return this;
    }

    /**
     * 获取「开始时间」值
     *
    */
    @JsonIgnore
    public Timestamp getBeginTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_BEGINTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「开始时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBeginTime() {
        return this._contains(FIELD_BEGINTIME);
    }

    /**
     * 重置 「开始时间」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetBeginTime() {
        this._reset(FIELD_BEGINTIME);
        return this;
    }

    /**
     * 设置「完成率」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setCompletionRate(BigDecimal val) {
        this._set(FIELD_COMPLETIONRATE, val);
        return this;
    }

    /**
     * 获取「完成率」值
     *
    */
    @JsonIgnore
    public BigDecimal getCompletionRate() {
        try{
            return DataTypeUtils.getBigDecimalValue(this._get(FIELD_COMPLETIONRATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「完成率」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCompletionRate() {
        return this._contains(FIELD_COMPLETIONRATE);
    }

    /**
     * 重置 「完成率」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetCompletionRate() {
        this._reset(FIELD_COMPLETIONRATE);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setCreateDate(Timestamp val) {
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
    public PTAsyncActionDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setCreateMan(String val) {
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
    public PTAsyncActionDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setDCSystemId(String val) {
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
    public PTAsyncActionDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「结束时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setEndTime(Timestamp val) {
        this._set(FIELD_ENDTIME, val);
        return this;
    }

    /**
     * 获取「结束时间」值
     *
    */
    @JsonIgnore
    public Timestamp getEndTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_ENDTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「结束时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEndTime() {
        return this._contains(FIELD_ENDTIME);
    }

    /**
     * 重置 「结束时间」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetEndTime() {
        this._reset(FIELD_ENDTIME);
        return this;
    }

    /**
     * 设置「完整结果」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setFullResult(String val) {
        this._set(FIELD_FULLRESULT, val);
        return this;
    }

    /**
     * 获取「完整结果」值
     *
    */
    @JsonIgnore
    public String getFullResult() {
        return (String) this._get(FIELD_FULLRESULT);
    }

    /**
     * 判断 「完整结果」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFullResult() {
        return this._contains(FIELD_FULLRESULT);
    }

    /**
     * 重置 「完整结果」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetFullResult() {
        this._reset(FIELD_FULLRESULT);
        return this;
    }

    /**
     * 设置「完整步骤信息」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setFullStepInfo(String val) {
        this._set(FIELD_FULLSTEPINFO, val);
        return this;
    }

    /**
     * 获取「完整步骤信息」值
     *
    */
    @JsonIgnore
    public String getFullStepInfo() {
        return (String) this._get(FIELD_FULLSTEPINFO);
    }

    /**
     * 判断 「完整步骤信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFullStepInfo() {
        return this._contains(FIELD_FULLSTEPINFO);
    }

    /**
     * 重置 「完整步骤信息」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetFullStepInfo() {
        this._reset(FIELD_FULLSTEPINFO);
        return this;
    }

    /**
     * 设置「完整主题标记」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setFullTopicTag(String val) {
        this._set(FIELD_FULLTOPICTAG, val);
        return this;
    }

    /**
     * 获取「完整主题标记」值
     *
    */
    @JsonIgnore
    public String getFullTopicTag() {
        return (String) this._get(FIELD_FULLTOPICTAG);
    }

    /**
     * 判断 「完整主题标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFullTopicTag() {
        return this._contains(FIELD_FULLTOPICTAG);
    }

    /**
     * 重置 「完整主题标记」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetFullTopicTag() {
        this._reset(FIELD_FULLTOPICTAG);
        return this;
    }

    /**
     * 设置「父异步操作标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setPAsyncAcitonId(String val) {
        this._set(FIELD_PASYNCACITONID, val);
        return this;
    }

    /**
     * 获取「父异步操作标识」值
     *
    */
    @JsonIgnore
    public String getPAsyncAcitonId() {
        return (String) this._get(FIELD_PASYNCACITONID);
    }

    /**
     * 判断 「父异步操作标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPAsyncAcitonId() {
        return this._contains(FIELD_PASYNCACITONID);
    }

    /**
     * 重置 「父异步操作标识」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetPAsyncAcitonId() {
        this._reset(FIELD_PASYNCACITONID);
        return this;
    }

    /**
     * 设置「消息推送类型」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setPushType(String val) {
        this._set(FIELD_PUSHTYPE, val);
        return this;
    }

    /**
     * 获取「消息推送类型」值
     *
    */
    @JsonIgnore
    public String getPushType() {
        return (String) this._get(FIELD_PUSHTYPE);
    }

    /**
     * 判断 「消息推送类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPushType() {
        return this._contains(FIELD_PUSHTYPE);
    }

    /**
     * 重置 「消息推送类型」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetPushType() {
        this._reset(FIELD_PUSHTYPE);
        return this;
    }

    /**
     * 设置「消息质量」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setQoS(Integer val) {
        this._set(FIELD_QOS, val);
        return this;
    }

    /**
     * 获取「消息质量」值
     *
    */
    @JsonIgnore
    public Integer getQoS() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_QOS),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「消息质量」是否有值
     *
    */
    @JsonIgnore
    public boolean containsQoS() {
        return this._contains(FIELD_QOS);
    }

    /**
     * 重置 「消息质量」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetQoS() {
        this._reset(FIELD_QOS);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「操作步骤信息」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setStepInfo(String val) {
        this._set(FIELD_STEPINFO, val);
        return this;
    }

    /**
     * 获取「操作步骤信息」值
     *
    */
    @JsonIgnore
    public String getStepInfo() {
        return (String) this._get(FIELD_STEPINFO);
    }

    /**
     * 判断 「操作步骤信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStepInfo() {
        return this._contains(FIELD_STEPINFO);
    }

    /**
     * 重置 「操作步骤信息」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetStepInfo() {
        this._reset(FIELD_STEPINFO);
        return this;
    }

    /**
     * 设置「主题标记」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setTopicTag(String val) {
        this._set(FIELD_TOPICTAG, val);
        return this;
    }

    /**
     * 获取「主题标记」值
     *
    */
    @JsonIgnore
    public String getTopicTag() {
        return (String) this._get(FIELD_TOPICTAG);
    }

    /**
     * 判断 「主题标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTopicTag() {
        return this._contains(FIELD_TOPICTAG);
    }

    /**
     * 重置 「主题标记」
     *
    */
    @JsonIgnore
    public PTAsyncActionDTO resetTopicTag() {
        this._reset(FIELD_TOPICTAG);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setUpdateDate(Timestamp val) {
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
    public PTAsyncActionDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionDTO setUpdateMan(String val) {
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
    public PTAsyncActionDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
