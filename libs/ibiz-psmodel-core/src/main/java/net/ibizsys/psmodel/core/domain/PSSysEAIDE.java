package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSEAIDE</B>集成实体映射 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIDE extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEAIDE(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysEAIDE codename(String codeName){
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
    public PSSysEAIDE createdate(String createDate){
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
    public PSSysEAIDE createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EAIDETAG</B>&nbsp;实体映射标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDETAG = "eaidetag";

    /**
     * 设置 实体映射标记
     * 
     * @param eAIDETag
     * 
     */
    @JsonProperty(FIELD_EAIDETAG)
    public void setEAIDETag(String eAIDETag){
        this.set(FIELD_EAIDETAG, eAIDETag);
    }
    
    /**
     * 获取 实体映射标记  
     * @return
     */
    @JsonIgnore
    public String getEAIDETag(){
        Object objValue = this.get(FIELD_EAIDETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDETagDirty(){
        if(this.contains(FIELD_EAIDETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射标记
     */
    @JsonIgnore
    public void resetEAIDETag(){
        this.reset(FIELD_EAIDETAG);
    }

    /**
     * 设置 实体映射标记
     * <P>
     * 等同 {@link #setEAIDETag}
     * @param eAIDETag
     */
    @JsonIgnore
    public PSSysEAIDE eaidetag(String eAIDETag){
        this.setEAIDETag(eAIDETag);
        return this;
    }

    /**
     * <B>EAIDETAG2</B>&nbsp;实体映射标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDETAG2 = "eaidetag2";

    /**
     * 设置 实体映射标记2
     * 
     * @param eAIDETag2
     * 
     */
    @JsonProperty(FIELD_EAIDETAG2)
    public void setEAIDETag2(String eAIDETag2){
        this.set(FIELD_EAIDETAG2, eAIDETag2);
    }
    
    /**
     * 获取 实体映射标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIDETag2(){
        Object objValue = this.get(FIELD_EAIDETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDETag2Dirty(){
        if(this.contains(FIELD_EAIDETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射标记2
     */
    @JsonIgnore
    public void resetEAIDETag2(){
        this.reset(FIELD_EAIDETAG2);
    }

    /**
     * 设置 实体映射标记2
     * <P>
     * 等同 {@link #setEAIDETag2}
     * @param eAIDETag2
     */
    @JsonIgnore
    public PSSysEAIDE eaidetag2(String eAIDETag2){
        this.setEAIDETag2(eAIDETag2);
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
    public PSSysEAIDE memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysEAIDE psdeid(String pSDEId){
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
    public PSSysEAIDE psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysEAIDE psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSEAIDEID</B>&nbsp;应用集成实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIDEID = "pssyseaideid";

    /**
     * 设置 应用集成实体标识
     * 
     * @param pSSysEAIDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDEID)
    public void setPSSysEAIDEId(String pSSysEAIDEId){
        this.set(FIELD_PSSYSEAIDEID, pSSysEAIDEId);
    }
    
    /**
     * 获取 应用集成实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEId(){
        Object objValue = this.get(FIELD_PSSYSEAIDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDEIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成实体标识
     */
    @JsonIgnore
    public void resetPSSysEAIDEId(){
        this.reset(FIELD_PSSYSEAIDEID);
    }

    /**
     * 设置 应用集成实体标识
     * <P>
     * 等同 {@link #setPSSysEAIDEId}
     * @param pSSysEAIDEId
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaideid(String pSSysEAIDEId){
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    /**
     * <B>PSSYSEAIDENAME</B>&nbsp;集成实体名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIDENAME = "pssyseaidename";

    /**
     * 设置 集成实体名称
     * 
     * @param pSSysEAIDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDENAME)
    public void setPSSysEAIDEName(String pSSysEAIDEName){
        this.set(FIELD_PSSYSEAIDENAME, pSSysEAIDEName);
    }
    
    /**
     * 获取 集成实体名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEName(){
        Object objValue = this.get(FIELD_PSSYSEAIDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成实体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDENameDirty(){
        if(this.contains(FIELD_PSSYSEAIDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成实体名称
     */
    @JsonIgnore
    public void resetPSSysEAIDEName(){
        this.reset(FIELD_PSSYSEAIDENAME);
    }

    /**
     * 设置 集成实体名称
     * <P>
     * 等同 {@link #setPSSysEAIDEName}
     * @param pSSysEAIDEName
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaidename(String pSSysEAIDEName){
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIDEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIDEName(strName);
    }

    @JsonIgnore
    public PSSysEAIDE name(String strName){
        this.setPSSysEAIDEName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;应用集成元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIElement} 
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 应用集成元素
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 应用集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 应用集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * 设置 应用集成元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElement 引用对象
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaielementid(PSSysEAIElement pSSysEAIElement){
        if(pSSysEAIElement == null){
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
        }
        else{
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTNAME</B>&nbsp;集成元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTID}
     */
    public final static String FIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";

    /**
     * 设置 集成元素
     * 
     * @param pSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTNAME)
    public void setPSSysEAIElementName(String pSSysEAIElementName){
        this.set(FIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }
    
    /**
     * 获取 集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementName(){
        this.reset(FIELD_PSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementName}
     * @param pSSysEAIElementName
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaielementname(String pSSysEAIElementName){
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;应用集成体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIScheme} 
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * 设置 应用集成体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAIScheme 引用对象
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaischemeid(PSSysEAIScheme pSSysEAIScheme){
        if(pSSysEAIScheme == null){
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        }
        else{
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMENAME</B>&nbsp;应用集成体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAISCHEMEID}
     */
    public final static String FIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMENAME)
    public void setPSSysEAISchemeName(String pSSysEAISchemeName){
        this.set(FIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeName(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeName(){
        this.reset(FIELD_PSSYSEAISCHEMENAME);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeName}
     * @param pSSysEAISchemeName
     */
    @JsonIgnore
    public PSSysEAIDE pssyseaischemename(String pSSysEAISchemeName){
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
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
    public PSSysEAIDE updatedate(String updateDate){
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
    public PSSysEAIDE updateman(String updateMan){
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
    public PSSysEAIDE usercat(String userCat){
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
    public PSSysEAIDE usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIDE usertag(String userTag){
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
    public PSSysEAIDE usertag2(String userTag2){
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
    public PSSysEAIDE usertag3(String userTag3){
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
    public PSSysEAIDE usertag4(String userTag4){
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
    public PSSysEAIDE validflag(Integer validFlag){
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
    public PSSysEAIDE validflag(Boolean validFlag){
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
        return this.getPSSysEAIDEId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIDEId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDE id(String strValue){
        this.setPSSysEAIDEId(strValue);
        return this;
    }


    /**
     *  集成实体属性映射 成员集合
     */
    public final static String FIELD_PSSYSEAIDEFIELDS = "pssyseaidefields";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDEField> pssyseaidefields;

    /**
     * 获取 集成实体属性映射 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSEAIDEFIELDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDEField> getPSSysEAIDEFields(){
        return this.pssyseaidefields;
    }

    /**
     * 设置 集成实体属性映射 成员集合  
     * @param pssyseaidefields
     */
    @JsonProperty(FIELD_PSSYSEAIDEFIELDS)
    public void setPSSysEAIDEFields(java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDEField> pssyseaidefields){
        this.pssyseaidefields = pssyseaidefields;
    }

    /**
     * 获取 集成实体属性映射 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDEField> getPSSysEAIDEFieldsIf(){
        if(this.pssyseaidefields == null){
            this.pssyseaidefields = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysEAIDEField>();          
        }
        return this.pssyseaidefields;
    }


    /**
     *  集成实体关系映射 成员集合
     */
    public final static String FIELD_PSSYSEAIDERS = "pssyseaiders";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDER> pssyseaiders;

    /**
     * 获取 集成实体关系映射 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSEAIDERS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDER> getPSSysEAIDERs(){
        return this.pssyseaiders;
    }

    /**
     * 设置 集成实体关系映射 成员集合  
     * @param pssyseaiders
     */
    @JsonProperty(FIELD_PSSYSEAIDERS)
    public void setPSSysEAIDERs(java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDER> pssyseaiders){
        this.pssyseaiders = pssyseaiders;
    }

    /**
     * 获取 集成实体关系映射 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDER> getPSSysEAIDERsIf(){
        if(this.pssyseaiders == null){
            this.pssyseaiders = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysEAIDER>();          
        }
        return this.pssyseaiders;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEAIDE){
            PSSysEAIDE model = (PSSysEAIDE)iPSModel;
            model.setPSSysEAIDEFields(this.getPSSysEAIDEFields());
            model.setPSSysEAIDERs(this.getPSSysEAIDERs());
        }
        super.copyTo(iPSModel);
    }
}
