package net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 文件
 * 
 * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/.ibizmodel.index
 */
public class SDFileDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FILEID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FILENAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 路径
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FILEPATH/.ibizmodel.index
   */
  public final static String FIELD_FILEPATH = "filepath";

  /**.
   * 特定目录
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FOLDER/.ibizmodel.index
   */
  public final static String FIELD_FOLDER = "folder";

  /**.
   * 文件大小
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FILESIZE/.ibizmodel.index
   */
  public final static String FIELD_FILESIZE = "filesize";

  /**.
   * 扩展名
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/FILEEXT/.ibizmodel.index
   */
  public final static String FIELD_EXTENSION = "extension";

  /**.
   * 所属类型
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/OWNERTYPE/.ibizmodel.index
   */
  public final static String FIELD_OWNERTYPE = "ownertype";

  /**.
   * 所属主体
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/OWNERID/.ibizmodel.index
   */
  public final static String FIELD_OWNERID = "ownerid";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 签名
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/DIGESTCODE/.ibizmodel.index
   */
  public final static String FIELD_DIGESTCODE = "digestcode";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 保留
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER/.ibizmodel.index
   */
  public final static String FIELD_RESERVER = "reserver";

  /**.
   * 保留2
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER2/.ibizmodel.index
   */
  public final static String FIELD_RESERVER2 = "reserver2";

  /**.
   * 保留3
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER3/.ibizmodel.index
   */
  public final static String FIELD_RESERVER3 = "reserver3";

  /**.
   * 保留4
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER4/.ibizmodel.index
   */
  public final static String FIELD_RESERVER4 = "reserver4";

  /**.
   * 保留5
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER5/.ibizmodel.index
   */
  public final static String FIELD_RESERVER5 = "reserver5";

  /**.
   * 保留6
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER6/.ibizmodel.index
   */
  public final static String FIELD_RESERVER6 = "reserver6";

  /**.
   * 保留7
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER7/.ibizmodel.index
   */
  public final static String FIELD_RESERVER7 = "reserver7";

  /**.
   * 保留8
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/RESERVER8/.ibizmodel.index
   */
  public final static String FIELD_RESERVER8 = "reserver8";

  /**.
   * 创建日期
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public SDFileDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public SDFileDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「路径」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setFilePath(String val) {
        this._set(FIELD_FILEPATH, val);
        return this;
    }

    /**
     * 获取「路径」值
     *
    */
    @JsonIgnore
    public String getFilePath() {
        return (String) this._get(FIELD_FILEPATH);
    }

    /**
     * 判断 「路径」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFilePath() {
        return this._contains(FIELD_FILEPATH);
    }

    /**
     * 重置 「路径」
     *
    */
    @JsonIgnore
    public SDFileDTO resetFilePath() {
        this._reset(FIELD_FILEPATH);
        return this;
    }

    /**
     * 设置「特定目录」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setFolder(String val) {
        this._set(FIELD_FOLDER, val);
        return this;
    }

    /**
     * 获取「特定目录」值
     *
    */
    @JsonIgnore
    public String getFolder() {
        return (String) this._get(FIELD_FOLDER);
    }

    /**
     * 判断 「特定目录」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFolder() {
        return this._contains(FIELD_FOLDER);
    }

    /**
     * 重置 「特定目录」
     *
    */
    @JsonIgnore
    public SDFileDTO resetFolder() {
        this._reset(FIELD_FOLDER);
        return this;
    }

    /**
     * 设置「文件大小」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setFileSize(Integer val) {
        this._set(FIELD_FILESIZE, val);
        return this;
    }

    /**
     * 获取「文件大小」值
     *
    */
    @JsonIgnore
    public Integer getFileSize() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_FILESIZE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「文件大小」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFileSize() {
        return this._contains(FIELD_FILESIZE);
    }

    /**
     * 重置 「文件大小」
     *
    */
    @JsonIgnore
    public SDFileDTO resetFileSize() {
        this._reset(FIELD_FILESIZE);
        return this;
    }

    /**
     * 设置「扩展名」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setExtension(String val) {
        this._set(FIELD_EXTENSION, val);
        return this;
    }

    /**
     * 获取「扩展名」值
     *
    */
    @JsonIgnore
    public String getExtension() {
        return (String) this._get(FIELD_EXTENSION);
    }

    /**
     * 判断 「扩展名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExtension() {
        return this._contains(FIELD_EXTENSION);
    }

    /**
     * 重置 「扩展名」
     *
    */
    @JsonIgnore
    public SDFileDTO resetExtension() {
        this._reset(FIELD_EXTENSION);
        return this;
    }

    /**
     * 设置「所属类型」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setOwnerType(String val) {
        this._set(FIELD_OWNERTYPE, val);
        return this;
    }

    /**
     * 获取「所属类型」值
     *
    */
    @JsonIgnore
    public String getOwnerType() {
        return (String) this._get(FIELD_OWNERTYPE);
    }

    /**
     * 判断 「所属类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOwnerType() {
        return this._contains(FIELD_OWNERTYPE);
    }

    /**
     * 重置 「所属类型」
     *
    */
    @JsonIgnore
    public SDFileDTO resetOwnerType() {
        this._reset(FIELD_OWNERTYPE);
        return this;
    }

    /**
     * 设置「所属主体」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setOwnerId(String val) {
        this._set(FIELD_OWNERID, val);
        return this;
    }

    /**
     * 获取「所属主体」值
     *
    */
    @JsonIgnore
    public String getOwnerId() {
        return (String) this._get(FIELD_OWNERID);
    }

    /**
     * 判断 「所属主体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOwnerId() {
        return this._contains(FIELD_OWNERID);
    }

    /**
     * 重置 「所属主体」
     *
    */
    @JsonIgnore
    public SDFileDTO resetOwnerId() {
        this._reset(FIELD_OWNERID);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public SDFileDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「签名」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setDigestCode(String val) {
        this._set(FIELD_DIGESTCODE, val);
        return this;
    }

    /**
     * 获取「签名」值
     *
    */
    @JsonIgnore
    public String getDigestCode() {
        return (String) this._get(FIELD_DIGESTCODE);
    }

    /**
     * 判断 「签名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDigestCode() {
        return this._contains(FIELD_DIGESTCODE);
    }

    /**
     * 重置 「签名」
     *
    */
    @JsonIgnore
    public SDFileDTO resetDigestCode() {
        this._reset(FIELD_DIGESTCODE);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setCreateMan(String val) {
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
    public SDFileDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「保留」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver(String val) {
        this._set(FIELD_RESERVER, val);
        return this;
    }

    /**
     * 获取「保留」值
     *
    */
    @JsonIgnore
    public String getReserver() {
        return (String) this._get(FIELD_RESERVER);
    }

    /**
     * 判断 「保留」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver() {
        return this._contains(FIELD_RESERVER);
    }

    /**
     * 重置 「保留」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver() {
        this._reset(FIELD_RESERVER);
        return this;
    }

    /**
     * 设置「保留2」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver2(String val) {
        this._set(FIELD_RESERVER2, val);
        return this;
    }

    /**
     * 获取「保留2」值
     *
    */
    @JsonIgnore
    public String getReserver2() {
        return (String) this._get(FIELD_RESERVER2);
    }

    /**
     * 判断 「保留2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver2() {
        return this._contains(FIELD_RESERVER2);
    }

    /**
     * 重置 「保留2」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver2() {
        this._reset(FIELD_RESERVER2);
        return this;
    }

    /**
     * 设置「保留3」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver3(String val) {
        this._set(FIELD_RESERVER3, val);
        return this;
    }

    /**
     * 获取「保留3」值
     *
    */
    @JsonIgnore
    public String getReserver3() {
        return (String) this._get(FIELD_RESERVER3);
    }

    /**
     * 判断 「保留3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver3() {
        return this._contains(FIELD_RESERVER3);
    }

    /**
     * 重置 「保留3」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver3() {
        this._reset(FIELD_RESERVER3);
        return this;
    }

    /**
     * 设置「保留4」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver4(String val) {
        this._set(FIELD_RESERVER4, val);
        return this;
    }

    /**
     * 获取「保留4」值
     *
    */
    @JsonIgnore
    public String getReserver4() {
        return (String) this._get(FIELD_RESERVER4);
    }

    /**
     * 判断 「保留4」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver4() {
        return this._contains(FIELD_RESERVER4);
    }

    /**
     * 重置 「保留4」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver4() {
        this._reset(FIELD_RESERVER4);
        return this;
    }

    /**
     * 设置「保留5」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver5(String val) {
        this._set(FIELD_RESERVER5, val);
        return this;
    }

    /**
     * 获取「保留5」值
     *
    */
    @JsonIgnore
    public String getReserver5() {
        return (String) this._get(FIELD_RESERVER5);
    }

    /**
     * 判断 「保留5」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver5() {
        return this._contains(FIELD_RESERVER5);
    }

    /**
     * 重置 「保留5」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver5() {
        this._reset(FIELD_RESERVER5);
        return this;
    }

    /**
     * 设置「保留6」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver6(String val) {
        this._set(FIELD_RESERVER6, val);
        return this;
    }

    /**
     * 获取「保留6」值
     *
    */
    @JsonIgnore
    public String getReserver6() {
        return (String) this._get(FIELD_RESERVER6);
    }

    /**
     * 判断 「保留6」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver6() {
        return this._contains(FIELD_RESERVER6);
    }

    /**
     * 重置 「保留6」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver6() {
        this._reset(FIELD_RESERVER6);
        return this;
    }

    /**
     * 设置「保留7」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver7(String val) {
        this._set(FIELD_RESERVER7, val);
        return this;
    }

    /**
     * 获取「保留7」值
     *
    */
    @JsonIgnore
    public String getReserver7() {
        return (String) this._get(FIELD_RESERVER7);
    }

    /**
     * 判断 「保留7」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver7() {
        return this._contains(FIELD_RESERVER7);
    }

    /**
     * 重置 「保留7」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver7() {
        this._reset(FIELD_RESERVER7);
        return this;
    }

    /**
     * 设置「保留8」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setReserver8(String val) {
        this._set(FIELD_RESERVER8, val);
        return this;
    }

    /**
     * 获取「保留8」值
     *
    */
    @JsonIgnore
    public String getReserver8() {
        return (String) this._get(FIELD_RESERVER8);
    }

    /**
     * 判断 「保留8」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver8() {
        return this._contains(FIELD_RESERVER8);
    }

    /**
     * 重置 「保留8」
     *
    */
    @JsonIgnore
    public SDFileDTO resetReserver8() {
        this._reset(FIELD_RESERVER8);
        return this;
    }

    /**
     * 设置「创建日期」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建日期」值
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
     * 判断 「创建日期」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建日期」
     *
    */
    @JsonIgnore
    public SDFileDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setUpdateMan(String val) {
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
    public SDFileDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setUpdateDate(Timestamp val) {
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
    public SDFileDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SDFileDTO setDCSystemId(String val) {
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
    public SDFileDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }


}
