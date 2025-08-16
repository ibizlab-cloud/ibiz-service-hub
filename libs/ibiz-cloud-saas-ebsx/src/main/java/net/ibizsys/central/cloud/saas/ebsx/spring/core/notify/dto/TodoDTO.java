package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 待办
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/.ibizmodel.index
 */
public class TodoDTO extends EntityDTO {

  /**.
   * 业务数据标识
   * 工作流任务时，记录taskid，工作流计算地址、处理时需根据该值进行关联处理
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/BIZKEY/.ibizmodel.index
   */
  public final static String FIELD_BIZKEY = "bizkey";

  /**.
   * 业务对象
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/BIZTYPE/.ibizmodel.index
   */
  public final static String FIELD_BIZTYPE = "biztype";

  /**.
   * 长文本参数01
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CLOBPARAM01/.ibizmodel.index
   */
  public final static String FIELD_CLOBPARAM01 = "clobparam01";

  /**.
   * 长文本参数02
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CLOBPARAM02/.ibizmodel.index
   */
  public final static String FIELD_CLOBPARAM02 = "clobparam02";

  /**.
   * 内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/CREATEMANNAME/.ibizmodel.index
   */
  public final static String FIELD_CREATEMANNAME = "createmanname";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/minorpsders/DER1N_SYS_TODO_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/minorpsders/DER1N_SYS_TODO_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 过期时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/DUEDATE/.ibizmodel.index
   */
  public final static String FIELD_DUEDATE = "duedate";

  /**.
   * 是否已读
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/ISREAD/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISREAD = "isread";

  /**.
   * 连接地址
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/LINKURL/.ibizmodel.index
   */
  public final static String FIELD_LINKURL = "linkurl";

  /**.
   * 组织机构标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 参数01
   * 流程待办：步骤标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM01/.ibizmodel.index
   */
  public final static String FIELD_PARAM01 = "param01";

  /**.
   * 参数02
   * 流程待办：流程定义标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM02/.ibizmodel.index
   */
  public final static String FIELD_PARAM02 = "param02";

  /**.
   * 参数03
   * 流程待办：步骤编码
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM03/.ibizmodel.index
   */
  public final static String FIELD_PARAM03 = "param03";

  /**.
   * 参数04
   * 流程待办：流程名称
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM04/.ibizmodel.index
   */
  public final static String FIELD_PARAM04 = "param04";

  /**.
   * 参数05
   * 流程待办：步骤名称
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM05/.ibizmodel.index
   */
  public final static String FIELD_PARAM05 = "param05";

  /**.
   * 参数06
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM06/.ibizmodel.index
   */
  public final static String FIELD_PARAM06 = "param06";

  /**.
   * 参数07
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM07/.ibizmodel.index
   */
  public final static String FIELD_PARAM07 = "param07";

  /**.
   * 参数08
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM08/.ibizmodel.index
   */
  public final static String FIELD_PARAM08 = "param08";

  /**.
   * 参数09
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PARAM09/.ibizmodel.index
   */
  public final static String FIELD_PARAM09 = "param09";

  /**.
   * 处理时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/PROCESSDATE/.ibizmodel.index
   */
  public final static String FIELD_PROCESSDATE = "processdate";

  /**.
   * 标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TITLE/.ibizmodel.index
   */
  public final static String FIELD_TITLE = "title";

  /**.
   * 待办标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TODOID/.ibizmodel.index
   */
  public final static String FIELD_TODOID = "todoid";

  /**.
   * 待办状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TodoState} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TODOSTATE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TodoState.ibizmodel.yaml
   */
  public final static String FIELD_TODOSTATE = "todostate";

  /**.
   * 待办子类
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TodoSubType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TODOSUBTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TodoSubType.ibizmodel.yaml
   */
  public final static String FIELD_TODOSUBTYPE = "todosubtype";

  /**.
   * 待办类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TodoType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TODOTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TodoType.ibizmodel.yaml
   */
  public final static String FIELD_TODOTYPE = "todotype";

