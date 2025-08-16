package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDPART</B>大数据分区 模型传输对象
 * <P>
 * 大数据体系的存储分区模型，定义存储分区的信息
 */
public class PSSysBDPart extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDPart(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定大数据分区的代码标识，需要在所在的大数据体系中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysBDPart codename(String codeName){
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
    public PSSysBDPart createdate(String createDate){
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
    public PSSysBDPart createman(String createMan){
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
    public PSSysBDPart memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSBDPARTID</B>&nbsp;大数据分区标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDPARTID = "pssysbdpartid";

    /**
     * 设置 大数据分区标识
     * 
     * @param pSSysBDPartId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDPARTID)
    public void setPSSysBDPartId(String pSSysBDPartId){
        this.set(FIELD_PSSYSBDPARTID, pSSysBDPartId);
    }
    
    /**
     * 获取 大数据分区标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDPartId(){
        Object objValue = this.get(FIELD_PSSYSBDPARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据分区标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDPartIdDirty(){
        if(this.contains(FIELD_PSSYSBDPARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据分区标识
     */
    @JsonIgnore
    public void resetPSSysBDPartId(){
        this.reset(FIELD_PSSYSBDPARTID);
    }

    /**
     * 设置 大数据分区标识
     * <P>
     * 等同 {@link #setPSSysBDPartId}
     * @param pSSysBDPartId
     */
    @JsonIgnore
    public PSSysBDPart pssysbdpartid(String pSSysBDPartId){
        this.setPSSysBDPartId(pSSysBDPartId);
        return this;
    }

    /**
     * <B>PSSYSBDPARTNAME</B>&nbsp;大数据分区名称，指定大数据分区的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBDPARTNAME = "pssysbdpartname";

    /**
     * 设置 大数据分区名称，详细说明：{@link #FIELD_PSSYSBDPARTNAME}
     * 
     * @param pSSysBDPartName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDPARTNAME)
    public void setPSSysBDPartName(String pSSysBDPartName){
        this.set(FIELD_PSSYSBDPARTNAME, pSSysBDPartName);
    }
    
    /**
     * 获取 大数据分区名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDPartName(){
        Object objValue = this.get(FIELD_PSSYSBDPARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据分区名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDPartNameDirty(){
        if(this.contains(FIELD_PSSYSBDPARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据分区名称
     */
    @JsonIgnore
    public void resetPSSysBDPartName(){
        this.reset(FIELD_PSSYSBDPARTNAME);
    }

    /**
     * 设置 大数据分区名称，详细说明：{@link #FIELD_PSSYSBDPARTNAME}
     * <P>
     * 等同 {@link #setPSSysBDPartName}
     * @param pSSysBDPartName
     */
    @JsonIgnore
    public PSSysBDPart pssysbdpartname(String pSSysBDPartName){
        this.setPSSysBDPartName(pSSysBDPartName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDPartName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDPartName(strName);
    }

    @JsonIgnore
    public PSSysBDPart name(String strName){
        this.setPSSysBDPartName(strName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据体系，指定大数据分区所在的大数据体系对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDScheme} 
     */
    public final static String FIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * 
     * @param pSSysBDSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMEID)
    public void setPSSysBDSchemeId(String pSSysBDSchemeId){
        this.set(FIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeId(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeId(){
        this.reset(FIELD_PSSYSBDSCHEMEID);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDSchemeId
     */
    @JsonIgnore
    public PSSysBDPart pssysbdschemeid(String pSSysBDSchemeId){
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    /**
     * 设置 大数据体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDScheme 引用对象
     */
    @JsonIgnore
    public PSSysBDPart pssysbdschemeid(PSSysBDScheme pSSysBDScheme){
        if(pSSysBDScheme == null){
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        }
        else{
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMENAME</B>&nbsp;大数据体系，指定大数据分区所在的大数据体系对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDSCHEMEID}
     */
    public final static String FIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * 
     * @param pSSysBDSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMENAME)
    public void setPSSysBDSchemeName(String pSSysBDSchemeName){
        this.set(FIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeName(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeName(){
        this.reset(FIELD_PSSYSBDSCHEMENAME);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysBDSchemeName}
     * @param pSSysBDSchemeName
     */
    @JsonIgnore
    public PSSysBDPart pssysbdschemename(String pSSysBDSchemeName){
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
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
    public PSSysBDPart updatedate(String updateDate){
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
    public PSSysBDPart updateman(String updateMan){
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
    public PSSysBDPart usercat(String userCat){
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
    public PSSysBDPart usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDPart usertag(String userTag){
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
    public PSSysBDPart usertag2(String userTag2){
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
    public PSSysBDPart usertag3(String userTag3){
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
    public PSSysBDPart usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDPartId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDPartId(strValue);
    }

    @JsonIgnore
    public PSSysBDPart id(String strValue){
        this.setPSSysBDPartId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDPart){
            PSSysBDPart model = (PSSysBDPart)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
