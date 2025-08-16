package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHDOC</B>全文检索文档 模型传输对象
 * <P>
 * 全文检索文档模型，包含检索文档属性对象集合
 */
public class PSSysSearchDocDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSearchDocDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定全文检索文档的代码标识，需在所在的全文检索体系具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysSearchDocDTO codename(String codeName){
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
    public PSSysSearchDocDTO createdate(Timestamp createDate){
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
    public PSSysSearchDocDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DOCTAG</B>&nbsp;文档标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DOCTAG = "doctag";

    /**
     * 设置 文档标记
     * 
     * @param docTag
     * 
     */
    @JsonProperty(FIELD_DOCTAG)
    public void setDocTag(String docTag){
        this.set(FIELD_DOCTAG, docTag);
    }
    
    /**
     * 获取 文档标记  
     * @return
     */
    @JsonIgnore
    public String getDocTag(){
        Object objValue = this.get(FIELD_DOCTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文档标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocTagDirty(){
        if(this.contains(FIELD_DOCTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文档标记
     */
    @JsonIgnore
    public void resetDocTag(){
        this.reset(FIELD_DOCTAG);
    }

    /**
     * 设置 文档标记
     * <P>
     * 等同 {@link #setDocTag}
     * @param docTag
     */
    @JsonIgnore
    public PSSysSearchDocDTO doctag(String docTag){
        this.setDocTag(docTag);
        return this;
    }

    /**
     * <B>DOCTAG2</B>&nbsp;文档标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DOCTAG2 = "doctag2";

    /**
     * 设置 文档标记2
     * 
     * @param docTag2
     * 
     */
    @JsonProperty(FIELD_DOCTAG2)
    public void setDocTag2(String docTag2){
        this.set(FIELD_DOCTAG2, docTag2);
    }
    
    /**
     * 获取 文档标记2  
     * @return
     */
    @JsonIgnore
    public String getDocTag2(){
        Object objValue = this.get(FIELD_DOCTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文档标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocTag2Dirty(){
        if(this.contains(FIELD_DOCTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文档标记2
     */
    @JsonIgnore
    public void resetDocTag2(){
        this.reset(FIELD_DOCTAG2);
    }

    /**
     * 设置 文档标记2
     * <P>
     * 等同 {@link #setDocTag2}
     * @param docTag2
     */
    @JsonIgnore
    public PSSysSearchDocDTO doctag2(String docTag2){
        this.setDocTag2(docTag2);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定全文检索文档的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysSearchDocDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 2000
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
    public PSSysSearchDocDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档标识
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档标识
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档标识
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCNAME</B>&nbsp;检索文档名称，指定全文检索文档的名称，需在所在的全文检索体系具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";

    /**
     * 设置 检索文档名称，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * 
     * @param pSSysSearchDocName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCNAME)
    public void setPSSysSearchDocName(String pSSysSearchDocName){
        this.set(FIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }
    
    /**
     * 获取 检索文档名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索文档名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索文档名称
     */
    @JsonIgnore
    public void resetPSSysSearchDocName(){
        this.reset(FIELD_PSSYSSEARCHDOCNAME);
    }

    /**
     * 设置 检索文档名称，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * <P>
     * 等同 {@link #setPSSysSearchDocName}
     * @param pSSysSearchDocName
     */
    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchdocname(String pSSysSearchDocName){
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchDocName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchDocName(strName);
    }

    @JsonIgnore
    public PSSysSearchDocDTO name(String strName){
        this.setPSSysSearchDocName(strName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMEID</B>&nbsp;全文检索体系，指定全文检索文档所在的全文检索体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchSchemeDTO} 
     */
    public final static String FIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";

    /**
     * 设置 全文检索体系，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMEID}
     * 
     * @param pSSysSearchSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMEID)
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId){
        this.set(FIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }
    
    /**
     * 获取 全文检索体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索体系
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeId(){
        this.reset(FIELD_PSSYSSEARCHSCHEMEID);
    }

    /**
     * 设置 全文检索体系，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMEID}
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchSchemeId
     */
    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchschemeid(String pSSysSearchSchemeId){
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    /**
     * 设置 全文检索体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchScheme 引用对象
     */
    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme){
        if(pSSysSearchScheme == null){
            this.setPSSysSearchSchemeId(null);
            this.setPSSysSearchSchemeName(null);
        }
        else{
            this.setPSSysSearchSchemeId(pSSysSearchScheme.getPSSysSearchSchemeId());
            this.setPSSysSearchSchemeName(pSSysSearchScheme.getPSSysSearchSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMENAME</B>&nbsp;全文检索体系，指定全文检索文档所在的全文检索体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHSCHEMEID}
     */
    public final static String FIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";

    /**
     * 设置 全文检索体系，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMENAME}
     * 
     * @param pSSysSearchSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMENAME)
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName){
        this.set(FIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }
    
    /**
     * 获取 全文检索体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索体系
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeName(){
        this.reset(FIELD_PSSYSSEARCHSCHEMENAME);
    }

    /**
     * 设置 全文检索体系，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysSearchSchemeName}
     * @param pSSysSearchSchemeName
     */
    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchschemename(String pSSysSearchSchemeName){
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    /**
     * <B>REPLICAS</B>&nbsp;副本数，指定全文检索文档的副本数，未定义时使用所在全文检索体系默认配置
     */
    public final static String FIELD_REPLICAS = "replicas";

    /**
     * 设置 副本数，详细说明：{@link #FIELD_REPLICAS}
     * 
     * @param replicas
     * 
     */
    @JsonProperty(FIELD_REPLICAS)
    public void setReplicas(Integer replicas){
        this.set(FIELD_REPLICAS, replicas);
    }
    
    /**
     * 获取 副本数  
     * @return
     */
    @JsonIgnore
    public Integer getReplicas(){
        Object objValue = this.get(FIELD_REPLICAS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 副本数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReplicasDirty(){
        if(this.contains(FIELD_REPLICAS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 副本数
     */
    @JsonIgnore
    public void resetReplicas(){
        this.reset(FIELD_REPLICAS);
    }

    /**
     * 设置 副本数，详细说明：{@link #FIELD_REPLICAS}
     * <P>
     * 等同 {@link #setReplicas}
     * @param replicas
     */
    @JsonIgnore
    public PSSysSearchDocDTO replicas(Integer replicas){
        this.setReplicas(replicas);
        return this;
    }

    /**
     * <B>SHARDS</B>&nbsp;分片，指定全文检索文档的分片数，未定义时使用所在全文检索体系默认配置
     */
    public final static String FIELD_SHARDS = "shards";

    /**
     * 设置 分片，详细说明：{@link #FIELD_SHARDS}
     * 
     * @param shards
     * 
     */
    @JsonProperty(FIELD_SHARDS)
    public void setShards(Integer shards){
        this.set(FIELD_SHARDS, shards);
    }
    
    /**
     * 获取 分片  
     * @return
     */
    @JsonIgnore
    public Integer getShards(){
        Object objValue = this.get(FIELD_SHARDS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShardsDirty(){
        if(this.contains(FIELD_SHARDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分片
     */
    @JsonIgnore
    public void resetShards(){
        this.reset(FIELD_SHARDS);
    }

    /**
     * 设置 分片，详细说明：{@link #FIELD_SHARDS}
     * <P>
     * 等同 {@link #setShards}
     * @param shards
     */
    @JsonIgnore
    public PSSysSearchDocDTO shards(Integer shards){
        this.setShards(shards);
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
    public PSSysSearchDocDTO updatedate(Timestamp updateDate){
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
    public PSSysSearchDocDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
     */
    public final static String FIELD_USERCAT = "usercat";

    /**
     * 设置 用户分类
     * 
     * @param userCat
     * 
     */
    @JsonProperty(FIELD_USERCAT)
    public void setUserCat(String userCat){
        this.set(FIELD_USERCAT, userCat);
    }
    
    /**
     * 获取 用户分类  
     * @return
     */
    @JsonIgnore
    public String getUserCat(){
        Object objValue = this.get(FIELD_USERCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserCatDirty(){
        if(this.contains(FIELD_USERCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户分类
     */
    @JsonIgnore
    public void resetUserCat(){
        this.reset(FIELD_USERCAT);
    }

    /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysSearchDocDTO usercat(String userCat){
        this.setUserCat(userCat);
        return this;
    }

     /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysSearchDocDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标记
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标记  
     * @return
     */
    @JsonIgnore
    public String getUserTag(){
        Object objValue = this.get(FIELD_USERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTagDirty(){
        if(this.contains(FIELD_USERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标记
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysSearchDocDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标记2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标记2  
     * @return
     */
    @JsonIgnore
    public String getUserTag2(){
        Object objValue = this.get(FIELD_USERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag2Dirty(){
        if(this.contains(FIELD_USERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标记2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysSearchDocDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标记3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标记3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标记3  
     * @return
     */
    @JsonIgnore
    public String getUserTag3(){
        Object objValue = this.get(FIELD_USERTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag3Dirty(){
        if(this.contains(FIELD_USERTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标记3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysSearchDocDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标记4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标记4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标记4  
     * @return
     */
    @JsonIgnore
    public String getUserTag4(){
        Object objValue = this.get(FIELD_USERTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag4Dirty(){
        if(this.contains(FIELD_USERTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标记4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysSearchDocDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 启用
     * 
     * @param validFlag
     * 
     */
    @JsonProperty(FIELD_VALIDFLAG)
    public void setValidFlag(Integer validFlag){
        this.set(FIELD_VALIDFLAG, validFlag);
    }
    
    /**
     * 获取 启用  
     * @return
     */
    @JsonIgnore
    public Integer getValidFlag(){
        Object objValue = this.get(FIELD_VALIDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValidFlagDirty(){
        if(this.contains(FIELD_VALIDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用
     */
    @JsonIgnore
    public void resetValidFlag(){
        this.reset(FIELD_VALIDFLAG);
    }

    /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSSysSearchDocDTO validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSSysSearchDocDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSearchDocId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSearchDocId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchDocId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchDocId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDocDTO id(String strValue){
        this.setPSSysSearchDocId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSearchDocDTO){
            PSSysSearchDocDTO dto = (PSSysSearchDocDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
