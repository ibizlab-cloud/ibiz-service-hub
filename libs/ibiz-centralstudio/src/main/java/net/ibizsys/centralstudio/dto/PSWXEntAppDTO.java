package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWXENTAPP</B>微信企业应用 模型传输对象
 * <P>
 * 微信企业应用模型，定义微信公众号中企业应用信息
 */
public class PSWXEntAppDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWXEntAppDTO(){
    }      

    /**
     * <B>APPTYPE</B>&nbsp;应用类型，指定微信企业应用的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WXAppType} 
     */
    public final static String FIELD_APPTYPE = "apptype";

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_APPTYPE}
     * 
     * @param appType
     * 
     */
    @JsonProperty(FIELD_APPTYPE)
    public void setAppType(String appType){
        this.set(FIELD_APPTYPE, appType);
    }
    
    /**
     * 获取 应用类型  
     * @return
     */
    @JsonIgnore
    public String getAppType(){
        Object objValue = this.get(FIELD_APPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppTypeDirty(){
        if(this.contains(FIELD_APPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用类型
     */
    @JsonIgnore
    public void resetAppType(){
        this.reset(FIELD_APPTYPE);
    }

    /**
     * 设置 应用类型，详细说明：{@link #FIELD_APPTYPE}
     * <P>
     * 等同 {@link #setAppType}
     * @param appType
     */
    @JsonIgnore
    public PSWXEntAppDTO apptype(String appType){
        this.setAppType(appType);
        return this;
    }

     /**
     * 设置 应用类型，详细说明：{@link #FIELD_APPTYPE}
     * <P>
     * 等同 {@link #setAppType}
     * @param appType
     */
    @JsonIgnore
    public PSWXEntAppDTO apptype(net.ibizsys.model.PSModelEnums.WXAppType appType){
        if(appType == null){
            this.setAppType(null);
        }
        else{
            this.setAppType(appType.value);
        }
        return this;
    }

    /**
     * <B>APPURL</B>&nbsp;应用路径，指定微信企业应用的访问路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_APPURL = "appurl";

    /**
     * 设置 应用路径，详细说明：{@link #FIELD_APPURL}
     * 
     * @param appUrl
     * 
     */
    @JsonProperty(FIELD_APPURL)
    public void setAppUrl(String appUrl){
        this.set(FIELD_APPURL, appUrl);
    }
    
    /**
     * 获取 应用路径  
     * @return
     */
    @JsonIgnore
    public String getAppUrl(){
        Object objValue = this.get(FIELD_APPURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppUrlDirty(){
        if(this.contains(FIELD_APPURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用路径
     */
    @JsonIgnore
    public void resetAppUrl(){
        this.reset(FIELD_APPURL);
    }

    /**
     * 设置 应用路径，详细说明：{@link #FIELD_APPURL}
     * <P>
     * 等同 {@link #setAppUrl}
     * @param appUrl
     */
    @JsonIgnore
    public PSWXEntAppDTO appurl(String appUrl){
        this.setAppUrl(appUrl);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定微信企业应用的代码标识，需在所属微信公众号中具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
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
    public PSWXEntAppDTO codename(String codeName){
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
    public PSWXEntAppDTO createdate(Timestamp createDate){
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
    public PSWXEntAppDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSWXEntAppDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序，指定微信企业应用的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSWXEntAppDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定微信企业应用相关的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSWXEntAppDTO pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSWXEntAppDTO pssysappid(PSSysAppDTO pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定微信企业应用相关的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSWXEntAppDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSWXACCOUNTID</B>&nbsp;微信公众号，指定微信企业应用所属的微信公众号
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXAccountDTO} 
     */
    public final static String FIELD_PSWXACCOUNTID = "pswxaccountid";

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * 
     * @param pSWXAccountId
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTID)
    public void setPSWXAccountId(String pSWXAccountId){
        this.set(FIELD_PSWXACCOUNTID, pSWXAccountId);
    }
    
    /**
     * 获取 微信公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountId(){
        Object objValue = this.get(FIELD_PSWXACCOUNTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountIdDirty(){
        if(this.contains(FIELD_PSWXACCOUNTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信公众号
     */
    @JsonIgnore
    public void resetPSWXAccountId(){
        this.reset(FIELD_PSWXACCOUNTID);
    }

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccountId
     */
    @JsonIgnore
    public PSWXEntAppDTO pswxaccountid(String pSWXAccountId){
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    /**
     * 设置 微信公众号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccount 引用对象
     */
    @JsonIgnore
    public PSWXEntAppDTO pswxaccountid(PSWXAccountDTO pSWXAccount){
        if(pSWXAccount == null){
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        }
        else{
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    /**
     * <B>PSWXACCOUNTNAME</B>&nbsp;微信公众号，指定微信企业应用所属的微信公众号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXACCOUNTID}
     */
    public final static String FIELD_PSWXACCOUNTNAME = "pswxaccountname";

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * 
     * @param pSWXAccountName
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTNAME)
    public void setPSWXAccountName(String pSWXAccountName){
        this.set(FIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }
    
    /**
     * 获取 微信公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountName(){
        Object objValue = this.get(FIELD_PSWXACCOUNTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountNameDirty(){
        if(this.contains(FIELD_PSWXACCOUNTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信公众号
     */
    @JsonIgnore
    public void resetPSWXAccountName(){
        this.reset(FIELD_PSWXACCOUNTNAME);
    }

    /**
     * 设置 微信公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * <P>
     * 等同 {@link #setPSWXAccountName}
     * @param pSWXAccountName
     */
    @JsonIgnore
    public PSWXEntAppDTO pswxaccountname(String pSWXAccountName){
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    /**
     * <B>PSWXENTAPPID</B>&nbsp;微信企业应用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWXENTAPPID = "pswxentappid";

    /**
     * 设置 微信企业应用标识
     * 
     * @param pSWXEntAppId
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPID)
    public void setPSWXEntAppId(String pSWXEntAppId){
        this.set(FIELD_PSWXENTAPPID, pSWXEntAppId);
    }
    
    /**
     * 获取 微信企业应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppId(){
        Object objValue = this.get(FIELD_PSWXENTAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信企业应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppIdDirty(){
        if(this.contains(FIELD_PSWXENTAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信企业应用标识
     */
    @JsonIgnore
    public void resetPSWXEntAppId(){
        this.reset(FIELD_PSWXENTAPPID);
    }

    /**
     * 设置 微信企业应用标识
     * <P>
     * 等同 {@link #setPSWXEntAppId}
     * @param pSWXEntAppId
     */
    @JsonIgnore
    public PSWXEntAppDTO pswxentappid(String pSWXEntAppId){
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    /**
     * <B>PSWXENTAPPNAME</B>&nbsp;应用名称，指定微信企业应用的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWXENTAPPNAME = "pswxentappname";

    /**
     * 设置 应用名称，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * 
     * @param pSWXEntAppName
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPNAME)
    public void setPSWXEntAppName(String pSWXEntAppName){
        this.set(FIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }
    
    /**
     * 获取 应用名称  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppName(){
        Object objValue = this.get(FIELD_PSWXENTAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppNameDirty(){
        if(this.contains(FIELD_PSWXENTAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用名称
     */
    @JsonIgnore
    public void resetPSWXEntAppName(){
        this.reset(FIELD_PSWXENTAPPNAME);
    }

    /**
     * 设置 应用名称，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * <P>
     * 等同 {@link #setPSWXEntAppName}
     * @param pSWXEntAppName
     */
    @JsonIgnore
    public PSWXEntAppDTO pswxentappname(String pSWXEntAppName){
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWXEntAppName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWXEntAppName(strName);
    }

    @JsonIgnore
    public PSWXEntAppDTO name(String strName){
        this.setPSWXEntAppName(strName);
        return this;
    }

    /**
     * <B>REPENTERFLAG</B>&nbsp;是否上报进入，指定微信企业应用是否向服务器发送用户进入应用的消息，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REPENTERFLAG = "repenterflag";

    /**
     * 设置 是否上报进入，详细说明：{@link #FIELD_REPENTERFLAG}
     * 
     * @param repEnterFlag
     * 
     */
    @JsonProperty(FIELD_REPENTERFLAG)
    public void setRepEnterFlag(Integer repEnterFlag){
        this.set(FIELD_REPENTERFLAG, repEnterFlag);
    }
    
    /**
     * 获取 是否上报进入  
     * @return
     */
    @JsonIgnore
    public Integer getRepEnterFlag(){
        Object objValue = this.get(FIELD_REPENTERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否上报进入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepEnterFlagDirty(){
        if(this.contains(FIELD_REPENTERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否上报进入
     */
    @JsonIgnore
    public void resetRepEnterFlag(){
        this.reset(FIELD_REPENTERFLAG);
    }

    /**
     * 设置 是否上报进入，详细说明：{@link #FIELD_REPENTERFLAG}
     * <P>
     * 等同 {@link #setRepEnterFlag}
     * @param repEnterFlag
     */
    @JsonIgnore
    public PSWXEntAppDTO repenterflag(Integer repEnterFlag){
        this.setRepEnterFlag(repEnterFlag);
        return this;
    }

     /**
     * 设置 是否上报进入，详细说明：{@link #FIELD_REPENTERFLAG}
     * <P>
     * 等同 {@link #setRepEnterFlag}
     * @param repEnterFlag
     */
    @JsonIgnore
    public PSWXEntAppDTO repenterflag(Boolean repEnterFlag){
        if(repEnterFlag == null){
            this.setRepEnterFlag(null);
        }
        else{
            this.setRepEnterFlag(repEnterFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REPLOCATIONFLAG</B>&nbsp;是否上报位置，指定微信企业应用是否向服务器发送用户所在位置的消息，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REPLOCATIONFLAG = "replocationflag";

    /**
     * 设置 是否上报位置，详细说明：{@link #FIELD_REPLOCATIONFLAG}
     * 
     * @param repLocationFlag
     * 
     */
    @JsonProperty(FIELD_REPLOCATIONFLAG)
    public void setRepLocationFlag(Integer repLocationFlag){
        this.set(FIELD_REPLOCATIONFLAG, repLocationFlag);
    }
    
    /**
     * 获取 是否上报位置  
     * @return
     */
    @JsonIgnore
    public Integer getRepLocationFlag(){
        Object objValue = this.get(FIELD_REPLOCATIONFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否上报位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepLocationFlagDirty(){
        if(this.contains(FIELD_REPLOCATIONFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否上报位置
     */
    @JsonIgnore
    public void resetRepLocationFlag(){
        this.reset(FIELD_REPLOCATIONFLAG);
    }

    /**
     * 设置 是否上报位置，详细说明：{@link #FIELD_REPLOCATIONFLAG}
     * <P>
     * 等同 {@link #setRepLocationFlag}
     * @param repLocationFlag
     */
    @JsonIgnore
    public PSWXEntAppDTO replocationflag(Integer repLocationFlag){
        this.setRepLocationFlag(repLocationFlag);
        return this;
    }

     /**
     * 设置 是否上报位置，详细说明：{@link #FIELD_REPLOCATIONFLAG}
     * <P>
     * 等同 {@link #setRepLocationFlag}
     * @param repLocationFlag
     */
    @JsonIgnore
    public PSWXEntAppDTO replocationflag(Boolean repLocationFlag){
        if(repLocationFlag == null){
            this.setRepLocationFlag(null);
        }
        else{
            this.setRepLocationFlag(repLocationFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSWXEntAppDTO updatedate(Timestamp updateDate){
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
    public PSWXEntAppDTO updateman(String updateMan){
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
    public PSWXEntAppDTO usercat(String userCat){
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
    public PSWXEntAppDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSWXEntAppDTO usertag(String userTag){
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
    public PSWXEntAppDTO usertag2(String userTag2){
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
    public PSWXEntAppDTO usertag3(String userTag3){
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
    public PSWXEntAppDTO usertag4(String userTag4){
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
    public PSWXEntAppDTO validflag(Integer validFlag){
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
    public PSWXEntAppDTO validflag(Boolean validFlag){
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
        return this.getPSWXEntAppId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWXEntAppId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWXEntAppId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWXEntAppId(strValue);
    }

    @JsonIgnore
    public PSWXEntAppDTO id(String strValue){
        this.setPSWXEntAppId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWXEntAppDTO){
            PSWXEntAppDTO dto = (PSWXEntAppDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
