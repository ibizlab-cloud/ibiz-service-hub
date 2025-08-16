package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHDE</B>全文检索实体 模型传输对象
 * <P>
 * 全文检索实体的模型，定义全文检索体系与实体的关系
 */
public class PSSysSearchDE extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSearchDE(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定全文检索实体的代码名称，需在所在模型域（检索体系）具备唯一性
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
    public PSSysSearchDE codename(String codeName){
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
    public void setCreateDate(String createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public String getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSSysSearchDE createdate(String createDate){
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
    public PSSysSearchDE createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DETAG</B>&nbsp;实体标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG = "detag";

    /**
     * 设置 实体标记
     * 
     * @param dETag
     * 
     */
    @JsonProperty(FIELD_DETAG)
    public void setDETag(String dETag){
        this.set(FIELD_DETAG, dETag);
    }
    
    /**
     * 获取 实体标记  
     * @return
     */
    @JsonIgnore
    public String getDETag(){
        Object objValue = this.get(FIELD_DETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETagDirty(){
        if(this.contains(FIELD_DETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记
     */
    @JsonIgnore
    public void resetDETag(){
        this.reset(FIELD_DETAG);
    }

    /**
     * 设置 实体标记
     * <P>
     * 等同 {@link #setDETag}
     * @param dETag
     */
    @JsonIgnore
    public PSSysSearchDE detag(String dETag){
        this.setDETag(dETag);
        return this;
    }

    /**
     * <B>DETAG2</B>&nbsp;实体标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG2 = "detag2";

    /**
     * 设置 实体标记2
     * 
     * @param dETag2
     * 
     */
    @JsonProperty(FIELD_DETAG2)
    public void setDETag2(String dETag2){
        this.set(FIELD_DETAG2, dETag2);
    }
    
    /**
     * 获取 实体标记2  
     * @return
     */
    @JsonIgnore
    public String getDETag2(){
        Object objValue = this.get(FIELD_DETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETag2Dirty(){
        if(this.contains(FIELD_DETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记2
     */
    @JsonIgnore
    public void resetDETag2(){
        this.reset(FIELD_DETAG2);
    }

    /**
     * 设置 实体标记2
     * <P>
     * 等同 {@link #setDETag2}
     * @param dETag2
     */
    @JsonIgnore
    public PSSysSearchDE detag2(String dETag2){
        this.setDETag2(dETag2);
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
    public PSSysSearchDE memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NOSQLFLAG</B>&nbsp;NoSQL存储，指定是否作为实体NoSQL存储，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSQLFLAG = "nosqlflag";

    /**
     * 设置 NoSQL存储，详细说明：{@link #FIELD_NOSQLFLAG}
     * 
     * @param noSQLFlag
     * 
     */
    @JsonProperty(FIELD_NOSQLFLAG)
    public void setNoSQLFlag(Integer noSQLFlag){
        this.set(FIELD_NOSQLFLAG, noSQLFlag);
    }
    
    /**
     * 获取 NoSQL存储  
     * @return
     */
    @JsonIgnore
    public Integer getNoSQLFlag(){
        Object objValue = this.get(FIELD_NOSQLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 NoSQL存储 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSQLFlagDirty(){
        if(this.contains(FIELD_NOSQLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 NoSQL存储
     */
    @JsonIgnore
    public void resetNoSQLFlag(){
        this.reset(FIELD_NOSQLFLAG);
    }

    /**
     * 设置 NoSQL存储，详细说明：{@link #FIELD_NOSQLFLAG}
     * <P>
     * 等同 {@link #setNoSQLFlag}
     * @param noSQLFlag
     */
    @JsonIgnore
    public PSSysSearchDE nosqlflag(Integer noSQLFlag){
        this.setNoSQLFlag(noSQLFlag);
        return this;
    }

     /**
     * 设置 NoSQL存储，详细说明：{@link #FIELD_NOSQLFLAG}
     * <P>
     * 等同 {@link #setNoSQLFlag}
     * @param noSQLFlag
     */
    @JsonIgnore
    public PSSysSearchDE nosqlflag(Boolean noSQLFlag){
        if(noSQLFlag == null){
            this.setNoSQLFlag(null);
        }
        else{
            this.setNoSQLFlag(noSQLFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定全文检索实体的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSSysSearchDE psdeid(String pSDEId){
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
    public PSSysSearchDE psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定全文检索实体的实体对象
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
    public PSSysSearchDE psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDEID</B>&nbsp;检索实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHDEID = "pssyssearchdeid";

    /**
     * 设置 检索实体标识
     * 
     * @param pSSysSearchDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDEID)
    public void setPSSysSearchDEId(String pSSysSearchDEId){
        this.set(FIELD_PSSYSSEARCHDEID, pSSysSearchDEId);
    }
    
    /**
     * 获取 检索实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDEIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索实体标识
     */
    @JsonIgnore
    public void resetPSSysSearchDEId(){
        this.reset(FIELD_PSSYSSEARCHDEID);
    }

    /**
     * 设置 检索实体标识
     * <P>
     * 等同 {@link #setPSSysSearchDEId}
     * @param pSSysSearchDEId
     */
    @JsonIgnore
    public PSSysSearchDE pssyssearchdeid(String pSSysSearchDEId){
        this.setPSSysSearchDEId(pSSysSearchDEId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDENAME</B>&nbsp;检索实体名称，指定全文检索实体的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSEARCHDENAME = "pssyssearchdename";

    /**
     * 设置 检索实体名称，详细说明：{@link #FIELD_PSSYSSEARCHDENAME}
     * 
     * @param pSSysSearchDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDENAME)
    public void setPSSysSearchDEName(String pSSysSearchDEName){
        this.set(FIELD_PSSYSSEARCHDENAME, pSSysSearchDEName);
    }
    
    /**
     * 获取 检索实体名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDEName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索实体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDENameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索实体名称
     */
    @JsonIgnore
    public void resetPSSysSearchDEName(){
        this.reset(FIELD_PSSYSSEARCHDENAME);
    }

    /**
     * 设置 检索实体名称，详细说明：{@link #FIELD_PSSYSSEARCHDENAME}
     * <P>
     * 等同 {@link #setPSSysSearchDEName}
     * @param pSSysSearchDEName
     */
    @JsonIgnore
    public PSSysSearchDE pssyssearchdename(String pSSysSearchDEName){
        this.setPSSysSearchDEName(pSSysSearchDEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchDEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchDEName(strName);
    }

    @JsonIgnore
    public PSSysSearchDE name(String strName){
        this.setPSSysSearchDEName(strName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档，指定全文检索实体的检索文档
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchDoc} 
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCID}
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档  
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
     * 判断 全文检索文档 是否指定值，包括空值
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
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCID}
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSSysSearchDE pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * 设置 全文检索文档，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDoc 引用对象
     */
    @JsonIgnore
    public PSSysSearchDE pssyssearchdocid(PSSysSearchDoc pSSysSearchDoc){
        if(pSSysSearchDoc == null){
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        }
        else{
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCNAME</B>&nbsp;全文检索文档，指定全文检索实体的检索文档
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDOCID}
     */
    public final static String FIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * 
     * @param pSSysSearchDocName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCNAME)
    public void setPSSysSearchDocName(String pSSysSearchDocName){
        this.set(FIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }
    
    /**
     * 获取 全文检索文档  
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
     * 判断 全文检索文档 是否指定值，包括空值
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
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocName(){
        this.reset(FIELD_PSSYSSEARCHDOCNAME);
    }

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * <P>
     * 等同 {@link #setPSSysSearchDocName}
     * @param pSSysSearchDocName
     */
    @JsonIgnore
    public PSSysSearchDE pssyssearchdocname(String pSSysSearchDocName){
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMEID</B>&nbsp;全文检索体系，指定全文检索实体所在的全文检索体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchScheme} 
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
    public PSSysSearchDE pssyssearchschemeid(String pSSysSearchSchemeId){
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
    public PSSysSearchDE pssyssearchschemeid(PSSysSearchScheme pSSysSearchScheme){
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
     * <B>PSSYSSEARCHSCHEMENAME</B>&nbsp;全文检索体系，指定全文检索实体所在的全文检索体系
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
    public PSSysSearchDE pssyssearchschemename(String pSSysSearchSchemeName){
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    /**
     * <B>THREADRUNMODE</B>&nbsp;线程运行模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicThreadRunMode} 
     */
    public final static String FIELD_THREADRUNMODE = "threadrunmode";

    /**
     * 设置 线程运行模式
     * 
     * @param threadRunMode
     * 
     */
    @JsonProperty(FIELD_THREADRUNMODE)
    public void setThreadRunMode(Integer threadRunMode){
        this.set(FIELD_THREADRUNMODE, threadRunMode);
    }
    
    /**
     * 获取 线程运行模式  
     * @return
     */
    @JsonIgnore
    public Integer getThreadRunMode(){
        Object objValue = this.get(FIELD_THREADRUNMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 线程运行模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThreadRunModeDirty(){
        if(this.contains(FIELD_THREADRUNMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 线程运行模式
     */
    @JsonIgnore
    public void resetThreadRunMode(){
        this.reset(FIELD_THREADRUNMODE);
    }

    /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSSysSearchDE threadrunmode(Integer threadRunMode){
        this.setThreadRunMode(threadRunMode);
        return this;
    }

     /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSSysSearchDE threadrunmode(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicThreadRunMode threadRunMode){
        if(threadRunMode == null){
            this.setThreadRunMode(null);
        }
        else{
            this.setThreadRunMode(threadRunMode.value);
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
    public void setUpdateDate(String updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public String getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSSysSearchDE updatedate(String updateDate){
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
    public PSSysSearchDE updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat} 
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
    public PSSysSearchDE usercat(String userCat){
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
    public PSSysSearchDE usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 200
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
    public PSSysSearchDE usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 200
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
    public PSSysSearchDE usertag2(String userTag2){
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
    public PSSysSearchDE usertag3(String userTag3){
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
    public PSSysSearchDE usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSSysSearchDE validflag(Integer validFlag){
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
    public PSSysSearchDE validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchDEId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchDEId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDE id(String strValue){
        this.setPSSysSearchDEId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSearchDE){
            PSSysSearchDE model = (PSSysSearchDE)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
