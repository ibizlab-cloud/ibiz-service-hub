package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnSysSrvDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVSLNSYSSRVID</B>&nbsp;开发系统后台服务体系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";

    /**
     * 设置 开发系统后台服务体系标识
     * 
     * @param pSDevSlnSysSrvId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSSRVID)
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId){
        this.set(FIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }
    
    /**
     * 获取 开发系统后台服务体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysSrvId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSSRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统后台服务体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSSRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统后台服务体系标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysSrvId(){
        this.reset(FIELD_PSDEVSLNSYSSRVID);
    }

    /**
     * 设置 开发系统后台服务体系标识
     * <P>
     * 等同 {@link #setPSDevSlnSysSrvId}
     * @param pSDevSlnSysSrvId
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsyssrvid(String pSDevSlnSysSrvId){
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSSRVNAME</B>&nbsp;后台服务体系名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";

    /**
     * 设置 后台服务体系名称
     * 
     * @param pSDevSlnSysSrvName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSSRVNAME)
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName){
        this.set(FIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }
    
    /**
     * 获取 后台服务体系名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysSrvName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSSRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务体系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSSRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务体系名称
     */
    @JsonIgnore
    public void resetPSDevSlnSysSrvName(){
        this.reset(FIELD_PSDEVSLNSYSSRVNAME);
    }

    /**
     * 设置 后台服务体系名称
     * <P>
     * 等同 {@link #setPSDevSlnSysSrvName}
     * @param pSDevSlnSysSrvName
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsyssrvname(String pSDevSlnSysSrvName){
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnSysSrvName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnSysSrvName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO name(String strName){
        this.setPSDevSlnSysSrvName(strName);
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
    public PSDevSlnSysSrvDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDevSlnSysSrvDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>ACCESSTOKEN</B>&nbsp;访问标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACCESSTOKEN = "accesstoken";

    /**
     * 设置 访问标识
     * 
     * @param accessToken
     * 
     */
    @JsonProperty(FIELD_ACCESSTOKEN)
    public void setAccessToken(String accessToken){
        this.set(FIELD_ACCESSTOKEN, accessToken);
    }
    
    /**
     * 获取 访问标识  
     * @return
     */
    @JsonIgnore
    public String getAccessToken(){
        Object objValue = this.get(FIELD_ACCESSTOKEN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccessTokenDirty(){
        if(this.contains(FIELD_ACCESSTOKEN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问标识
     */
    @JsonIgnore
    public void resetAccessToken(){
        this.reset(FIELD_ACCESSTOKEN);
    }

    /**
     * 设置 访问标识
     * <P>
     * 等同 {@link #setAccessToken}
     * @param accessToken
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO accesstoken(String accessToken){
        this.setAccessToken(accessToken);
        return this;
    }

    /**
     * <B>PKGCODENAME</B>&nbsp;代码包名
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PKGCODENAME = "pkgcodename";

    /**
     * 设置 代码包名
     * 
     * @param pKGCodeName
     * 
     */
    @JsonProperty(FIELD_PKGCODENAME)
    public void setPKGCodeName(String pKGCodeName){
        this.set(FIELD_PKGCODENAME, pKGCodeName);
    }
    
    /**
     * 获取 代码包名  
     * @return
     */
    @JsonIgnore
    public String getPKGCodeName(){
        Object objValue = this.get(FIELD_PKGCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码包名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKGCodeNameDirty(){
        if(this.contains(FIELD_PKGCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码包名
     */
    @JsonIgnore
    public void resetPKGCodeName(){
        this.reset(FIELD_PKGCODENAME);
    }

    /**
     * 设置 代码包名
     * <P>
     * 等同 {@link #setPKGCodeName}
     * @param pKGCodeName
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO pkgcodename(String pKGCodeName){
        this.setPKGCodeName(pKGCodeName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
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
    public PSDevSlnSysSrvDTO codename(String codeName){
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
    public PSDevSlnSysSrvDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDevSlnSysSrvDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;支持外部引用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 支持外部引用
     * 
     * @param enableLink
     * 
     */
    @JsonProperty(FIELD_ENABLELINK)
    public void setEnableLink(Integer enableLink){
        this.set(FIELD_ENABLELINK, enableLink);
    }
    
    /**
     * 获取 支持外部引用  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLink(){
        Object objValue = this.get(FIELD_ENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持外部引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLinkDirty(){
        if(this.contains(FIELD_ENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持外部引用
     */
    @JsonIgnore
    public void resetEnableLink(){
        this.reset(FIELD_ENABLELINK);
    }

    /**
     * 设置 支持外部引用
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 支持外部引用
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO enablelink(Boolean enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDevSlnSysSrvDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
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
    public PSDevSlnSysSrvDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>SYSCODENAME</B>&nbsp;系统代码名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_SYSCODENAME = "syscodename";

    /**
     * 设置 系统代码名称
     * 
     * @param sysCodeName
     * 
     */
    @JsonProperty(FIELD_SYSCODENAME)
    public void setSysCodeName(String sysCodeName){
        this.set(FIELD_SYSCODENAME, sysCodeName);
    }
    
    /**
     * 获取 系统代码名称  
     * @return
     */
    @JsonIgnore
    public String getSysCodeName(){
        Object objValue = this.get(FIELD_SYSCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysCodeNameDirty(){
        if(this.contains(FIELD_SYSCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码名称
     */
    @JsonIgnore
    public void resetSysCodeName(){
        this.reset(FIELD_SYSCODENAME);
    }

    /**
     * 设置 系统代码名称
     * <P>
     * 等同 {@link #setSysCodeName}
     * @param sysCodeName
     */
    @JsonIgnore
    public PSDevSlnSysSrvDTO syscodename(String sysCodeName){
        this.setSysCodeName(sysCodeName);
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
    public PSDevSlnSysSrvDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDevSlnSysSrvDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnSysSrvId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnSysSrvDTO){
            PSDevSlnSysSrvDTO dto = (PSDevSlnSysSrvDTO)iEntity;
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