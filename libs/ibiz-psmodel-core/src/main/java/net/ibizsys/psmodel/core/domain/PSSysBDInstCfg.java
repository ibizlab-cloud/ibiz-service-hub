package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDINSTCFG</B>系统大数据实例配置 模型传输对象
 * <P>
 * 系统大数据实例配置模型，指定大数据库的类型及相应开发实例信息
 */
public class PSSysBDInstCfg extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDInstCfg(){
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
    public PSSysBDInstCfg createdate(String createDate){
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
    public PSSysBDInstCfg createman(String createMan){
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
    public PSSysBDInstCfg memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDCBDINSTID</B>&nbsp;大数据实例，指定系统开发阶段的大数据实例
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCBDINSTID = "psdcbdinstid";

    /**
     * 设置 大数据实例，详细说明：{@link #FIELD_PSDCBDINSTID}
     * 
     * @param pSDCBDInstId
     * 
     */
    @JsonProperty(FIELD_PSDCBDINSTID)
    public void setPSDCBDInstId(String pSDCBDInstId){
        this.set(FIELD_PSDCBDINSTID, pSDCBDInstId);
    }
    
    /**
     * 获取 大数据实例  
     * @return
     */
    @JsonIgnore
    public String getPSDCBDInstId(){
        Object objValue = this.get(FIELD_PSDCBDINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCBDInstIdDirty(){
        if(this.contains(FIELD_PSDCBDINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据实例
     */
    @JsonIgnore
    public void resetPSDCBDInstId(){
        this.reset(FIELD_PSDCBDINSTID);
    }

    /**
     * 设置 大数据实例，详细说明：{@link #FIELD_PSDCBDINSTID}
     * <P>
     * 等同 {@link #setPSDCBDInstId}
     * @param pSDCBDInstId
     */
    @JsonIgnore
    public PSSysBDInstCfg psdcbdinstid(String pSDCBDInstId){
        this.setPSDCBDInstId(pSDCBDInstId);
        return this;
    }

    /**
     * <B>PSDCBDINSTNAME</B>&nbsp;大数据实例，指定系统开发阶段的大数据实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCBDINSTID}
     */
    public final static String FIELD_PSDCBDINSTNAME = "psdcbdinstname";

    /**
     * 设置 大数据实例，详细说明：{@link #FIELD_PSDCBDINSTNAME}
     * 
     * @param pSDCBDInstName
     * 
     */
    @JsonProperty(FIELD_PSDCBDINSTNAME)
    public void setPSDCBDInstName(String pSDCBDInstName){
        this.set(FIELD_PSDCBDINSTNAME, pSDCBDInstName);
    }
    
    /**
     * 获取 大数据实例  
     * @return
     */
    @JsonIgnore
    public String getPSDCBDInstName(){
        Object objValue = this.get(FIELD_PSDCBDINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCBDInstNameDirty(){
        if(this.contains(FIELD_PSDCBDINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据实例
     */
    @JsonIgnore
    public void resetPSDCBDInstName(){
        this.reset(FIELD_PSDCBDINSTNAME);
    }

    /**
     * 设置 大数据实例，详细说明：{@link #FIELD_PSDCBDINSTNAME}
     * <P>
     * 等同 {@link #setPSDCBDInstName}
     * @param pSDCBDInstName
     */
    @JsonIgnore
    public PSSysBDInstCfg psdcbdinstname(String pSDCBDInstName){
        this.setPSDCBDInstName(pSDCBDInstName);
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGID</B>&nbsp;系统大数据实例配置标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDINSTCFGID = "pssysbdinstcfgid";

    /**
     * 设置 系统大数据实例配置标识
     * 
     * @param pSSysBDInstCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGID)
    public void setPSSysBDInstCfgId(String pSSysBDInstCfgId){
        this.set(FIELD_PSSYSBDINSTCFGID, pSSysBDInstCfgId);
    }
    
    /**
     * 获取 系统大数据实例配置标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgId(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统大数据实例配置标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgIdDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统大数据实例配置标识
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgId(){
        this.reset(FIELD_PSSYSBDINSTCFGID);
    }

    /**
     * 设置 系统大数据实例配置标识
     * <P>
     * 等同 {@link #setPSSysBDInstCfgId}
     * @param pSSysBDInstCfgId
     */
    @JsonIgnore
    public PSSysBDInstCfg pssysbdinstcfgid(String pSSysBDInstCfgId){
        this.setPSSysBDInstCfgId(pSSysBDInstCfgId);
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGNAME</B>&nbsp;实例类型，指定大数据库的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BDType} 
     */
    public final static String FIELD_PSSYSBDINSTCFGNAME = "pssysbdinstcfgname";

    /**
     * 设置 实例类型，详细说明：{@link #FIELD_PSSYSBDINSTCFGNAME}
     * 
     * @param pSSysBDInstCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGNAME)
    public void setPSSysBDInstCfgName(String pSSysBDInstCfgName){
        this.set(FIELD_PSSYSBDINSTCFGNAME, pSSysBDInstCfgName);
    }
    
    /**
     * 获取 实例类型  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgName(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实例类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgNameDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实例类型
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgName(){
        this.reset(FIELD_PSSYSBDINSTCFGNAME);
    }

    /**
     * 设置 实例类型，详细说明：{@link #FIELD_PSSYSBDINSTCFGNAME}
     * <P>
     * 等同 {@link #setPSSysBDInstCfgName}
     * @param pSSysBDInstCfgName
     */
    @JsonIgnore
    public PSSysBDInstCfg pssysbdinstcfgname(String pSSysBDInstCfgName){
        this.setPSSysBDInstCfgName(pSSysBDInstCfgName);
        return this;
    }

     /**
     * 设置 实例类型，详细说明：{@link #FIELD_PSSYSBDINSTCFGNAME}
     * <P>
     * 等同 {@link #setPSSysBDInstCfgName}
     * @param pSSysBDInstCfgName
     */
    @JsonIgnore
    public PSSysBDInstCfg pssysbdinstcfgname(net.ibizsys.psmodel.core.util.PSModelEnums.BDType pSSysBDInstCfgName){
        if(pSSysBDInstCfgName == null){
            this.setPSSysBDInstCfgName(null);
        }
        else{
            this.setPSSysBDInstCfgName(pSSysBDInstCfgName.value);
        }
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDInstCfgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDInstCfgName(strName);
    }

    @JsonIgnore
    public PSSysBDInstCfg name(String strName){
        this.setPSSysBDInstCfgName(strName);
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
    public PSSysBDInstCfg updatedate(String updateDate){
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
    public PSSysBDInstCfg updateman(String updateMan){
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
    public PSSysBDInstCfg usercat(String userCat){
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
    public PSSysBDInstCfg usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDInstCfg usertag(String userTag){
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
    public PSSysBDInstCfg usertag2(String userTag2){
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
    public PSSysBDInstCfg usertag3(String userTag3){
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
    public PSSysBDInstCfg usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDInstCfgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDInstCfgId(strValue);
    }

    @JsonIgnore
    public PSSysBDInstCfg id(String strValue){
        this.setPSSysBDInstCfgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDInstCfg){
            PSSysBDInstCfg model = (PSSysBDInstCfg)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
