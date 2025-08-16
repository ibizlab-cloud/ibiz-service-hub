package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDBINDEX</B>实体数据库索引 模型传输对象
 * <P>
 * 实体数据库索引模型，支持定义索引类型、方向等参数，包含一个或多个的索引属性
 */
public class PSDEDBIndexDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDBIndexDTO(){
    }      

    /**
     * <B>ALLOWREVERSE</B>&nbsp;允许反向检索，指定是否启用允许反向检索，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWREVERSE = "allowreverse";

    /**
     * 设置 允许反向检索，详细说明：{@link #FIELD_ALLOWREVERSE}
     * 
     * @param allowReverse
     * 
     */
    @JsonProperty(FIELD_ALLOWREVERSE)
    public void setAllowReverse(Integer allowReverse){
        this.set(FIELD_ALLOWREVERSE, allowReverse);
    }
    
    /**
     * 获取 允许反向检索  
     * @return
     */
    @JsonIgnore
    public Integer getAllowReverse(){
        Object objValue = this.get(FIELD_ALLOWREVERSE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许反向检索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowReverseDirty(){
        if(this.contains(FIELD_ALLOWREVERSE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许反向检索
     */
    @JsonIgnore
    public void resetAllowReverse(){
        this.reset(FIELD_ALLOWREVERSE);
    }

    /**
     * 设置 允许反向检索，详细说明：{@link #FIELD_ALLOWREVERSE}
     * <P>
     * 等同 {@link #setAllowReverse}
     * @param allowReverse
     */
    @JsonIgnore
    public PSDEDBIndexDTO allowreverse(Integer allowReverse){
        this.setAllowReverse(allowReverse);
        return this;
    }

     /**
     * 设置 允许反向检索，详细说明：{@link #FIELD_ALLOWREVERSE}
     * <P>
     * 等同 {@link #setAllowReverse}
     * @param allowReverse
     */
    @JsonIgnore
    public PSDEDBIndexDTO allowreverse(Boolean allowReverse){
        if(allowReverse == null){
            this.setAllowReverse(null);
        }
        else{
            this.setAllowReverse(allowReverse?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体数据库索引的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEDBIndexDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CREATEDATE</B>&nbsp;建立时间
     */
    public final static String FIELD_CREATEDATE = "createdate";

    /**
     * 设置 建立时间
     * 
     * @param createDate
     * 
     */
    @JsonProperty(FIELD_CREATEDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 建立时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDateDirty(){
        if(this.contains(FIELD_CREATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立时间
     */
    @JsonIgnore
    public void resetCreateDate(){
        this.reset(FIELD_CREATEDATE);
    }

    /**
     * 设置 建立时间
     * <P>
     * 等同 {@link #setCreateDate}
     * @param createDate
     */
    @JsonIgnore
    public PSDEDBIndexDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEMAN</B>&nbsp;建立人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEMAN = "createman";

    /**
     * 设置 建立人
     * 
     * @param createMan
     * 
     */
    @JsonProperty(FIELD_CREATEMAN)
    public void setCreateMan(String createMan){
        this.set(FIELD_CREATEMAN, createMan);
    }
    
    /**
     * 获取 建立人  
     * @return
     */
    @JsonIgnore
    public String getCreateMan(){
        Object objValue = this.get(FIELD_CREATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateManDirty(){
        if(this.contains(FIELD_CREATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立人
     */
    @JsonIgnore
    public void resetCreateMan(){
        this.reset(FIELD_CREATEMAN);
    }

    /**
     * 设置 建立人
     * <P>
     * 等同 {@link #setCreateMan}
     * @param createMan
     */
    @JsonIgnore
    public PSDEDBIndexDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>INDEXTYPE</B>&nbsp;索引类型，指定数据库索引的类型，未定义时为【常规索引】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBIndexType} 
     */
    public final static String FIELD_INDEXTYPE = "indextype";

    /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXTYPE}
     * 
     * @param indexType
     * 
     */
    @JsonProperty(FIELD_INDEXTYPE)
    public void setIndexType(String indexType){
        this.set(FIELD_INDEXTYPE, indexType);
    }
    
    /**
     * 获取 索引类型  
     * @return
     */
    @JsonIgnore
    public String getIndexType(){
        Object objValue = this.get(FIELD_INDEXTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 索引类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexTypeDirty(){
        if(this.contains(FIELD_INDEXTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引类型
     */
    @JsonIgnore
    public void resetIndexType(){
        this.reset(FIELD_INDEXTYPE);
    }

    /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXTYPE}
     * <P>
     * 等同 {@link #setIndexType}
     * @param indexType
     */
    @JsonIgnore
    public PSDEDBIndexDTO indextype(String indexType){
        this.setIndexType(indexType);
        return this;
    }

     /**
     * 设置 索引类型，详细说明：{@link #FIELD_INDEXTYPE}
     * <P>
     * 等同 {@link #setIndexType}
     * @param indexType
     */
    @JsonIgnore
    public PSDEDBIndexDTO indextype(net.ibizsys.model.PSModelEnums.DBIndexType indexType){
        if(indexType == null){
            this.setIndexType(null);
        }
        else{
            this.setIndexType(indexType.value);
        }
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_MEMO = "memo";

    /**
     * 设置 备注
     * 
     * @param memo
     * 
     */
    @JsonProperty(FIELD_MEMO)
    public void setMemo(String memo){
        this.set(FIELD_MEMO, memo);
    }
    
    /**
     * 获取 备注  
     * @return
     */
    @JsonIgnore
    public String getMemo(){
        Object objValue = this.get(FIELD_MEMO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 备注 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMemoDirty(){
        if(this.contains(FIELD_MEMO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备注
     */
    @JsonIgnore
    public void resetMemo(){
        this.reset(FIELD_MEMO);
    }

    /**
     * 设置 备注
     * <P>
     * 等同 {@link #setMemo}
     * @param memo
     */
    @JsonIgnore
    public PSDEDBIndexDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDBINDEXID</B>&nbsp;实体数据库索引标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDBINDEXID = "psdedbindexid";

    /**
     * 设置 实体数据库索引标识
     * 
     * @param pSDEDBIndexId
     * 
     */
    @JsonProperty(FIELD_PSDEDBINDEXID)
    public void setPSDEDBIndexId(String pSDEDBIndexId){
        this.set(FIELD_PSDEDBINDEXID, pSDEDBIndexId);
    }
    
    /**
     * 获取 实体数据库索引标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIndexId(){
        Object objValue = this.get(FIELD_PSDEDBINDEXID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库索引标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIndexIdDirty(){
        if(this.contains(FIELD_PSDEDBINDEXID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库索引标识
     */
    @JsonIgnore
    public void resetPSDEDBIndexId(){
        this.reset(FIELD_PSDEDBINDEXID);
    }

    /**
     * 设置 实体数据库索引标识
     * <P>
     * 等同 {@link #setPSDEDBIndexId}
     * @param pSDEDBIndexId
     */
    @JsonIgnore
    public PSDEDBIndexDTO psdedbindexid(String pSDEDBIndexId){
        this.setPSDEDBIndexId(pSDEDBIndexId);
        return this;
    }

    /**
     * <B>PSDEDBINDEXNAME</B>&nbsp;数据库索引标识，指定数据库索引的标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDBINDEXNAME = "psdedbindexname";

    /**
     * 设置 数据库索引标识，详细说明：{@link #FIELD_PSDEDBINDEXNAME}
     * 
     * @param pSDEDBIndexName
     * 
     */
    @JsonProperty(FIELD_PSDEDBINDEXNAME)
    public void setPSDEDBIndexName(String pSDEDBIndexName){
        this.set(FIELD_PSDEDBINDEXNAME, pSDEDBIndexName);
    }
    
    /**
     * 获取 数据库索引标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIndexName(){
        Object objValue = this.get(FIELD_PSDEDBINDEXNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库索引标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIndexNameDirty(){
        if(this.contains(FIELD_PSDEDBINDEXNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库索引标识
     */
    @JsonIgnore
    public void resetPSDEDBIndexName(){
        this.reset(FIELD_PSDEDBINDEXNAME);
    }

    /**
     * 设置 数据库索引标识，详细说明：{@link #FIELD_PSDEDBINDEXNAME}
     * <P>
     * 等同 {@link #setPSDEDBIndexName}
     * @param pSDEDBIndexName
     */
    @JsonIgnore
    public PSDEDBIndexDTO psdedbindexname(String pSDEDBIndexName){
        this.setPSDEDBIndexName(pSDEDBIndexName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDBIndexName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDBIndexName(strName);
    }

    @JsonIgnore
    public PSDEDBIndexDTO name(String strName){
        this.setPSDEDBIndexName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据库索引所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDBIndexDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEDBIndexDTO psdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定数据库索引所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEDBIndexDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>REMOVEFLAG</B>&nbsp;标记已删除，指定索引是否已经删除，模型引擎将根据此配置发布移除索引的代码，直接删除则可能导致在运行环境的索引无法被自动移除。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REMOVEFLAG = "removeflag";

    /**
     * 设置 标记已删除，详细说明：{@link #FIELD_REMOVEFLAG}
     * 
     * @param removeFlag
     * 
     */
    @JsonProperty(FIELD_REMOVEFLAG)
    public void setRemoveFlag(Integer removeFlag){
        this.set(FIELD_REMOVEFLAG, removeFlag);
    }
    
    /**
     * 获取 标记已删除  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveFlag(){
        Object objValue = this.get(FIELD_REMOVEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标记已删除 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveFlagDirty(){
        if(this.contains(FIELD_REMOVEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记已删除
     */
    @JsonIgnore
    public void resetRemoveFlag(){
        this.reset(FIELD_REMOVEFLAG);
    }

    /**
     * 设置 标记已删除，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSDEDBIndexDTO removeflag(Integer removeFlag){
        this.setRemoveFlag(removeFlag);
        return this;
    }

     /**
     * 设置 标记已删除，详细说明：{@link #FIELD_REMOVEFLAG}
     * <P>
     * 等同 {@link #setRemoveFlag}
     * @param removeFlag
     */
    @JsonIgnore
    public PSDEDBIndexDTO removeflag(Boolean removeFlag){
        if(removeFlag == null){
            this.setRemoveFlag(null);
        }
        else{
            this.setRemoveFlag(removeFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UPDATEDATE</B>&nbsp;更新时间
     */
    public final static String FIELD_UPDATEDATE = "updatedate";

    /**
     * 设置 更新时间
     * 
     * @param updateDate
     * 
     */
    @JsonProperty(FIELD_UPDATEDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 更新时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDateDirty(){
        if(this.contains(FIELD_UPDATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新时间
     */
    @JsonIgnore
    public void resetUpdateDate(){
        this.reset(FIELD_UPDATEDATE);
    }

    /**
     * 设置 更新时间
     * <P>
     * 等同 {@link #setUpdateDate}
     * @param updateDate
     */
    @JsonIgnore
    public PSDEDBIndexDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEMAN</B>&nbsp;更新人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UPDATEMAN = "updateman";

    /**
     * 设置 更新人
     * 
     * @param updateMan
     * 
     */
    @JsonProperty(FIELD_UPDATEMAN)
    public void setUpdateMan(String updateMan){
        this.set(FIELD_UPDATEMAN, updateMan);
    }
    
    /**
     * 获取 更新人  
     * @return
     */
    @JsonIgnore
    public String getUpdateMan(){
        Object objValue = this.get(FIELD_UPDATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateManDirty(){
        if(this.contains(FIELD_UPDATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新人
     */
    @JsonIgnore
    public void resetUpdateMan(){
        this.reset(FIELD_UPDATEMAN);
    }

    /**
     * 设置 更新人
     * <P>
     * 等同 {@link #setUpdateMan}
     * @param updateMan
     */
    @JsonIgnore
    public PSDEDBIndexDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDEDBIndexDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEDBIndexId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDBIndexId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDBIndexId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDBIndexId(strValue);
    }

    @JsonIgnore
    public PSDEDBIndexDTO id(String strValue){
        this.setPSDEDBIndexId(strValue);
        return this;
    }


    /**
     *  实体数据库索引属性 成员集合
     */
    public final static String FIELD_PSDEDBIDXFIELDS = "psdedbidxfields";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEDBIdxFieldDTO> psdedbidxfields;

    /**
     * 获取 实体数据库索引属性 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDBIDXFIELDS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEDBIdxFieldDTO> getPSDEDBIdxFields(){
        return this.psdedbidxfields;
    }

    /**
     * 设置 实体数据库索引属性 成员集合  
     * @param psdedbidxfields
     */
    @JsonProperty(FIELD_PSDEDBIDXFIELDS)
    public void setPSDEDBIdxFields(java.util.List<net.ibizsys.centralstudio.dto.PSDEDBIdxFieldDTO> psdedbidxfields){
        this.psdedbidxfields = psdedbidxfields;
    }

    /**
     * 获取 实体数据库索引属性 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEDBIdxFieldDTO> getPSDEDBIdxFieldsIf(){
        if(this.psdedbidxfields == null){
            this.psdedbidxfields = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEDBIdxFieldDTO>();          
        }
        return this.psdedbidxfields;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDBIndexDTO){
            PSDEDBIndexDTO dto = (PSDEDBIndexDTO)iEntity;
            dto.setPSDEDBIdxFields(this.getPSDEDBIdxFields());
        }
        super.copyTo(iEntity);
    }
}
