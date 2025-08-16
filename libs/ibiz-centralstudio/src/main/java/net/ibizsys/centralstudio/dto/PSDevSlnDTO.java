package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnDTO extends CentralEntityDTOBase{

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
    public PSDevSlnDTO updateman(String updateMan){
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
    public PSDevSlnDTO updatedate(Timestamp updateDate){
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
    public PSDevSlnDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案标识
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案标识  
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
     * 判断 开发方案标识 是否指定值，包括空值
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
     * 重置 开发方案标识
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案标识
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevSlnDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案名称
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案名称  
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
     * 判断 开发方案名称 是否指定值，包括空值
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
     * 重置 开发方案名称
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案名称
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevSlnDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnName(strName);
    }

    @JsonIgnore
    public PSDevSlnDTO name(String strName){
        this.setPSDevSlnName(strName);
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
    public PSDevSlnDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心标识
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心标识
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心标识
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDevSlnDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心名称
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心名称
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心名称
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDevSlnDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>ADMINPSDEVUSERNAME</B>&nbsp;方案管理用户
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADMINPSDEVUSERID}
     */
    public final static String FIELD_ADMINPSDEVUSERNAME = "adminpsdevusername";

    /**
     * 设置 方案管理用户
     * 
     * @param adminPSDevUserName
     * 
     */
    @JsonProperty(FIELD_ADMINPSDEVUSERNAME)
    public void setAdminPSDevUserName(String adminPSDevUserName){
        this.set(FIELD_ADMINPSDEVUSERNAME, adminPSDevUserName);
    }
    
    /**
     * 获取 方案管理用户  
     * @return
     */
    @JsonIgnore
    public String getAdminPSDevUserName(){
        Object objValue = this.get(FIELD_ADMINPSDEVUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方案管理用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAdminPSDevUserNameDirty(){
        if(this.contains(FIELD_ADMINPSDEVUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方案管理用户
     */
    @JsonIgnore
    public void resetAdminPSDevUserName(){
        this.reset(FIELD_ADMINPSDEVUSERNAME);
    }

    /**
     * 设置 方案管理用户
     * <P>
     * 等同 {@link #setAdminPSDevUserName}
     * @param adminPSDevUserName
     */
    @JsonIgnore
    public PSDevSlnDTO adminpsdevusername(String adminPSDevUserName){
        this.setAdminPSDevUserName(adminPSDevUserName);
        return this;
    }

    /**
     * <B>ADMINPSDEVUSERID</B>&nbsp;方案管理用户
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ADMINPSDEVUSERID = "adminpsdevuserid";

    /**
     * 设置 方案管理用户
     * 
     * @param adminPSDevUserId
     * 
     */
    @JsonProperty(FIELD_ADMINPSDEVUSERID)
    public void setAdminPSDevUserId(String adminPSDevUserId){
        this.set(FIELD_ADMINPSDEVUSERID, adminPSDevUserId);
    }
    
    /**
     * 获取 方案管理用户  
     * @return
     */
    @JsonIgnore
    public String getAdminPSDevUserId(){
        Object objValue = this.get(FIELD_ADMINPSDEVUSERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方案管理用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAdminPSDevUserIdDirty(){
        if(this.contains(FIELD_ADMINPSDEVUSERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方案管理用户
     */
    @JsonIgnore
    public void resetAdminPSDevUserId(){
        this.reset(FIELD_ADMINPSDEVUSERID);
    }

    /**
     * 设置 方案管理用户
     * <P>
     * 等同 {@link #setAdminPSDevUserId}
     * @param adminPSDevUserId
     */
    @JsonIgnore
    public PSDevSlnDTO adminpsdevuserid(String adminPSDevUserId){
        this.setAdminPSDevUserId(adminPSDevUserId);
        return this;
    }

    /**
     * <B>CALLBACKTAG</B>&nbsp;Web回调标记
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CALLBACKTAG = "callbacktag";

    /**
     * 设置 Web回调标记
     * 
     * @param callbackTag
     * 
     */
    @JsonProperty(FIELD_CALLBACKTAG)
    public void setCallbackTag(String callbackTag){
        this.set(FIELD_CALLBACKTAG, callbackTag);
    }
    
    /**
     * 获取 Web回调标记  
     * @return
     */
    @JsonIgnore
    public String getCallbackTag(){
        Object objValue = this.get(FIELD_CALLBACKTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Web回调标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCallbackTagDirty(){
        if(this.contains(FIELD_CALLBACKTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Web回调标记
     */
    @JsonIgnore
    public void resetCallbackTag(){
        this.reset(FIELD_CALLBACKTAG);
    }

    /**
     * 设置 Web回调标记
     * <P>
     * 等同 {@link #setCallbackTag}
     * @param callbackTag
     */
    @JsonIgnore
    public PSDevSlnDTO callbacktag(String callbackTag){
        this.setCallbackTag(callbackTag);
        return this;
    }

    /**
     * <B>CALLBACKURL</B>&nbsp;Web回调地址
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CALLBACKURL = "callbackurl";

    /**
     * 设置 Web回调地址
     * 
     * @param callbackUrl
     * 
     */
    @JsonProperty(FIELD_CALLBACKURL)
    public void setCallbackUrl(String callbackUrl){
        this.set(FIELD_CALLBACKURL, callbackUrl);
    }
    
    /**
     * 获取 Web回调地址  
     * @return
     */
    @JsonIgnore
    public String getCallbackUrl(){
        Object objValue = this.get(FIELD_CALLBACKURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Web回调地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCallbackUrlDirty(){
        if(this.contains(FIELD_CALLBACKURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Web回调地址
     */
    @JsonIgnore
    public void resetCallbackUrl(){
        this.reset(FIELD_CALLBACKURL);
    }

    /**
     * 设置 Web回调地址
     * <P>
     * 等同 {@link #setCallbackUrl}
     * @param callbackUrl
     */
    @JsonIgnore
    public PSDevSlnDTO callbackurl(String callbackUrl){
        this.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * <B>ENABLECALLBACK</B>&nbsp;启用Web回调
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLECALLBACK = "enablecallback";

    /**
     * 设置 启用Web回调
     * 
     * @param enableCallback
     * 
     */
    @JsonProperty(FIELD_ENABLECALLBACK)
    public void setEnableCallback(Integer enableCallback){
        this.set(FIELD_ENABLECALLBACK, enableCallback);
    }
    
    /**
     * 获取 启用Web回调  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCallback(){
        Object objValue = this.get(FIELD_ENABLECALLBACK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用Web回调 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCallbackDirty(){
        if(this.contains(FIELD_ENABLECALLBACK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用Web回调
     */
    @JsonIgnore
    public void resetEnableCallback(){
        this.reset(FIELD_ENABLECALLBACK);
    }

    /**
     * 设置 启用Web回调
     * <P>
     * 等同 {@link #setEnableCallback}
     * @param enableCallback
     */
    @JsonIgnore
    public PSDevSlnDTO enablecallback(Integer enableCallback){
        this.setEnableCallback(enableCallback);
        return this;
    }

     /**
     * 设置 启用Web回调
     * <P>
     * 等同 {@link #setEnableCallback}
     * @param enableCallback
     */
    @JsonIgnore
    public PSDevSlnDTO enablecallback(Boolean enableCallback){
        if(enableCallback == null){
            this.setEnableCallback(null);
        }
        else{
            this.setEnableCallback(enableCallback?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
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
     * 判断 中文名称 是否指定值，包括空值
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
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDevSlnDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDevSlnDTO codename(String codeName){
        this.setCodeName(codeName);
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
    public PSDevSlnDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>SLNSN</B>&nbsp;方案编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SLNSN = "slnsn";

    /**
     * 设置 方案编号
     * 
     * @param sLNSN
     * 
     */
    @JsonProperty(FIELD_SLNSN)
    public void setSLNSN(String sLNSN){
        this.set(FIELD_SLNSN, sLNSN);
    }
    
    /**
     * 获取 方案编号  
     * @return
     */
    @JsonIgnore
    public String getSLNSN(){
        Object objValue = this.get(FIELD_SLNSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方案编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSLNSNDirty(){
        if(this.contains(FIELD_SLNSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方案编号
     */
    @JsonIgnore
    public void resetSLNSN(){
        this.reset(FIELD_SLNSN);
    }

    /**
     * 设置 方案编号
     * <P>
     * 等同 {@link #setSLNSN}
     * @param sLNSN
     */
    @JsonIgnore
    public PSDevSlnDTO slnsn(String sLNSN){
        this.setSLNSN(sLNSN);
        return this;
    }

    /**
     * <B>PSDCDEPLOYCENTERID</B>&nbsp;部署中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCDEPLOYCENTERID = "psdcdeploycenterid";

    /**
     * 设置 部署中心
     * 
     * @param pSDCDeployCenterId
     * 
     */
    @JsonProperty(FIELD_PSDCDEPLOYCENTERID)
    public void setPSDCDeployCenterId(String pSDCDeployCenterId){
        this.set(FIELD_PSDCDEPLOYCENTERID, pSDCDeployCenterId);
    }
    
    /**
     * 获取 部署中心  
     * @return
     */
    @JsonIgnore
    public String getPSDCDeployCenterId(){
        Object objValue = this.get(FIELD_PSDCDEPLOYCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCDeployCenterIdDirty(){
        if(this.contains(FIELD_PSDCDEPLOYCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署中心
     */
    @JsonIgnore
    public void resetPSDCDeployCenterId(){
        this.reset(FIELD_PSDCDEPLOYCENTERID);
    }

    /**
     * 设置 部署中心
     * <P>
     * 等同 {@link #setPSDCDeployCenterId}
     * @param pSDCDeployCenterId
     */
    @JsonIgnore
    public PSDevSlnDTO psdcdeploycenterid(String pSDCDeployCenterId){
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    /**
     * <B>PSDCDEPLOYCENTERNAME</B>&nbsp;部署中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCDEPLOYCENTERID}
     */
    public final static String FIELD_PSDCDEPLOYCENTERNAME = "psdcdeploycentername";

    /**
     * 设置 部署中心
     * 
     * @param pSDCDeployCenterName
     * 
     */
    @JsonProperty(FIELD_PSDCDEPLOYCENTERNAME)
    public void setPSDCDeployCenterName(String pSDCDeployCenterName){
        this.set(FIELD_PSDCDEPLOYCENTERNAME, pSDCDeployCenterName);
    }
    
    /**
     * 获取 部署中心  
     * @return
     */
    @JsonIgnore
    public String getPSDCDeployCenterName(){
        Object objValue = this.get(FIELD_PSDCDEPLOYCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCDeployCenterNameDirty(){
        if(this.contains(FIELD_PSDCDEPLOYCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署中心
     */
    @JsonIgnore
    public void resetPSDCDeployCenterName(){
        this.reset(FIELD_PSDCDEPLOYCENTERNAME);
    }

    /**
     * 设置 部署中心
     * <P>
     * 等同 {@link #setPSDCDeployCenterName}
     * @param pSDCDeployCenterName
     */
    @JsonIgnore
    public PSDevSlnDTO psdcdeploycentername(String pSDCDeployCenterName){
        this.setPSDCDeployCenterName(pSDCDeployCenterName);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnDTO){
            PSDevSlnDTO dto = (PSDevSlnDTO)iEntity;
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