  /**.
   * 待办地址类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TodoUrlType} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/TODOURLTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/TodoUrlType.ibizmodel.yaml
   */
  public final static String FIELD_TODOURLTYPE = "todourltype";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/UPDATEMANNAME/.ibizmodel.index
   */
  public final static String FIELD_UPDATEMANNAME = "updatemanname";

  /**.
   * 待办用户标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 待办用户
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";


    /**
     * 设置「业务数据标识」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setBizKey(String val) {
        this._set(FIELD_BIZKEY, val);
        return this;
    }

    /**
     * 获取「业务数据标识」值
     *
    */
    @JsonIgnore
    public String getBizKey() {
        return (String) this._get(FIELD_BIZKEY);
    }

    /**
     * 判断 「业务数据标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBizKey() {
        return this._contains(FIELD_BIZKEY);
    }

    /**
     * 重置 「业务数据标识」
     *
    */
    @JsonIgnore
    public TodoDTO resetBizKey() {
        this._reset(FIELD_BIZKEY);
        return this;
    }

    /**
     * 设置「业务对象」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setBizType(String val) {
        this._set(FIELD_BIZTYPE, val);
        return this;
    }

    /**
     * 获取「业务对象」值
     *
    */
    @JsonIgnore
    public String getBizType() {
        return (String) this._get(FIELD_BIZTYPE);
    }

    /**
     * 判断 「业务对象」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBizType() {
        return this._contains(FIELD_BIZTYPE);
    }

    /**
     * 重置 「业务对象」
     *
    */
    @JsonIgnore
    public TodoDTO resetBizType() {
        this._reset(FIELD_BIZTYPE);
        return this;
    }

    /**
     * 设置「长文本参数01」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setClobParam01(String val) {
        this._set(FIELD_CLOBPARAM01, val);
        return this;
    }

    /**
     * 获取「长文本参数01」值
     *
    */
    @JsonIgnore
    public String getClobParam01() {
        return (String) this._get(FIELD_CLOBPARAM01);
    }

    /**
     * 判断 「长文本参数01」是否有值
     *
    */
    @JsonIgnore
    public boolean containsClobParam01() {
        return this._contains(FIELD_CLOBPARAM01);
    }

    /**
     * 重置 「长文本参数01」
     *
    */
    @JsonIgnore
    public TodoDTO resetClobParam01() {
        this._reset(FIELD_CLOBPARAM01);
        return this;
    }

    /**
     * 设置「长文本参数02」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setClobParam02(String val) {
        this._set(FIELD_CLOBPARAM02, val);
        return this;
    }

    /**
     * 获取「长文本参数02」值
     *
    */
    @JsonIgnore
    public String getClobParam02() {
        return (String) this._get(FIELD_CLOBPARAM02);
    }

    /**
     * 判断 「长文本参数02」是否有值
     *
    */
    @JsonIgnore
    public boolean containsClobParam02() {
        return this._contains(FIELD_CLOBPARAM02);
    }

    /**
     * 重置 「长文本参数02」
     *
    */
    @JsonIgnore
    public TodoDTO resetClobParam02() {
        this._reset(FIELD_CLOBPARAM02);
        return this;
    }

    /**
     * 设置「内容」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setContent(String val) {
        this._set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
    */
    @JsonIgnore
    public String getContent() {
        return (String) this._get(FIELD_CONTENT);
    }

    /**
     * 判断 「内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContent() {
        return this._contains(FIELD_CONTENT);
    }

    /**
     * 重置 「内容」
     *
    */
    @JsonIgnore
    public TodoDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
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
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public TodoDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「创建人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「创建人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「创建人」
     *
    */
    @JsonIgnore
    public TodoDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setCreateManName(String val) {
        this._set(FIELD_CREATEMANNAME, val);
        return this;
    }

    /**
     * 获取「创建人」值
     *
    */
    @JsonIgnore
    public String getCreateManName() {
        return (String) this._get(FIELD_CREATEMANNAME);
    }

