package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class IrAttachmentDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: oss文件标识
     */
    public final static String FIELD_FILE_ID = "file_id";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 访问令牌
     */
    public final static String FIELD_ACCESS_TOKEN = "access_token";

    /**
     * 属性: 校验码/SHA1
     */
    public final static String FIELD_CHECKSUM = "checksum";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 文件大小
     */
    public final static String FIELD_FILE_SIZE = "file_size";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 索引内容
     */
    public final static String FIELD_INDEX_CONTENT = "index_content";

    /**
     * 属性: Mime类型
     */
    public final static String FIELD_MIMETYPE = "mimetype";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 原始（未优化，未调整大小）附件
     */
    public final static String FIELD_ORIGINAL_ID = "original_id";

    /**
     * 属性: 是公开文件
     */
    public final static String FIELD_PUBLIC = "public";

    /**
     * 属性: 资源字段
     */
    public final static String FIELD_RES_FIELD = "res_field";

    /**
     * 属性: 资源模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 属性: 存储的文件名
     */
    public final static String FIELD_STORE_FNAME = "store_fname";

    /**
     * 属性: 类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: 网址
     */
    public final static String FIELD_URL = "url";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「oss文件标识」
     * @param val
     */
    @JsonProperty(FIELD_FILE_ID)
    public IrAttachmentDTO setFileId(String val) {
        this._set(FIELD_FILE_ID, val);
        return this;
    }

    /**
     * 获取「oss文件标识」值
     *
     */
    @JsonIgnore
    public String getFileId() {
        return DataTypeUtils.asString(this._get(FIELD_FILE_ID), null);
    }

    /**
     * 判断 「oss文件标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFileId() {
        return this._contains(FIELD_FILE_ID);
    }

    /**
     * 重置 「oss文件标识」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetFileId() {
        this._reset(FIELD_FILE_ID);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public IrAttachmentDTO setResId(String val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「访问令牌」
     * @param val
     */
    @JsonProperty(FIELD_ACCESS_TOKEN)
    public IrAttachmentDTO setAccessToken(String val) {
        this._set(FIELD_ACCESS_TOKEN, val);
        return this;
    }

    /**
     * 获取「访问令牌」值
     *
     */
    @JsonIgnore
    public String getAccessToken() {
        return DataTypeUtils.asString(this._get(FIELD_ACCESS_TOKEN), null);
    }

    /**
     * 判断 「访问令牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccessToken() {
        return this._contains(FIELD_ACCESS_TOKEN);
    }

    /**
     * 重置 「访问令牌」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetAccessToken() {
        this._reset(FIELD_ACCESS_TOKEN);
        return this;
    }

    /**
     * 设置「校验码/SHA1」
     * @param val
     */
    @JsonProperty(FIELD_CHECKSUM)
    public IrAttachmentDTO setChecksum(String val) {
        this._set(FIELD_CHECKSUM, val);
        return this;
    }

    /**
     * 获取「校验码/SHA1」值
     *
     */
    @JsonIgnore
    public String getChecksum() {
        return DataTypeUtils.asString(this._get(FIELD_CHECKSUM), null);
    }

    /**
     * 判断 「校验码/SHA1」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChecksum() {
        return this._contains(FIELD_CHECKSUM);
    }

    /**
     * 重置 「校验码/SHA1」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetChecksum() {
        this._reset(FIELD_CHECKSUM);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public IrAttachmentDTO setCompanyId(String val) {
        this._set(FIELD_COMPANY_ID, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getCompanyId() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_ID), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyId() {
        return this._contains(FIELD_COMPANY_ID);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrAttachmentDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrAttachmentDTO setCreateUid(String val) {
        this._set(FIELD_CREATE_UID, val);
        return this;
    }

    /**
     * 获取「建立人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getCreateUid() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_UID), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateUid() {
        return this._contains(FIELD_CREATE_UID);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public IrAttachmentDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「文件大小」
     * @param val
     */
    @JsonProperty(FIELD_FILE_SIZE)
    public IrAttachmentDTO setFileSize(Integer val) {
        this._set(FIELD_FILE_SIZE, val);
        return this;
    }

    /**
     * 获取「文件大小」值
     *
     */
    @JsonIgnore
    public Integer getFileSize() {
        return DataTypeUtils.asInteger(this._get(FIELD_FILE_SIZE), null);
    }

    /**
     * 判断 「文件大小」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFileSize() {
        return this._contains(FIELD_FILE_SIZE);
    }

    /**
     * 重置 「文件大小」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetFileSize() {
        this._reset(FIELD_FILE_SIZE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrAttachmentDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
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
    public IrAttachmentDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「索引内容」
     * @param val
     */
    @JsonProperty(FIELD_INDEX_CONTENT)
    public IrAttachmentDTO setIndexContent(String val) {
        this._set(FIELD_INDEX_CONTENT, val);
        return this;
    }

    /**
     * 获取「索引内容」值
     *
     */
    @JsonIgnore
    public String getIndexContent() {
        return DataTypeUtils.asString(this._get(FIELD_INDEX_CONTENT), null);
    }

    /**
     * 判断 「索引内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIndexContent() {
        return this._contains(FIELD_INDEX_CONTENT);
    }

    /**
     * 重置 「索引内容」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetIndexContent() {
        this._reset(FIELD_INDEX_CONTENT);
        return this;
    }

    /**
     * 设置「Mime类型」
     * @param val
     */
    @JsonProperty(FIELD_MIMETYPE)
    public IrAttachmentDTO setMimetype(String val) {
        this._set(FIELD_MIMETYPE, val);
        return this;
    }

    /**
     * 获取「Mime类型」值
     *
     */
    @JsonIgnore
    public String getMimetype() {
        return DataTypeUtils.asString(this._get(FIELD_MIMETYPE), null);
    }

    /**
     * 判断 「Mime类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMimetype() {
        return this._contains(FIELD_MIMETYPE);
    }

    /**
     * 重置 「Mime类型」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetMimetype() {
        this._reset(FIELD_MIMETYPE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrAttachmentDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
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
    public IrAttachmentDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「原始（未优化，未调整大小）附件」
     * @param val
     */
    @JsonProperty(FIELD_ORIGINAL_ID)
    public IrAttachmentDTO setOriginalId(String val) {
        this._set(FIELD_ORIGINAL_ID, val);
        return this;
    }

    /**
     * 获取「原始（未优化，未调整大小）附件」值
     *
     */
    @JsonIgnore
    public String getOriginalId() {
        return DataTypeUtils.asString(this._get(FIELD_ORIGINAL_ID), null);
    }

    /**
     * 判断 「原始（未优化，未调整大小）附件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOriginalId() {
        return this._contains(FIELD_ORIGINAL_ID);
    }

    /**
     * 重置 「原始（未优化，未调整大小）附件」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetOriginalId() {
        this._reset(FIELD_ORIGINAL_ID);
        return this;
    }

    /**
     * 设置「是公开文件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PUBLIC)
    public IrAttachmentDTO setPublic(Integer val) {
        this._set(FIELD_PUBLIC, val);
        return this;
    }

    /**
     * 获取「是公开文件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPublic() {
        return DataTypeUtils.asInteger(this._get(FIELD_PUBLIC), null);
    }

    /**
     * 判断 「是公开文件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPublic() {
        return this._contains(FIELD_PUBLIC);
    }

    /**
     * 重置 「是公开文件」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetPublic() {
        this._reset(FIELD_PUBLIC);
        return this;
    }

    /**
     * 设置「资源字段」
     * @param val
     */
    @JsonProperty(FIELD_RES_FIELD)
    public IrAttachmentDTO setResField(String val) {
        this._set(FIELD_RES_FIELD, val);
        return this;
    }

    /**
     * 获取「资源字段」值
     *
     */
    @JsonIgnore
    public String getResField() {
        return DataTypeUtils.asString(this._get(FIELD_RES_FIELD), null);
    }

    /**
     * 判断 「资源字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResField() {
        return this._contains(FIELD_RES_FIELD);
    }

    /**
     * 重置 「资源字段」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetResField() {
        this._reset(FIELD_RES_FIELD);
        return this;
    }

    /**
     * 设置「资源模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public IrAttachmentDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「资源模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「资源模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「资源模型」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「存储的文件名」
     * @param val
     */
    @JsonProperty(FIELD_STORE_FNAME)
    public IrAttachmentDTO setStoreFname(String val) {
        this._set(FIELD_STORE_FNAME, val);
        return this;
    }

    /**
     * 获取「存储的文件名」值
     *
     */
    @JsonIgnore
    public String getStoreFname() {
        return DataTypeUtils.asString(this._get(FIELD_STORE_FNAME), null);
    }

    /**
     * 判断 「存储的文件名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStoreFname() {
        return this._contains(FIELD_STORE_FNAME);
    }

    /**
     * 重置 「存储的文件名」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetStoreFname() {
        this._reset(FIELD_STORE_FNAME);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_attachment_type
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public IrAttachmentDTO setType(String val) {
        this._set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_attachment_type
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this._get(FIELD_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this._contains(FIELD_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「网址」
     * @param val
     */
    @JsonProperty(FIELD_URL)
    public IrAttachmentDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「网址」值
     *
     */
    @JsonIgnore
    public String getUrl() {
        return DataTypeUtils.asString(this._get(FIELD_URL), null);
    }

    /**
     * 判断 「网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「网址」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrAttachmentDTO setWriteDate(Timestamp val) {
        this._set(FIELD_WRITE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getWriteDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WRITE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteDate() {
        return this._contains(FIELD_WRITE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrAttachmentDTO setWriteUid(String val) {
        this._set(FIELD_WRITE_UID, val);
        return this;
    }

    /**
     * 获取「更新人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getWriteUid() {
        return DataTypeUtils.asString(this._get(FIELD_WRITE_UID), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteUid() {
        return this._contains(FIELD_WRITE_UID);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public IrAttachmentDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
