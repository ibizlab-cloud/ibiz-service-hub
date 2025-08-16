package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBILEVEL</B>智能报表维度层级 模型传输对象
 * <P>
 * 
 */
public class PSSysBILevel extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBILevel(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AGGCAPTION</B>&nbsp;聚合标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AGGCAPTION = "aggcaption";

    /**
     * 设置 聚合标题
     * 
     * @param aggCaption
     * 
     */
    @JsonProperty(FIELD_AGGCAPTION)
    public void setAggCaption(String aggCaption){
        this.set(FIELD_AGGCAPTION, aggCaption);
    }
    
    /**
     * 获取 聚合标题  
     * @return
     */
    @JsonIgnore
    public String getAggCaption(){
        Object objValue = this.get(FIELD_AGGCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggCaptionDirty(){
        if(this.contains(FIELD_AGGCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合标题
     */
    @JsonIgnore
    public void resetAggCaption(){
        this.reset(FIELD_AGGCAPTION);
    }

    /**
     * 设置 聚合标题
     * <P>
     * 等同 {@link #setAggCaption}
     * @param aggCaption
     */
    @JsonIgnore
    public PSSysBILevel aggcaption(String aggCaption){
        this.setAggCaption(aggCaption);
        return this;
    }

    /**
     * <B>BILEVELTAG</B>&nbsp;维度层级标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BILEVELTAG = "bileveltag";

    /**
     * 设置 维度层级标记
     * 
     * @param bILevelTag
     * 
     */
    @JsonProperty(FIELD_BILEVELTAG)
    public void setBILevelTag(String bILevelTag){
        this.set(FIELD_BILEVELTAG, bILevelTag);
    }
    
    /**
     * 获取 维度层级标记  
     * @return
     */
    @JsonIgnore
    public String getBILevelTag(){
        Object objValue = this.get(FIELD_BILEVELTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBILevelTagDirty(){
        if(this.contains(FIELD_BILEVELTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级标记
     */
    @JsonIgnore
    public void resetBILevelTag(){
        this.reset(FIELD_BILEVELTAG);
    }

    /**
     * 设置 维度层级标记
     * <P>
     * 等同 {@link #setBILevelTag}
     * @param bILevelTag
     */
    @JsonIgnore
    public PSSysBILevel bileveltag(String bILevelTag){
        this.setBILevelTag(bILevelTag);
        return this;
    }

    /**
     * <B>BILEVELTAG2</B>&nbsp;维度层级标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BILEVELTAG2 = "bileveltag2";

    /**
     * 设置 维度层级标记2
     * 
     * @param bILevelTag2
     * 
     */
    @JsonProperty(FIELD_BILEVELTAG2)
    public void setBILevelTag2(String bILevelTag2){
        this.set(FIELD_BILEVELTAG2, bILevelTag2);
    }
    
    /**
     * 获取 维度层级标记2  
     * @return
     */
    @JsonIgnore
    public String getBILevelTag2(){
        Object objValue = this.get(FIELD_BILEVELTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBILevelTag2Dirty(){
        if(this.contains(FIELD_BILEVELTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级标记2
     */
    @JsonIgnore
    public void resetBILevelTag2(){
        this.reset(FIELD_BILEVELTAG2);
    }

    /**
     * 设置 维度层级标记2
     * <P>
     * 等同 {@link #setBILevelTag2}
     * @param bILevelTag2
     */
    @JsonIgnore
    public PSSysBILevel bileveltag2(String bILevelTag2){
        this.setBILevelTag2(bILevelTag2);
        return this;
    }

    /**
     * <B>BILEVELTYPE</B>&nbsp;层级类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BILevelType} 
     */
    public final static String FIELD_BILEVELTYPE = "bileveltype";

    /**
     * 设置 层级类型
     * 
     * @param bILevelType
     * 
     */
    @JsonProperty(FIELD_BILEVELTYPE)
    public void setBILevelType(String bILevelType){
        this.set(FIELD_BILEVELTYPE, bILevelType);
    }
    
    /**
     * 获取 层级类型  
     * @return
     */
    @JsonIgnore
    public String getBILevelType(){
        Object objValue = this.get(FIELD_BILEVELTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 层级类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBILevelTypeDirty(){
        if(this.contains(FIELD_BILEVELTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 层级类型
     */
    @JsonIgnore
    public void resetBILevelType(){
        this.reset(FIELD_BILEVELTYPE);
    }

    /**
     * 设置 层级类型
     * <P>
     * 等同 {@link #setBILevelType}
     * @param bILevelType
     */
    @JsonIgnore
    public PSSysBILevel bileveltype(String bILevelType){
        this.setBILevelType(bILevelType);
        return this;
    }

     /**
     * 设置 层级类型
     * <P>
     * 等同 {@link #setBILevelType}
     * @param bILevelType
     */
    @JsonIgnore
    public PSSysBILevel bileveltype(net.ibizsys.psmodel.core.util.PSModelEnums.BILevelType bILevelType){
        if(bILevelType == null){
            this.setBILevelType(null);
        }
        else{
            this.setBILevelType(bILevelType.value);
        }
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
    public PSSysBILevel codename(String codeName){
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
    public PSSysBILevel createdate(String createDate){
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
    public PSSysBILevel createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysBILevel memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysBILevel ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIHIERARCHYID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体标识
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体标识  
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
     * 判断 实体标识 是否指定值，包括空值
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
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体标识
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBILevel psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYID</B>&nbsp;智能报表维度体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIHierarchy} 
     */
    public final static String FIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";

    /**
     * 设置 智能报表维度体系
     * 
     * @param pSSysBIHierarchyId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYID)
    public void setPSSysBIHierarchyId(String pSSysBIHierarchyId){
        this.set(FIELD_PSSYSBIHIERARCHYID, pSSysBIHierarchyId);
    }
    
    /**
     * 获取 智能报表维度体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyId(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyIdDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度体系
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyId(){
        this.reset(FIELD_PSSYSBIHIERARCHYID);
    }

    /**
     * 设置 智能报表维度体系
     * <P>
     * 等同 {@link #setPSSysBIHierarchyId}
     * @param pSSysBIHierarchyId
     */
    @JsonIgnore
    public PSSysBILevel pssysbihierarchyid(String pSSysBIHierarchyId){
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
        return this;
    }

    /**
     * 设置 智能报表维度体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIHierarchyId}
     * @param pSSysBIHierarchy 引用对象
     */
    @JsonIgnore
    public PSSysBILevel pssysbihierarchyid(PSSysBIHierarchy pSSysBIHierarchy){
        if(pSSysBIHierarchy == null){
            this.setPSDEId(null);
            this.setPSSysBIHierarchyId(null);
            this.setPSSysBIHierarchyName(null);
        }
        else{
            this.setPSDEId(pSSysBIHierarchy.getPSDEId());
            this.setPSSysBIHierarchyId(pSSysBIHierarchy.getPSSysBIHierarchyId());
            this.setPSSysBIHierarchyName(pSSysBIHierarchy.getPSSysBIHierarchyName());
        }
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYNAME</B>&nbsp;智能报表维度体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIHIERARCHYID}
     */
    public final static String FIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";

    /**
     * 设置 智能报表维度体系
     * 
     * @param pSSysBIHierarchyName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYNAME)
    public void setPSSysBIHierarchyName(String pSSysBIHierarchyName){
        this.set(FIELD_PSSYSBIHIERARCHYNAME, pSSysBIHierarchyName);
    }
    
    /**
     * 获取 智能报表维度体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyName(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyNameDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度体系
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyName(){
        this.reset(FIELD_PSSYSBIHIERARCHYNAME);
    }

    /**
     * 设置 智能报表维度体系
     * <P>
     * 等同 {@link #setPSSysBIHierarchyName}
     * @param pSSysBIHierarchyName
     */
    @JsonIgnore
    public PSSysBILevel pssysbihierarchyname(String pSSysBIHierarchyName){
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    /**
     * <B>PSSYSBILEVELID</B>&nbsp;智能报表维度层级标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBILEVELID = "pssysbilevelid";

    /**
     * 设置 智能报表维度层级标识
     * 
     * @param pSSysBILevelId
     * 
     */
    @JsonProperty(FIELD_PSSYSBILEVELID)
    public void setPSSysBILevelId(String pSSysBILevelId){
        this.set(FIELD_PSSYSBILEVELID, pSSysBILevelId);
    }
    
    /**
     * 获取 智能报表维度层级标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBILevelId(){
        Object objValue = this.get(FIELD_PSSYSBILEVELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度层级标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBILevelIdDirty(){
        if(this.contains(FIELD_PSSYSBILEVELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度层级标识
     */
    @JsonIgnore
    public void resetPSSysBILevelId(){
        this.reset(FIELD_PSSYSBILEVELID);
    }

    /**
     * 设置 智能报表维度层级标识
     * <P>
     * 等同 {@link #setPSSysBILevelId}
     * @param pSSysBILevelId
     */
    @JsonIgnore
    public PSSysBILevel pssysbilevelid(String pSSysBILevelId){
        this.setPSSysBILevelId(pSSysBILevelId);
        return this;
    }

    /**
     * <B>PSSYSBILEVELNAME</B>&nbsp;维度层级名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBILEVELNAME = "pssysbilevelname";

    /**
     * 设置 维度层级名称
     * 
     * @param pSSysBILevelName
     * 
     */
    @JsonProperty(FIELD_PSSYSBILEVELNAME)
    public void setPSSysBILevelName(String pSSysBILevelName){
        this.set(FIELD_PSSYSBILEVELNAME, pSSysBILevelName);
    }
    
    /**
     * 获取 维度层级名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBILevelName(){
        Object objValue = this.get(FIELD_PSSYSBILEVELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBILevelNameDirty(){
        if(this.contains(FIELD_PSSYSBILEVELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级名称
     */
    @JsonIgnore
    public void resetPSSysBILevelName(){
        this.reset(FIELD_PSSYSBILEVELNAME);
    }

    /**
     * 设置 维度层级名称
     * <P>
     * 等同 {@link #setPSSysBILevelName}
     * @param pSSysBILevelName
     */
    @JsonIgnore
    public PSSysBILevel pssysbilevelname(String pSSysBILevelName){
        this.setPSSysBILevelName(pSSysBILevelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBILevelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBILevelName(strName);
    }

    @JsonIgnore
    public PSSysBILevel name(String strName){
        this.setPSSysBILevelName(strName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本属性
     * 
     * @param textPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFID)
    public void setTextPSDEFId(String textPSDEFId){
        this.set(FIELD_TEXTPSDEFID, textPSDEFId);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFId(){
        Object objValue = this.get(FIELD_TEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFIdDirty(){
        if(this.contains(FIELD_TEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFId(){
        this.reset(FIELD_TEXTPSDEFID);
    }

    /**
     * 设置 文本属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSSysBILevel textpsdefid(String textPSDEFId){
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    /**
     * 设置 文本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBILevel textpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        }
        else{
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本属性
     * 
     * @param textPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFNAME)
    public void setTextPSDEFName(String textPSDEFName){
        this.set(FIELD_TEXTPSDEFNAME, textPSDEFName);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFName(){
        Object objValue = this.get(FIELD_TEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFNameDirty(){
        if(this.contains(FIELD_TEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFName(){
        this.reset(FIELD_TEXTPSDEFNAME);
    }

    /**
     * 设置 文本属性
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSSysBILevel textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>UNIQUEMEMBERS</B>&nbsp;唯一成员
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UNIQUEMEMBERS = "uniquemembers";

    /**
     * 设置 唯一成员
     * 
     * @param uniqueMembers
     * 
     */
    @JsonProperty(FIELD_UNIQUEMEMBERS)
    public void setUniqueMembers(Integer uniqueMembers){
        this.set(FIELD_UNIQUEMEMBERS, uniqueMembers);
    }
    
    /**
     * 获取 唯一成员  
     * @return
     */
    @JsonIgnore
    public Integer getUniqueMembers(){
        Object objValue = this.get(FIELD_UNIQUEMEMBERS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 唯一成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueMembersDirty(){
        if(this.contains(FIELD_UNIQUEMEMBERS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 唯一成员
     */
    @JsonIgnore
    public void resetUniqueMembers(){
        this.reset(FIELD_UNIQUEMEMBERS);
    }

    /**
     * 设置 唯一成员
     * <P>
     * 等同 {@link #setUniqueMembers}
     * @param uniqueMembers
     */
    @JsonIgnore
    public PSSysBILevel uniquemembers(Integer uniqueMembers){
        this.setUniqueMembers(uniqueMembers);
        return this;
    }

     /**
     * 设置 唯一成员
     * <P>
     * 等同 {@link #setUniqueMembers}
     * @param uniqueMembers
     */
    @JsonIgnore
    public PSSysBILevel uniquemembers(Boolean uniqueMembers){
        if(uniqueMembers == null){
            this.setUniqueMembers(null);
        }
        else{
            this.setUniqueMembers(uniqueMembers?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysBILevel updatedate(String updateDate){
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
    public PSSysBILevel updateman(String updateMan){
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
    public PSSysBILevel usercat(String userCat){
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
    public PSSysBILevel usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBILevel usertag(String userTag){
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
    public PSSysBILevel usertag2(String userTag2){
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
    public PSSysBILevel usertag3(String userTag3){
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
    public PSSysBILevel usertag4(String userTag4){
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
    public PSSysBILevel validflag(Integer validFlag){
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
    public PSSysBILevel validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFID</B>&nbsp;值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_VALUEPSDEFID = "valuepsdefid";

    /**
     * 设置 值属性
     * 
     * @param valuePSDEFId
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFID)
    public void setValuePSDEFId(String valuePSDEFId){
        this.set(FIELD_VALUEPSDEFID, valuePSDEFId);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFId(){
        Object objValue = this.get(FIELD_VALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFIdDirty(){
        if(this.contains(FIELD_VALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFId(){
        this.reset(FIELD_VALUEPSDEFID);
    }

    /**
     * 设置 值属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param valuePSDEFId
     */
    @JsonIgnore
    public PSSysBILevel valuepsdefid(String valuePSDEFId){
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    /**
     * 设置 值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysBILevel valuepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        }
        else{
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFNAME</B>&nbsp;值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_VALUEPSDEFID}
     */
    public final static String FIELD_VALUEPSDEFNAME = "valuepsdefname";

    /**
     * 设置 值属性
     * 
     * @param valuePSDEFName
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFNAME)
    public void setValuePSDEFName(String valuePSDEFName){
        this.set(FIELD_VALUEPSDEFNAME, valuePSDEFName);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFName(){
        Object objValue = this.get(FIELD_VALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFNameDirty(){
        if(this.contains(FIELD_VALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFName(){
        this.reset(FIELD_VALUEPSDEFNAME);
    }

    /**
     * 设置 值属性
     * <P>
     * 等同 {@link #setValuePSDEFName}
     * @param valuePSDEFName
     */
    @JsonIgnore
    public PSSysBILevel valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBILevelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBILevelId(strValue);
    }

    @JsonIgnore
    public PSSysBILevel id(String strValue){
        this.setPSSysBILevelId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBILevel){
            PSSysBILevel model = (PSSysBILevel)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
