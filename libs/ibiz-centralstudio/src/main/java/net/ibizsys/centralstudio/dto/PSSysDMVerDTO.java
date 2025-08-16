package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDMVER</B>系统数据库模型版本 模型传输对象
 * <P>
 * 系统数据库模型版本模型，定义系统的数据库结构版本信息
 */
public class PSSysDMVerDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDMVerDTO(){
    }      

    /**
     * <B>ACTIVEFLAG</B>&nbsp;当前版本，指定数据库模型版本是否为当前版本，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ACTIVEFLAG = "activeflag";

    /**
     * 设置 当前版本，详细说明：{@link #FIELD_ACTIVEFLAG}
     * 
     * @param activeFlag
     * 
     */
    @JsonProperty(FIELD_ACTIVEFLAG)
    public void setActiveFlag(Integer activeFlag){
        this.set(FIELD_ACTIVEFLAG, activeFlag);
    }
    
    /**
     * 获取 当前版本  
     * @return
     */
    @JsonIgnore
    public Integer getActiveFlag(){
        Object objValue = this.get(FIELD_ACTIVEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 当前版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActiveFlagDirty(){
        if(this.contains(FIELD_ACTIVEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前版本
     */
    @JsonIgnore
    public void resetActiveFlag(){
        this.reset(FIELD_ACTIVEFLAG);
    }

    /**
     * 设置 当前版本，详细说明：{@link #FIELD_ACTIVEFLAG}
     * <P>
     * 等同 {@link #setActiveFlag}
     * @param activeFlag
     */
    @JsonIgnore
    public PSSysDMVerDTO activeflag(Integer activeFlag){
        this.setActiveFlag(activeFlag);
        return this;
    }

     /**
     * 设置 当前版本，详细说明：{@link #FIELD_ACTIVEFLAG}
     * <P>
     * 等同 {@link #setActiveFlag}
     * @param activeFlag
     */
    @JsonIgnore
    public PSSysDMVerDTO activeflag(Boolean activeFlag){
        if(activeFlag == null){
            this.setActiveFlag(null);
        }
        else{
            this.setActiveFlag(activeFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSysDMVerDTO createdate(Timestamp createDate){
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
    public PSSysDMVerDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DMVER</B>&nbsp;数据结构版本，数据库模型版本的版本号
     */
    public final static String FIELD_DMVER = "dmver";

    /**
     * 设置 数据结构版本，详细说明：{@link #FIELD_DMVER}
     * 
     * @param dMVer
     * 
     */
    @JsonProperty(FIELD_DMVER)
    public void setDMVer(Integer dMVer){
        this.set(FIELD_DMVER, dMVer);
    }
    
    /**
     * 获取 数据结构版本  
     * @return
     */
    @JsonIgnore
    public Integer getDMVer(){
        Object objValue = this.get(FIELD_DMVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据结构版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDMVerDirty(){
        if(this.contains(FIELD_DMVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据结构版本
     */
    @JsonIgnore
    public void resetDMVer(){
        this.reset(FIELD_DMVER);
    }

    /**
     * 设置 数据结构版本，详细说明：{@link #FIELD_DMVER}
     * <P>
     * 等同 {@link #setDMVer}
     * @param dMVer
     */
    @JsonIgnore
    public PSSysDMVerDTO dmver(Integer dMVer){
        this.setDMVer(dMVer);
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
    public PSSysDMVerDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSDMVERID</B>&nbsp;系统数据库模型版本标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDMVERID = "pssysdmverid";

    /**
     * 设置 系统数据库模型版本标识
     * 
     * @param pSSysDMVerId
     * 
     */
    @JsonProperty(FIELD_PSSYSDMVERID)
    public void setPSSysDMVerId(String pSSysDMVerId){
        this.set(FIELD_PSSYSDMVERID, pSSysDMVerId);
    }
    
    /**
     * 获取 系统数据库模型版本标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMVerId(){
        Object objValue = this.get(FIELD_PSSYSDMVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库模型版本标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMVerIdDirty(){
        if(this.contains(FIELD_PSSYSDMVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库模型版本标识
     */
    @JsonIgnore
    public void resetPSSysDMVerId(){
        this.reset(FIELD_PSSYSDMVERID);
    }

    /**
     * 设置 系统数据库模型版本标识
     * <P>
     * 等同 {@link #setPSSysDMVerId}
     * @param pSSysDMVerId
     */
    @JsonIgnore
    public PSSysDMVerDTO pssysdmverid(String pSSysDMVerId){
        this.setPSSysDMVerId(pSSysDMVerId);
        return this;
    }

    /**
     * <B>PSSYSDMVERNAME</B>&nbsp;版本名称，指定数据库模型版本的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDMVERNAME = "pssysdmvername";

    /**
     * 设置 版本名称，详细说明：{@link #FIELD_PSSYSDMVERNAME}
     * 
     * @param pSSysDMVerName
     * 
     */
    @JsonProperty(FIELD_PSSYSDMVERNAME)
    public void setPSSysDMVerName(String pSSysDMVerName){
        this.set(FIELD_PSSYSDMVERNAME, pSSysDMVerName);
    }
    
    /**
     * 获取 版本名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMVerName(){
        Object objValue = this.get(FIELD_PSSYSDMVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMVerNameDirty(){
        if(this.contains(FIELD_PSSYSDMVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本名称
     */
    @JsonIgnore
    public void resetPSSysDMVerName(){
        this.reset(FIELD_PSSYSDMVERNAME);
    }

    /**
     * 设置 版本名称，详细说明：{@link #FIELD_PSSYSDMVERNAME}
     * <P>
     * 等同 {@link #setPSSysDMVerName}
     * @param pSSysDMVerName
     */
    @JsonIgnore
    public PSSysDMVerDTO pssysdmvername(String pSSysDMVerName){
        this.setPSSysDMVerName(pSSysDMVerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDMVerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDMVerName(strName);
    }

    @JsonIgnore
    public PSSysDMVerDTO name(String strName){
        this.setPSSysDMVerName(strName);
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
    public PSSysDMVerDTO updatedate(Timestamp updateDate){
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
    public PSSysDMVerDTO updateman(String updateMan){
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
    public PSSysDMVerDTO usercat(String userCat){
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
    public PSSysDMVerDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDMVerDTO usertag(String userTag){
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
    public PSSysDMVerDTO usertag2(String userTag2){
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
    public PSSysDMVerDTO usertag3(String userTag3){
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
    public PSSysDMVerDTO usertag4(String userTag4){
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
    public PSSysDMVerDTO validflag(Integer validFlag){
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
    public PSSysDMVerDTO validflag(Boolean validFlag){
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
        return this.getPSSysDMVerId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDMVerId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDMVerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDMVerId(strValue);
    }

    @JsonIgnore
    public PSSysDMVerDTO id(String strValue){
        this.setPSSysDMVerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDMVerDTO){
            PSSysDMVerDTO dto = (PSSysDMVerDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
