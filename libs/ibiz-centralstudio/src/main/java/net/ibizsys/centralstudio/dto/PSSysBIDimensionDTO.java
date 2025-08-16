package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBIDIMENSION</B>智能报表维度 模型传输对象
 * <P>
 * 
 */
public class PSSysBIDimensionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBIDimensionDTO(){
    }      

    /**
     * <B>BIDIMENSIONTAG</B>&nbsp;维度标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIDIMENSIONTAG = "bidimensiontag";

    /**
     * 设置 维度标记
     * 
     * @param bIDimensionTag
     * 
     */
    @JsonProperty(FIELD_BIDIMENSIONTAG)
    public void setBIDimensionTag(String bIDimensionTag){
        this.set(FIELD_BIDIMENSIONTAG, bIDimensionTag);
    }
    
    /**
     * 获取 维度标记  
     * @return
     */
    @JsonIgnore
    public String getBIDimensionTag(){
        Object objValue = this.get(FIELD_BIDIMENSIONTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIDimensionTagDirty(){
        if(this.contains(FIELD_BIDIMENSIONTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度标记
     */
    @JsonIgnore
    public void resetBIDimensionTag(){
        this.reset(FIELD_BIDIMENSIONTAG);
    }

    /**
     * 设置 维度标记
     * <P>
     * 等同 {@link #setBIDimensionTag}
     * @param bIDimensionTag
     */
    @JsonIgnore
    public PSSysBIDimensionDTO bidimensiontag(String bIDimensionTag){
        this.setBIDimensionTag(bIDimensionTag);
        return this;
    }

    /**
     * <B>BIDIMENSIONTAG2</B>&nbsp;维度标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BIDIMENSIONTAG2 = "bidimensiontag2";

    /**
     * 设置 维度标记2
     * 
     * @param bIDimensionTag2
     * 
     */
    @JsonProperty(FIELD_BIDIMENSIONTAG2)
    public void setBIDimensionTag2(String bIDimensionTag2){
        this.set(FIELD_BIDIMENSIONTAG2, bIDimensionTag2);
    }
    
    /**
     * 获取 维度标记2  
     * @return
     */
    @JsonIgnore
    public String getBIDimensionTag2(){
        Object objValue = this.get(FIELD_BIDIMENSIONTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIDimensionTag2Dirty(){
        if(this.contains(FIELD_BIDIMENSIONTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度标记2
     */
    @JsonIgnore
    public void resetBIDimensionTag2(){
        this.reset(FIELD_BIDIMENSIONTAG2);
    }

    /**
     * 设置 维度标记2
     * <P>
     * 等同 {@link #setBIDimensionTag2}
     * @param bIDimensionTag2
     */
    @JsonIgnore
    public PSSysBIDimensionDTO bidimensiontag2(String bIDimensionTag2){
        this.setBIDimensionTag2(bIDimensionTag2);
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
    public PSSysBIDimensionDTO codename(String codeName){
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
    public PSSysBIDimensionDTO createdate(Timestamp createDate){
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
    public PSSysBIDimensionDTO createman(String createMan){
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
    public PSSysBIDimensionDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSBIDIMENSIONID</B>&nbsp;智能报表维度标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";

    /**
     * 设置 智能报表维度标识
     * 
     * @param pSSysBIDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIDIMENSIONID)
    public void setPSSysBIDimensionId(String pSSysBIDimensionId){
        this.set(FIELD_PSSYSBIDIMENSIONID, pSSysBIDimensionId);
    }
    
    /**
     * 获取 智能报表维度标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBIDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表维度标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBIDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表维度标识
     */
    @JsonIgnore
    public void resetPSSysBIDimensionId(){
        this.reset(FIELD_PSSYSBIDIMENSIONID);
    }

    /**
     * 设置 智能报表维度标识
     * <P>
     * 等同 {@link #setPSSysBIDimensionId}
     * @param pSSysBIDimensionId
     */
    @JsonIgnore
    public PSSysBIDimensionDTO pssysbidimensionid(String pSSysBIDimensionId){
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    /**
     * <B>PSSYSBIDIMENSIONNAME</B>&nbsp;维度名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBIDIMENSIONNAME = "pssysbidimensionname";

    /**
     * 设置 维度名称
     * 
     * @param pSSysBIDimensionName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIDIMENSIONNAME)
    public void setPSSysBIDimensionName(String pSSysBIDimensionName){
        this.set(FIELD_PSSYSBIDIMENSIONNAME, pSSysBIDimensionName);
    }
    
    /**
     * 获取 维度名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIDimensionName(){
        Object objValue = this.get(FIELD_PSSYSBIDIMENSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIDimensionNameDirty(){
        if(this.contains(FIELD_PSSYSBIDIMENSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度名称
     */
    @JsonIgnore
    public void resetPSSysBIDimensionName(){
        this.reset(FIELD_PSSYSBIDIMENSIONNAME);
    }

    /**
     * 设置 维度名称
     * <P>
     * 等同 {@link #setPSSysBIDimensionName}
     * @param pSSysBIDimensionName
     */
    @JsonIgnore
    public PSSysBIDimensionDTO pssysbidimensionname(String pSSysBIDimensionName){
        this.setPSSysBIDimensionName(pSSysBIDimensionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBIDimensionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBIDimensionName(strName);
    }

    @JsonIgnore
    public PSSysBIDimensionDTO name(String strName){
        this.setPSSysBIDimensionName(strName);
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
    public PSSysBIDimensionDTO pssysbischemeid(String pSSysBISchemeId){
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
    public PSSysBIDimensionDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme){
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
    public PSSysBIDimensionDTO pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
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
    public PSSysBIDimensionDTO updatedate(Timestamp updateDate){
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
    public PSSysBIDimensionDTO updateman(String updateMan){
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
    public PSSysBIDimensionDTO usercat(String userCat){
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
    public PSSysBIDimensionDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBIDimensionDTO usertag(String userTag){
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
    public PSSysBIDimensionDTO usertag2(String userTag2){
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
    public PSSysBIDimensionDTO usertag3(String userTag3){
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
    public PSSysBIDimensionDTO usertag4(String userTag4){
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
    public PSSysBIDimensionDTO validflag(Integer validFlag){
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
    public PSSysBIDimensionDTO validflag(Boolean validFlag){
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
        return this.getPSSysBIDimensionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBIDimensionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBIDimensionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBIDimensionId(strValue);
    }

    @JsonIgnore
    public PSSysBIDimensionDTO id(String strValue){
        this.setPSSysBIDimensionId(strValue);
        return this;
    }


    /**
     *  智能报表维度体系 成员集合
     */
    public final static String FIELD_PSSYSBIHIERARCHIES = "pssysbihierarchies";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO> pssysbihierarchies;

    /**
     * 获取 智能报表维度体系 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHIES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO> getPSSysBIHierarchies(){
        return this.pssysbihierarchies;
    }

    /**
     * 设置 智能报表维度体系 成员集合  
     * @param pssysbihierarchies
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHIES)
    public void setPSSysBIHierarchies(java.util.List<net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO> pssysbihierarchies){
        this.pssysbihierarchies = pssysbihierarchies;
    }

    /**
     * 获取 智能报表维度体系 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO> getPSSysBIHierarchiesIf(){
        if(this.pssysbihierarchies == null){
            this.pssysbihierarchies = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysBIHierarchyDTO>();          
        }
        return this.pssysbihierarchies;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBIDimensionDTO){
            PSSysBIDimensionDTO dto = (PSSysBIDimensionDTO)iEntity;
            dto.setPSSysBIHierarchies(this.getPSSysBIHierarchies());
        }
        super.copyTo(iEntity);
    }
}
