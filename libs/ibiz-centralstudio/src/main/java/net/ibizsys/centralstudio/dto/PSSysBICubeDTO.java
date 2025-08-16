package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBE</B>智能报表立方体 模型传输对象
 * <P>
 * 
 */
public class PSSysBICubeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBICubeDTO(){
    }      

    /**
     * <B>BICUBETAG</B>&nbsp;立方体标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBETAG = "bicubetag";

    /**
     * 设置 立方体标记
     * 
     * @param bICubeTag
     * 
     */
    @JsonProperty(FIELD_BICUBETAG)
    public void setBICubeTag(String bICubeTag){
        this.set(FIELD_BICUBETAG, bICubeTag);
    }
    
    /**
     * 获取 立方体标记  
     * @return
     */
    @JsonIgnore
    public String getBICubeTag(){
        Object objValue = this.get(FIELD_BICUBETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeTagDirty(){
        if(this.contains(FIELD_BICUBETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体标记
     */
    @JsonIgnore
    public void resetBICubeTag(){
        this.reset(FIELD_BICUBETAG);
    }

    /**
     * 设置 立方体标记
     * <P>
     * 等同 {@link #setBICubeTag}
     * @param bICubeTag
     */
    @JsonIgnore
    public PSSysBICubeDTO bicubetag(String bICubeTag){
        this.setBICubeTag(bICubeTag);
        return this;
    }

    /**
     * <B>BICUBETAG2</B>&nbsp;立方体标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBETAG2 = "bicubetag2";

    /**
     * 设置 立方体标记2
     * 
     * @param bICubeTag2
     * 
     */
    @JsonProperty(FIELD_BICUBETAG2)
    public void setBICubeTag2(String bICubeTag2){
        this.set(FIELD_BICUBETAG2, bICubeTag2);
    }
    
    /**
     * 获取 立方体标记2  
     * @return
     */
    @JsonIgnore
    public String getBICubeTag2(){
        Object objValue = this.get(FIELD_BICUBETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeTag2Dirty(){
        if(this.contains(FIELD_BICUBETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体标记2
     */
    @JsonIgnore
    public void resetBICubeTag2(){
        this.reset(FIELD_BICUBETAG2);
    }

    /**
     * 设置 立方体标记2
     * <P>
     * 等同 {@link #setBICubeTag2}
     * @param bICubeTag2
     */
    @JsonIgnore
    public PSSysBICubeDTO bicubetag2(String bICubeTag2){
        this.setBICubeTag2(bICubeTag2);
        return this;
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
    public PSSysBICubeDTO codename(String codeName){
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
    public PSSysBICubeDTO createdate(Timestamp createDate){
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
    public PSSysBICubeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;键值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 键值属性
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 键值属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFId(){
        Object objValue = this.get(FIELD_KEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 键值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFIdDirty(){
        if(this.contains(FIELD_KEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 键值属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 键值属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSSysBICubeDTO keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 键值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDTO keypsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        }
        else{
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEYPSDEFNAME</B>&nbsp;键值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 键值属性
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 键值属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFName(){
        Object objValue = this.get(FIELD_KEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 键值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFNameDirty(){
        if(this.contains(FIELD_KEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 键值属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 键值属性
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSSysBICubeDTO keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysBICubeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;立方体实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 立方体实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 立方体实体  
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
     * 判断 立方体实体 是否指定值，包括空值
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
     * 重置 立方体实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 立方体实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBICubeDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 立方体实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;立方体实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 立方体实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 立方体实体  
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
     * 判断 立方体实体 是否指定值，包括空值
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
     * 重置 立方体实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 立方体实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysBICubeDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;智能报表立方体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 智能报表立方体标识
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 智能报表立方体标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表立方体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表立方体标识
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 智能报表立方体标识
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * <B>PSSYSBICUBENAME</B>&nbsp;立方体名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBICUBENAME = "pssysbicubename";

    /**
     * 设置 立方体名称
     * 
     * @param pSSysBICubeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBENAME)
    public void setPSSysBICubeName(String pSSysBICubeName){
        this.set(FIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }
    
    /**
     * 获取 立方体名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeName(){
        Object objValue = this.get(FIELD_PSSYSBICUBENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体名称
     */
    @JsonIgnore
    public void resetPSSysBICubeName(){
        this.reset(FIELD_PSSYSBICUBENAME);
    }

    /**
     * 设置 立方体名称
     * <P>
     * 等同 {@link #setPSSysBICubeName}
     * @param pSSysBICubeName
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBICubeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBICubeName(strName);
    }

    @JsonIgnore
    public PSSysBICubeDTO name(String strName){
        this.setPSSysBICubeName(strName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;智能报表体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBISchemeDTO} 
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * 设置 智能报表体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBIScheme 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme){
        if(pSSysBIScheme == null){
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        }
        else{
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;智能报表体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBISCHEMEID}
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysBICubeDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>TYPEPSDEFID</B>&nbsp;类型属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TYPEPSDEFID = "typepsdefid";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFId
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFID)
    public void setTypePSDEFId(String typePSDEFId){
        this.set(FIELD_TYPEPSDEFID, typePSDEFId);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFId(){
        Object objValue = this.get(FIELD_TYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFIdDirty(){
        if(this.contains(FIELD_TYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFId(){
        this.reset(FIELD_TYPEPSDEFID);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param typePSDEFId
     */
    @JsonIgnore
    public PSSysBICubeDTO typepsdefid(String typePSDEFId){
        this.setTypePSDEFId(typePSDEFId);
        return this;
    }

    /**
     * 设置 类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBICubeDTO typepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTypePSDEFId(null);
            this.setTypePSDEFName(null);
        }
        else{
            this.setTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TYPEPSDEFNAME</B>&nbsp;类型属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TYPEPSDEFID}
     */
    public final static String FIELD_TYPEPSDEFNAME = "typepsdefname";

    /**
     * 设置 类型属性
     * 
     * @param typePSDEFName
     * 
     */
    @JsonProperty(FIELD_TYPEPSDEFNAME)
    public void setTypePSDEFName(String typePSDEFName){
        this.set(FIELD_TYPEPSDEFNAME, typePSDEFName);
    }
    
    /**
     * 获取 类型属性  
     * @return
     */
    @JsonIgnore
    public String getTypePSDEFName(){
        Object objValue = this.get(FIELD_TYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypePSDEFNameDirty(){
        if(this.contains(FIELD_TYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型属性
     */
    @JsonIgnore
    public void resetTypePSDEFName(){
        this.reset(FIELD_TYPEPSDEFNAME);
    }

    /**
     * 设置 类型属性
     * <P>
     * 等同 {@link #setTypePSDEFName}
     * @param typePSDEFName
     */
    @JsonIgnore
    public PSSysBICubeDTO typepsdefname(String typePSDEFName){
        this.setTypePSDEFName(typePSDEFName);
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
    public PSSysBICubeDTO updatedate(Timestamp updateDate){
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
    public PSSysBICubeDTO updateman(String updateMan){
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
    public PSSysBICubeDTO usercat(String userCat){
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
    public PSSysBICubeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICubeDTO usertag(String userTag){
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
    public PSSysBICubeDTO usertag2(String userTag2){
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
    public PSSysBICubeDTO usertag3(String userTag3){
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
    public PSSysBICubeDTO usertag4(String userTag4){
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
    public PSSysBICubeDTO validflag(Integer validFlag){
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
    public PSSysBICubeDTO validflag(Boolean validFlag){
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
        return this.getPSSysBICubeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBICubeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBICubeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBICubeId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeDTO id(String strValue){
        this.setPSSysBICubeId(strValue);
        return this;
    }


    /**
     *  智能报表立方体维度 成员集合
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONS = "pssysbicubedimensions";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO> pssysbicubedimensions;

    /**
     * 获取 智能报表立方体维度 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO> getPSSysBICubeDimensions(){
        return this.pssysbicubedimensions;
    }

    /**
     * 设置 智能报表立方体维度 成员集合  
     * @param pssysbicubedimensions
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONS)
    public void setPSSysBICubeDimensions(java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO> pssysbicubedimensions){
        this.pssysbicubedimensions = pssysbicubedimensions;
    }

    /**
     * 获取 智能报表立方体维度 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO> getPSSysBICubeDimensionsIf(){
        if(this.pssysbicubedimensions == null){
            this.pssysbicubedimensions = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysBICubeDimensionDTO>();          
        }
        return this.pssysbicubedimensions;
    }


    /**
     *  智能报表立方体指标 成员集合
     */
    public final static String FIELD_PSSYSBICUBEMEASURES = "pssysbicubemeasures";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeMeasureDTO> pssysbicubemeasures;

    /**
     * 获取 智能报表立方体指标 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASURES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeMeasureDTO> getPSSysBICubeMeasures(){
        return this.pssysbicubemeasures;
    }

    /**
     * 设置 智能报表立方体指标 成员集合  
     * @param pssysbicubemeasures
     */
    @JsonProperty(FIELD_PSSYSBICUBEMEASURES)
    public void setPSSysBICubeMeasures(java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeMeasureDTO> pssysbicubemeasures){
        this.pssysbicubemeasures = pssysbicubemeasures;
    }

    /**
     * 获取 智能报表立方体指标 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBICubeMeasureDTO> getPSSysBICubeMeasuresIf(){
        if(this.pssysbicubemeasures == null){
            this.pssysbicubemeasures = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysBICubeMeasureDTO>();          
        }
        return this.pssysbicubemeasures;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBICubeDTO){
            PSSysBICubeDTO dto = (PSSysBICubeDTO)iEntity;
            dto.setPSSysBICubeDimensions(this.getPSSysBICubeDimensions());
            dto.setPSSysBICubeMeasures(this.getPSSysBICubeMeasures());
        }
        super.copyTo(iEntity);
    }
}
