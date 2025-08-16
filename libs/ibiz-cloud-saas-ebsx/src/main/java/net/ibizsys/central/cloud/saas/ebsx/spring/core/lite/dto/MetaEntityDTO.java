package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 实体
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/.ibizmodel.index
 */
public class MetaEntityDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 实体名
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/ENTITYNAME/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 逻辑名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/LOGICNAME/.ibizmodel.index
   */
  public final static String FIELD_LOGICNAME = "logicname";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODENAME = "codename";

  /**.
   * 表名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/TABLENAME/.ibizmodel.index
   */
  public final static String FIELD_TABLENAME = "tablename";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/SYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMNAME = "systemname";

  /**.
   * 数据源标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/DSID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_DST_DATASOURCE_DSID/.ibizmodel.index
   */
  public final static String FIELD_DSID = "dsid";

  /**.
   * 数据源
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/DSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_DST_DATASOURCE_DSID/.ibizmodel.index
   */
  public final static String FIELD_DSNAME = "dsname";

  /**.
   * 模块标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/MODULEID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_META_MODULE_MODULEID/.ibizmodel.index
   */
  public final static String FIELD_MODULEID = "moduleid";

  /**.
   * 模块
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/MODULENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/minorpsders/DER1N_META_ENTITY_META_MODULE_MODULEID/.ibizmodel.index
   */
  public final static String FIELD_MODULENAME = "modulename";

  /**.
   * 扩展参数
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/EXTPARAMS/.ibizmodel.index
   */
  public final static String FIELD_EXTPARAMS = "extparams";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 
   *
   */
  public final static String FIELD_DATA_SETS = "data_sets";

  /**.
   * 
   *
   */
  public final static String FIELD_FIELDS = "fields";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「实体名」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「实体名」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「实体名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「实体名」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「逻辑名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setLogicName(String val) {
        this._set(FIELD_LOGICNAME, val);
        return this;
    }

    /**
     * 获取「逻辑名称」值
     *
    */
    @JsonIgnore
    public String getLogicName() {
        return (String) this._get(FIELD_LOGICNAME);
    }

    /**
     * 判断 「逻辑名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLogicName() {
        return this._contains(FIELD_LOGICNAME);
    }

    /**
     * 重置 「逻辑名称」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetLogicName() {
        this._reset(FIELD_LOGICNAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setCodeName(String val) {
        this._set(FIELD_CODENAME, val);
        return this;
    }

    /**
     * 获取「代码名称」值
     *
    */
    @JsonIgnore
    public String getCodeName() {
        return (String) this._get(FIELD_CODENAME);
    }

    /**
     * 判断 「代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCodeName() {
        return this._contains(FIELD_CODENAME);
    }

    /**
     * 重置 「代码名称」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetCodeName() {
        this._reset(FIELD_CODENAME);
        return this;
    }

    /**
     * 设置「表名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setTableName(String val) {
        this._set(FIELD_TABLENAME, val);
        return this;
    }

    /**
     * 获取「表名称」值
     *
    */
    @JsonIgnore
    public String getTableName() {
        return (String) this._get(FIELD_TABLENAME);
    }

    /**
     * 判断 「表名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTableName() {
        return this._contains(FIELD_TABLENAME);
    }

    /**
     * 重置 「表名称」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetTableName() {
        this._reset(FIELD_TABLENAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setSystemId(String val) {
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
    public MetaEntityDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setSystemName(String val) {
        this._set(FIELD_SYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getSystemName() {
        return (String) this._get(FIELD_SYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemName() {
        return this._contains(FIELD_SYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetSystemName() {
        this._reset(FIELD_SYSTEMNAME);
        return this;
    }

    /**
     * 设置「数据源标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setDSId(String val) {
        this._set(FIELD_DSID, val);
        return this;
    }

    /**
     * 获取「数据源标识」值
     *
    */
    @JsonIgnore
    public String getDSId() {
        return (String) this._get(FIELD_DSID);
    }

    /**
     * 判断 「数据源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSId() {
        return this._contains(FIELD_DSID);
    }

    /**
     * 重置 「数据源标识」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetDSId() {
        this._reset(FIELD_DSID);
        return this;
    }

    /**
     * 设置「数据源」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setDSName(String val) {
        this._set(FIELD_DSNAME, val);
        return this;
    }

    /**
     * 获取「数据源」值
     *
    */
    @JsonIgnore
    public String getDSName() {
        return (String) this._get(FIELD_DSNAME);
    }

    /**
     * 判断 「数据源」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSName() {
        return this._contains(FIELD_DSNAME);
    }

    /**
     * 重置 「数据源」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetDSName() {
        this._reset(FIELD_DSNAME);
        return this;
    }

    /**
     * 设置「模块标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setModuleId(String val) {
        this._set(FIELD_MODULEID, val);
        return this;
    }

    /**
     * 获取「模块标识」值
     *
    */
    @JsonIgnore
    public String getModuleId() {
        return (String) this._get(FIELD_MODULEID);
    }

    /**
     * 判断 「模块标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModuleId() {
        return this._contains(FIELD_MODULEID);
    }

    /**
     * 重置 「模块标识」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetModuleId() {
        this._reset(FIELD_MODULEID);
        return this;
    }

    /**
     * 设置「模块」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setModuleName(String val) {
        this._set(FIELD_MODULENAME, val);
        return this;
    }

    /**
     * 获取「模块」值
     *
    */
    @JsonIgnore
    public String getModuleName() {
        return (String) this._get(FIELD_MODULENAME);
    }

    /**
     * 判断 「模块」是否有值
     *
    */
    @JsonIgnore
    public boolean containsModuleName() {
        return this._contains(FIELD_MODULENAME);
    }

    /**
     * 重置 「模块」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetModuleName() {
        this._reset(FIELD_MODULENAME);
        return this;
    }

    /**
     * 设置「扩展参数」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setExtParams(String val) {
        this._set(FIELD_EXTPARAMS, val);
        return this;
    }

    /**
     * 获取「扩展参数」值
     *
    */
    @JsonIgnore
    public String getExtParams() {
        return (String) this._get(FIELD_EXTPARAMS);
    }

    /**
     * 判断 「扩展参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExtParams() {
        return this._contains(FIELD_EXTPARAMS);
    }

    /**
     * 重置 「扩展参数」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetExtParams() {
        this._reset(FIELD_EXTPARAMS);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setShowOrder(Integer val) {
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
    public MetaEntityDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setCreateDate(Timestamp val) {
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
    public MetaEntityDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setDCSystemId(String val) {
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
    public MetaEntityDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setData_sets(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDataSetDTO> val) {
        this._set(FIELD_DATA_SETS, val);
        return this;
    }

    /**
     * 获取「」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDataSetDTO> getData_sets() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDataSetDTO>) this._get(FIELD_DATA_SETS);
    }

    /**
     * 判断 「」是否有值
     *
    */
    @JsonIgnore
    public boolean containsData_sets() {
        return this._contains(FIELD_DATA_SETS);
    }

    /**
     * 重置 「」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetData_sets() {
        this._reset(FIELD_DATA_SETS);
        return this;
    }

    /**
     * 设置「」
     *
     * @param val
    */
    @JsonIgnore
    public MetaEntityDTO setFields(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaFieldDTO> val) {
        this._set(FIELD_FIELDS, val);
        return this;
    }

    /**
     * 获取「」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaFieldDTO> getFields() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaFieldDTO>) this._get(FIELD_FIELDS);
    }

    /**
     * 判断 「」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFields() {
        return this._contains(FIELD_FIELDS);
    }

    /**
     * 重置 「」
     *
    */
    @JsonIgnore
    public MetaEntityDTO resetFields() {
        this._reset(FIELD_FIELDS);
        return this;
    }


}