    /**
     * 判断 「创建人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateManName() {
        return this._contains(FIELD_CREATEMANNAME);
    }

    /**
     * 重置 「创建人」
     *
    */
    @JsonIgnore
    public TodoDTO resetCreateManName() {
        this._reset(FIELD_CREATEMANNAME);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setDCSystemId(String val) {
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
    public TodoDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public TodoDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「过期时间」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setDueDate(Timestamp val) {
        this._set(FIELD_DUEDATE, val);
        return this;
    }

    /**
     * 获取「过期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getDueDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_DUEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「过期时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDueDate() {
        return this._contains(FIELD_DUEDATE);
    }

    /**
     * 重置 「过期时间」
     *
    */
    @JsonIgnore
    public TodoDTO resetDueDate() {
        this._reset(FIELD_DUEDATE);
        return this;
    }

    /**
     * 设置「是否已读」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setIsRead(Integer val) {
        this._set(FIELD_ISREAD, val);
        return this;
    }

    /**
     * 获取「是否已读」值
     *
    */
    @JsonIgnore
    public Integer getIsRead() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISREAD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否已读」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsRead() {
        return this._contains(FIELD_ISREAD);
    }

    /**
     * 重置 「是否已读」
     *
    */
    @JsonIgnore
    public TodoDTO resetIsRead() {
        this._reset(FIELD_ISREAD);
        return this;
    }

    /**
     * 设置「连接地址」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setLinkUrl(String val) {
        this._set(FIELD_LINKURL, val);
        return this;
    }

    /**
     * 获取「连接地址」值
     *
    */
    @JsonIgnore
    public String getLinkUrl() {
        return (String) this._get(FIELD_LINKURL);
    }

    /**
     * 判断 「连接地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLinkUrl() {
        return this._contains(FIELD_LINKURL);
    }

    /**
     * 重置 「连接地址」
     *
    */
    @JsonIgnore
    public TodoDTO resetLinkUrl() {
        this._reset(FIELD_LINKURL);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「组织机构标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「组织机构标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「组织机构标识」
     *
    */
    @JsonIgnore
    public TodoDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「参数01」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam01(String val) {
        this._set(FIELD_PARAM01, val);
        return this;
    }

    /**
     * 获取「参数01」值
     *
    */
    @JsonIgnore
    public String getParam01() {
        return (String) this._get(FIELD_PARAM01);
    }

    /**
     * 判断 「参数01」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam01() {
        return this._contains(FIELD_PARAM01);
    }

    /**
     * 重置 「参数01」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam01() {
        this._reset(FIELD_PARAM01);
        return this;
    }

    /**
     * 设置「参数02」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam02(String val) {
        this._set(FIELD_PARAM02, val);
        return this;
    }

    /**
     * 获取「参数02」值
     *
    */
    @JsonIgnore
    public String getParam02() {
        return (String) this._get(FIELD_PARAM02);
    }

    /**
     * 判断 「参数02」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam02() {
        return this._contains(FIELD_PARAM02);
    }

    /**
     * 重置 「参数02」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam02() {
        this._reset(FIELD_PARAM02);
        return this;
    }

    /**
     * 设置「参数03」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam03(String val) {
        this._set(FIELD_PARAM03, val);
        return this;
    }

    /**
     * 获取「参数03」值
     *
    */
    @JsonIgnore
    public String getParam03() {
        return (String) this._get(FIELD_PARAM03);
    }

    /**
     * 判断 「参数03」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam03() {
        return this._contains(FIELD_PARAM03);
    }

    /**
     * 重置 「参数03」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam03() {
        this._reset(FIELD_PARAM03);
        return this;
    }

    /**
     * 设置「参数04」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam04(String val) {
        this._set(FIELD_PARAM04, val);
        return this;
    }

    /**
     * 获取「参数04」值
     *
    */
    @JsonIgnore
    public String getParam04() {
        return (String) this._get(FIELD_PARAM04);
    }

    /**
     * 判断 「参数04」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam04() {
        return this._contains(FIELD_PARAM04);
    }

    /**
     * 重置 「参数04」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam04() {
        this._reset(FIELD_PARAM04);
        return this;
    }

    /**
     * 设置「参数05」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam05(String val) {
        this._set(FIELD_PARAM05, val);
        return this;
    }

    /**
     * 获取「参数05」值
     *
    */
    @JsonIgnore
    public String getParam05() {
        return (String) this._get(FIELD_PARAM05);
    }

    /**
     * 判断 「参数05」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam05() {
        return this._contains(FIELD_PARAM05);
    }

    /**
     * 重置 「参数05」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam05() {
        this._reset(FIELD_PARAM05);
        return this;
    }

    /**
     * 设置「参数06」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam06(String val) {
        this._set(FIELD_PARAM06, val);
        return this;
    }

    /**
     * 获取「参数06」值
     *
    */
    @JsonIgnore
    public String getParam06() {
        return (String) this._get(FIELD_PARAM06);
    }

    /**
     * 判断 「参数06」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam06() {
        return this._contains(FIELD_PARAM06);
    }

    /**
     * 重置 「参数06」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam06() {
        this._reset(FIELD_PARAM06);
        return this;
    }

    /**
     * 设置「参数07」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam07(String val) {
        this._set(FIELD_PARAM07, val);
        return this;
    }

    /**
     * 获取「参数07」值
     *
    */
    @JsonIgnore
    public String getParam07() {
        return (String) this._get(FIELD_PARAM07);
    }

    /**
     * 判断 「参数07」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam07() {
        return this._contains(FIELD_PARAM07);
    }

    /**
     * 重置 「参数07」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam07() {
        this._reset(FIELD_PARAM07);
        return this;
    }

    /**
     * 设置「参数08」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam08(String val) {
        this._set(FIELD_PARAM08, val);
        return this;
    }

    /**
     * 获取「参数08」值
     *
    */
    @JsonIgnore
    public String getParam08() {
        return (String) this._get(FIELD_PARAM08);
    }

    /**
     * 判断 「参数08」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam08() {
        return this._contains(FIELD_PARAM08);
    }

    /**
     * 重置 「参数08」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam08() {
        this._reset(FIELD_PARAM08);
        return this;
    }

    /**
     * 设置「参数09」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setParam09(String val) {
        this._set(FIELD_PARAM09, val);
        return this;
    }

    /**
     * 获取「参数09」值
     *
    */
    @JsonIgnore
    public String getParam09() {
        return (String) this._get(FIELD_PARAM09);
    }

    /**
     * 判断 「参数09」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParam09() {
        return this._contains(FIELD_PARAM09);
    }

    /**
     * 重置 「参数09」
     *
    */
    @JsonIgnore
    public TodoDTO resetParam09() {
        this._reset(FIELD_PARAM09);
        return this;
    }

    /**
     * 设置「处理时间」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setProcessDate(Timestamp val) {
        this._set(FIELD_PROCESSDATE, val);
        return this;
    }

    /**
     * 获取「处理时间」值
     *
    */
    @JsonIgnore
    public Timestamp getProcessDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_PROCESSDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「处理时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsProcessDate() {
        return this._contains(FIELD_PROCESSDATE);
    }

    /**
     * 重置 「处理时间」
     *
    */
    @JsonIgnore
    public TodoDTO resetProcessDate() {
        this._reset(FIELD_PROCESSDATE);
        return this;
    }

    /**
     * 设置「标题」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTitle(String val) {
        this._set(FIELD_TITLE, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
    */
    @JsonIgnore
    public String getTitle() {
        return (String) this._get(FIELD_TITLE);
    }

    /**
     * 判断 「标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTitle() {
        return this._contains(FIELD_TITLE);
    }

    /**
     * 重置 「标题」
     *
    */
    @JsonIgnore
    public TodoDTO resetTitle() {
        this._reset(FIELD_TITLE);
        return this;
    }

    /**
     * 设置「待办标识」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTodoId(String val) {
        this._set(FIELD_TODOID, val);
        return this;
    }

    /**
     * 获取「待办标识」值
     *
    */
    @JsonIgnore
    public String getTodoId() {
        return (String) this._get(FIELD_TODOID);
    }

    /**
     * 判断 「待办标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoId() {
        return this._contains(FIELD_TODOID);
    }

    /**
     * 重置 「待办标识」
     *
    */
    @JsonIgnore
    public TodoDTO resetTodoId() {
        this._reset(FIELD_TODOID);
        return this;
    }

    /**
     * 设置「待办状态」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTodoState(String val) {
        this._set(FIELD_TODOSTATE, val);
        return this;
    }

    /**
     * 获取「待办状态」值
     *
    */
    @JsonIgnore
    public String getTodoState() {
        return (String) this._get(FIELD_TODOSTATE);
    }

    /**
     * 判断 「待办状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoState() {
        return this._contains(FIELD_TODOSTATE);
    }

    /**
     * 重置 「待办状态」
     *
    */
    @JsonIgnore
    public TodoDTO resetTodoState() {
        this._reset(FIELD_TODOSTATE);
        return this;
    }

    /**
     * 设置「待办子类」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTodoSubType(String val) {
        this._set(FIELD_TODOSUBTYPE, val);
        return this;
    }

    /**
     * 获取「待办子类」值
     *
    */
    @JsonIgnore
    public String getTodoSubType() {
        return (String) this._get(FIELD_TODOSUBTYPE);
    }

    /**
     * 判断 「待办子类」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoSubType() {
        return this._contains(FIELD_TODOSUBTYPE);
    }

    /**
     * 重置 「待办子类」
     *
    */
    @JsonIgnore
    public TodoDTO resetTodoSubType() {
        this._reset(FIELD_TODOSUBTYPE);
        return this;
    }

    /**
     * 设置「待办类型」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTodoType(String val) {
        this._set(FIELD_TODOTYPE, val);
        return this;
    }

    /**
     * 获取「待办类型」值
     *
    */
    @JsonIgnore
    public String getTodoType() {
        return (String) this._get(FIELD_TODOTYPE);
    }

    /**
     * 判断 「待办类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoType() {
        return this._contains(FIELD_TODOTYPE);
    }

    /**
     * 重置 「待办类型」
     *
    */
    @JsonIgnore
    public TodoDTO resetTodoType() {
        this._reset(FIELD_TODOTYPE);
        return this;
    }

    /**
     * 设置「待办地址类型」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setTodoUrlType(String val) {
        this._set(FIELD_TODOURLTYPE, val);
        return this;
    }

    /**
     * 获取「待办地址类型」值
     *
    */
    @JsonIgnore
    public String getTodoUrlType() {
        return (String) this._get(FIELD_TODOURLTYPE);
    }

    /**
     * 判断 「待办地址类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoUrlType() {
        return this._contains(FIELD_TODOURLTYPE);
    }

    /**
     * 重置 「待办地址类型」
     *
    */
    @JsonIgnore
    public TodoDTO resetTodoUrlType() {
        this._reset(FIELD_TODOURLTYPE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setUpdateDate(Timestamp val) {
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
    public TodoDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setUpdateMan(String val) {
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
    public TodoDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setUpdateManName(String val) {
        this._set(FIELD_UPDATEMANNAME, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateManName() {
        return (String) this._get(FIELD_UPDATEMANNAME);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateManName() {
        return this._contains(FIELD_UPDATEMANNAME);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public TodoDTO resetUpdateManName() {
        this._reset(FIELD_UPDATEMANNAME);
        return this;
    }

    /**
     * 设置「待办用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「待办用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this._get(FIELD_USERID);
    }

    /**
     * 判断 「待办用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「待办用户标识」
     *
    */
    @JsonIgnore
    public TodoDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「待办用户」
     *
     * @param val
    */
    @JsonIgnore
    public TodoDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「待办用户」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this._get(FIELD_USERNAME);
    }

    /**
     * 判断 「待办用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「待办用户」
     *
    */
    @JsonIgnore
    public TodoDTO resetUserName() {
        this._reset(FIELD_USERNAME);
        return this;
    }


}
