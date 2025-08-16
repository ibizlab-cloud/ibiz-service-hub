package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnUserDTO extends CentralEntityDTOBase{

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
    public PSDevSlnUserDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDevSlnUserDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDevSlnUserDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevSlnUserDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNUSERID</B>&nbsp;开发方案用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNUSERID = "psdevslnuserid";

    /**
     * 设置 开发方案用户标识
     * 
     * @param pSDevSlnUserId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNUSERID)
    public void setPSDevSlnUserId(String pSDevSlnUserId){
        this.set(FIELD_PSDEVSLNUSERID, pSDevSlnUserId);
    }
    
    /**
     * 获取 开发方案用户标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnUserId(){
        Object objValue = this.get(FIELD_PSDEVSLNUSERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案用户标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnUserIdDirty(){
        if(this.contains(FIELD_PSDEVSLNUSERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案用户标识
     */
    @JsonIgnore
    public void resetPSDevSlnUserId(){
        this.reset(FIELD_PSDEVSLNUSERID);
    }

    /**
     * 设置 开发方案用户标识
     * <P>
     * 等同 {@link #setPSDevSlnUserId}
     * @param pSDevSlnUserId
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnuserid(String pSDevSlnUserId){
        this.setPSDevSlnUserId(pSDevSlnUserId);
        return this;
    }

    /**
     * <B>PSDEVSLNUSERNAME</B>&nbsp;开发方案用户名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNUSERNAME = "psdevslnusername";

    /**
     * 设置 开发方案用户名称
     * 
     * @param pSDevSlnUserName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNUSERNAME)
    public void setPSDevSlnUserName(String pSDevSlnUserName){
        this.set(FIELD_PSDEVSLNUSERNAME, pSDevSlnUserName);
    }
    
    /**
     * 获取 开发方案用户名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnUserName(){
        Object objValue = this.get(FIELD_PSDEVSLNUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案用户名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnUserNameDirty(){
        if(this.contains(FIELD_PSDEVSLNUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案用户名称
     */
    @JsonIgnore
    public void resetPSDevSlnUserName(){
        this.reset(FIELD_PSDEVSLNUSERNAME);
    }

    /**
     * 设置 开发方案用户名称
     * <P>
     * 等同 {@link #setPSDevSlnUserName}
     * @param pSDevSlnUserName
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnusername(String pSDevSlnUserName){
        this.setPSDevSlnUserName(pSDevSlnUserName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnUserName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnUserName(strName);
    }

    @JsonIgnore
    public PSDevSlnUserDTO name(String strName){
        this.setPSDevSlnUserName(strName);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnName(){
        Object objValue = this.get(FIELD_PSDEVSLNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnNameDirty(){
        if(this.contains(FIELD_PSDEVSLNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSNAME</B>&nbsp;开发系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNSYSNAME = "psdevslnsysname";

    /**
     * 设置 开发系统
     * 
     * @param pSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSNAME)
    public void setPSDevSlnSysName(String pSDevSlnSysName){
        this.set(FIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysName(){
        this.reset(FIELD_PSDEVSLNSYSNAME);
    }

    /**
     * 设置 开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysName}
     * @param pSDevSlnSysName
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    /**
     * <B>PSDEVUSEROBJNAME</B>&nbsp;授权用户
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVUSEROBJID}
     */
    public final static String FIELD_PSDEVUSEROBJNAME = "psdevuserobjname";

    /**
     * 设置 授权用户
     * 
     * @param pSDevUserObjName
     * 
     */
    @JsonProperty(FIELD_PSDEVUSEROBJNAME)
    public void setPSDevUserObjName(String pSDevUserObjName){
        this.set(FIELD_PSDEVUSEROBJNAME, pSDevUserObjName);
    }
    
    /**
     * 获取 授权用户  
     * @return
     */
    @JsonIgnore
    public String getPSDevUserObjName(){
        Object objValue = this.get(FIELD_PSDEVUSEROBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 授权用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevUserObjNameDirty(){
        if(this.contains(FIELD_PSDEVUSEROBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 授权用户
     */
    @JsonIgnore
    public void resetPSDevUserObjName(){
        this.reset(FIELD_PSDEVUSEROBJNAME);
    }

    /**
     * 设置 授权用户
     * <P>
     * 等同 {@link #setPSDevUserObjName}
     * @param pSDevUserObjName
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevuserobjname(String pSDevUserObjName){
        this.setPSDevUserObjName(pSDevUserObjName);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
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
    public PSDevSlnUserDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ACCMODE</B>&nbsp;访问方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.SlnSysAccMode2} 
     */
    public final static String FIELD_ACCMODE = "accmode";

    /**
     * 设置 访问方式
     * 
     * @param accMode
     * 
     */
    @JsonProperty(FIELD_ACCMODE)
    public void setAccMode(Integer accMode){
        this.set(FIELD_ACCMODE, accMode);
    }
    
    /**
     * 获取 访问方式  
     * @return
     */
    @JsonIgnore
    public Integer getAccMode(){
        Object objValue = this.get(FIELD_ACCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccModeDirty(){
        if(this.contains(FIELD_ACCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问方式
     */
    @JsonIgnore
    public void resetAccMode(){
        this.reset(FIELD_ACCMODE);
    }

    /**
     * 设置 访问方式
     * <P>
     * 等同 {@link #setAccMode}
     * @param accMode
     */
    @JsonIgnore
    public PSDevSlnUserDTO accmode(Integer accMode){
        this.setAccMode(accMode);
        return this;
    }

     /**
     * 设置 访问方式
     * <P>
     * 等同 {@link #setAccMode}
     * @param accMode
     */
    @JsonIgnore
    public PSDevSlnUserDTO accmode(net.ibizsys.centralstudio.util.CentralEnums.SlnSysAccMode2 accMode){
        if(accMode == null){
            this.setAccMode(null);
        }
        else{
            this.setAccMode(accMode.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认用户
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认用户
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认用户  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认用户
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认用户
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDevSlnUserDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认用户
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDevSlnUserDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ALLSYSFLAG</B>&nbsp;全部系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSlnUserMode} 
     */
    public final static String FIELD_ALLSYSFLAG = "allsysflag";

    /**
     * 设置 全部系统
     * 
     * @param allSysFlag
     * 
     */
    @JsonProperty(FIELD_ALLSYSFLAG)
    public void setAllSysFlag(Integer allSysFlag){
        this.set(FIELD_ALLSYSFLAG, allSysFlag);
    }
    
    /**
     * 获取 全部系统  
     * @return
     */
    @JsonIgnore
    public Integer getAllSysFlag(){
        Object objValue = this.get(FIELD_ALLSYSFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllSysFlagDirty(){
        if(this.contains(FIELD_ALLSYSFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部系统
     */
    @JsonIgnore
    public void resetAllSysFlag(){
        this.reset(FIELD_ALLSYSFLAG);
    }

    /**
     * 设置 全部系统
     * <P>
     * 等同 {@link #setAllSysFlag}
     * @param allSysFlag
     */
    @JsonIgnore
    public PSDevSlnUserDTO allsysflag(Integer allSysFlag){
        this.setAllSysFlag(allSysFlag);
        return this;
    }

     /**
     * 设置 全部系统
     * <P>
     * 等同 {@link #setAllSysFlag}
     * @param allSysFlag
     */
    @JsonIgnore
    public PSDevSlnUserDTO allsysflag(net.ibizsys.centralstudio.util.CentralEnums.DevSlnUserMode allSysFlag){
        if(allSysFlag == null){
            this.setAllSysFlag(null);
        }
        else{
            this.setAllSysFlag(allSysFlag.value);
        }
        return this;
    }

    /**
     * <B>PSDEVUSEROBJID</B>&nbsp;用户对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVUSEROBJID = "psdevuserobjid";

    /**
     * 设置 用户对象
     * 
     * @param pSDevUserObjId
     * 
     */
    @JsonProperty(FIELD_PSDEVUSEROBJID)
    public void setPSDevUserObjId(String pSDevUserObjId){
        this.set(FIELD_PSDEVUSEROBJID, pSDevUserObjId);
    }
    
    /**
     * 获取 用户对象  
     * @return
     */
    @JsonIgnore
    public String getPSDevUserObjId(){
        Object objValue = this.get(FIELD_PSDEVUSEROBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevUserObjIdDirty(){
        if(this.contains(FIELD_PSDEVUSEROBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户对象
     */
    @JsonIgnore
    public void resetPSDevUserObjId(){
        this.reset(FIELD_PSDEVUSEROBJID);
    }

    /**
     * 设置 用户对象
     * <P>
     * 等同 {@link #setPSDevUserObjId}
     * @param pSDevUserObjId
     */
    @JsonIgnore
    public PSDevSlnUserDTO psdevuserobjid(String pSDevUserObjId){
        this.setPSDevUserObjId(pSDevUserObjId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnUserId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnUserDTO){
            PSDevSlnUserDTO dto = (PSDevSlnUserDTO)iEntity;
        }
        super.copyTo(iEntity);
    }

    @Override
    protected Map<String, Object> prepareAny() {
        Map<String, Object> any = super.prepareAny();
        if(any != null){
            any.remove(FIELD_CREATEMAN);
            any.remove(FIELD_UPDATEMAN);
            any.remove(FIELD_CREATEDATE);
            any.remove(FIELD_UPDATEDATE);
        }
        return any;
    }
    
}